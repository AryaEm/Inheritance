public class balok extends BangunRuang {
    double p;
    double l;
    double t;

    @Override
    double volume(){
        double volume = p * l * t;
        System.out.println("Volume Balok adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        double luasPermukaan = 2 * (p*l) + (p*t) + (l*t);
        System.out.println("Luas permukaan Balok adalah: " + luasPermukaan);
        return luasPermukaan;
    }
}
