import { DataSourceDecorator } from "./DataSourceDecorator";

export
class EncryptionDecorator extends DataSourceDecorator {
    writeData(data: string): void {
        super.writeData(data);
    }

    readData(): string {
        return super.readData();
    }

    encrypt(data: string): string {
        return data + " (encrypted)"; 
    }

    decrypt(data: string): string {
        return data.replace(" (encrypted)", "");
    }
}