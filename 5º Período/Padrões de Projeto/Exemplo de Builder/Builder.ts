export
interface Builder {
    reset(): void;
    setSeats(seats: number): void;
    setEngine(engine: string): void;
    setTripComputer(tripComputer: string): void;
    setGPS(gps: string): void;
}