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

    def adicionar_aluno_disciplina(self, nome_disciplina, n_matricula):
        '''Adiciona um aluno em uma disciplina.'''
        no_disciplina = self.lista_disciplinas.buscar_disciplina(nome_disciplina)
        no_aluno = self.lista_alunos.buscar_aluno(n_matricula)
        if no_disciplina is None:
            print(f'Disciplina "{nome_disciplina}" não existe.')
            return
        if no_aluno is None:
            print(f'Aluno com nº "{n_matricula}" não existe.')
            return
        no_disciplina.ponteiro.adicionar(no_aluno)

    def remover_aluno_disciplina(self, nome_disciplina, n_matricula):
        '''Remove um aluno de uma disciplina.'''
        no_disciplina = self.lista_disciplinas.buscar_disciplina(nome_disciplina)
        no_aluno = self.lista_alunos.buscar_aluno(n_matricula)
        if no_disciplina is None:
            print(f'Disciplina "{nome_disciplina}" não existe.')
            return
        if no_aluno is None:
            print(f'Aluno com nº "{n_matricula}" não existe.')
            return
        no_disciplina.ponteiro.remover(no_aluno)

    def imprimir_disciplinas(self):
        '''Imprime a lista de disciplinas.'''
        self.lista_disciplinas.imprimir_disciplinas()

    def imprimir_alunos(self):
        '''Imprime a lista de alunos.'''
        self.lista_alunos.imprimir_alunos()
    
    def imprimir_alunos_em_disciplina(self, nome_disciplina):
        '''Imprime a lista de alunos de uma disciplina.'''
        no_disciplina = self.lista_disciplinas.buscar_disciplina(nome_disciplina)
        if no_disciplina is None:
            print(f'Disciplina "{nome_disciplina}" não existe.')
            return
        no_disciplina.ponteiro.imprimir()

    def imprimir_disciplinas_de_aluno(self, n_matricula):
        '''Itera sobre as disciplinas e imprime a lista de disciplinas de um aluno.'''
        no_aluno = self.lista_alunos.buscar_aluno(n_matricula)
        if no_aluno is None:
            print(f'Aluno com nº "{n_matricula}" não existe.')
            return
        no_disciplina = self.lista_disciplinas.cabeca
        print(f"Disciplinas de {no_aluno.nome_aluno}:")
        while no_disciplina is not None:
            if no_disciplina.ponteiro.buscar(no_aluno):
                print(no_disciplina.nome_disciplina)
            no_disciplina = no_disciplina.proximo

'''
if __name__ == '__main__':
    admin = Admin()
    admin.adicionar_disciplina('Estrutura de Dados')
    admin.adicionar_disciplina('Cálculo')
    admin.imprimir_disciplinas() # Estrutura de Dados, Cálculo

    admin.adicionar_aluno('João', 1)
    admin.adicionar_aluno('Maria', 2)
    admin.imprimir_alunos() # João, Maria

    admin.adicionar_aluno_disciplina('Estrutura de Dados', 1) # João adicionado em Estrutura de Dados
    admin.adicionar_aluno_disciplina('Estrutura de Dados', 2) # Maria adicionada em Estrutura de Dados

    admin.adicionar_aluno_disciplina('Cálculo', 1) # João adicionado em Cálculo

    admin.imprimir_alunos_em_disciplina('Estrutura de Dados') # João, Maria

    admin.imprimir_disciplinas_de_aluno(1) # Estrutura de Dados, Cálculo

    admin.remover_aluno_disciplina('Estrutura de Dados', 1) # João removido de Estrutura de Dados

    admin.imprimir_disciplinas_de_aluno(1) # Cálculo, já que João foi removido de Estrutura de Dados

    admin.remover_disciplina('Estrutura de Dados') # Estrutura de Dados removida

    admin.imprimir_disciplinas() # Cálculo, já que Estrutura de Dados foi removida

    admin.imprimir_alunos_em_disciplina('Estrutura de Dados') # Disciplina "Estrutura de Dados" não existe.

    admin.imprimir_disciplinas_de_aluno(2) # Nenhuma disciplina, já que Estrutura de Dados foi removida
'''

admin = Admin()
_input = ''

while _input != "11":
    print()
    print("1 - Adicionar disciplina")
    print("2 - Remover disciplina")
    print("3 - Adicionar aluno")
    print("4 - Remover aluno")
    print("5 - Adicionar aluno em disciplina")
    print("6 - Remover aluno de disciplina")
    print("7 - Imprimir disciplinas")
    print("8 - Imprimir alunos")
    print("9 - Imprimir alunos em disciplina")
    print("10 - Imprimir disciplinas de aluno")
    print("11 - Sair")

    _input = input("Digite o número da opção desejada: ")

    if _input == "1":
        admin.adicionar_disciplina(input("Digite o nome da disciplina: "))
    
    elif _input == "2":
        admin.remover_disciplina(input("Digite o nome da disciplina: "))
    
    elif _input == "3":
        admin.adicionar_aluno(input("Digite o nome do aluno: "), input("Digite o número de matrícula do aluno: "))

    elif _input == "4":
        admin.remover_aluno(input("Digite o número de matrícula do aluno: "))

    elif _input == "5":
        admin.adicionar_aluno_disciplina(input("Digite o nome da disciplina: "), input("Digite o número de matrícula do aluno: "))

    elif _input == "6":
        admin.remover_aluno_disciplina(input("Digite o nome da disciplina: "), input("Digite o número de matrícula do aluno: "))

    elif _input == "7":
        admin.imprimir_disciplinas()

    elif _input == "8":
        admin.imprimir_alunos()

    elif _input == "9":
        admin.imprimir_alunos_em_disciplina(input("Digite o nome da disciplina: "))

    elif _input == "10":
        admin.imprimir_disciplinas_de_aluno(input("Digite o número de matrícula do aluno: "))
