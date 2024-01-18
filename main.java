public class main {
    public static void main(String[] args) {
        
        //membuat objek
        BangunRuang BangunRuang = new BangunRuang();

        Bola Bola = new Bola();
        Bola.r = 14;

        balok balok = new balok();
        balok.p = 8;
        balok.l = 16;
        balok.t = 12;

        limasSegitiga limasSegitiga = new limasSegitiga();
        limasSegitiga.lAlas = 10;
        limasSegitiga.lSisi = 14;
        limasSegitiga.tLimas = 24;

        tabung tabung = new tabung();
        tabung.r = 7;
        tabung.t = 10;

        //method
        BangunRuang.volume();
        BangunRuang.luasPermukaan();

        balok.volume(); 
        balok.luasPermukaan();

        limasSegitiga.volume();
        limasSegitiga.luasPermukaan();

        tabung.volume();
        tabung.luasPermukaan();

        Bola.volume();
        Bola.luasPermukaan();
    }
}
