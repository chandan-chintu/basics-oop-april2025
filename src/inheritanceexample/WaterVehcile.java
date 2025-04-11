package inheritanceexample;

public class WaterVehcile extends Vehicle{

    public void travelOnWater(){
        System.out.println("these vehicles travels on water");
    }

    @Override
    public void start() {
        super.color="White";
        System.out.println("Water Vehcile has started");
        System.out.println("color is : "+color);
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Water vehcile has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Water vehicle is fueling");
    }
}
