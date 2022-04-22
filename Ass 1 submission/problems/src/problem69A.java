import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class problem69A {

    public boolean checkVectors(int n) throws FileNotFoundException,IllegalArgumentException {
        int x = 0, y = 0, z = 0, a = 0, b = 0, c = 0;
        File file = new File("D:\\College\\Testing\\Ass 1 submission\\problems\\src\\problem69A.txt");
        Scanner sc = new Scanner(file);
        if (n <= 0 || n>100){
            throw new IllegalArgumentException("N not accepted");
        }
        while (n-- >= 1) {
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            c = Integer.parseInt(sc.next());
            if (a>100 || b>100 || c>100){
                throw new IllegalArgumentException("value of force greater than 100");
            }
            x += a;
            y += b;
            z += c;
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.print("YES");
            return true;
        } else {
            System.out.print("NO");
            return false;
        }
    }
}
