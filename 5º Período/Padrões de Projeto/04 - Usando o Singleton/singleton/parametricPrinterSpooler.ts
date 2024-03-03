import type { PrinterJob } from '../types.js';

export class ParametricPrinterSpooler {
  private static instances: ParametricPrinterSpooler[] = [];
  private jobs: PrinterJob[] = [];
  private name: String;

  private constructor(name: String) {
    this.name = name;
  }

  static getInstance(name: String): ParametricPrinterSpooler {
    for (var pps of ParametricPrinterSpooler.instances) {
      if (pps.name == name) {
        return pps;
      }
    }

    var i = new ParametricPrinterSpooler(name);
    ParametricPrinterSpooler.instances.push(i);
    return i;
  }

  addJob(job: PrinterJob) {
    this.jobs.unshift(job);
  }

  getNextJob(): PrinterJob | undefined {
    return this.jobs.pop();
  }

  listAllJobs(): PrinterJob[] {
    return [...this.jobs]; // Retorna uma cópia da Array
  }

  clearJobs() {
    this.jobs = [];
  }
}
