package Esercizio1;

public class Dipendente {
    private static double stipendioBase = 1000.0;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public enum Livello {
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    }

    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        stipendio = stipendioBase;
        importoOrarioStraordinario = 30;
        livello = Livello.OPERAIO;

    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }


    public double getStipendio() {
        return stipendio;
    }


    public Livello getLivello() {
        return livello;
    }


    public Dipartimento getDipartimento() {
        return dipartimento;
    }


    public void setImportoOrarioStraordinario(double importo) {
        this.importoOrarioStraordinario = importo;
    }


    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipentende() {
        System.out.println("dipendente con numero matricola: " + this.matricola + " stipendio: " + this.stipendio + " importo straordinario: " + this.importoOrarioStraordinario + " di Livello: " + this.livello + " lavora nel dipartimento: " + this.dipartimento);
    }

    public Livello promuovi() {
        Livello nuovoLivello = null;

        if (livello == Livello.OPERAIO) {
            livello = Livello.IMPIEGATO;
            stipendio = stipendioBase * 1.2;
            nuovoLivello = Livello.IMPIEGATO;
        } else if (livello == Livello.IMPIEGATO) {
            livello = Livello.QUADRO;
            stipendio = stipendioBase * 1.5;
            nuovoLivello = Livello.QUADRO;
        } else if (livello == Livello.QUADRO) {
            livello = Livello.DIRIGENTE;
            stipendio = stipendioBase * 2;
            nuovoLivello = Livello.DIRIGENTE;
        } else {
            System.out.println("Il dipendente è già al livello massimo.");
            nuovoLivello = Livello.DIRIGENTE;
        }

        return nuovoLivello;
    }

        public static double calcolaPaga(Dipendente dipendente) {
            System.out.println("Il suo stipendio è di: " + dipendente.getStipendio() + "$");
            return dipendente.getStipendio();
        }

        public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
            double pagaExtra = ((dipendente.getStipendioBase() / 28) / 8) * oreStraordinario;
            double pagaTotale = dipendente.getStipendio() + pagaExtra;
            System.out.println("Il suo stipendio è di: " + pagaTotale + "$");
            return pagaTotale;
        }


    }


