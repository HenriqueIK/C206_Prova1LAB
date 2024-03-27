package Prova;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Arena a1 = new Arena("Arena do Macarrão", "São Paulo");

        while(flag){
            System.out.println("============================");
            System.out.println("Bem Vindo à arena!");
            System.out.println("1 - Adicionar rapper");
            System.out.println("2 - Mostrar informações da arena e dos rappers");
            System.out.println("3 - Mostrar rappers com microfone dourado");
            System.out.println("4 - Mostrar ganhadores e perdedores");
            System.out.println("5 - Sair da arena");
            System.out.println("============================");

            int op = sc.nextInt(); // entrando com o valor do operador

            switch(op){
                case 1:
                    System.out.println("Entre com o nome do rapper: ");
                    sc.nextLine();
                    String nomerapper = sc.nextLine();

                    System.out.println("Entre com a idade do rapper: ");
                    int idade = sc.nextInt();

                    System.out.println("Entre com o material do microfone: ");
                    sc.nextLine();
                    String tipo = sc.nextLine();

                    System.out.println("Entre com a nota do rapper de 0 a 10: ");
                    float nota = sc.nextFloat();

                    Rapper mc = new Rapper(nomerapper, nota, idade, tipo);
                    a1.addRapper(mc);
                    break;
                case 2:
                    a1.mostraInfo();
                    break;
                case 3:
                    a1.microfoneDou();
                    break;
                case 4:
                    a1.ranking();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Você saiu da arena");
                    System.out.println("====================");
                    break;
                default:
                    System.out.println("Digite um número válido!");
                    break;
            }
        }
    }
}