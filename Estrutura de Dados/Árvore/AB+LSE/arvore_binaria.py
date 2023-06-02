#Esse algoritmo foi modificado para acomodar listas simplesmente encadeadas em cada nó da árvore binária.

from se import *

class Node:
    ''' Classe que representa um nó da árvore binária. Possui um ponteiro para uma lista simplesmente encadeada.'''
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
        self.lista = Lista()

class BinarySearchTree:
    ''' Classe que representa uma árvore binária de busca. Possui um ponteiro para a raiz da árvore e um ponteiro para uma lista simplesmente encadeada.'''
    def __init__(self):
        self.root = None
        self.lista = Lista()

    def insert(self, key):
        ''' Insere um novo nó na árvore binária de busca.'''
        if self.root is None:
            self.root = Node(key)
        else:
            self._insert_recursive(key, self.root)

    def _insert_recursive(self, key, current_node):
        ''' Função auxiliar para inserir um novo nó na árvore binária de busca.'''
        if key < current_node.key:
            if current_node.left is None:
                current_node.left = Node(key)
            else:
                self._insert_recursive(key, current_node.left)
        else:
            if current_node.right is None:
                current_node.right = Node(key)
            else:
                self._insert_recursive(key, current_node.right)

    def search(self, key):
        ''' Busca um nó na árvore binária de busca.'''
        return self._search_recursive(key, self.root)

    def _search_recursive(self, key, current_node):
        ''' Função auxiliar para buscar um nó na árvore binária de busca.'''
        if current_node is None or current_node.key == key:
            return current_node
        if key < current_node.key:
            return self._search_recursive(key, current_node.left)
        return self._search_recursive(key, current_node.right)

    def remove(self, key):
        ''' Remove um nó da árvore binária de busca.'''
        self.root = self._remove_recursive(key, self.root)

    def _remove_recursive(self, key, current_node):
        ''' Função auxiliar para remover um nó da árvore binária de busca.'''
        if current_node is None:
            return current_node

        if key < current_node.key:
            current_node.left = self._remove_recursive(key, current_node.left)
        elif key > current_node.key:
            current_node.right = self._remove_recursive(key, current_node.right)
        else:
            if current_node.left is None:
                return current_node.right
            elif current_node.right is None:
                return current_node.left
            else:
                current_node.key = self._find_minimum(current_node.right)
                current_node.right = self._remove_recursive(current_node.key, current_node.right)
        return current_node

    def _find_minimum(self, current_node):
        ''' Função auxiliar para encontrar o menor nó da árvore binária de busca.'''
        while current_node.left is not None:
            current_node = current_node.left
        return current_node.key

    def inorder_traversal(self):
        ''' Percorre a árvore binária de busca em ordem simétrica.'''
        self._inorder_recursive(self.root)

    def _inorder_recursive(self, current_node):
        ''' Função auxiliar para percorrer a árvore binária de busca em ordem simétrica.'''
        if current_node:
            self._inorder_recursive(current_node.left)
            print(current_node.key)
            self._inorder_recursive(current_node.right)

    def preorder_traversal(self):
        ''' Percorre a árvore binária de busca em pré-ordem.'''
        self._preorder_recursive(self.root)

    def _preorder_recursive(self, current_node):
        ''' Função auxiliar para percorrer a árvore binária de busca em pré-ordem.'''
        if current_node:
            print(current_node.key)
            self._preorder_recursive(current_node.left)
            self._preorder_recursive(current_node.right)

    def postorder_traversal(self):
        ''' Percorre a árvore binária de busca em pós-ordem.'''
        self._postorder_recursive(self.root)

    def _postorder_recursive(self, current_node):
        ''' Função auxiliar para percorrer a árvore binária de busca em pós-ordem.'''
        if current_node:
            self._postorder_recursive(current_node.left)
            self._postorder_recursive(current_node.right)
            print(current_node.key)