import { Builder } from "./Builder";
import { CarBuilder } from "./CarBuilder";
import { CarManualBuilder } from "./CarManualBuilder";

class Director {
    public makeSUV(builder: Builder): void {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine('Motor');
        builder.setTripComputer('Comum');
        builder.setGPS('Comum');
    }

    public makeSportsCar(builder: Builder): void {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine('Motor');
        builder.setTripComputer('Comum');
        builder.setGPS('Comum');
    }
}

const director = new Director();
const carBuilder = new CarBuilder();
const manualBuilder = new CarManualBuilder();

director.makeSUV(carBuilder);
const car = carBuilder.getResult();

director.makeSUV(manualBuilder);
const manual = manualBuilder.getResult();

console.log(car.constructor.name)
console.log(manual.constructor.name)
