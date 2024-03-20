import {Car} from './Car';
import {Builder} from './Builder';

export
class CarBuilder implements Builder {
    private car: Car;

    constructor() {
        this.car = new Car();
    }

    public reset(): void {
        this.car = new Car();
    }

    public setSeats(seats: number): void {
        this.car.setSeats(seats);
    }

    public setEngine(engine: string): void {
        this.car.setEngine(engine);
    }

    public setTripComputer(tripComputer: string): void {
        this.car.setTripComputer(tripComputer);
    }

    public setGPS(gps: string): void {
        this.car.setGPS(gps);
    }

    public getResult(): Car {
        return this.car;
    }
}