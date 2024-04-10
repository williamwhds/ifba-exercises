import { DataSourceDecorator } from "./DataSourceDecorator";
import { FileDataSource } from "./FileDataSource";
import { DataSource } from "./DataSource";
import { EncryptionDecorator } from "./EncryptionDecorator";

let obj = new FileDataSource('teste.txt');
obj.writeData("Testando...");
console.log(obj.readData());

let obj2 = new DataSourceDecorator(obj);
obj2.writeData("Testando outra vez...");
console.log(obj2.readData());

let obj3 = new EncryptionDecorator(obj2);
obj3.writeData(obj3.encrypt("Testando mais uma vez..."));
console.log(obj3.readData());
//console.log(obj3.decrypt(obj3.readData()));
