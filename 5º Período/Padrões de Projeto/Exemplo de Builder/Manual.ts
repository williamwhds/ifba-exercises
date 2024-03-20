export
class Manual {
    private seats : number;
    private engine : string;
    private tripComputer : string;
    private gps : string;

    constructor() {
        this.seats = 0;
        this.engine = "";
        this.tripComputer = "";
        this.gps = "";
    }

    public setSeats(seats : number) : void {
        this.seats = seats;
    }

    public setEngine(engine : string) : void {
        this.engine = engine;
    }

    public setTripComputer(tripComputer : string) : void {
        this.tripComputer = tripComputer;
    }

    public setGPS(gps : string) : void {
        this.gps = gps;
    }

    public getSeats() : number {
        return this.seats;
    }

    public getEngine() : string {
        return this.engine;
    }

    public getTripComputer() : string {
        return this.tripComputer;
    }

    public getGPS() : string {
        return this.gps;
    }
}