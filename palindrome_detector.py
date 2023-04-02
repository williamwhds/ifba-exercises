palavra = input("Insira uma palavra ->")
string = palavra.lower()
reverse = list(reversed(string))

palindromo = True


for index, i in enumerate(string):
    if not string[index] == reverse[index]:
        palindromo = False

if palindromo:
    print(f"{palavra} é um palíndromo!")
else:
    print(f"{palavra} não é um palíndromo.")