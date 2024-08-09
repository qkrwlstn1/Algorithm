import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        boolean success;
        ArrayDeque<Character> stack;
        while (!str.equals(".")){
            stack = new ArrayDeque<>();
            success = true;
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == '('|| chars[i] == '['){
                    stack.addLast(chars[i]);
                }else if(chars[i] == ')') {
                    if(stack.isEmpty() || !stack.removeLast().equals('(')){
                        success = false;
                        break;
                    }
                }else if(chars[i] == ']') {
                    if(stack.isEmpty() || !stack.removeLast().equals('[')){
                        success = false;
                        break;
                    }
                }
            }
            if(!success || !stack.isEmpty()){sb.append("no").append("\n");}
            else {
            sb.append("yes").append("\n");
                
            }
            
            str = br.readLine();
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}