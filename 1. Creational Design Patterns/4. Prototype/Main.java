public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating Object using prototype design pattern");
    
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        // we want new Object of networkConnection
        
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}