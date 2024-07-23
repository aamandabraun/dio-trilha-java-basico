import java.until.locale
import java.until.scanner

public class AboutMe {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner (System.in).use.Locale(Locale.US);

        System.out.println("Digite o seu nome");
        String name = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String name = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtido pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();

        }
}
