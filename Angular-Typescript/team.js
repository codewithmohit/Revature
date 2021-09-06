"use strict";
exports.__esModule = true;
exports.Team = void 0;
var Team = /** @class */ (function () {
    function Team(id, teamName) {
        this.id = id;
        this.teamName = teamName;
    }
    Team.prototype.getTeamName = function () {
        return "Team Name is " + this.teamName;
    };
    return Team;
}());
exports.Team = Team;
