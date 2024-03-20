import { Manual } from "./Manual";
import { Builder } from "./Builder";

export
class CarManualBuilder implements Builder {
    private manual: Manual;

    constructor() {
        this.manual = new Manual();
    }

    public reset(): void {
        this.manual = new Manual();
    }

    public setSeats(seats: number): void {
        this.manual.setSeats(seats);
    }

    public setEngine(engine: string): void {
        this.manual.setEngine(engine);
    }

    public setTripComputer(tripComputer: string): void {
        this.manual.setTripComputer(tripComputer);
    }

    public setGPS(gps: string): void {
        this.manual.setGPS(gps);
    }

    public getResult(): Manual {
        return this.manual;
    }
}