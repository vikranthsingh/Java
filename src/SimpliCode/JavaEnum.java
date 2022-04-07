package SimpliCode;

/*
enum Days {
    MON("red"),
    TUE("black"),
    WED("orange");

    private String value;

    Days(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
enum Weekend{
    SUNDAY("red"),
    SATURDAY("black");

    private String value;

    Weekend(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
enum Months{
    JAN("red"),
    FEB("black"),
    MAR("Yellow");
    private String value;

    Months(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}*/
enum ModuleType {
    VG("0"), VT("1"), CSP("2");
    private String value;

    ModuleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class JavaEnum {
    public static void main(String[] args) {
        ModuleType vg = ModuleType.VG;
        ModuleType vt = ModuleType.VT;
        ModuleType csp = ModuleType.CSP;

        System.out.println(vg.name());
        System.out.println(vg.getValue());

        System.out.println(vt.name());
        System.out.println(vt.getValue());

        System.out.println(csp.name());
        System.out.println(csp.getValue());

        for (ModuleType type : ModuleType.values()
             ) {
            System.out.println(type.name() + " " + type.getValue());
        }

        /*Days d = Days.MON;
        System.out.println(d.name());
        System.out.println(d.getValue());

        Weekend weekend = Weekend.SUNDAY;
        System.out.println(weekend.getValue());
        System.out.println(weekend.name());

        Months months = Months.JAN;
        System.out.println(months.getValue());
        System.out.println(months.name());*/
    }
}
