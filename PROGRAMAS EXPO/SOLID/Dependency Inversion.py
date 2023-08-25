class Bombilla:
    def encender(self):
        print("La bombilla está encendida")
    
    def apagar(self):
        print("La bombilla está apagada")

class Conmutable:
    def encender(self):
        pass
    
    def apagar(self):
        pass

class Interruptor:
    def __init__(self, dispositivo: Conmutable):
        self.dispositivo = dispositivo
    
    def operar(self):
        self.dispositivo.encender()

def main_dip():
    bombilla = Bombilla()
    interruptor = Interruptor(bombilla)
    interruptor.operar()

if __name__ == "__main__":
    main_dip()
