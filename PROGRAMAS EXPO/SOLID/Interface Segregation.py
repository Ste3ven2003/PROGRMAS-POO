class Trabajador:
    def trabajar(self):
        pass

class Cocinero(Trabajador):
    def trabajar(self):
        print("El cocinero está cocinando")

class Conductor(Trabajador):
    def trabajar(self):
        print("El conductor está conduciendo")

class Camarero(Trabajador):
    def trabajar(self):
        print("El camarero está sirviendo")

def principal_isp():
    cocinero = Cocinero()
    conductor = Conductor()
    camarero = Camarero()

    cocinero.trabajar()
    conductor.trabajar()
    camarero.trabajar()

if __name__ == "__main__":
    principal_isp()





