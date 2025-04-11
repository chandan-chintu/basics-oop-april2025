package inheritanceexample;

public class AirVehcile extends Vehicle{

    public void travelOnAir(){
        System.out.println("these vehicles travels on air");
    }

    @Override
    public void start() {
        System.out.println("Air Vehcile has started");
    }

    @Override
    public void stop() {
        System.out.println("Air vehcile has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Air vehicle is fueling");
    }
}
