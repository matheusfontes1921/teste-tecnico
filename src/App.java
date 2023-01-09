import java.util.ArrayList;
import java.util.Scanner;

/* Nome do autor: Matheus Fontes
Data do código: 07/01/2023
Requisitos Funcionais: O código fornece as opções de adicionar um CPF e consultar os CPFs já adicionados. Para isso,
o usuário deve selecionar o número que deseja e, posteriormente, caso tenha escolhido a opção de adicionar o documento,
fornecer os números do CPF. Deste modo, o sistema retornará uma mensagem de acordo com a situação analisada.
Descrição: Para armazenamento dos CPFs, tanto VIPs, quanto liberados e bloqueados, foi utilizada uma ArrayList em cada
situação. Como interface ao usuário, um menu de escolha é apresentado sentro de uma estrutura de repetição (while) que,
enquanto a opção de sair não seja selecionada, o processo continua acontecendo. E, por fim, foi feito um switch-case com
o número escolhido pelo usuário final.
 */

public class App {
    public static void main(String[] args) {

        ArrayList<String> cpfLista = new ArrayList<>();
        ArrayList<String> cpfBloqueado = new ArrayList<>();
        ArrayList<String> cpfVip = new ArrayList<>();
        cpfBloqueado.add("13369992497");
        cpfBloqueado.add("70091475184");
        cpfBloqueado.add("28918774723");
        cpfVip.add("58463944200");
        cpfVip.add("26211538911");
        int escolha = 4;
        String cpf;
        while (escolha != 0) {
            Scanner teclado = new Scanner(System.in);

            switch (escolha) {
                case 1:
                    System.out.println("Digite o CPF que quer adicionar (apenas números): ");
                    cpf = teclado.nextLine();
                    if (cpfBloqueado.contains(cpf)) {
                        System.out.println("O CPF informado encontra-se BLOQUEADO");
                    } else if(cpfVip.contains(cpf)){
                        System.out.println("O CPF informado está na lista de clientes VIP e encontra-se LIBERADO");
                        cpfLista.add(cpf);
                    } else {
                        System.out.println("O CPF informado encontra-se LIBERADO");
                        cpfLista.add(cpf);
                    }

                    break;
                case 2:
                    System.out.println("Lista de CPFs: " + cpfLista);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
            System.out.println("----MENU----\n Escolha uma opção:\n" +
                    "[1] -> Adicionar um CPF\n" +
                    "[2] -> Consultar CPFs adicionados\n" +
                    "[0] -> Sair");
            escolha = teclado.nextInt();
        }
        System.out.println("Obrigado por utilizar!");
    }

}
