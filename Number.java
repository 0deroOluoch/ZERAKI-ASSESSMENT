//This solution uses the summation method.


public class Number {

    public static void main(String args[])
    {
    	int givenArray[] = { 1, 2, 4, 5, 6 };

    	int n = givenArray.length +1;

    	int sumOfN = (n * (n+1))/2;

    	for(int i =0; i< givenArray.length; i++ ){
    		sumOfN = sumOfN - givenArray[1];
    	}

    	System.out.println("The Missing Number from the array is:  "+ sumOfN)

    }


}





