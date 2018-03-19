'''
╔══════════════════════════════════════════════════════════════════════════════╗
║ Instituição   :  Faculdade de Tecnologia de São Paulo                        ║
║ Departamento  :  Tecnologia da Informação                                    ║
║ Curso         :  Análise e Desenvolvimento de Sistemas                       ║
║ Autor         :  Lucio Nunes de Lira                                         ║
╠══════════════════════════════════════════════════════════════════════════════╣
║ Evento        :  Palestra (Números Primos: Conceitos & Algoritmos)           ║
║ Programa      :  Implementações de algoritmos para cálculo de números primos ║
║ Linguagem     :  Python 3                                                    ║
║ Compilador    :  CPython (3.6.4)                                             ║
║ Versão        :  A (Rev. 0)                                                  ║
╚══════════════════════════════════════════════════════════════════════════════╝
'''

# Importação das funções necessárias
from math import sqrt, floor

# Conta os divisores entre 1 e n.
def primo_1(n):
    divisores = 0
    for i in range(1, n + 1):
        if n % i == 0:
            divisores += 1
    if divisores == 2:
        return True
    else:
        return False

# Conta os divisores entre 1 e n.
def primo_2(n):
    divisores = 0
    for i in range(1, n + 1):
        if n % i == 0:
            divisores += 1
    return divisores == 2

# Conta os divisores entre 2 e n-1.
def primo_3(n):
    divisores = 0
    for i in range(2, n):
        if n % i == 0:
            divisores += 1
    return n > 1 and divisores == 0

# Termina as tentativas de divisão na
# primeira ocorrência de uma divisão
# com resto zero.
def primo_4(n):
    if n == 1: return False
    divisor = 2
    while n % divisor != 0:
        divisor += 1
    return divisor == n

# Testa apenas divisores ímpares.
def primo_5(n):
    if n == 1: return False
    if n % 2 == 0: return n == 2
    divisor = 3
    while n % divisor != 0:
        divisor += 2
    return divisor == n

# Testa divisores até a metade de n.
def primo_6(n):
    if n % 2 == 0: return n == 2
    divisor = 3
    metade = n // 2
    while divisor <= metade and n % divisor != 0:
        divisor += 2
    return n > 1 and divisor > metade

# Testa divisores até a raiz de n.
def primo_7(n):
    if n % 2 == 0: return n == 2
    divisor = 3
    raiz = floor(sqrt(n))
    while divisor <= raiz and n % divisor != 0:
        divisor += 2
    return n > 1 and divisor > raiz

# Marca os múltiplos de n com zero.
# Obs.: a partir do segundo múltiplo.
def marca_multiplos(n, lista, lim):
    for i in range(n * 2, lim + 1, n):
        lista[i] = 0

# Devolve uma nova lista sem zeros.
def filtra(lista):
    return [n for n in lista if n != 0]

# Algoritmo "Crivo de Eratóstenes"
# lim = valor do limite
def crivo(lim):
    lista = [n for n in range(lim + 1)]
    lista[1] = 0
    raiz = floor(sqrt(lim))
    for i in range(2, raiz + 1):
        marca_multiplos(i, lista, lim)
    return filtra(lista)
