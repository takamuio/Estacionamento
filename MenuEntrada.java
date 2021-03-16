
public class MenuEntrada extends MenuEstacionamento {

    public void Entrada() {

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
                

                if (vagas.size() == QUANTIDADE_MAXIMA_DO_ESTACIONAMENTO) {
                    System.out.println("Estacionamento cheio !");                    
                }                
                break;
        }
    }
}
