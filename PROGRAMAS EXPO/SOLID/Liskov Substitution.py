class Ave:
    def volar(self):
        pass

class Gorrión(Ave):
    def volar(self):
        print("El gorrión está volando")

class Pingüino(Ave):
    def volar(self):
        raise Exception("Los pingüinos no pueden volar")

def hacer_ave_volar(ave):
    ave.volar()

def principal_lsp():
    gorrión = Gorrión()
    pingüino = Pingüino()

    hacer_ave_volar(gorrión)
    hacer_ave_volar(pingüino)  # Esto generaría una excepción

if __name__ == "__main__":
    principal_lsp()
