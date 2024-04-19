package Quatorze;

public class Funcional implements OperacaoAritimetica{
    //Implementando o metodo executar da interface
    /*
    Embora não seja necessário, podemos utilizar a anotação @FunctionalInterface
    para que o compilador Java verifique se a interface é funcional ou não. Ela é
    especialmente útil em interfaces que sofrem muitas alterações durante o ciclo
    de desenvolvimento do projeto.
    Ao tentar adicionar um segundo método abstrato em uma interface marcada
    como @FunctionalInterface, o compilador exibirá uma mensagem de erro:
     */

    @Override
    public double executar(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        return resultado;
    }

    //Somar foi Criada do tipo da interface
    //Neste exemplo, adotamos a abordagem tradicional em que abstraímos a
    //existência de entidades (classes) responsáveis pela execução de operações
    //aritméticas.
    //Criamos a classe Soma como uma implementação de operação aritmética e
    //podemos instanciá-la a qualquer momento.
    //Seguindo este conceito, para cada operação aritmética que possa ser utilizada
    //pela aplicação, devemos criar uma nova classe implementadora conforme a
    //necessidade (soma, divisão, potência etc.).

    //Abaixo um exemplo
//    OperacaoAritimetica somar = new Funcional();
//    double result = somar.executar(12.5,350.20);
//        System.out.println(result);
//
//    }
    /*
    Embora o conceito de interface funcional seja uma novidade no Java, algumas
    interfaces que já existiam na linguagem seguem esta especificação.
    São exemplos de interfaces funcionais nativas da linguagem:
    • java.lang.Runnable: Utilizada na criação de threads, assunto que será
    abordado posteriormente. Possui um único método, sem retorno (void) e
    sem argumentos, chamado run();
    • java.util.Comparator: Utilizada em coleções ordenadas como critério
    de ordenação. Possui um único método chamado compare() com dois
    argumentos genéricos e tipo de retorno int;
    • javax.swing.ActionListener: Utilizada em aplicações gráficas para
    associar o evento de clique (ou ativação) a um componente de tela,
    como um botão ou caixa de texto. Possui um único método chamado
    actionPerform(), que possui um argumento auxiliar de tipo java.awt.
    event.ActionEvent e valor de retorno void.
    Além disso, a versão 8 do Java traz o novo package java.util.function contendo
    inúmeras outras interfaces funcionais que foram criadas especificamente para
    auxiliar a programação funcional.
     */

}
