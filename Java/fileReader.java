import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class fileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("exam.txt"));
        StringBuilder sb=new StringBuilder();
        String s="";
        while ((s = reader.readLine()) != null) {
            sb.append(s);
        }
        String str[]=sb.toString().split(" ");
        System.out.println(Arrays.toString(str));
    }
}
