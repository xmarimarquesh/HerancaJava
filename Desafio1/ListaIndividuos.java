import java.util.Random;
public class ListaIndividuos {
    public Individuo[] individuos;
    private int colaborativo;
    private int trapaceiro;
    private int copiador;
    private int confuso;
    private int tolerante;
    private int rabugento;
    private int matematico;
    
    Random gerador = new Random();
    int num = gerador.nextInt();

    private int size;
    private static final int TAMANHO_MAXIMO = 500;

    ListaIndividuos(int colaborativo, int trapaceiro, int copiador, int confuso, int tolerante, int rabugento, int matematico) {
        if (colaborativo + trapaceiro + copiador + confuso + tolerante + rabugento + matematico > TAMANHO_MAXIMO) {
            System.out.println("Aviso: O número total de indivíduos excede o tamanho máximo de " + TAMANHO_MAXIMO);
        }
        
        individuos = new Individuo[TAMANHO_MAXIMO];
        size = 0;
        inicializarIndividuos(colaborativo,trapaceiro,copiador,confuso,tolerante,rabugento,matematico);
    }

    
    private void inicializarIndividuos(int colaborativo, int trapaceiro, int copiador, int confuso, int tolerante, int rabugento, int matematico) {
        int index = 0;
        
        for (int i = 0; i < colaborativo && index < individuos.length; i++) {
            individuos[index++] = new Colaborativo();
            size++;
        }
        for (int i = 0; i < trapaceiro && index < individuos.length; i++) {
            individuos[index++] = new Trapaceiro();
            size++;
        }
        for (int i = 0; i < copiador && index < individuos.length; i++) {
            individuos[index++] = new Copiador();
            size++;
        }
        for (int i = 0; i < confuso && index < individuos.length; i++) {
            individuos[index++] = new Confuso();
            size++;
        }
        for (int i = 0; i < tolerante && index < individuos.length; i++) {
            individuos[index++] = new Tolerante();
            size++;
        }
        for (int i = 0; i < rabugento && index < individuos.length; i++) {
            individuos[index++] = new Rabugento();
            size++;
        }
        for (int i = 0; i < matematico && index < individuos.length; i++) {
            individuos[index++] = new Matematico();
            size++;
        }
    }
    
    public String visualizarLista() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Indivíduos:\n");
        for (int i = 0; i < size; i++) {
            sb.append(i + 1).append(". ").append(individuos[i].getClass().getSimpleName()).append("\n");
        }
        return sb.toString();
    }

    public int getSize() {
        return size;
    }

    public Individuo[] getIndividuos(){
        return individuos;
    }

    public void Jogada(){
        // individuos[num];
    }

}

