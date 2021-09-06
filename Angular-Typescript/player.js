"use strict";
exports.__esModule = true;
var team_1 = require("./team");
var Player = /** @class */ (function () {
    function Player(id, name, team) {
        this.id = id;
        this.name = name;
        this.team = team;
    }
    Player.prototype.getPlayerDetail = function () {
        return "Player Id : " + this.id + ",name :  " + this.name + " and " + this.team.getTeamName();
    };
    return Player;
}());
var team1 = new team_1.Team(1, "India");
var player1 = new Player(1, "Mohit Jindal", team1);
console.log(player1.getPlayerDetail());
