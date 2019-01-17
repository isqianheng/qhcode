import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("to");

        System.out.println("test");
        InputStream inputStream = new FileInputStream("go");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        Reader in1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));//字符流

        InputStream in2 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        InputStream in4 = new BufferedInputStream(new DataInputStream(new FileInputStream(file)));

    }
}
