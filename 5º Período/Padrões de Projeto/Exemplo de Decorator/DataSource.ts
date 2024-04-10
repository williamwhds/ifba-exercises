export
interface DataSource {
    writeData(data: string): void;
    readData(): string;
}
