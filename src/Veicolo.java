public class Veicolo {
    public String targa;
    public double prezzo;
    public int cilindrata;

    public Veicolo(String targa, double prezzo, int cilindrata){
        this.targa = targa;
        this.prezzo = prezzo;
        this.cilindrata = cilindrata;
    }

    public Veicolo(){
        this.targa = "";
        this.prezzo = 0.0;
        this.cilindrata = 0;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void stampa(){
        System.out.println("Targa: " + this.targa);
        System.out.println("Prezzo: " + this.prezzo);
        System.out.println("Cilindrata: " + this.cilindrata);
    }
}
