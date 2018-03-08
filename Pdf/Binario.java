import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n;
        StringBuilder nums = new StringBuilder();
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while(true){
            if(n%2 == 1){
                nums.append("1");               
            }else{
            	nums.append("0");
            }
            if(n/2 == 0){
            	break;
            }
            n = n/2;
            
        }
        System.out.println(nums.reverse());
	}
}