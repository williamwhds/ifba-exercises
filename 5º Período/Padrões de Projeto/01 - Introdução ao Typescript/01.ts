// Declaração de classe, encapsulamento de métodos e atributos
class ContaCorrente{
    // Atributo estático
    private static staticId:number = 1;
    private id:number;
    constructor(private nome:string, private saldo:number) {
        this.nome = nome;
        this.saldo = saldo;
        this.id = ContaCorrente.staticId;
        ContaCorrente.staticId++;
    }

    // Getters e setters

    getId() : number{
        return this.id;
    }

    getNome() : string {
        return this.nome;
    }

    getSaldo() : number {
        return this.saldo;
    }

    setSaldo(novoSaldo : number) {
        this.saldo = novoSaldo;
    }
}

// Classe abstrata 
abstract class Animal {
  private nome: string;
  constructor(nome: string) {
    this.nome = nome;
  }

  abstract fazerBarulho(): string;
}

// Herança de classe abstrata
class Cachorro extends Animal{
    constructor(nome: string) {
        super(nome);
    }

    fazerBarulho() {
        return "Au!"
    }
}

// Herança de classe concreta
class ContaPoupanca extends ContaCorrente {
    constructor(nome:string, saldo:number) {
        super(nome, saldo);
    }

    aplicarRendimento () {
        this.setSaldo(this.getSaldo() * 1.05);
    }
}

// Declaração de interface
interface Pessoa {
  nome: string;
  idade: number;
  cpf: string;
  endereco: string;
}
