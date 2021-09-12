import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PlayerComponent } from './player/player.component';
import { FormsModule } from '@angular/forms';
import { CustomDirective } from './custom.directive';


@NgModule({
  declarations: [
    AppComponent,
    PlayerComponent,
    CustomDirective
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
