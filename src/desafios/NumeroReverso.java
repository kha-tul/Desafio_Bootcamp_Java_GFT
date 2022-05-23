package desafios;

import java.util.Scanner;

public class NumeroReverso {

    public static void numeroReverso() {

    Scanner scan = new Scanner(System.in); //entrada de número através de teclado
    do {
        System.out.println("Informe um valor inteiro e positivo (este número deverá conter 4 dígitos): ");
        int numeroInformado = scan.nextInt();
        String numeroInformadoString = String.valueOf(numeroInformado); //recebeu numero através do teclado, transformou
        //em string para transformar de trás para frente.
        if(numeroInformado>= 1000 && numeroInformado <= 9999) { //entrada do numero conforme a questao
            StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
            System.out.println(stringBuilder.reverse());
            break;
        } else if(numeroInformadoString.length() < 4) {
            System.out.println("O número informado deverá conter 4 dígitos!");
        }
    } while(true);

    }
}
