import { DataSource } from "./DataSource";

export
class FileDataSource implements DataSource {
    private data: string;
    private filename: string;
    
    constructor(filename : string) {
        this.filename = filename
        this.data = '';
    }

    writeData(data: string): void {
        this.data = data;
    }

    readData(): string {
        return this.data;
    }
}
