'''
Algoritmo de lista simplesmente encadeada.
Haverão duas classes: No e Lista.
A classe No terá dois atributos: valor e proximo.
A classe Lista terá dois atributos: cabeca e tamanho.

A classe Lista terá como métodos:
    adicionar: adiciona um nó à lista.
    remover: remove um nó da lista.
    buscar: retorna True se o valor estiver na lista, False caso contrário.
    imprimir: imprime os valores da lista.
'''

class No:
    '''Nó de uma lista simplesmente encadeada.'''
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None

class Lista:
    '''Lista simplesmente encadeada.'''
    def __init__(self):
        self.cabeca = None
        self.tamanho = 0

    def adicionar(self, valor):
        '''Adiciona um nó à lista.'''
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
        '''Remove um nó da lista.'''
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
        print(f"Não foi possível encontrar o valor {valor}.")

    def buscar(self, valor):
        '''Retorna True se o valor estiver na lista, False caso contrário.'''
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.valor == valor:
                return True
            no_atual = no_atual.proximo
        return False

    def imprimir(self):
        '''Imprime os valores da lista.'''
        lista_valores = []
        no_atual = self.cabeca
        while no_atual is not None:
            lista_valores.append(no_atual.valor)
            no_atual = no_atual.proximo
        print(lista_valores)
