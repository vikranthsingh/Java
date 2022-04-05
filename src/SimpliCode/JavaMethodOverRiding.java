package SimpliCode;

class Vehicle{
    public static final String NAME = "KTM";
    void name(int speed){
        System.out.println("Hero Honda");
    }
}
class MotorBike extends Vehicle{
    @Override
    void name(int speed) {
        System.out.println(speed-10);
    }
}
public class JavaMethodOverRiding {
    public static void main(String[] args) {
       MotorBike bike = new MotorBike();
       bike.name(100);
        System.out.println(Vehicle.NAME);
    }
}
