palavra = input("Insira uma palavra ->")
string = palavra.lower()
reverse = list(reversed(string))

palindromo = True

count = 0
for i in string:
    if not string[count] == reverse[count]:
        palindromo = False

if palindromo:
    print(f"{palavra} é um palíndromo!")
else:
    print(f"{palavra} não é um palíndromo.")