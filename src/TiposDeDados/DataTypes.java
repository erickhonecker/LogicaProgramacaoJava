package TiposDeDados;

public class DataTypes {
    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It is an alien");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println(" depende do referencial");
        } else {
            System.out.println("foi triste");
        }

        byte myNum = 100;
        short myNum1 = 5000;
        int myNum3 = 10000;
        long myNum4 = 150000000L;
        System.out.println(myNum);
        System.out.println(myNum1);
        System.out.println(myNum3);
        System.out.println(myNum4);
        float myNum5 = 5.75F;
        double myNum6 = 19.99;
        System.out.println(myNum5);
        System.out.println(myNum6);
        float f1 = 35000.0F;
        double d1 = 120000.0;
        System.out.println(f1);
        System.out.println(d1);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        char myName = 'A';
        char myName1 = 'A';
        char myName2 = 'B';
        String greeting = "Hello World";
        System.out.println(myName);
        System.out.println(myName1);
        System.out.println(myName2);
        System.out.println(greeting);
    }
}
