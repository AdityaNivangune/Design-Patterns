public class AirpotControlTower implements AirTrafficControlTower {

    @Override
    public void requestTakeOff(Airplane airplane) {
        airplane.notifyAllTrafficControl("Requesting takeoff clearance.");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplane.notifyAllTrafficControl("Requesting landing clearance.");
    }
}
