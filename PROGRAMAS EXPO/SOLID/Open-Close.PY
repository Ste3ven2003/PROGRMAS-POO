class Forma:
    def area(self):
        pass

class Círculo(Forma):
    def __init__(self, radio):
        self.radio = radio
    
    def area(self):
        return 3.14 * self.radio ** 2

class Rectángulo(Forma):
    def __init__(self, ancho, alto):
        self.ancho = ancho
        self.alto = alto
    
    def area(self):
        return self.ancho * self.alto

def principal_ocp():
    círculo = Círculo(5)
    print("Área del Círculo:", círculo.area())

    rectángulo = Rectángulo(4, 6)
    print("Área del Rectángulo:", rectángulo.area())

if __name__ == "__main__":
    principal_ocp()

