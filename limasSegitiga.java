public class limasSegitiga extends BangunRuang{
    double lAlas;
    double lSisi;
    double tLimas;

    @Override
    double volume(){
        System.out.println("\n === Volume Limas Segitiga ===");
        System.out.print("Masukkan Luas alas:");
        double lAlas = input.nextDouble();
        System.out.print("Masukkan Tinggi Limas:");
        double tLimas = input.nextDouble();
        double volume = 1 / 3 * lAlas * tLimas;
        System.out.println("Volume limas segitiga adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        System.out.println("\n === luas permukaan Limas Segitiga ===");
        System.out.print("Masukkan Luas alas:");
        double lAlas = input.nextDouble();
        System.out.print("Masukkan Luas sisi:");
        double lSisi = input.nextDouble();
        double luasPermukaan = lAlas * lSisi ;
        System.out.println("Luas permukaan limas segitiga adalah: " + luasPermukaan + "\n");
        return luasPermukaan;
    }
}
