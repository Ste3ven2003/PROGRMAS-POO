from abc import ABC, abstractmethod

# Clase base que define la interfaz de los vehículos
class Vehiculo(ABC):
    @abstractmethod
    def mostrar_info(self):
        pass

# Clases derivadas de Vehiculo
class Automovil(Vehiculo):
    def mostrar_info(self):
        return "Automóvil creado"

class Motocicleta(Vehiculo):
    def mostrar_info(self):
        return "Motocicleta creada"

# Fábrica para crear vehículos
class FabricaVehiculos(ABC):
    @abstractmethod
    def crear_vehiculo(self):
        pass

class FabricaAutomoviles(FabricaVehiculos):
    def crear_vehiculo(self):
        return Automovil()

class FabricaMotocicletas(FabricaVehiculos):
    def crear_vehiculo(self):
        return Motocicleta()

def main():
    fabrica_automoviles = FabricaAutomoviles()
    vehiculo1 = fabrica_automoviles.crear_vehiculo()
    print(vehiculo1.mostrar_info())

    fabrica_motocicletas = FabricaMotocicletas()
    vehiculo2 = fabrica_motocicletas.crear_vehiculo()
    print(vehiculo2.mostrar_info())

if __name__ == "__main__":
    main()
