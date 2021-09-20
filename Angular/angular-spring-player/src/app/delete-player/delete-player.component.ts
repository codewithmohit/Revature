import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-delete-player',
  templateUrl: './delete-player.component.html',
  styleUrls: ['./delete-player.component.css']
})
export class DeletePlayerComponent implements OnInit {
  id: number;
  playerList: Player[];
  flag: boolean;
  constructor(private service: PlayerService, private router: Router) {
    this.flag = false;
  }

  ngOnInit() {
    this.service.getAllPlayers().subscribe(res => {
      this.playerList = res;
      if (this.playerList.length > 0) {
        this.flag = true;
      }
    });

  }

  public deletePlayerById() {
    this.service.deletePlayer(this.id).subscribe(res => {
      this.router.navigate(["/viewPlayers"]);
    });

  }
}
