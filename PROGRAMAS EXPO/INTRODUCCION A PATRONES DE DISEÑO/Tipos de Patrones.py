# Clase que representa el sujeto observado (el clima)
class Clima:
    def __init__(self):
        self._observadores = []
        self._estado = None
    
    def agregar_observador(self, observador):
        self._observadores.append(observador)
    
    def eliminar_observador(self, observador):
        self._observadores.remove(observador)
    
    def notificar_observadores(self):
        for observador in self._observadores:
            observador.actualizar(self._estado)
    
    def cambiar_estado(self, nuevo_estado):
        self._estado = nuevo_estado
        self.notificar_observadores()

# Interfaz para observadores
class Observador:
    def actualizar(self, estado):
        pass

# Observadores concretos
class ObservadorTelefono(Observador):
    def actualizar(self, estado):
        print(f"Notificación por teléfono: El clima ha cambiado a {estado}")

class ObservadorCorreo(Observador):
    def actualizar(self, estado):
        print(f"Notificación por correo electrónico: El clima ha cambiado a {estado}")

def main():
    clima = Clima()
    
    observador_telefono = ObservadorTelefono()
    observador_correo = ObservadorCorreo()
    
    clima.agregar_observador(observador_telefono)
    clima.agregar_observador(observador_correo)
    
    clima.cambiar_estado("soleado")
    clima.cambiar_estado("lluvioso")

if __name__ == "__main__":
    main()
