class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def calcular_precio_final(self):
        return self.precio

class ProductoDescuento(Producto):
    def __init__(self, nombre, precio, descuento):
        super().__init__(nombre, precio)
        self.descuento = descuento
    
    def calcular_precio_final(self):
        precio_con_descuento = self.precio * (1 - self.descuento)
        return precio_con_descuento

class CarritoCompras:
    def __init__(self):
        self.productos = []
    
    def agregar_producto(self, producto):
        self.productos.append(producto)
    
    def calcular_total(self):
        total = sum(producto.calcular_precio_final() for producto in self.productos)
        return total

def main():
    producto1 = Producto("Camisa", 20)
    producto2 = ProductoDescuento("Pantalón", 30, 0.1)
    
    carrito = CarritoCompras()
    carrito.agregar_producto(producto1)
    carrito.agregar_producto(producto2)
    
    total = carrito.calcular_total()
    print(f"Total a pagar: ${total}")

if __name__ == "__main__":
    main()
