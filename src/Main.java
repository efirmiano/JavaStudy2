import Dezesseis.InPutStream_Entrada_IO;
import Dezesseis.OutPutStream_Saida_IO;
import Dezessete.ThreadExecucao;
import Dezoito.GerarOUCriarArquivo_Jar;
import Quatorze.*;
import Quinze.Funcionario;
import Quinze.JogadorFutebol;
import Quinze.PessoaEquals;
import Quinze.Produto;
import Treze.TestesUnitarios_JUnit;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        //Teste Unitario
        TestesUnitarios_JUnit teste = new TestesUnitarios_JUnit();

        //Interface Funcional
        //Somar foi Criada do tipo da interface
        //Neste exemplo, adotamos a abordagem tradicional em que abstraímos a
        //existência de entidades (classes) responsáveis pela execução de operações
        //aritméticas.
        //Criamos a classe Soma como uma implementação de operação aritmética e
        //podemos instanciá-la a qualquer momento.
        //Seguindo este conceito, para cada operação aritmética que possa ser utilizada
        //pela aplicação, devemos criar uma nova classe implementadora conforme a
        //necessidade (soma, divisão, potência etc.).
        OperacaoAritimetica somar = new Funcional();
        double result = somar.executar(12.5,350.20);
        System.out.println(result);

        //Expressao lambda
        LambdaExpressao funcao = (n, i, s) -> System.out.println("Parabens "+n.toUpperCase(Locale.ROOT) + "pelos seus "
                + i + "anos de vida. Seu novo salario: " + s);
        funcao.exibeDados("Estevão",32,16000.50);
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
                System.out.println("menor de idade, nao trabalha na empresa !!!");
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
        System.out.println(funcao4.quadruplo(10));

        //Trabalhando com List
        List<String> lista = new ArrayList<>();

        lista.add("Brasil");
        lista.add("Portugal");
        lista.add("EUA");
        lista.add("Franca");
        lista.add("Inglaterra");


        System.out.println("===========================================");
        System.out.println("Paises na ordem original ");
        lista.forEach(curso -> System.out.println(" - " + curso));

        System.out.println("===========================================");
        //Imprime o item na posicao 3 da lista
        System.out.println(lista.get(3));
        System.out.println("===========================================");

        //Imprime o tamanho da lista
        System.out.println(lista.size());

        //Imprime a posicao na lista
        System.out.println(lista.indexOf("Franca"));

        //Verifica se a lista possui EUA
        System.out.println(lista.contains("EUA"));

        //Substitui todo os elementos pelo seu conteudo em maiusculo
        lista.replaceAll(s -> s.toUpperCase());

        //Reordena toda a lista utilizando a ordem natural de String
        lista.sort((x,y) -> x.compareTo(y));

        System.out.println("===========================================");
        lista.forEach(curso -> System.out.println(" - "+curso));
        System.out.println("===========================================");

      //Implementado a coleção SetColetion
        TreeSet<String> cursos = new TreeSet<>();

        cursos.add("PHP");
        cursos.add("JS");
        cursos.add("JAVA");
        cursos.add("C#");
        cursos.add("SQL");
        cursos.add("ORACLE");
        cursos.add("ASP.NET");

        Iterator<String> iterator = cursos.iterator();
        System.out.println("Cursos em ordem alfabetica: \n");

        //Enquanto houver proximo execute
        while (iterator.hasNext()){
            String curso = iterator.next();
            System.out.println("Curso: " +curso);
        }
        System.out.println("===========================================");
        // usando FOREACH PARA O LOOP
        cursos.forEach(c -> System.out.println("Curso: "+c));
        System.out.println("===========================================");

        //equals para comparar se os objetos são iguais

        PessoaEquals pedro = new PessoaEquals("Pedro", 33);
        PessoaEquals maria = new PessoaEquals("Maria", 30);

        System.out.println(pedro.nome + " e igual a " + maria.nome + " ? " + pedro.equals(maria));

        pedro.nome = maria.nome; // Nomes iguais, mas objetos diferentes

        System.out.println(pedro.nome + " e igual a " + maria.nome + " ? " + pedro.equals(maria));

        System.out.println(pedro == maria);

        pedro = maria; //objetos iguais

        System.out.println(pedro.nome + " e igual a " + maria.nome + " ? " + pedro.equals(maria));

        //usando o Metodo Removeif()
        Set<Produto> curso = new HashSet<>();

        curso.add(new Produto("Leite em po","Laticinio", 5.81));
        curso.add(new Produto("Cerveja","bebida", 9.81));
        curso.add(new Produto("Refrigerante","bebida", 2.81));
        curso.add(new Produto("Agua","bebida", 0.81));
        curso.add(new Produto("Vinho","bebida", 19.81));
        curso.add(new Produto("Detergente","Limpeza", 5.81));
        curso.add(new Produto("pao","pao", 1.81));
        curso.add(new Produto("creme dental","limpeza", 5.81));
        curso.add(new Produto("Doce Leite","Laticinio", 13.81));
        curso.add(new Produto("Pinga","bebida", 7.81));
        curso.add(new Produto("acucar","Mantimento", 2.81));
        curso.add(new Produto("bolo","pao", 1.81));
        curso.add(new Produto("Escova dental","limpeza", 8.81));

        curso.removeIf(p-> p.getvalor() > 9.1);
        System.out.println("Lista de Produtos: \n");
        curso.forEach(p -> System.out.println("produto: " + p.getNome()+" : R$:"+p.getvalor()));

        //Usando o stream para executar varios metodos em sequencia.
        curso.stream()
                .filter(f -> "bebida".equals(f.gettipo()))
                .sorted((f1,f2) -> f1.getNome().compareTo(f2.getNome()))
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //Usando o stream para Ordenar coleção(Lista)
//        curso.stream()
//                .sorted()
//                .forEach(System.out::println);


        //Usando map() para alterar uma lista
        //Utiliza uma expressão lambda de transformação para gerar um stream de elementos de um tipo diferente.

        List<Funcionario> lista2 = new ArrayList<>();

        lista2.add(new Funcionario(3018,"Joaquim Batista","Desevolvedor",6550.55));
        lista2.add(new Funcionario(3018,"Maria Batista","Analista",2550.55));
        lista2.add(new Funcionario(3018,"Joao Batis","Desevolvedor",7550.55));
        lista2.add(new Funcionario(3018,"Ana Maria","Vendedor",3550.55));
        lista2.add(new Funcionario(3018,"Robson Fernandes","Analista",1550.55));
        lista2.add(new Funcionario(3018,"Fernando Batista","Desevolvedor",8550.55));

        Stream<Funcionario> streamFunc = lista2.stream();
        Stream<JogadorFutebol> streamJogador =
                streamFunc.map(f-> new JogadorFutebol(
                        f.getNome(),f.getSalario() > 6000 ? "Atacante" : "Zagueiro"
                ));
        streamJogador.forEach(System.out::println);

        //Executando a classe que escreve em um arquito de texto.
        OutPutStream_Saida_IO saida = new OutPutStream_Saida_IO();

        //Executando a classe que Lê em um arquito de texto.
        InPutStream_Entrada_IO entrada = new InPutStream_Entrada_IO();

        //Executando o metodo run() da Thread()
        ThreadExecucao ex = new ThreadExecucao();
        ex.start();
        int i = 0;
        while (i < 10){
            System.out.println("Executando a Thread principal");
            i++;
            Thread.sleep(1000);
        }
        //Executar a Janela criada em Jframe
        GerarOUCriarArquivo_Jar criar = new GerarOUCriarArquivo_Jar();

    }

}