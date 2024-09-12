import java.util.Scanner;
//Driver Class
public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapa objek yang dibuat?");
        System.out.println("cd atau dvd?");
        String pilihan = in.next();



 


        // kondisi
        if (pilihan.equals("cd")) {
        cd c1 = new cd();
        c1.print();
        } else if (pilihan.equals("cd")){
        dvd d1 = new dvd();
        d1.print();
        } else {
            System.out.println("Input Salah.");

        in.close();


        }
    }
}
    

