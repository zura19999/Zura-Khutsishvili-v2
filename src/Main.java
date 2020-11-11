import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\BTU_DOCUMENT");

        for (String filename : file.list(new WordFilter())) {
            System.out.println("მოიძებნა" + " " + filename);
            System.out.println(file.list().length);
        }
    }
}

class WordFilter implements FilenameFilter {
    Scanner my_scan = new Scanner(System.in);
    String a = my_scan.nextLine();
    @Override
    public boolean accept(File dir, String name) {
        return name.startsWith(a);
    }
}