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
