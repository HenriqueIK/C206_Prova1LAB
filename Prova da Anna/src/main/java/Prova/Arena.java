package Prova;
public class Arena {
    String nome;
    String lugar;
    Microfone tipo;

    public Arena(String nome, String lugar) {
        this.nome = "Arena do Macarrão";
        this.lugar = "São Paulo";
    }

    Rapper[] rappers = new Rapper[4]; // batalha entre 4 rappers

    void addRapper(Rapper rapper) { // adicionando rappers
        for (int i = 0; i < rappers.length; i++) { // varrendo rappers
            if (rappers[i] == null) { // conferindo se existe rappers
                rappers[i] = rapper;
                System.out.println("Rapper adicionado");
                break;
            }
        }
    }

    void mostraInfo() { // mostrando o nome da arena e localização e rappers
        System.out.println("====================");
        System.out.print(this.nome);
        System.out.print(" em ");
        System.out.print(this.lugar);
        System.out.println("====================");
        for (int i = 0; i < rappers.length; i++) { // varrendo rappers
            if (rappers != null) { // conferindo se existe rappers
                System.out.println("Rapper inscrito: ");
                rappers[i].mostraInfo();
                System.out.println("====================");
            }
        }
    }

    void microfoneDou() {
        for (int i = 0; i < rappers.length; i++) { // varrendo rappers
            if (rappers[i] != null) { // conferindo se existe nenhum rapper
                if (rappers[i].m1.material.equals("dourado")) {
                    System.out.println("Rapper " + rappers[i].nome + " tem o microfone dourado");
                } else if (rappers[i].m1.material != "dourado") {
                    System.out.println("Rapper " + rappers[i].nome + " não tem o microfone dourado");
                }
            }
        }
    }

    void ranking() {
        float menor = 10; // variaveis para medir as notas
        float maior = 0;

        String vencedor; // rapper que ficou em primeiro
        String perdedor; // rapper que ficou em ultimo

        int aux2 = 0; // variavel auxiliar

        for (int i = 0; i < rappers.length; i++) { // varrendo rappers
            if (rappers[i] != null) { // conferindo se existe rappers
                if (rappers[i].nota > maior) { // comparando as notas
                    maior = rappers[i].nota;
                    vencedor = rappers[i].nome;
                }
                else if(rappers[i].nota < menor){
                    menor = rappers[i].nota;
                    perdedor = rappers[i].nome;
                }
                aux2 = aux2 + 1;
            }
        }
    }
}
