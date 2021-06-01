import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterApp {
    public static void main(String[] args) throws IOException {
        
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello, I'm Version 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello, I'm Version 2");
        p2.close();
    }
    
}
