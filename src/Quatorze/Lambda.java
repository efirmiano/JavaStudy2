package Quatorze;

import java.util.Locale;

public class Lambda {
    /*
    Uma expressão lambda, também chamada de função anônima, trata-se de
    código utilizado na implementação de uma interface funcional baseada em
    uma nova nomenclatura dentro da linguagem Java.
     */
    //Expressão lambda abaixo -> x + y
    OperacaoAritimetica somar = (x,y) -> x + y;

    /*
    Uma expressão lambda sempre deve ser atribuída a uma variável de tipo
    funcional (interface funcional), como no exemplo anterior, ou passada como
    argumento na chamada de um método que aceita um tipo funcional, como no
    exemplo a seguir:
     */

    /*
    De forma geral, uma expressão lambda possui duas seções separadas pelo
    símbolo “->” (menos-maior):
    Expressão lambda =  (arg1, arg2, ..., argn) -> <expressão de cálculo ou retorno>
    Em que temos, ao lado esquerdo, os parâmetros a serem recebidos pelo método
    funcional e, ao lado direito, o conjunto de instruções que implementam este
    método.
     */

    void Lambda(){
        //Expressao Lambda com parametros
        LambdaExpressao funcao = (n,i,s) -> System.out.println("Parabens "+n.toUpperCase(Locale.ROOT) + "pelos seus "
                + i + "anos de vida. Seu novo salario: " + s);
        funcao.exibeDados("Estevao ",32,16000.55);
        System.out.println("Expressao Lambda OK....");

        //Expressao Lambda sem parametros
        LambdaExpressao1 funcao1 = ()-> System.out.println("Sem paramtros no Lambda");
        funcao1.exibirDados();

        //Expressao Lambda com um unico parametro
        LambdaExpressao2 funcao2 = d -> Math.sqrt(d);
        double result2 = funcao2.execute(144);
        System.out.println("Resultado: "+ result2);

        //Expressao Lambda com Corpo{}
        LambdaExpressao funcao3 = (n,i,s) ->{
            String nomeMaiusculo = n.toUpperCase();
            if (i < 18){
                System.out.println("menor de idade, não trabalha na empresa !!!");
            }else {
                System.out.println("Funcionario " + nomeMaiusculo + " Recebe o salario de: "+s);
            }
        };
        funcao3.exibeDados("Manuel",18,3500);
        funcao3.exibeDados("Manuele",16,3600);

        //Expressao Lambda com metodos que retona valores Return;
        LambdaExpressao3 funcao4 = valor -> {
            double temp = valor * 4;
            return temp;
        };
        System.out.println(funcao4.quadruplo(8));

    }


}
