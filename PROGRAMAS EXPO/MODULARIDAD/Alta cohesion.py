class CalculadoraEstadisticas:
    def __init__(self, datos):
        self.datos = datos

    def calcular_promedio(self):
        return sum(self.datos) / len(self.datos)

    def calcular_maximo(self):
        return max(self.datos)

    def calcular_minimo(self):
        return min(self.datos)

def main():
    numeros = [15, 7, 21, 8, 3, 9, 11]
    
    calculadora = CalculadoraEstadisticas(numeros)
    
    promedio = calculadora.calcular_promedio()
    maximo = calculadora.calcular_maximo()
    minimo = calculadora.calcular_minimo()
    
    print(f"Números: {numeros}")
    print(f"Promedio: {promedio}")
    print(f"Máximo: {maximo}")
    print(f"Mínimo: {minimo}")

if __name__ == "__main__":
    main()
