public class Bola extends BangunRuang {
    double r;

    @Override
    double volume(){
        System.out.println("=== volume Bola ===");
        System.out.print("Masukkan jari jari bola:");
        double r = input.nextDouble();
        double volume = (4 / 3) * Math.PI * r * r *r;
        System.out.println("Volume Bola adalah: " + volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        System.out.println("\n === luas permukaan Bola ===");
        System.out.print("Masukkan jari jari bola:");
        double r = input.nextDouble();
        double luasPermukaan = 4 * Math.PI * r * r;
        System.out.println("Luas permukaan bola adalah: " + luasPermukaan + "\n");
        return luasPermukaan;
    }
}