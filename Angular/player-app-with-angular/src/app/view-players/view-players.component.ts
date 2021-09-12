import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { PlayerService } from '../player-service.service';

@Component({
  selector: 'app-view-players',
  templateUrl: './view-players.component.html',
  styleUrls: ['./view-players.component.css']
})
export class ViewPlayersComponent implements OnInit {
  private playerList: Player[];
  private flag: boolean;
  constructor(private service: PlayerService) {
    this.flag = false;
  }

  ngOnInit() {
    this.playerList = this.service.viewPlayers();
    if (this.playerList.length > 0) {
      this.flag = true;
    }
  }


}
