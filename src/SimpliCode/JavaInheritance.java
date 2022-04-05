package SimpliCode;

class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void bicycleName() {
        System.out.println("Lady Bird");
    }

    public int reduceSpeed(int speed) {
        return this.speed -= speed;
    }

    public int increaseGear(int gear) {
        return this.gear += 5;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class MountainBicycle extends Bicycle {
    private int seatHeight;

    public MountainBicycle(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public void bicycleName() {
        super.bicycleName();
        System.out.println("Hercules");
    }
}

public class JavaInheritance {
    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle(27, 28, 15);
        System.out.println(mountainBicycle.getSeatHeight());
        System.out.println(mountainBicycle.getGear());
        System.out.println(mountainBicycle.getSpeed());
        mountainBicycle.bicycleName();
        int speed = mountainBicycle.reduceSpeed(10);
        System.out.println(speed);
        int gear = mountainBicycle.increaseGear(5);
        System.out.println("increase gear by " + gear);
    }
}
