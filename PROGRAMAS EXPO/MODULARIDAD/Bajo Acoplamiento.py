class Empleado:
    def __init__(self, nombre, salario):
        self.nombre = nombre
        self.salario = salario
    
    def obtener_salario(self):
        return self.salario

class CalculadoraBonificaciones:
    def calcular_bonificacion(self, empleado):
        return empleado.obtener_salario() * 0.1

def main():
    empleado1 = Empleado("Juan", 50000)
    empleado2 = Empleado("María", 60000)
    
    calculadora = CalculadoraBonificaciones()
    
    bonificacion_empleado1 = calculadora.calcular_bonificacion(empleado1)
    bonificacion_empleado2 = calculadora.calcular_bonificacion(empleado2)
    
    print(f"Bonificación de {empleado1.nombre}: {bonificacion_empleado1}")
    print(f"Bonificación de {empleado2.nombre}: {bonificacion_empleado2}")

if __name__ == "__main__":
    main()
