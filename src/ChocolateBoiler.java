public class ChocolateBoiler {
    private static ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;
    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    private static Object mutex = new Object();

    public static ChocolateBoiler getInstance(){
        synchronized (mutex) {
            if (instance == null) {
                instance = new ChocolateBoiler();
                System.out.println("Creé una instancia");
            }
        }
        if(instance != null){
            System.out.println("Ya existe una instancia");
        }
        return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}


