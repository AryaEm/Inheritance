public class Bola extends BangunRuang {
    double r;

    @Override
    double volume(){
        double volume = (4 / 3) * Math.PI * r * r *r;
        System.out.println("Volume Bola adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * r * r;
        System.out.println("Luas permukaan bola adalah: " + luasPermukaan);
        return luasPermukaan;
    }
}
