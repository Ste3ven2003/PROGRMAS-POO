class AdministradorArchivos:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo
    
    def leer_archivo(self):
        with open(self.nombre_archivo, 'r') as archivo:
            return archivo.read()
    
    def escribir_archivo(self, contenido):
        with open(self.nombre_archivo, 'w') as archivo:
            archivo.write(contenido)

def principal_srp():
    administrador_archivos = AdministradorArchivos("ejemplo.txt")
    administrador_archivos.escribir_archivo("   Hola Stevn")
    print(administrador_archivos.leer_archivo())

if __name__ == "__main__":
    principal_srp()