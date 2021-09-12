import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player-service.service';

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
    this.playerList = this.service.viewPlayers();
    if (this.playerList.length > 0) {
      this.flag = true;
    }
  }

  public deletePlayerById() {
    this.service.deletePlayer(this.id);
    this.router.navigate(["/viewPlayers"]);
  }

}
