#
#
#	Algoritmo de lista duplamente encadeada adaptado para funcionalidade com sublista.py
#
#

from dec import Node_DEC, Lista_DEC

class Node_DE:
    '''Nó utilizado em listas duplamente encadeadas.'''
    def __init__(self, valor):
        self.valor = valor
        self.ponteiro = Lista_DEC() #Sublista
        self.anterior = None
        self.proximo = None


class Lista_DE:
    '''Lista duplamente encadeada.'''
    def __init__(self):
        self.cabeca = None
    
    def vazio(self):
        '''Retorna True se a cabeça da lista estiver vazia. Falso se o contrário.'''
        return self.cabeca is None
    
    def inserir(self, valor):
        '''Insere um valor na lista. Não é possivel inserir se já existir um nó com o mesmo valor.'''
        if self.vazio():
            novo_no = Node_DE(valor)
            novo_no.valor = valor
            novo_no.anterior = None
            novo_no.proximo = None
            self.cabeca = novo_no
        else:
            # Varificando se já tem um nó com o valor inserido
            aux = self.cabeca
            while True:
                if aux.valor == valor:
                    print(f"Já existe um nó de valor '{valor}' na lista.")
                    return
                aux = aux.proximo
                if aux is None:
                    break
                
            # Se o valor não existe na lista, crie um
            aux = self.cabeca
            while aux.proximo is not None:
                aux = aux.proximo
            novo_no = Node_DE(valor)
            aux.proximo = novo_no
            novo_no.anterior = aux
            novo_no.proximo = None

    def imprimir(self):
        '''Imprime a lista.'''
        print("\nCabeça da lista\nvvvvvv")
        aux = self.cabeca
        while aux is not None:
            # Se nós anteriores e próximos não existirem, exiba None.
            print(f"Anterior - {aux.anterior.valor if aux.anterior else None}, Valor do nó - {aux.valor}, Próximo - {aux.proximo.valor if aux.proximo else None}")
            aux = aux.proximo
        print("^^^^^^\nFim da Lista\n")

    def deletar(self, valor):
        '''Deleta um nó com um determinado valor da lista.'''
        if self.vazio():
            print("A lista está vazia.")
            return
        
        # Nó é a cabeça da lista
        if self.cabeca.valor == valor:
            self.cabeca = self.cabeca.proximo
            if self.cabeca is not None:
                self.cabeca.anterior = None
            return
        
        # Buscando o nó
        aux = self.cabeca
        while aux is not None:
            if aux.valor == valor:
                break
            aux = aux.proximo
        
        # Caso o valor não esteja na lista
        if aux is None:
            print(f"O valor '{valor}' não está na lista.")
            return
        
        # Deletando o objeto Node_DE da memória
        aux.anterior.proximo = aux.proximo
        if aux.proximo is not None:
            aux.proximo.anterior = aux.anterior
        del aux

if __name__ == "__main__":
    lista = Lista_DE()
    lista.inserir("pog")
    lista.imprimir()
    lista.inserir("pog")
    lista.inserir("nog")
    lista.imprimir()
    lista.inserir("jog")
    lista.imprimir()
    lista.deletar("fog")
    lista.deletar("pog")
    lista.imprimir()
