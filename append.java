import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("append.txt", true))) {
            bw.write("Hello, World!");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
