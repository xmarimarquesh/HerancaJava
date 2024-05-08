import java.util.Scanner;

public class Main

{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----------- NICKY CASE ------------\n");
        // System.out.println("\nEscolha a quantidade de indivíduos: \n");
        ListaIndividuos list = new ListaIndividuos(100, 200, 200, 0 , 0, 0, 0);
        System.out.println(list.visualizarLista());
    }
}