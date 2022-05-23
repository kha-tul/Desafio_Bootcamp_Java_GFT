import desafios.Classe_Macaco;
import desafios.NumeroReverso;
import desafios.funcionario.Consultor;
import desafios.funcionario.Vendedor;

public class Main {
    public static void main(String[] args) {

        // NumeroReverso.numeroReverso();

       /* Classe_Macaco macaco1 = new Classe_Macaco();
        Classe_Macaco macaco2 = new Classe_Macaco();

        macaco1.comer("banana");
        macaco1.comer("banana");
        macaco1.comer("banana");

        macaco2.comer("pera");
        macaco2.comer("uva");
        macaco2.comer("maçã");

        macaco1.digerir();
        macaco2.digerir(); */

        Vendedor vendedor = new Vendedor("Joana", 12121221, 10d, 5);
        System.out.println(vendedor.calcularSalario());

        Consultor consultor = new Consultor("Consultor", 121222, 100d, 10);
        System.out.println(consultor.calcularSalario());
    }
}
