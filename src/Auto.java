public class Auto extends Veicolo{
    public int porte;
    public String modello;

    public Auto(String targa, double prezzo, int porte, String modello, int cilindrata){
        super(targa, prezzo, cilindrata);
        this.porte = porte;
        this.modello = modello;
    }

    public void stampa(){
        super.stampa();
        System.out.println("Porte: " + this.porte);
        System.out.println("Modello: " + this.modello);
    }

    public Auto(){
        super();
        this.porte = 0;
        this.modello = "";
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

}
