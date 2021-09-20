import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.css']
})
export class UpdatePlayerComponent implements OnInit {

  id: number;
  player: Player;
  flag: boolean;
  viewFlag: boolean;
  constructor(private service: PlayerService, private router: Router) {
    this.player = new Player();
    this.flag = true;
    this.viewFlag = true;
  }
  ngOnInit() {
  }
  getPlayerById() {
    this.service.getPlayerById(this.id).subscribe(res => {

      this.player = res;
      this.flag = false;
      this.viewFlag = false;
    })
  }

  updatePlayer() {
    this.service.updatePlayer(this.player).subscribe(res => {
      //this.player = new Player();
      this.router.navigate(["/viewPlayers"])
    })
  }

}
