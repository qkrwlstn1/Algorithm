
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        bw.append(parseInt(br.readLine()) * parseInt(br.readLine()) +"");

        bw.close();
        br.close();
    }

}