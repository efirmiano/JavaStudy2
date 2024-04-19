package Quinze;

import java.util.*;
import java.util.stream.Stream;

public class SetColecao {

    public SetColecao(){
        TreeSet<String> cursos = new TreeSet<>();

        cursos.add("PHP");
        cursos.add("JS");
        cursos.add("JAVA");
        cursos.add("C#");
        cursos.add("SQL");
        cursos.add("ORACLE");
        cursos.add("APS.NET");

        Iterator<String> iterator = cursos.iterator();
        System.out.println("Cursos em ordem alfabetica: \n");

        while (iterator.hasNext()){
            String curso = iterator.next();
            System.out.println("Curso: " +curso);
        }

        // usando FOREACH PARA O LOOP
        cursos.forEach(c -> System.out.println("Curso: "+c));

        /*
        Para comparar o conteúdo de dois objetos, ou seja, para comparar se dois
        objetos são significativamente equivalentes, utilize o método equals(). Use
        o operador == apenas para verificar se um mesmo objeto é referenciado por
        duas variáveis distintas, ou seja, se apontam para um mesmo endereço de
        memória
         */

        //equals para comparar se os objetos são iguais

        PessoaEquals pedro = new PessoaEquals("Pedro", 33);
        PessoaEquals maria = new PessoaEquals("Maria", 30);

        System.out.println(pedro.nome + " e igual a " + maria.nome + " ? " + pedro.equals(maria));

        pedro.nome = maria.nome; // Nomes iguais, mas objetos diferentes

        System.out.println(pedro.nome + " e igual a " + maria.nome + " ? " + pedro.equals(maria));

        System.out.println(pedro == maria);

        pedro = maria; //objetos iguais

        System.out.println(pedro.nome + " e igual a " + maria.nome + " ? " + pedro.equals(maria));

        /* Regras de utilização do EQUALS
        Consistente: Considere as variáveis a e b. Caso não sejam realizadas
        alteraçõesnas informações utilizadas na comparação do objeto de equals(),
        são retornadas múltiplas chamadas de a.equals(b) consistentemente
        false ou true para qualquer valor de referência aplicado às variáveis;
        • Reflexivo: Considere a variável a. O valor true é retornado por a.equals()
        para qualquer valor de referência atribuído à variável a;
        • Simétrico: Considere as variáveis a e b. Somente se b.equals(a) retornar
        o valor true, a.equals(b) retornará true para qualquer valor de referência
        atribuído a ambas as variáveis;
        • Transitivo: Considere as variáveis a, b e c. Se a.equals(b) e b.equals(c)
        retornar true, então, a.equals(c) também retornará true para qualquer
        valor de referência atribuído às variáveis.
         */

        //metodo removeif()
             /*
        Outro método utilitário que faz uso de expressões lambda é o método
        removeIf().
        Através deste método, podemos remover de nossa coleção todos os itens que
        não satisfaçam a um determinado critério.
        O exemplo a seguir remove todos os produtos cujo preço seja superior a R$
        2,50:
         */

        //usando o Metodo Removeif()
        Set<Produto> curso = new HashSet<>();

        curso.add(new Produto("Leite em po","Laticinio", 5.81));
        curso.add(new Produto("Cerveja","bebida", 9.81));
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
        curso.stream()
                .sorted()
                .forEach(System.out::println);

        //Usando metodo Stream() + foreach()
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


    }



}
