from dec import Lista_DEC, Node_DEC
from de import Lista_DE, Node_DE

class Mestre:
    '''Esta classe administra listas e sublistas.'''
    def __init__(self):
        self.lista = Lista_DE()

    def get_sub(self, sublista):
        '''Procura e retorna a sublista solicitada.'''
       #Procurando sublista solicitada.
        aux = self.lista.cabeca
        while aux is not None:
            if aux.valor == sublista:
                #Achou a Sublista. Entrando na lista duplamente encadeada circular e retornando endereço.
                return aux.ponteiro
            aux = aux.proximo
        #Sublista não existe na classe Mestre.
        if aux is None:
            return None

    def inserir(self, valor):
        '''Insere uma sublista na lista.'''
        self.lista.inserir(valor)

    def inserir_sublista(self, nsublista, valor):
        '''Insere um valor em uma sublista'''
        sublista = self.get_sub(nsublista)
        if sublista:
            sublista.insert(valor)
        else:
            print(f"Não é possível inserir '{valor}' na sublista '{nsublista}' pois ela não existe.")

    def imprimir(self):
        '''Imprime valores da lista. Não imprime valores de sublistas.'''
        self.lista.imprimir()

    def imprimir_sublista(self, sublista):
        '''Imprime valores da sublista selecionada'''
        sublista = self.get_sub(sublista)
        if sublista:
            sublista.print_list()
        else:
            print(f"Não existe uma sublista nomeada {sublista}.")

    def sublista_inclui(self, sublista, valor):
        '''Recebe uma sublista e valor. Retorna True se valor existe na sublista, False se não existir e None se a sublista não existir.'''
        sublista = self.get_sub(sublista)
        if sublista:
            return sublista.search(valor) 

    def deletar_valor_sublista(self, sublista, valor):
        '''Deleta um valor de uma sublista'''
        sublista = self.get_sub(sublista)
        if sublista:
            sublista.delete(valor)
    
    def deletar_sublista(self, sublista):
        '''Deleta uma sublista'''
        self.lista.deletar(sublista)

adm = Mestre()

#Inserindo sublistas na lista.
adm.inserir("Vendas")
adm.inserir("Financeiro")
adm.inserir("Administração")
adm.imprimir()

#Tentando inserir valores em listas que não existem.
adm.inserir_sublista("Recursos Humanos", "Tomás")

#Inserindo valores nas sublistas.
adm.inserir_sublista("Vendas", "Dário")
adm.inserir_sublista("Financeiro", "Caio")
adm.inserir_sublista("Administração", "Marcelo")

#Imprimindo valores da sublista 'Vendas'.
adm.imprimir_sublista("Vendas")

#Deletando sublistas
print(adm.sublista_inclui("Vendas", "Dário"))  # True.
print(adm.sublista_inclui("Vendas", "Ricardo")) # False.
adm.deletar_sublista("Vendas")                  # Deletando sublista 'Vendas'.
print(adm.sublista_inclui("Vendas", "Dário"))  # None. A sublista 'Vendas' não existe mais.
