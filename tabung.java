public class tabung extends BangunRuang{
    double r;
    double t;

    @Override
    double volume(){
        double volume = Math.PI * r * r * t;
        System.out.println("Volume tabung adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        double luasPermukaan = 2 * Math.PI * r * (r + t);
        System.out.println("Luas permukaan tabung adalah: " + luasPermukaan);
        return luasPermukaan;
    }
}
