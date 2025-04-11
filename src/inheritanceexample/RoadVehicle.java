package inheritanceexample;

public class RoadVehicle extends Vehicle{
    public void travelOnRoad(){
        System.out.println("these vehicles travels on road");
    }

    @Override
    public void start() {
        System.out.println("Road Vehcile has started");
    }

    @Override
    public void stop() {
        System.out.println("Road vehcile has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Road vehicle is fueling");
    }
}
