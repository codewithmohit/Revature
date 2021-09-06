import { Team } from "./team";

class Player {
    private id: Number;
    private name: string;
    private team: Team;

    constructor(id: Number, name: string, team: Team) {
        this.id = id;
        this.name = name;
        this.team = team;
    }

    getPlayerDetail(): string {
        return "Player Id : " + this.id + ",name :  " + this.name + " and " + this.team.getTeamName();
    }
}

let team1 = new Team(1, "India");
let player1 = new Player(1, "Mohit Jindal", team1);
console.log(player1.getPlayerDetail());
