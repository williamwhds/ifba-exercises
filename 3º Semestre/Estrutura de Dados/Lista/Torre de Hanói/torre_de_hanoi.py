import func_pilha as fp

def moverAnel(torre_origem, torre_alvo):
    '''Move o anel da torre_origem para torre_alvo.'''
    #Detectando o anel da torre de origem/alvo.
    anel = None
    for i in torre_origem[2]:
        if i != 0:
            anel = i
    if anel is None:
        anel = 0

    anel_torrealvo = None
    for i in torre_alvo[2]:
        if i != 0:
            anel_torrealvo = i
    if anel_torrealvo is None:
        anel_torrealvo = 0

    #Não faça nada caso anel seja maior que anel_torrealvo. 
    #Única exceção sendo anel_torrealvo ser 0, já que isso significa que a pilha está vazia.
    if anel > anel_torrealvo and anel_torrealvo != 0:
        print("O Anel Origem é maior que o Anel Alvo. Tente Novamente.")
    else:
        fp.pop(torre_origem)
        fp.push(torre_alvo, anel)
        

#Declarando as torres e a quantidade de anéis.
q_aneis = int(input("Insira a quantidade de anéis ->"))

torre1 = fp.novaPilha(q_aneis)
torre2 = fp.novaPilha(q_aneis)
torre3 = fp.novaPilha(q_aneis)

#Adicionando os "anéis" na primeira torre.
n_aneis = q_aneis

for i in range(0,q_aneis):
    torre1[2][i] = n_aneis
    n_aneis -= 1

#Como a torre começa com aneís em tamanho crescente, eu modifico o topo da primeira torre para ser o último index.
torre1[1] = torre1[0]

#Se essa sequência for encontrada em uma torre sem ser a primeira, o jogo acaba.
sequencia_vitoria = torre1[2]

#Atalho das torres para facilitar a impressão.
torres = [torre1, torre2, torre3]

_input = ""

while _input != "2":
    if torre2[2] == sequencia_vitoria or torre3[2] == sequencia_vitoria:
        print("Você venceu!")
        break

    print(f"1 - {torre1[2]}")
    print(f"2 - {torre2[2]}")
    print(f"3 - {torre3[2]}")

    print("O que deseja fazer?\n1 - Mover anel\n2 - Sair")
    _input = input("->")

    if _input == "1":
        print(f"1 - {torre1[2]}")
        print(f"2 - {torre2[2]}")
        print(f"3 - {torre3[2]}")
        try:
            idx_origem =  int(input("Selecione a torre de origem. ->")) -1
            idx_alvo =    int(input("Selecione a torre alvo. ->")) -1
            moverAnel(torres[idx_origem], torres[idx_alvo])
        except:
            print("Input não é válido. Tente novamente.")