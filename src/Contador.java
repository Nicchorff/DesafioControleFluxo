import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            int primeiroNumero = sc.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int segundoNumero = sc.nextInt();
            sc.close();

            contar(primeiroNumero, segundoNumero);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void contar(int primeiroNumero,int segundoNumero ) throws ParametrosInvalidosException{
        if(primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = segundoNumero - primeiroNumero;
            for(var i = 0; i < contagem; i++){
                System.out.println("Imprimindo o número "+ (1 + i) );
            }
        }
    }
}
