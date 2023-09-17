public class SchoolDriver {
    public static void main(String[] args) {
        School armaniSchool = new School();
        //System.out.println(armaniSchool.getName());
        armaniSchool.setName("Armani School");
        String name = armaniSchool.getName();
        System.out.printf("%s The name of the school is ",name);
        System.out.printf("\nThe name of the school is %s",armaniSchool.getName());

    }
}
