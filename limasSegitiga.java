public class limasSegitiga extends BangunRuang{
    double lAlas;
    double lSisi;
    double tLimas;

    @Override
    double volume(){
        double volume = 1 / 3 * lAlas * tLimas;
        System.out.println("Volume limas segitiga adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        double luasPermukaan = lAlas * lSisi ;
        System.out.println("Luas permukaan limas segitiga adalah: " + luasPermukaan);
        return luasPermukaan;
    }
}
