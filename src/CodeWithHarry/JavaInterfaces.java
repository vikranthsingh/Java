package CodeWithHarry;

interface Base3 {
    int x = 7;

    static void gym() {
        System.out.println("Gyming");
    }

    default void yoga() {
        gym();
        System.out.println("Can Do Yoga");
    }

    void sing();

    void talk();
}

class Human implements Base3 {

    @Override
    public void sing() {
        System.out.println("Singing");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }
}

public class JavaInterfaces {
    public static void main(String[] args) {
        Human me = new Human();
        me.sing();
        me.talk();
        System.out.println(me.x);

        //Dynamic Method ref of Superclass and object of Subclass
        Base3 base = new Human();
        base.talk();
        base.sing();
        base.yoga();
        System.out.println(me.x);

        //we can create object of interfaces using Anonymous object
        Base3 singer = new Base3() {
            @Override
            public void sing() {
                System.out.println("Singer is Singing");
            }

            @Override
            public void talk() {
                System.out.println("Singer can talk");
            }
        };
        singer.sing();
        singer.talk();
    }
}
