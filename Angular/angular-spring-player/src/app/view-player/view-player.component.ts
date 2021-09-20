import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-view-player',
  templateUrl: './view-player.component.html',
  styleUrls: ['./view-player.component.css']
})
export class ViewPlayerComponent implements OnInit {

  private playerList: Player[];
  private flag: boolean;
  constructor(private service: PlayerService) {
    this.flag = false;
  }

  ngOnInit() {
    this.service.getAllPlayers().subscribe(res => {
      this.playerList = res;
      if (this.playerList.length > 0) {
        this.flag = true;
      }
    })
  }



}
