package basic;

public class Aliquotas {
    public static void main(String[] args) {

        double salario = 3900.0;

        if (salario >= 1900.0 && salario <= 2800.0){
            System.out.println(" O seu IR é de 7.5% ");
            System.out.println("Sendo assim será o valor de R$ 142");
        } else if (salario <= 3751.0) {
            System.out.println(" O seu IR é de 15% ");
            System.out.println("Sendo assim será o valor de R$ 350");
        } else if (salario <= 4664.0) {
            System.out.println(" O seu IR é de 22.5% ");
            System.out.println("Sendo assim será o valor de R$ 636");
        }


    }
}
