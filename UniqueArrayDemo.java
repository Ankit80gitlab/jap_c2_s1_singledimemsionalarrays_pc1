package com.jap.uniquearray;
import java.util.Scanner;


public class UniqueArrayDemo {

    public static void main(String[] aa) {

        //declare and initialize integer Array in numberArray Variable

        int [] numberArray = new int [7];
        UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println(result);


    }


    public boolean getUniqueArrayElement(int numberArray[]){
        
		Scanner sc=new Scanner(System.in);

		/*System.out.println("Enter first value");
        numberArray[0]=sc.nextInt();
        System.out.println("Enter second value");
        numberArray[1]=sc.nextInt();
        System.out.println("Enter third value");
        numberArray[2]=sc.nextInt();
        System.out.println("Enter fourth value");
        numberArray[3]=sc.nextInt();
        System.out.println("Enter fifth value");
        numberArray[4]=sc.nextInt();
        System.out.println("Enter sixth value");
        numberArray[5]=sc.nextInt();
        System.out.println("Enter seventh value");
        numberArray[6]=sc.nextInt();*/

		boolean result = false;
		int count=0;

		for (int i=0; i<6; i++)
        {
            for(int j=i+1; j<6;j++)
            {
                if (numberArray[i] != numberArray[j])
                {
                    count++;
                }
                System.out.println(count);
            }
        }

        if (count ==15)
        {
            result=true;
        } 

        return result;
    }

}
