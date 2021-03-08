/*
 Esse estacionamento tem 10 vagas (7 carros, 2 motos e 1 ônibus).
O sistema deve registrar entradas e saídas do estacionamento. Cada veículo deve
ter registrado: sua placa, modelo, cor e tipo (onibus/moto/carro).

Em algum momento deverá ser possível descobrir dados do carro passando a vaga.
Por exemplo:
Insira o número da vaga: 2
Vaga 2:
  Chevete verde 9277-244
Insira o número da vaga: 3
Vaga vazia
Em algum momento também deverá ser possível retornar estatística da estacionamento.
Mostrando quantos veículos de cada tipo existem estacionados
 */

import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Veiculos> vagas = new ArrayList();

        int qtdVeiculos = 0;
        int qtdCarros = 0;
        int qtdMotos = 0;
        int qtdOnibus = 0;
        int menu;

        Veiculos carro = new Veiculos();
        Veiculos moto = new Veiculos();
        Veiculos onibus = new Veiculos();

        do {

            System.out.println("Selecione uma das opção abaixo");
            System.out.println(" 1- Entrada \n 2- Saida \n 3- Consulta Vaga \n 4- Consulta Geral \n 5- Sair");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Entrada de veiculos");
                    System.out.println("1- Carro \n 2- Moto \n 3- Onibus");
                    int entrada = ler.nextInt();
                    switch (entrada) {
                        case 1:
                            System.out.println("Digite os dados do carro para a vaga: ");
                            System.out.println("Placa: ");
                            carro.setPlaca(ler.nextLine());
                            System.out.println("Modelo: ");
                            carro.setModelo(ler.nextLine());
                            System.out.println("Cor: ");
                            carro.setCor(ler.nextLine());
                            vagas.add(carro);
                            qtdCarros++;
                            qtdVeiculos++;
                            if (qtdCarros == 7) {
                                System.out.println("Vagas para carro Lotado !");
                            }
                            break;
                        case 2:
                            System.out.println("Digite os dados da moto !");
                            System.out.println("Placa: ");
                            moto.setPlaca(ler.nextLine());
                            System.out.println("Modelo: ");
                            moto.setModelo(ler.nextLine());
                            System.out.println("Cor: ");
                            moto.setCor(ler.nextLine());
                            vagas.add(moto);
                            qtdMotos++;
                            qtdVeiculos++;
                            if (qtdMotos == 2) {
                                System.out.println("Vagas para moto Lotado !");
                            }
                            break;
                        case 3:
                            System.out.println("Digite os dados do onibus !");
                            System.out.println("Placa: ");
                            onibus.setPlaca(ler.nextLine());
                            System.out.println("Modelo: ");
                            onibus.setModelo(ler.nextLine());
                            System.out.println("Cor: ");
                            onibus.setCor(ler.nextLine());
                            vagas.add(onibus);
                            qtdOnibus++;
                            qtdVeiculos++;
                            if (qtdOnibus == 1) {
                                System.out.println("Vaga para onibus Lotado !");
                            }
                            break;
                    }

                    if (qtdVeiculos == 10) {
                        System.out.println("Estacionamento cheio !");
                    }
                    break;

                case 2:
                    System.out.println("Saida de veiculos");
                    System.out.println("1- Carro \n 2- Moto \n 3- Onibus");
                    int saida = ler.nextInt();
                    switch (saida) {
                        case 1:
                            System.out.println("Carro removido da vaga: ");
                            System.out.println(vagas.remove(saida));
                            qtdVeiculos--;
                            break;
                        case 2:
                            System.out.println("Moto removida da vaga: ");
                            System.out.println(vagas.remove(saida));
                            qtdVeiculos--;
                            break;
                        case 3:
                            System.out.println("Onibus removido da vaga: ");
                            System.out.println(vagas.remove(saida));
                            qtdVeiculos--;
                            break;
                        default:
                            break;
                    }

                    if (qtdVeiculos == 0) {
                        System.out.println("Estacionamento vazio !");
                    }
                    break;

                case 3:
                    System.out.println("Consultar à vaga: ");
                    int consulta = ler.nextInt();
                    if (consulta <= qtdVeiculos){
                        System.out.println(vagas.get(consulta).modelo);
                    } else {
                        System.out.println("Esta vaga não esta ocupada");
                    }
                    
                    break;

                case 4:
                    System.out.println("Consulta geral do estacionamento");
                    for (int i = 0; i < vagas.size(); i++) {
                        System.out.println("Vaga " + i + ": " + vagas.get(i).modelo);
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema.");
            }

        } while (menu != 5);
    }

}
