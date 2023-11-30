package Esercizio1;

import Esercizio1.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente pino = new Dipendente(4565, Dipendente.Dipartimento.PRODUZIONE);
        System.out.println();

        pino.stampaDatiDipentende();

        pino.promuovi();

        pino.stampaDatiDipentende();

        Dipendente.calcolaPaga(pino);

        Dipendente.calcolaPaga(pino,30);
    }

}
