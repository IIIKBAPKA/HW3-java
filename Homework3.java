import java.io.*;
import java.util.Scanner;

class Homework3{
    public static void main(String[] args) throws IOException {
        o: while (true) {
            String f = "student.txt";
            File fi = new File(f);
            if (!fi.exists()) {
                fi.createNewFile();
            }
            File file = new File(f);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String last;
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's second-name to add his to");
            String name = scanner.nextLine();
            while ((last = reader.readLine()) != null) {
                if(last.equalsIgnoreCase(name)){
                    System.out.println("This student already exists. Try again!");
                    continue o;
                }
            }
            pw.println(name);
            pw.close();
            System.out.println("Want to add another student? 1-Yes. If not, enter any other value");
            int x = scanner.nextInt();
            if(x!=1){
                System.out.println("The end, good luck!");
                fr.close();
                scanner.close();
                break;
            }
        }
    }
}
