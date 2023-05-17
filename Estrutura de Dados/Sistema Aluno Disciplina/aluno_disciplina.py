'''
Este será um algoritmo de administração de alunos e disciplinas.
Será criado uma classe chamada Admin, que terá como atributos:
    - Uma lista duplamente encadeada de disciplinas;
    - Uma lista duplamente encadeada de alunos;

Cada nó da lista de alunos terá como atributos:
    - O nome do aluno;
    - O número de matrícula do aluno;

Cada nó da lista de disciplinas terá como atributos:
    - O nome da disciplina;
    - Um ponteiro para uma lista simplesmente encadeada

Cada nó dessa lista simplemente encadeada terá como atributos:
    - Um ponteiro para o nó de um aluno;
    - Um ponteiro para o próximo nó da lista;

A classe Admin terá como métodos:
    - Adicionar disciplina;
    - Remover disciplina;
    - Adicionar aluno;
    - Remover aluno;
    - Adicionar aluno em disciplina;
    - Remover aluno de disciplina;
    - Imprimir lista de disciplinas;
    - Imprimir lista de alunos;
    - Imprimir lista de alunos em disciplina;
    - Imprimir lista de disciplinas de um aluno (Iterar sobre todas as disciplinas);
'''

from DE import *

class Admin:
    '''Esta classe é utilizada para administrar alunos e disciplinas.'''
    def __init__(self):
        self.lista_disciplinas = Lista_DE()
        self.lista_alunos = Lista_DE()

    def adicionar_disciplina(self, nome_disciplina):
        '''Adiciona uma disciplina na lista de disciplinas.'''
        self.lista_disciplinas.adicionar_no_disciplina(nome_disciplina)
    
    def remover_disciplina(self, nome_disciplina):
        '''Remove uma disciplina da lista de disciplinas.'''
        self.lista_disciplinas.remover_disciplina(nome_disciplina)

    def adicionar_aluno(self, nome, n_matricula):
        '''Adiciona um aluno na lista de alunos.'''
        self.lista_alunos.adicionar_no_aluno(nome, n_matricula)

    def remover_aluno(self, n_matricula):
        '''Remove um aluno da lista de alunos.'''
        self.lista_alunos.remover_aluno(n_matricula)