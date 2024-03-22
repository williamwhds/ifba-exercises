import { Shape } from "./Shape";

export
class Rectangle extends Shape {
    private width : number;
    private height : number;

    constructor(x:number, y:number, width:number, height:number) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    getWidth () : number {
        return this.width
    }

    getHeight () : number {
        return this.height
    }

    setHeight (height:number) : void {
        this.height = height
    }

    setWidth (width:number) : void {
        this.width = width
    }

    clone () : Rectangle {
        return Object.create(this);
    }   
}
