import { Injectable } from '@angular/core';
import { Player } from './player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  playerList: Player[];
  constructor() {
    this.playerList = [];
  }

  public addPlayer(player: Player) {
    this.playerList.push(player);
  }

  public viewPlayers(): Player[] {

    return this.playerList;
  }

  public deletePlayer(id: number) {
    this.playerList = this.playerList.filter((player) => player.id !== id);
  }

}
