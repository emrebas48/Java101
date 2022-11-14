import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Mathematics, Physics, Chemistry, Turkish, History, Music;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mathematics note:");
        Mathematics = sc.nextInt();
        System.out.print("Physics note:");
        Physics = sc.nextInt();
        System.out.print("Chemistry note:");
        Chemistry = sc.nextInt();
        System.out.print("Turkish note:");
        Turkish = sc.nextInt();
        System.out.print("History note:");
        History = sc.nextInt();
        System.out.print("Music note:");
        Music = sc.nextInt();

        int average=(Mathematics+ Physics+ Chemistry+ Turkish+ History+ Music)/6;
        String result =(average>=60)? "Successfull!" : "Fail!";
        System.out.println(result);
    }
}