package inheritanceexample;

public class MainInheritanceClass {
    public static void main(String[] args) {

        System.out.println("-------------vehicle---------------");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.fuel();
        vehicle.stop();

        System.out.println("-------------Water vehicle---------------");
        WaterVehcile waterVehcile = new WaterVehcile();
        waterVehcile.travelOnWater();
        waterVehcile.start();
        waterVehcile.fuel();
        waterVehcile.stop();

        System.out.println("-------------Air vehicle---------------");
        AirVehcile airVehcile = new AirVehcile();
        airVehcile.travelOnAir();
        airVehcile.start();
        airVehcile.fuel();
        airVehcile.stop();

        System.out.println("-------------Road vehicle---------------");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.travelOnRoad();
        roadVehicle.start();
        roadVehicle.fuel();
        roadVehicle.stop();
    }
}
