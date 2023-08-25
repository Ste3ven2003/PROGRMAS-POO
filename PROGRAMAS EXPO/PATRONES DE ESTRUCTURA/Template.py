from abc import ABC, abstractmethod

# Clase base que define la estructura del informe
class InformeTemplate(ABC):
    def generar_informe(self):
        contenido = self.obtener_encabezado() + "\n"
        contenido += self.obtener_cuerpo() + "\n"
        contenido += self.obtener_pie()
        return contenido
    
    @abstractmethod
    def obtener_encabezado(self):
        pass
    
    @abstractmethod
    def obtener_cuerpo(self):
        pass
    
    @abstractmethod
    def obtener_pie(self):
        pass

# Clase concreta que extiende InformeTemplate
class InformeFinanciero(InformeTemplate):
    def obtener_encabezado(self):
        return "Informe Financiero - Encabezado"
    
    def obtener_cuerpo(self):
        return "Este es el cuerpo del informe financiero."
    
    def obtener_pie(self):
        return "Pie del informe financiero"

class InformeVentas(InformeTemplate):
    def obtener_encabezado(self):
        return "Informe de Ventas - Encabezado"
    
    def obtener_cuerpo(self):
        return "Este es el cuerpo del informe de ventas."
    
    def obtener_pie(self):
        return "Pie del informe de ventas"

def main():
    informe_financiero = InformeFinanciero()
    informe_ventas = InformeVentas()
    
    print("Informe Financiero:")
    print(informe_financiero.generar_informe())
    
    print("\nInforme de Ventas:")
    print(informe_ventas.generar_informe())

if __name__ == "__main__":
    main()
