package workingWithAbstractions.trafficLights;

public class TrafficLight {
    private LightSignal signal;

    public TrafficLight(LightSignal signal) {
        this.signal = signal;
    }

    public LightSignal getSignal() {
        return signal;
    }


    public void update() {
        switch (signal){
            case RED -> signal = LightSignal.GREEN;
            case GREEN -> signal = LightSignal.YELLOW;
            case YELLOW -> signal = LightSignal.RED;
        }
    }
}
