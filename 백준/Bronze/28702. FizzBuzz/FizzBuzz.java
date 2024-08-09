import java.io.*;

public class Main {
    static int[] factorial = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if(!str.equals("Fizz") && !str.equals("Buzz") && !str.equals("FizzBuzz")){
                num = Integer.parseInt(str);
                num += 3-i;
                break;
            }
        }

        if(num % 3 == 0){
            if(num % 5 == 0){
                sb.append("FizzBuzz");
            }else sb.append("Fizz");
        }else if(num % 5 == 0) {
            sb.append("Buzz");
        }else{sb.append(num);}

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}