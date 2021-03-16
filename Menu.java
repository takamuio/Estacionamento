
public class Menu extends MenuEstacionamento {
    
    MenuEntrada Menu_Entrada = new MenuEntrada();
    MenuSaida Menu_Saida = new MenuSaida();

    public void MenuPrincipal() {

        do {
            System.out.println("Selecione uma das opção abaixo");
            System.out.println(" 1- Entrada \n 2- Saida \n 3- Consulta Vaga \n 4- Consulta Geral \n 5- Sair");
            menu = ler.nextInt();
            switch (menu) {
                case 1: Menu_Entrada.Entrada();

                case 2: Menu_Saida.Saida();

                case 3: {
                    System.out.println("Consultar à vaga: ");
                    int consulta = ler.nextInt();
                    if (consulta <= vagas.size()) {
                        System.out.println(vagas.get(consulta).getPlaca());
                    } else {
                        System.out.println("Esta vaga não esta ocupada");
                    }
                }

                case 4: {
                    System.out.println("Consulta geral do estacionamento");
                    for (int i = 0; i < vagas.size(); i++) {
                        System.out.println("Vaga " + i + ": " + vagas.get(i).getPlaca());
                    }
                }

                case 5: System.out.println("Saindo do sistema.");

                default: System.out.println("Opção invalida");

            }

        } while (menu
                != 5);
    }
}
