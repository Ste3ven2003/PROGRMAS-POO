# Interfaz para las estrategias de cálculo de impuestos
class CalculadorImpuestos:
    def calcular_impuesto(self, monto):
        pass

# Implementaciones concretas de estrategias de cálculo de impuestos
class ImpuestoEstandar(CalculadorImpuestos):
    def calcular_impuesto(self, monto):
        return monto * 0.15

class ImpuestoReducido(CalculadorImpuestos):
    def calcular_impuesto(self, monto):
        return monto * 0.10

class ImpuestoExento(CalculadorImpuestos):
    def calcular_impuesto(self, monto):
        return 0

# Clase que utiliza una estrategia de cálculo de impuestos
class Producto:
    def __init__(self, nombre, precio, estrategia_impuestos):
        self.nombre = nombre
        self.precio = precio
        self.estrategia_impuestos = estrategia_impuestos
    
    def calcular_total(self):
        impuesto = self.estrategia_impuestos.calcular_impuesto(self.precio)
        total = self.precio + impuesto
        return total

def main():
    producto1 = Producto("Camisa", 50, ImpuestoEstandar())
    producto2 = Producto("Libro", 30, ImpuestoReducido())
    producto3 = Producto("Chocolate", 2, ImpuestoExento())
    
    productos = [producto1, producto2, producto3]
    
    for producto in productos:
        total = producto.calcular_total()
        print(f"{producto.nombre}: Precio: ${producto.precio}, Total con Impuestos: ${total}")

if __name__ == "__main__":
    main()
