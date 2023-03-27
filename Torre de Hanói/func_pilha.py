#Funções de pilha

def isEmpty(pilha):
    '''Retorna True se a pilha estiver vazia.'''
    if pilha[1] == -1:
        return True
    else:
        return False

def isFull(pilha):
    '''Retorna True se a pilha está em sua capacidade máxima.'''
    if pilha[1] == pilha[0]:
        return True
    else:
        return False

def push(pilha, valor):
    '''Insere o elemento "valor" na pilha.'''
    if isFull(pilha):
        return print("A Pilha está cheia.")
    if pilha[1] == -1:
        pilha[1] = 0
    pilha[2][pilha[1]] = valor  #Acessando os dados usando o Topo como index
    pilha[1] = pilha[1]+1       #Aumentando o "Topo" (index)

def pop(pilha):
    '''Remove o elemento da posição topo da pilha e o retorna.'''
    if isEmpty(pilha):
        return print("A Pilha está vazia.")
    else:
        #O valor '{pilha[2][pilha[1]-1]}' será removido.
        pilha[2][pilha[1]-1] = 0
        pilha[1] = pilha[1] - 1
        if pilha[1] == 0:
            pilha[1] = -1

def novaPilha(tamanho):
    '''Cria uma estrutura de pilha. [0] = Tamanho; [1] = Topo; [2] = Dados'''
    pilha = [
        tamanho,            #Tamanho
        -1,                 #Topo (index) (-1 == vazia)
        []                  #Dados
    ]

    for i in range(0, pilha[0]): #Adicionando
        pilha[2] += [0]

    return pilha