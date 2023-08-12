#
#
#	Algoritmo de lista duplamente encadeada circular adaptado para funcionalidade com sublista.py
#
#

class Node_DEC:
    def __init__(self, value):
        self.value = value
        self.previous = None
        self.next = None


class Lista_DEC:
    def __init__(self):
        self.head = None
        self.last_node = None

    def is_empty(self):
        '''Returns True if the head of the list points to None.'''
        return self.head is None

    def insert(self, value):
        '''Inserts a Node into the list if the value is not already in the list.'''
        if self.is_empty():
            new_node = Node_DEC(value)
            self.head = new_node
            self.last_node = new_node
            new_node.previous = new_node
            new_node.next = new_node
        else:
            # Check if the value already exists in the list
            node = self.head
            while True:
                if node.value == value:
                    print(f"Valor {value} já existe.")
                    return
                node = node.next
                if node == self.head:
                    break
            # If the value doesn't exist, insert a new node
            new_node = Node_DEC(value)
            new_node.previous = self.last_node
            new_node.next = self.head
            self.last_node.next = new_node
            self.head.previous = new_node
            self.last_node = new_node

    def print_list(self):
        '''Prints out the list.'''
        if self.is_empty():
            print("A sublista está vazia.")
            return
        node = self.head
        print("\nCabeça da Sublista\n")
        while True:
            print(f"Valor do nó anterior -> {node.previous.value}, Valor deste nó -> {node.value}, Valor do próximo nó -> {node.next.value}")
            node = node.next
            if node == self.head:
                break
        print(f"\nValor do último nó -> {self.last_node.value}")

    def print_reverse(self):
        '''Prints out the list in reverse order.'''
        if self.is_empty():
            print("A sublista está vazia.")
            return
        node = self.last_node
        print("\nÚltimo valor da lista\n")
        while True:
            print(f"Valor do nó anterior -> {node.previous.value}, Valor deste nó -> {node.value}, Valor do próximo nó -> {node.next.value}")
            node = node.previous
            if node == self.last_node:
                break
        print(f"\nValor do primeiro nó -> {self.head.value}")

    def delete(self, value):
        '''Deletes a node with the given value from the list.'''
        if self.is_empty():
            print("A sublista está vazia.")
            return
        # Find the node with that value
        node = self.head
        while True:
            if node.value == value:
                break
            node = node.next
            if node == self.head:
                print(f"Valor {value} não encontrado na sublista.")
                return
        #Only node in list
        if node == self.head and node == self.last_node:
            self.head = None
            self.last_node = None
        #Node is head of list
        elif node == self.head:
            self.head = node.next
            self.last_node.next = self.head
            self.head.previous = self.last_node
        #Node is last node of the list
        elif node == self.last_node:
            self.last_node = node.previous
            self.last_node.next = self.head
            self.head.previous = self.last_node
        #Node is in the middle of the list
        else:
            node.previous.next = node.next
            node.next.previous = node.previous
        print(f"Nó de valor {value} deletado da lista.")

    def search(self, value):
        '''Searches for a node with the given value in the list.'''
        if self.is_empty():
            print("A sublista está vazia. Não é possível pesquisar por um valor.")
            return
        node = self.head
        while True:
            if node.value == value:
                return True
            node = node.next
            if node == self.head:
                return False
        

    def free_memory(self):
        '''Deletes all nodes from the list.'''

        #Esse método não deleta os nós de verdade. Ele só aponta os nós próximos e anteriores para None.
        #Fiz uma pesquisa, e para deletar da memória, é preciso chamar o módulo de coletor de lixo do python com 'import gc'

        if self.is_empty():
            print("A sublista já está vazia.")
            return
        node = self.head
        while True:
            next_node = node.next
            if node == self.last_node:
                break
            node.previous = None
            node.next = None
            node = next_node
        self.head = None
        self.last_node = None
        print("Todos os nós foram deletados desta sublista.")
