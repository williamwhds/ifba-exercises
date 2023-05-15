#   Algoritmo de Lista Duplamente Encadeada adaptado para funcionalidade com sistema_aluno_disciplina.py

#TESTAR ADICIONAR E REMOVER. REFAZER O RESTO

class No_Disciplina:
    '''Este nó representa uma disciplina.'''
    def __init__(self, nome_disciplina):
        self.nome_disciplina = nome_disciplina
        self.ponteiro = None
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

    def buscar(self, valor):
        no_atual = self.cabeca
        while no_atual is not None:
            if no_atual.valor == valor:
                return True
            no_atual = no_atual.proximo
        return False

    def imprimir(self):
        lista_valores = []
        no_atual = self.cabeca
        while no_atual is not None:
            lista_valores.append(no_atual.valor)
            no_atual = no_atual.proximo
        print(lista_valores)

if __name__ == "__main__":
    alunos = Lista_DE()