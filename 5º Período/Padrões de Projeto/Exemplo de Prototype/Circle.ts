import { Shape } from "./Shape";

export
class Circle extends Shape {
    private radius : number;

    constructor(x:number, y:number, radius:number) {
        super(x, y);
        this.radius = radius;
    }

    getRadius () : number {
        return this.radius
    }

    setRadius (radius:number) : void {
        this.radius = radius
    }

    clone () : Circle {
        return Object.create(this);
    }   
}