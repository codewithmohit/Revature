import { Component, OnInit } from '@angular/core';
import { Player } from '../player';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {

  playerList: Player[];
  player: Player;
  flag: boolean;
  playerId: number;
  constructor() {
    this.playerList = [];
    this.player = new Player();
    this.flag = false;

  }
  addPlayer() {
    this.playerList.push(this.player);
    this.player = new Player();
    this.flag = true;
  }

  deletePlayer() {
    this.playerList.pop();
    if (this.playerList.length == 0) {
      this.flag = false;
    }
  }
  deletePlayerById() {
    this.playerList = this.playerList.filter((e) => e.id !== this.playerId);
    if (this.playerList.length == 0) {
      this.flag = false;
    }
  }
  ngOnInit() {
  }

}
