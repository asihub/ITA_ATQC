package patterns.singleton;

public class ClassicSingleton {
    private static ClassicSingleton singleton;

    private ClassicSingleton() {
        // defeating instantiation
    }

    public static ClassicSingleton getInstance(){
        if(singleton == null){
            return new ClassicSingleton();
        }

        return singleton;
    }
}
