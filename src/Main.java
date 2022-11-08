import java.util.Scanner;

public class Main {
//    Public implies Anyone can access this class
//    Static denotes that this method is the own method of the Class "Main"
//    Void Implies that the program doesn't return anything
    public static void main(String[] args) {
//        Simple Print statement
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}