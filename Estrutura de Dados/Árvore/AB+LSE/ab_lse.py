'''
Este algortimo administrará uma árvore Binária com uma Lista Simplesmente Encadeada em cada nó, inclusive a raiz.

A classe Admin terá um ponteiro para uma árvore binária e possuirá atributos para administrar a estrutura.

A classe Admin terá como métodos:
    adicionar_no_arvore: adiciona um nó à árvore.
    remover_no_arvore: remove um nó da árvore.
    buscar_no_arvore: retorna True se o valor estiver na árvore, False caso contrário.
    imprimir_arvore: imprime os valores da árvore.
    imprimir_lista: imprime os valores da lista. Recebe como parâmetro o nó da árvore.
    adicionar_no_lista: adiciona um nó à lista. Recebe como parâmetro o nó da árvore.
    remover_no_lista: remove um nó da lista. Recebe como parâmetro o nó da árvore.
    buscar_no_lista: retorna True se o valor estiver na lista, False caso contrário. Recebe como parâmetro o nó da árvore.
'''

from arvore_binaria import *

class Admin:
    '''Classe que administra uma árvore binária com listas simplesmente encadeadas.'''
    def __init__(self):
        self.arvore = BinarySearchTree()

    def adicionar_no_arvore(self, valor):
        '''Adiciona um nó à árvore.'''
        self.arvore.insert(valor)

    def remover_no_arvore(self, valor):
        '''Remove um nó da árvore.'''
        self.arvore.remove(valor)

    def buscar_no_arvore(self, valor):
        '''Retorna True se o valor estiver na árvore, False caso contrário.'''
        return self.arvore.search(valor)

    def imprimir_arvore(self):
        '''Imprime os valores da árvore.'''
        self.arvore.print_tree()

    def imprimir_lista(self, no):
        '''Imprime os valores da lista. Recebe como parâmetro o nó da árvore.'''
        no = self.buscar_no_arvore(no)
        no.lista.imprimir()

    def adicionar_no_lista(self, no, valor):
        '''Adiciona um nó à lista. Recebe como parâmetro o nó da árvore.'''
        no = self.buscar_no_arvore(no)
        no.lista.adicionar(valor)

    def remover_no_lista(self, no, valor):
        '''Remove um nó da lista. Recebe como parâmetro o nó da árvore.'''
        no = self.buscar_no_arvore(no)
        no.lista.remover(valor)

    def buscar_no_lista(self, no, valor):
        '''Retorna True se o valor estiver na lista, False caso contrário. Recebe como parâmetro o nó da árvore.'''
        no = self.buscar_no_arvore(no)
        return no.lista.buscar(valor)


if __name__ == "__main__":
    adm = Admin()

    #Testes da árvore binária

    adicionar = [10, 5, 15, 3, 7, 12, 17, 1, 4, 6, 8, 11, 13, 16, 18]
    for i in adicionar:
        adm.adicionar_no_arvore(i)
    adm.imprimir_arvore() # Adicionando lista de números à árvore

    remover = [10, 5, 15, 3, 7, 12, 17, 1, 4, 6, 8, 11, 13]
    for i in remover:
        adm.remover_no_arvore(i)
    adm.imprimir_arvore() # Sobram 16 e 18

    print(adm.buscar_no_arvore(10)) # Retorna None
    print(adm.buscar_no_arvore(16)) # Retorna o objeto nó

    #Testes da lista

    adm.adicionar_no_lista(16, 1)
    adm.adicionar_no_lista(16, 2)
    adm.adicionar_no_lista(16, 3)

    adm.imprimir_lista(16) # [1, 2, 3]
    adm.remover_no_lista(16, 2)
    adm.imprimir_lista(16) # [1, 3]

    print(adm.buscar_no_lista(16, 1)) # True
    print(adm.buscar_no_lista(16, 2)) # False

    adm.adicionar_no_lista(18, 1)
    adm.imprimir_lista(18) # [1]
