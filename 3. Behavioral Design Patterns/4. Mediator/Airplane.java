public interface Airplane {
    void requestTakeOff();
    void requestLanding();
    void notifyAllTrafficControl(String message);
}