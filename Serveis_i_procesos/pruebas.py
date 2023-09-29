def tablas():
    for x in range(11):
        print('Tablas de Multiplicar del', x)
        for y in range(11):
            print(x, 'x', y, '=', x * y)


tablas()


def matrices():
    filas = 2
    columnas = 2
    matriz1 = [[1, 2], [5, 3]]
    matriz2 = [[4, 5], [2, 3]]
    matriz3 = [[0, 0], [0, 0]]

    print("Matriz1:")
    for fila in matriz1:
        print(fila)

    print("\nMatriz2:")
    for fila in matriz2:
        print(fila)

    for i in range(filas):
        for j in range(columnas):
            matriz3[i][j] = matriz1[i][j] + matriz2[i][j]

    print("\nResultado de la suma:")
    for fila in matriz3:
        print(fila)


matrices()
