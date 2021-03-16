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

public class Estacionamento {

    public static void main(String[] args) {
        
        Menu principal = new Menu();
        
        principal.MenuPrincipal();
    }

}
