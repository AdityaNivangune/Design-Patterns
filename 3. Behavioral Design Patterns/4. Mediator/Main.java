public class Main {
    public static void main(String[] args) {
        AirTrafficControlTower controlTower = new AirpotControlTower();

        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeOff();
        airplane2.requestLanding();
    }
}
