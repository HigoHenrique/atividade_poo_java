import ex1.Assistente_administrativo;
import ex1.Assistente_tecnico;
import ex2.A.Cachorro;
import ex2.A.Gato;
import ex2.B.Rica;
import ex2.B.Pobre;
import ex2.B.Miseravel;
import ex3.CamaroteInferior;
import ex3.CamaroteSuperior;
import ex3.Ingresso;
import ex4.Imovel;
import ex4.Novo;
import ex4.Velho;
import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        // exercicio 5
        // a)
        Assistente_administrativo assistente_administrativo = new Assistente_administrativo("Fulano", 1200, "1234", "noite", 150);
        System.out.println(assistente_administrativo.getMatricula());
        System.out.println(assistente_administrativo.getNome());
        ;
        Assistente_tecnico assistente_tecnico = new Assistente_tecnico("Fulana", 1300, "7722", 250);
        System.out.println(assistente_tecnico.getMatricula());
        System.out.println(assistente_tecnico.getNome());
        // b)
        Cachorro cachorro = new Cachorro("Caramelo", "Vira-lata");
        Gato gato = new Gato("Xayah", "Vira-lata");
        cachorro.late();
        gato.mia();
        cachorro.caminha();
        gato.caminha();
        // c)
        Rica rica = new Rica("Zezinho", 25);
        rica.faz_compras();
        Pobre pobre = new Pobre("Jõaozinho", 27);
        pobre.trabalha();
        Miseravel miseravel = new Miseravel("Fulano", 44);
        miseravel.mendiga();
        // d)
        Scanner input = new Scanner(System.in);
        double valor = 25;
        Ingresso ingresso = new Ingresso(valor);
        CamaroteSuperior superior = new CamaroteSuperior(valor, 50, "parte superior do camarote");
        CamaroteInferior inferior = new CamaroteInferior(valor, 25, "parte inferior do camarote");


        System.out.println("Escolha qual o tipo do seu ingresso: ");
        System.out.println("1 - Normal");
        System.out.println("2 - VIP");
        int escolha = input.nextInt();

        if (escolha == 1) {
            System.out.println("Ingresso escolhido foi o normal e o valor é de" + ingresso.getValor());
        } else if (escolha == 2) {
            System.out.println("Para camarote superior (digite 1)");
            System.out.println("Para camarote inferior (digite 2)");
            int escolha2 = input.nextInt();

            if (escolha2 == 1) {
                System.out.println("Ingresso escolhido foi o camarote superior e o valor total do ingresso é de " + superior.valor_ingresso());
            } else if (escolha2 == 2) {
                System.out.println("Ingresso escolhido foi o camarote superior e o valor total do ingresso é de " + inferior.valor_ingresso());
            }
        }
        // e)
        double preco_imovel = 500000;
        String endereco = "Rua do Imaginário, número 777";

        Imovel imovel = new Imovel(endereco, preco_imovel);
        Novo novo = new Novo(endereco, preco_imovel, 100000);
        Velho velho = new Velho(endereco, preco_imovel, 10000);

        System.out.println("Qual Imovel voce deseja comprar: ");
        System.out.println("1 - Novo");
        System.out.println("2 - Velho");
        int escolha_imovel = input.nextInt();

        if (escolha_imovel == 1) {

            System.out.println("o imovel novo custa o valor de : R$" + novo.preco_com_adicional());

        } else if (escolha_imovel == 2) {

            System.out.println("o imovel velho custa o valor de : R$" + velho.preco_com_desconto());

        }

    }
}
