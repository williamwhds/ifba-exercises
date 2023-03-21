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
        '''Inserts a Node into the list.'''
        if self.is_empty():
            new_node = Node(value)
            self.head = new_node
            self.last_node = new_node
            new_node.previous = new_node
            new_node.next = new_node
        else:
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

#a = Lista()
#a.insert(15)
#a.insert(12)
#a.print_list()