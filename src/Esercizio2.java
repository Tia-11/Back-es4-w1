import Esercizio1.Dipendente;

public class Esercizio2 {
    public static class GestioneDipendenti {

        public static double sommaTotale(Dipendente uno,Dipendente due ,Dipendente tre,Dipendente quattro) {
            double Risultato = Dipendente.calcolaPaga(uno, 5) + Dipendente.calcolaPaga(due, 5) + Dipendente.calcolaPaga(tre, 5) + Dipendente.calcolaPaga(quattro, 5);
            return Risultato;
        }



        public static void main(String[] args) {

            Dipendente operaio1 = new Dipendente(1,1000,5, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
            Dipendente operaio2 = new Dipendente(2,1000,5, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
            Dipendente impiegato = new Dipendente(3,5, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
            Dipendente dirigente = new Dipendente(4,2000,5, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);

            operaio2.promuovi();
            impiegato.promuovi();


            System.out.println("Stato aggiornato dei dipendenti dopo la promozione:");
            operaio1.stampaDatiDipentende();
            operaio2.stampaDatiDipentende();
            impiegato.stampaDatiDipentende();
            dirigente.stampaDatiDipentende();


            double stipendioTotale = GestioneDipendenti.sommaTotale(operaio1, operaio2, impiegato, dirigente);
            System.out.println("Il totale degli stipendi da pagare è: " + stipendioTotale + "$");

        }


    }
}
