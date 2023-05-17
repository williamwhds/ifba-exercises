#   Algoritmo de Lista Simplemente Encadeada adaptado para funcionamento com sistema_aluno_disciplina.py

class No:
    '''Este nó acomodará o endereco de memória de um objeto do tipo Aluno.'''
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None

class Lista:
    '''Esta classe representa uma lista simplesmente encadeada.'''
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
            n_aluno = no_atual.valor.matricula
            nome_aluno = no_atual.valor.nome_aluno
            lista_valores.append((n_aluno, nome_aluno))
            no_atual = no_atual.proximo
        for aluno in lista_valores:
            print(f'Nº Matrícula: {aluno[0]} - Nome: {aluno[1]}')
