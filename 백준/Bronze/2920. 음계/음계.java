import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        if (str.equals("1 2 3 4 5 6 7 8"))sb.append("ascending");
        else if(str.equals("8 7 6 5 4 3 2 1"))sb.append("descending");
        else sb.append("mixed");
        bw.append(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }


}