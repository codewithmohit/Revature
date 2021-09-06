
export class Team {

    private id: Number;
    private teamName: String;

    constructor(id: Number, teamName: String) {
        this.id = id;
        this.teamName = teamName;
    }

    getTeamName(): String {
        return "Team Name is " + this.teamName;
    }

}