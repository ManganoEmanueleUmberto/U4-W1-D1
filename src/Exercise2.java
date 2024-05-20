import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String name= sc.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        String surname= sc.nextLine();
        System.out.println("Inserisci il tuo codice del corso: ");
        String courseCode= sc.nextLine();

        System.out.println(name+" "+surname+" "+courseCode);
        System.out.println(courseCode+" "+surname+" "+name);
    }

}
