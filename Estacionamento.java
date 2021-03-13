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
import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Veiculo> vagas = new ArrayList();
        Carro carro = new Carro();
        Moto moto = new Moto();
        Onibus onibus = new Onibus();

        final int QUANTIDADE_MAXIMA_DE_CARROS = 7;
        final int QUANTIDADE_MAXIMA_DE_MOTOS = 2;
        final int QUANTIDADE_MAXIMA_DE_ONIBUS = 1;
        final int QUANTIDADE_MAXIMA_DO_ESTACIONAMENTO = 10;
        int QuantidadeDeCarros = 0;
        int QuantidadeDeMotos = 0;
        int QuantidadeDeOnibus = 0;
        int menu;   
        
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
                            if (QuantidadeDeCarros < QUANTIDADE_MAXIMA_DE_CARROS) {  
                                System.out.println("Digite os dados do carro para a vaga: ");
                                carro = new Carro();           
                                carro.setTeste(ler.nextLine());
                                System.out.println("Placa: ");
                                carro.setPlaca(ler.nextLine());
                                System.out.println("Modelo: ");
                                carro.setModelo(ler.nextLine());
                                System.out.println("Cor: ");
                                carro.setCor(ler.nextLine());
                                vagas.add(carro);
                                QuantidadeDeCarros++;
                            } else {
                                System.out.println("Vagas para carro Lotado !");
                            }
                            break;
                            
                        case 2:
                            if (QuantidadeDeMotos < QUANTIDADE_MAXIMA_DE_MOTOS) {
                                System.out.println("Digite os dados da moto !");
                                moto = new Moto();
                                moto.setTeste(ler.nextLine());
                                System.out.println("Placa: ");
                                moto.setPlaca(ler.nextLine());
                                System.out.println("Modelo: ");
                                moto.setModelo(ler.nextLine());
                                System.out.println("Cor: ");
                                moto.setCor(ler.nextLine());
                                vagas.add(moto);
                                QuantidadeDeMotos++;
                            } else {
                                System.out.println("Vagas para moto Lotado !");
                            }
                            break;
                            
                        case 3:
                            if (QuantidadeDeOnibus < QUANTIDADE_MAXIMA_DE_ONIBUS) {
                                System.out.println("Digite os dados do onibus !");
                                onibus = new Onibus();
                                onibus.setTeste(ler.nextLine());
                                System.out.println("Placa: ");
                                onibus.setPlaca(ler.nextLine());
                                System.out.println("Modelo: ");
                                onibus.setModelo(ler.nextLine());
                                System.out.println("Cor: ");
                                onibus.setCor(ler.nextLine());
                                vagas.add(onibus);
                                QuantidadeDeOnibus++;
                            } else {
                                System.out.println("Vaga para onibus Lotado !");
                            }
                            break;
                    }

                    if (vagas.size() == QUANTIDADE_MAXIMA_DO_ESTACIONAMENTO) {
                        System.out.println("Estacionamento cheio !");
                    }
                    break;

                case 2:
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

                            break;
                            
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

                            break;
                            
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

                            break;
                    }

                    if (vagas.size() == 0) {
                        System.out.println("Estacionamento vazio !");
                    }
                    break;

                case 3:
                    System.out.println("Consultar à vaga: ");
                    int consulta = ler.nextInt();
                    if (consulta <= vagas.size()) {
                        System.out.println(vagas.get(consulta).getPlaca());
                    } else {
                        System.out.println("Esta vaga não esta ocupada");
                    }

                    break;

                case 4:
                    System.out.println("Consulta geral do estacionamento");
                    for (int i = 0; i < vagas.size(); i++) {
                        System.out.println("Vaga " + i + ": " + vagas.get(i).getPlaca());
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção invalida");
            }
            
        } while (menu != 5);

    }

}
