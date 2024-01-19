public class balok extends BangunRuang {
    double p;
    double l;
    double t;

    @Override
    double volume(){
        System.out.println("=== volume Balok ===");
        System.out.print("Masukkan panjang balok: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double l = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double t = input.nextDouble();
        double volume = p * l * t;
        System.out.println("Volume Balok adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        System.out.println("\n === Luas Permukaan Balok ===");
        System.out.print("Masukkan panjang balok: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double l = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double t = input.nextDouble();
        double luasPermukaan = 2 * (p*l) + (p*t) + (l*t);
        System.out.println("Luas permukaan Balok adalah: " + luasPermukaan + "\n");
        return luasPermukaan;
    }
}
