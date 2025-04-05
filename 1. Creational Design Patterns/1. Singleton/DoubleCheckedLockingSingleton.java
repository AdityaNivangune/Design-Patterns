// Double-Checked Locking Singleton (Efficient thread-safe implementation)

class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;
    private DoubleCheckedLockingSingleton() { }
    public static DoubleCheckedLockingSingleton getInstance() {
        if (doubleCheckedLockingSingleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (doubleCheckedLockingSingleton == null) {
                    doubleCheckedLockingSingleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return doubleCheckedLockingSingleton;
    }
}

