
import java.util.Scanner;
class problem2 {


    static void encode(String s, int k) {

       char[] ss = s.toCharArray();

        for (int i = 0; i < ss.length - 2;) {
            ss[i+k] = (char)((int)(ss[i+k]+2));
            i = i+2;
//            System.out.println(i+k);
        }

        System.out.print("Converted String: ");
        for (char sk : ss) {
            System.out.print(sk);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:(without space) ");
        String str = scanner.nextLine();
        int k = 2;


        encode(str, k);
    }
}


