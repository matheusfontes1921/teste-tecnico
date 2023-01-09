{
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
