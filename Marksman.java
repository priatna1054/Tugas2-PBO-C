package belajar.inheritance.java;

public class Marksman extends RangeHero {
    String role= "Marksman";

    Marksman(String p1, String p2, String p3){
        nama= p1;
        emblem= p2;
        lane= p3;
    }

    String info() {
        return "Nama Hero: " + nama + ", Tipe Hero: " + tipe +
               ", Role : " + role +", Emblem: " + emblem + ", Lane: "+ lane;
    }
}
