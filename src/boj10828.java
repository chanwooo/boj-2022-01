import java.util.ArrayList;
import java.util.Scanner;

public class boj10828 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var commandCount = Integer.parseInt(sc.nextLine());
        var stack = new ArrayList<Integer>();
        StringBuilder answer = new StringBuilder();

        for (var i=0; i<commandCount; i++) {
            var currentCommand = sc.nextLine();
            if(currentCommand.startsWith("push")){
                stack.add(Integer.parseInt(currentCommand.split(" ")[1]));
            } else if(currentCommand.equals("pop")) {
                if(stack.size()==0){
                    answer.append("-1\n");
                } else{
                    answer.append(stack.get(stack.size() - 1)).append("\n");
                    stack.remove(stack.size()-1);
                }
            } else if(currentCommand.equals("size")) {
                answer.append(stack.size()).append("\n");
            } else if(currentCommand.equals("empty")) {
                if(stack.size()==0){
                    answer.append("1\n");
                } else {
                    answer.append("0\n");
                }
            } else if(currentCommand.equals("top")) {
                if(stack.size()==0){
                    answer.append("-1\n");
                } else {
                    answer.append(stack.get(stack.size() - 1)).append("\n");
                }

            } else {
                System.out.println("command error");
            }
        }
        System.out.println(answer);
    }
}
