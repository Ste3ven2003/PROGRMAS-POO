from abc import ABC, abstractmethod

# Productos concretos
class Producto(ABC):
    @abstractmethod
    def descripcion(self):
        pass

class ProductoA(Producto):
    def descripcion(self):
        return "Producto A"

class ProductoB(Producto):
    def descripcion(self):
        return "Producto B"

# Fabrica abstracta
class Fabrica(ABC):
    @abstractmethod
    def crear_producto(self):
        pass

class FabricaProductoA(Fabrica):
    def crear_producto(self):
        return ProductoA()

class FabricaProductoB(Fabrica):
    def crear_producto(self):
        return ProductoB()

def main():
    fabrica_a = FabricaProductoA()
    producto_a = fabrica_a.crear_producto()
    print(producto_a.descripcion())

    fabrica_b = FabricaProductoB()
    producto_b = fabrica_b.crear_producto()
    print(producto_b.descripcion())

if __name__ == "__main__":
    main()
