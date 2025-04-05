// Lazy Initialization Singleton (Not thread-safe)

class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton() { }

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}