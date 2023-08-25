class Singleton:
    _instance = None
    
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Singleton, cls).__new__(cls)
            cls._instance.value = None
        return cls._instance

def main():
    instance1 = Singleton()
    instance1.value = "Instancia 1"
    print("Instancia 1:", instance1.value)
    
    instance2 = Singleton()
    print("Instancia 2:", instance2.value)

if __name__ == "__main__":
    main()