class Node:
    def __init__(self, value):
        self.value = int(value)
        self.previous = None
        self.next = None


class Lista:
    def __init__(self):
        self.head = None
        self.last_node = None

    def is_empty(self):
        '''Returns True if the head of the list points to None.'''
        return self.head is None

    def insert(self, value):
        '''Inserts a Node into the list if the value is not already in the list.'''
        if self.is_empty():
            new_node = Node(value)
            self.head = new_node
            self.last_node = new_node
            new_node.previous = new_node
            new_node.next = new_node
        else:
            # Check if the value already exists in the list
            node = self.head
            while True:
                if node.value == value:
                    print(f"Value {value} already exists in the list.")
                    return
                node = node.next
                if node == self.head:
                    break
            # If the value doesn't exist, insert a new node
            new_node = Node(value)
            new_node.previous = self.last_node
            new_node.next = self.head
            self.last_node.next = new_node
            self.head.previous = new_node
            self.last_node = new_node

    def print_list(self):
        '''Prints out the list.'''
        if self.is_empty():
            print("The list is empty.")
            return
        node = self.head
        print("\nHead of the list\n")
        while True:
            print(f"Value of previous node -> {node.previous.value}, Value of this node -> {node.value}, Value of the next node -> {node.next.value}")
            node = node.next
            if node == self.head:
                break
        print(f"\nValue of the last Node -> {self.last_node.value}")

    def print_reverse(self):
        '''Prints out the list in reverse order.'''
        if self.is_empty():
            print("The list is empty.")
            return
        node = self.last_node
        print("\nLast Node of the list\n")
        while True:
            print(f"Value of previous node -> {node.previous.value}, Value of this node -> {node.value}, Value of the next node -> {node.next.value}")
            node = node.previous
            if node == self.last_node:
                break
        print(f"\nValue of the head Node -> {self.head.value}")

    def delete(self, value):
        '''Deletes a node with the given value from the list.'''
        if self.is_empty():
            print("The list is empty.")
            return
        # Find the node with that value
        node = self.head
        while True:
            if node.value == value:
                break
            node = node.next
            if node == self.head:
                print(f"Value {value} not found in the list.")
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
        print(f"Node with value {value} deleted from the list.")

    def search(self, value):
        '''Searches for a node with the given value in the list.'''
        if self.is_empty():
            print("The list is empty.")
            return
        node = self.head
        node_num = 1
        while True:
            if node.value == value:
                print(f"Node number -> {node_num}, Value -> {node.value}")
                return
            node = node.next
            node_num += 1
            if node == self.head:
                break
        print(f"Value {value} not found in the list.")

    def free_memory(self):
        '''Deletes all nodes from the list.'''

        #Esse método não deleta os nós de verdade. Ele só aponta os nós próximos e anteriores para None.
        #Fiz uma pesquisa, e para deletar da memória, é preciso chamar o módulo de coletor de lixo do python com 'import gc'

        if self.is_empty():
            print("The list is already empty.")
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
        print("All nodes have been deleted from the list.")

#a = Lista()
#a.insert(15)
#a.insert(12)
#a.print_list()
#a.print_reverse()
#a.free_memory()
#a.print_list