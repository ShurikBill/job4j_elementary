package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[]args) {
        String[] names = new String[4];
        names [0] = "Mintimer Shaimiev";
        names [1] = "Rudolf Nureyev";
        names [2] = "Gubaidulina Sofia";
        names [3] = "Renat Ibragimov";
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " +  "ages " + ages.length);
        System.out.println("Размер массива равен: " +  "surnames " + surnames.length);
        System.out.println("Размер массива равен: " +  "prices " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
