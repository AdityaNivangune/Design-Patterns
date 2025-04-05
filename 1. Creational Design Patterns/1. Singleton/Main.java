public class Main {
    public static void main(String[] args) {
        System.out.println("Eager Singleton:");
        EagerSingleton eagerInstance1 = EagerSingleton.getInstance();
        EagerSingleton eagerInstance2 = EagerSingleton.getInstance();
        System.out.println("Same instance: " + (eagerInstance1 == eagerInstance2));

        System.out.println("\nLazy Singleton:");
        LazySingleton lazyInstance1 = LazySingleton.getInstance();
        LazySingleton lazyInstance2 = LazySingleton.getInstance();
        System.out.println("Same instance: " + (lazyInstance1 == lazyInstance2));

        System.out.println("\nSynchronized Singleton:");
        SynchronizedSingleton syncInstance1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton syncInstance2 = SynchronizedSingleton.getInstance();
        System.out.println("Same instance: " + (syncInstance1 == syncInstance2));

        System.out.println("\nDouble-Checked Locking Singleton:");
        DoubleCheckedLockingSingleton doubleCheckedInstance1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedInstance2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("Same instance: " + (doubleCheckedInstance1 == doubleCheckedInstance2));

        System.out.println("\nBill Pugh Singleton:");
        BillPughSingleton billPughInstance1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughInstance2 = BillPughSingleton.getInstance();
        System.out.println("Same instance: " + (billPughInstance1 == billPughInstance2));
    }
}
