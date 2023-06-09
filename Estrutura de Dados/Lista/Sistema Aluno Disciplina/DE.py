#   Algoritmo de Lista Duplamente Encadeada adaptado para funcionalidade com sistema_aluno_disciplina.py
from SE import * # Importa a classe de lista simplesmente encadeada

class No_Disciplina:
    '''Este nó representa uma disciplina.'''
    def __init__(self, nome_disciplina):
        self.nome_disciplina = nome_disciplina
        self.ponteiro = Lista()
        self.anterior = None
        self.proximo = None

class No_Alunos:
    '''Este nó representa um aluno.'''
    def __init__(self, nome_aluno, n_matricula):
        self.nome_aluno = nome_aluno
        self.matricula = n_matricula
        self.anterior = None
        self.proximo = None

class Lista_DE:
    '''Esta classe representa uma lista duplamente encadeada.'''
    def __init__(self):
        self.cabeca = None
        self.tamanho = 0

    def adicionar_no_disciplina(self, nome_disciplina):
        '''Adiciona um nó de disciplina à lista.'''
        if self.disciplina_existe(nome_disciplina):
            print(f'A disciplina de {nome_disciplina} já existe.')
            return
        novo_no = No_Disciplina(nome_disciplina)
        if self.cabeca is None:
            self.cabeca = novo_no
        else:
            no_atual = self.cabeca
            while no_atual.proximo is not None:
                no_atual = no_atual.proximo
            no_atual.proximo = novo_no
            novo_no.anterior = no_atual
        self.tamanho += 1

    def adicionar_no_aluno(self, nome_aluno, n_matricula):
        '''Adiciona um nó de aluno à lista.'''
        if self.aluno_existe(n_matricula):
            print(f'Aluno com nº "{n_matricula}" já existe.')
            return
        novo_no = No_Alunos(nome_aluno, n_matricula)
        if self.cabeca is None:
            self.cabeca = novo_no
        else:
            no_atual = self.cabeca
            while no_atual.proximo is not None:
                no_atual = no_atual.proximo
            no_atual.proximo = novo_no
            novo_no.anterior = no_atual
        self.tamanho += 1

    def remover_aluno(self, n_matricula):
        '''Remove um nó de aluno da lista.'''
        if self.cabeca is None:
            return
        if self.cabeca.matricula == n_matricula:
            self.cabeca = self.cabeca.proximo
            self.cabeca.anterior = None
            self.tamanho -= 1
            return
        no_atual = self.cabeca
        while no_atual.proximo is not None:
            if no_atual.proximo.matricula == n_matricula:
                no_atual.proximo = no_atual.proximo.proximo
                if no_atual.proximo is not None:
                    no_atual.proximo.anterior = no_atual
                self.tamanho -= 1
                return
            no_atual = no_atual.proximo

    def remover_disciplina(self, n_disciplina):
        '''Remove um nó de disciplina da lista.'''
        if self.cabeca is None:
            return
        if self.cabeca.nome_disciplina == n_disciplina:
            self.cabeca = self.cabeca.proximo
            self.cabeca.anterior = None
            self.tamanho -= 1
            return
        no_atual = self.cabeca
        while no_atual.proximo is not None:
            if no_atual.proximo.nome_disciplina == n_disciplina:
                no_atual.proximo = no_atual.proximo.proximo
                if no_atual.proximo is not None:
                    no_atual.proximo.anterior = no_atual
                self.tamanho -= 1
                return
            no_atual = no_atual.proximo

    def disciplina_existe(self, nome_disciplina):
        '''Verifica se uma disciplina existe na lista. Retorna True se sim, False se não.'''
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.nome_disciplina == nome_disciplina:
                return True
            no_atual = no_atual.proximo
        return False

    def aluno_existe(self, n_matricula):
        '''Verifica se um aluno existe na lista. Retorna True se sim, False se não.'''
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.matricula == n_matricula:
                return True
            no_atual = no_atual.proximo
        return False

    def imprimir_disciplinas(self):
        '''Imprime as disciplinas da lista.'''
        lista_disciplinas = []
        no_atual = self.cabeca
        while no_atual is not None:
            lista_disciplinas.append(no_atual.nome_disciplina)
            no_atual = no_atual.proximo
        print(lista_disciplinas)

    def imprimir_alunos(self):
        '''Imprime os alunos da lista.'''
        lista_alunos = []
        no_atual = self.cabeca
        while no_atual is not None:
            lista_alunos.append(no_atual.nome_aluno)
            no_atual = no_atual.proximo
        print(lista_alunos)

    def buscar_disciplina(self, nome_disciplina):
        '''Busca uma disciplina na lista e retorna o nó.'''
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.nome_disciplina == nome_disciplina:
                return no_atual
            no_atual = no_atual.proximo
        return None
    
    def buscar_aluno(self, n_matricula):
        '''Busca um aluno na lista e retorna o nó.'''
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.matricula == n_matricula:
                return no_atual
            no_atual = no_atual.proximo
        return None

if __name__ == "__main__":
    alunos = Lista_DE()

    alunos.adicionar_no_aluno("João", "1")
    alunos.adicionar_no_aluno("Maria", "2")
    alunos.adicionar_no_aluno("Mario", "2") # Aluno com nº "2" já existe.

    alunos.imprimir_alunos() # ['João', 'Maria']

    alunos.remover_aluno("1")

    alunos.imprimir_alunos() # ['Maria']

    print(alunos.aluno_existe("2")) # True
    print(alunos.aluno_existe("1")) # False

    disciplina = Lista_DE()

    disciplina.adicionar_no_disciplina("Estrutura de Dados")
    disciplina.adicionar_no_disciplina("Programação Orientada a Objetos")
    disciplina.adicionar_no_disciplina("Estrutura de Dados") # A disciplina de Estrutura de Dados já existe.

    disciplina.imprimir_disciplinas() # ['Estrutura de Dados', 'Programação Orientada a Objetos']

    disciplina.remover_disciplina("Estrutura de Dados")

    disciplina.imprimir_disciplinas() # ['Programação Orientada a Objetos']

    print(disciplina.disciplina_existe("Programação Orientada a Objetos"))  # True
    print(disciplina.disciplina_existe("Estrutura de Dados"))               # False