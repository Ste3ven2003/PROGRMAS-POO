class Tarea:
    def __init__(self, descripcion, completada=False):
        self.descripcion = descripcion
        self.completada = completada
    
    def marcar_completada(self):
        self.completada = True
    
    def __str__(self):
        estado = "Completada" if self.completada else "Pendiente"
        return f"{self.descripcion} - {estado}"

class ListaTareas:
    def __init__(self):
        self.tareas = []
    
    def agregar_tarea(self, descripcion):
        tarea = Tarea(descripcion)
        self.tareas.append(tarea)
    
    def mostrar_tareas(self):
        print("Lista de Tareas:")
        for i, tarea in enumerate(self.tareas, start=1):
            print(f"{i}. {tarea}")
    
    def marcar_completada(self, indice):
        if 1 <= indice <= len(self.tareas):
            tarea = self.tareas[indice - 1]
            tarea.marcar_completada()
            print(f"Tarea '{tarea.descripcion}' marcada como completada.")
        else:
            print("Índice de tarea inválido.")

def main():
    lista = ListaTareas()
    
    lista.agregar_tarea("Hacer la compra")
    lista.agregar_tarea("Terminar proyecto")
    lista.agregar_tarea("Llamar al médico")
    
    lista.mostrar_tareas()
    
    indice_completada = 2
    lista.marcar_completada(indice_completada)
    
    lista.mostrar_tareas()

if __name__ == "__main__":
    main()
