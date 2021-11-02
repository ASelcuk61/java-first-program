package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
<<<<<<< HEAD

        return number*2;
    }
    private static int add(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
=======
        return 2 * number;
    }

    private static int add(int[] numbers) {
        var sum = 0;
        for(int number: numbers) {
            sum += number;
>>>>>>> 6e0b52974cd87da99219317bbd50f810c99f50e8
        }
        return sum;
    }
}
