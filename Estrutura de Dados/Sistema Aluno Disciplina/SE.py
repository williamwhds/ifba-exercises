#   Algoritmo de Lista Simplemente Encadeada adaptado para funcionamento com sistema_aluno_disciplina.py

class No:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None

class Lista:
    def __init__(self):
        self.cabeca = None
        self.tamanho = 0

    def adicionar(self, valor):
        novo_no = No(valor)
        if self.cabeca is None:
            self.cabeca = novo_no
        else:
            no_atual = self.cabeca
            while no_atual.proximo is not None:
                no_atual = no_atual.proximo
            no_atual.proximo = novo_no
        self.tamanho += 1

    def remover(self, valor):
        if self.cabeca is None:
            return
        if self.cabeca.valor == valor:
            self.cabeca = self.cabeca.proximo
            self.tamanho -= 1
            return
        no_atual = self.cabeca
        while no_atual.proximo is not None:
            if no_atual.proximo.valor == valor:
                no_atual.proximo = no_atual.proximo.proximo
                self.tamanho -= 1
                return
            no_atual = no_atual.proximo

    def buscar(self, valor):
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.valor == valor:
                return True
            no_atual = no_atual.proximo
        return False

    def imprimir(self):
        lista_valores = []
        no_atual = self.cabeca
        while no_atual is not None:
            lista_valores.append(no_atual.valor)
            no_atual = no_atual.proximo
        print(lista_valores)
