package SolarSystem;


public class solarSystem {
    public static void main(String[] args) {
        solarSystemBase solar = new solarSystemBase();
        solar.sun="1";
        solar.planet="2";
        solar.star="2";
        System.out.println("the solar system is ready");

        featureSun xros=new featureSun();
        xros.color="pink";
        xros.temp="2434kv";
        xros.size="Bkm";

        planet1 renox=new planet1();
        renox.color="grey";
        renox.size="18km";
        renox.radius="5m";
    }
}