import java.util.Scanner;

public class Main {
    private String name = "Dhanraj";
    private String email = "dsingh23911@gmail.com";

    public void setName(String newName) {
        this.name = newName;

    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.displayInfo();

        main.setName("Dhanraj");
        main.setEmail("dsingh23911@gmail.com");

        main.displayInfo();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");

        String name = sc.nextLine();

        System.out.println("Entr Email");

        String email = sc.nextLine();

        Main main = new Main(name, email);
        main.displayInfo();

        System.out.println("Entr new name");

        String newName = sc.nextLine();
        main.setName(newName);

        System.out.println("Entr new Email");

        String newEmail = sc.nextLine();
        main.setEmail(newEmail);

        sc.close();

    }

}
