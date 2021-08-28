package JavaPractice;

public enum JavaEnum {
    MON("RED"),
    TUE("GREEN"),
    WED("BLACK");

    private String value;

    JavaEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
class JavaEnum1{
    public static void main(String[] args) {
        JavaEnum e = JavaEnum.MON;
        System.out.println(e.getValue());
        System.out.println(e.name());
    }
}

