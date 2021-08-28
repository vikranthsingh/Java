package CodeWithHarry;

public class JavaStringMethods {
    public static void main(String[] args) {
        String name = "Vikranth";
        System.out.println(name.length()); //8
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1)); //i
        System.out.println(name.indexOf('k')); //2
        System.out.println(name.equals("Vikranth"));

        String trimName = "    singh    ";
        System.out.println(trimName.trim()); //remove unwanted spaces

        System.out.println(name.substring(2)); //start from index 2;
        System.out.println(name.substring(2,6)); //include index 2nd and exclude 6th index

        System.out.println(name.replace('i','I'));
        System.out.println(name.replace("ran","RAN"));

        System.out.println(name.startsWith("Vi"));
        System.out.println(name.endsWith("th"));

        System.out.println(name.lastIndexOf('h'));
        System.out.println("Vikranth\'s");

        //Problem 2
        String college = "   AU   ";
        System.out.println(college.replace(" ","_"));

        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Vikranth"));

        //Problem 4
        String m = "Dear Harry,\nThis Java Course is nice, \t Thank\'s";
        System.out.println(m);

    }
}
