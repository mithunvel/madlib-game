
import java.util.Scanner;
public class madlab {
    public static void main(String[]arg)
    {
        Scanner scanner = new Scanner(System.in);
        String noun1;
        String adjective1;
        String verb1;
        String noun2;
        String verb2;
        String pluralnoun1;
        String noun3;
        String adjective2;

    System.out.print("Enter a noun (a person name)");
    noun1=scanner.nextLine();
    System.out.print("Enter an adjective (a good quality)");
    adjective1=scanner.nextLine();
    System.out.print("Enter a verb (cool)");
    verb1=scanner.nextLine();
    System.out.print("Enter a noun (a physival activity)");
    noun2=scanner.nextLine();
    System.out.print("Enter a verb+ing (like cleaning)");
    verb2=scanner.nextLine();
    System.out.print("Enter plural noun (living beings)");
    pluralnoun1=scanner.nextLine();
    System.out.print("Enter a noun (funny)");
    noun3=scanner.nextLine();
    System.out.print("Enter an adjective (a good emotion)");
    adjective2=scanner.nextLine();

        System.out.print("My friend "+ noun1 +" thinks they are the most");
        System.out.println( " "+adjective1 +" person in the world.");
        System.out.print("Yesterday, they tried to "+verb1 +" a "+ noun2);
        System.out.print(",but end up "+ verb2 + " on the floor.");
        System.out.println("Everyone laughed so hard that even the "+pluralnoun1 +" couldn't stop.");
        System.out.println("Now we all call them The Great " + noun3);
        System.out.print(" and they actually feel "+adjective2+" about that.");
    

    }
    
}
