import type { PrinterJob } from '../types.js';

export class PrinterSpooler {
  private static instance: PrinterSpooler;
  private jobs: PrinterJob[] = [];

  private constructor() {}

  static getInstance(): PrinterSpooler {
    if (PrinterSpooler.instance == null) {
      PrinterSpooler.instance = new PrinterSpooler();
    }
    return PrinterSpooler.instance;
  }

  addJob(job: PrinterJob) {
    this.jobs.unshift(job); // unshift ao invés de push para atender aos testes
  }

  getNextJob(): PrinterJob | undefined {
    return this.jobs.pop(); // Retorna e remove o último elemento da Array
  }

  listAllJobs(): PrinterJob[] {
    return [...this.jobs]; // Retorna uma cópia da Array
  }

  clearJobs() {
    this.jobs = [];
  }
}
