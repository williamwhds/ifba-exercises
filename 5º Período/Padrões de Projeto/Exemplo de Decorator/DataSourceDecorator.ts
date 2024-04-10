import { DataSource } from "./DataSource";

export
class DataSourceDecorator implements DataSource {
    private wrappee: DataSource;

    constructor(source: DataSource) {
        this.wrappee = source;
    }

    writeData(data: string): void {
        this.wrappee.writeData(data);
    }

    readData(): string {
        return this.wrappee.readData();
    }
}
