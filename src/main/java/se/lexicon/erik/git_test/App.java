package se.lexicon.erik.git_test;


public class App 
{
    public static void main( String[] args )
    {
        Foo numbers = new Foo();
        numbers.setNumber1(1.0);
        numbers.setNumber2(3.0);
        
        System.out.println("sum: " + add(numbers.getNumber1(), numbers.getNumber2()));
    }
    
    public static double add(double number1, double number2) {
    	return number1 + number2;
    }
}
