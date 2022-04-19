package belajar.inheritance.java;

public class Main {
    public static void main(String[] args) {

        Marksman wan_wan= new Marksman("wan-wan","Marksman","Gold Lane");
        Marksman moskov= new Marksman("moskov","Assasin", "Gold Lane");
        Marksman Yin_sun_shin= new Marksman("Yin sun-shin","Assasin", "Jungler");

        System.out.println(wan_wan.info());
        System.out.println();
        System.out.println(moskov.info());
        System.out.println();
        System.out.println(Yin_sun_shin.info());
    }
}
