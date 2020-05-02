import java.util.*;
public class FindNumberComThink {
    
    public static void main(String[] args) {
        int userSelRange = 50;
        int comThinkNum = (int) (Math.random()*userSelRange)+1;
        Scanner scn = new Scanner(System.in);
        
        int userSelectNum = 0;

        for(int i = 1; i <=5; i++){
            System.out.println(i+" ATTEMPT");
            System.out.print("INSERT: ");
            userSelectNum = scn.nextInt();
            upDownTalkBack(userSelectNum, comThinkNum, userSelRange);
            if (comThinkNum == userSelectNum){
                break;
            }
        }
        if(comThinkNum != userSelectNum){
            System.out.println("YOU LOSE ANSER IS "+comThinkNum);
        }
    }
    
    public static int upDownTalkBack(int num, int comThinkNum, int userSelRange) {
        
        if (num > userSelRange || num < 1) {
            System.out.println("INSERT BETWEEN 1 AND 50");
        } else if(comThinkNum == num) {
            System.out.println("YOU WIN");
        } else if (comThinkNum > num){
            System.out.println("UP");
        } else if (comThinkNum < num) {
            System.out.println("DOWN");
        } else {
            System.out.println("INSERT CORRECT NUMBER IN CORRECT RANGE");
        }
        return num;
    }

}
