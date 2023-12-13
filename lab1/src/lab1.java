import java.util.Scanner;    


public class lab1 {
	public static void main(String[] args){

    	Scanner console = new Scanner(System.in);
    	System.out.println("Enter N");
    	int n = console.nextInt();
    	System.out.println("Enter K");
    	int k = console.nextInt();

    	fib F1 = new fib(n+k);
    	fib F2 = new fib(n-k);
    	fib F3 = new fib(n);
    	fib F4 = new fib(k);
    	boolean result = F1.get_val() * F2.get_val() - Math.pow(F3.get_val(),2) == Math.pow(-1,n+k-1) * Math.pow(F4.get_val(),2);
    	System.out.println("The result is: " + result);
    }
}


class fib {
	/**Ordinal number of this fibonacci number in sequence */
	private int num;
	/**Number value of this  fibonacci number */
	private int value;


	/**
	*Constructs particular fibonacci number  
	*@author Max
	*@param n number of finonacci number in sequence  
	*/
	public fib(int n){
		int a = 0, b = 1,c = 0;
			if (n==0)
				this.num = 0;
		for (int i = 2;i <= n;i++){
			c = a + b;
			a = b;
			b = c;
		}
		num = n;
		value = c;
	} 

	/**
	*Get value of fibonacci number 
	*@author Max
	*@return value of num
	*/
	public int get_val(){
		return this.value;
	}

	/**
	*Get ordinal number of fibonacci number in sequence 
	*@author Max
	*@return num of num
	*/
	public int get_num(){
		return this.num;
	}

} 
