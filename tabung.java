public class tabung extends BangunRuang{
    double r;
    double t;

    @Override
    double volume(){
        System.out.println("\n === Volume Tabung ===");
        System.out.print("Masukkan jari jari Tabung: ");
        double r = input.nextDouble();
        System.out.print("Masukkan Tinggi Tabung: ");
        double t = input.nextDouble();
        double volume = Math.PI * r * r * t;
        System.out.println("Volume tabung adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        System.out.println("\n === Luas Permukaan Tabung ===");
        System.out.print("Masukkan jari jari Tabung: ");
        double r = input.nextDouble();
        System.out.print("Masukkan Tinggi Tabung: ");
        double t = input.nextDouble();
        double luasPermukaan = 2 * Math.PI * r * (r + t);
        System.out.println("Luas permukaan tabung adalah: " + luasPermukaan + "\n");
        return luasPermukaan;
    }
}
