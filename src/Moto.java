public class Moto extends Veicolo{
    public int ruote;
    public String tipo;

    public Moto(String targa, double prezzo, int cilindrata, int ruote, String tipo){
        super(targa, prezzo, cilindrata);
        this.ruote = ruote;
        this.tipo = tipo;
    }

    public void stampa(){
        super.stampa();
        System.out.println("Ruote: " + this.ruote);
        System.out.println("Tipo: " + this.tipo);
    }

    public Moto(){
        super();
        this.ruote = 0;
        this.tipo = "";
    }

    public int getRuote() {
        return ruote;
    }

    public void setRuote(int ruote) {
        this.ruote = ruote;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

