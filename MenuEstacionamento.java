import java.util.ArrayList;
import java.util.Scanner;
public abstract class MenuEstacionamento {

    protected Scanner ler = new Scanner(System.in);

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public ArrayList<Veiculo> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Veiculo> vagas) {
        this.vagas = vagas;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public int getQuantidadeDeCarros() {
        return QuantidadeDeCarros;
    }

    public void setQuantidadeDeCarros(int QuantidadeDeCarros) {
        this.QuantidadeDeCarros = QuantidadeDeCarros;
    }

    public int getQuantidadeDeMotos() {
        return QuantidadeDeMotos;
    }

    public void setQuantidadeDeMotos(int QuantidadeDeMotos) {
        this.QuantidadeDeMotos = QuantidadeDeMotos;
    }

    public int getQuantidadeDeOnibus() {
        return QuantidadeDeOnibus;
    }

    public void setQuantidadeDeOnibus(int QuantidadeDeOnibus) {
        this.QuantidadeDeOnibus = QuantidadeDeOnibus;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }
  
    protected ArrayList<Veiculo> vagas = new ArrayList();

    protected Carro carro = new Carro();
    protected Moto moto = new Moto();
    protected Onibus onibus = new Onibus();

    protected final int QUANTIDADE_MAXIMA_DE_CARROS = 7;
    protected final int QUANTIDADE_MAXIMA_DE_MOTOS = 2;
    protected final int QUANTIDADE_MAXIMA_DE_ONIBUS = 1;
    protected final int QUANTIDADE_MAXIMA_DO_ESTACIONAMENTO = 10;
    protected int QuantidadeDeCarros = 0;
    protected int QuantidadeDeMotos = 0;
    protected int QuantidadeDeOnibus = 0;
    protected int menu;   

    }

