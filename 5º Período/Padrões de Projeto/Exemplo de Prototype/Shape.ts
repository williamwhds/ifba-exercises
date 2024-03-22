export
class Shape {
    private x : number;
    private y : number;
    private color : string;

    constructor(x:number, y:number) {
        this.x = x;
        this.y = y;
        this.color = "";
    }

    getX () : number {
        return this.x
    }

    getY () : number {
        return this.y
    }

    getColor () : string {
        return this.color
    }

    setColor (color:string) : void {
        this.color = color
    }

    setX (x:number) : void {
        this.x = x
    }

    setY (y:number) : void {
        this.y = y
    }

    clone () : Shape {
        return Object.create(this);
    }
}