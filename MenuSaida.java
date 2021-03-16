
public class MenuSaida extends MenuEstacionamento {
    int saida;

    public void Saida() {

        System.out.println("Saida de veiculos");
        System.out.println("1- Carro \n 2- Moto \n 3- Onibus");
        menu = ler.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Carro removido da vaga: ");
                int saida = ler.nextInt();
                if (vagas.get(saida) instanceof Carro) {
                    if (saida <= vagas.size()) {
                        System.out.println(vagas.remove(saida).getPlaca());
                        QuantidadeDeCarros--;
                    } else {
                        System.out.println("Esta vaga não esta ocupada");
                    }
                } else {
                    System.out.println("Tipo de vaga incorreta !");
                }

            case 2:
                System.out.println("Moto removida da vaga: ");
                saida = ler.nextInt();
                if (vagas.get(saida) instanceof Moto) {
                    if (saida <= vagas.size()) {
                        System.out.println(vagas.remove(saida).getPlaca());
                        QuantidadeDeMotos--;
                    } else {
                        System.out.println("Esta vaga não esta ocupada");
                    }
                } else {
                    System.out.println("Tipo de vaga incorreta !");
                }

            case 3:
                System.out.println("Onibus removido da vaga: ");
                saida = ler.nextInt();
                if (vagas.get(saida) instanceof Onibus) {
                    if (saida <= vagas.size()) {
                        System.out.println(vagas.remove(saida).getPlaca());
                        QuantidadeDeOnibus--;
                    } else {
                        System.out.println("Esta vaga não esta ocupada");
                    }
                } else {
                    System.out.println("Tipo de vaga incorreta !");
                }

                if (vagas.isEmpty()) {
                    System.out.println("Estacionamento vazio !");
                }
                break;
        }
    }

}
