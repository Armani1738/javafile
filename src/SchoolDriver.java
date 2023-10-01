public class SchoolDriver {
    public static void main(String[] args) {
        School armaniSchool = new School();
        armaniSchool.setName("Armani School");
        String name = armaniSchool.getName();
       System.out.printf(name);
        System.out.printf("\nThe name of the school is %s",armaniSchool.getName());

    }
}
