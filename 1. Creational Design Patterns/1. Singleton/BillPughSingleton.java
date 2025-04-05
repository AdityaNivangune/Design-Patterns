// Bill Pugh Singleton (Best method using static inner class)

class BillPughSingleton {
    private BillPughSingleton() { }
    private static class SingletonHelper {
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return SingletonHelper.billPughSingleton;
    }
}