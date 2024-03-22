import { Shape } from "./Shape";
import { Rectangle } from "./Rectangle";
import { Circle } from "./Circle";

let circulo = new Circle(5, 5, 10);
let circuloClone = circulo.clone();

console.log(circuloClone.getX());
console.log(circulo.getX());

console.log(circulo == circuloClone);
console.log(circulo.constructor === circuloClone.constructor); // true
