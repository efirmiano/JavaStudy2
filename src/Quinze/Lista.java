package Quinze;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    /*
    Confira, a seguir, três implementações importantes de List, ordenadas pela
    posição do índice:
    • ArrayList
    Esta lista foi implementada na versão 1.4 de Java e diz respeito a um array
    que pode aumentar de tamanho dinamicamente. Ele não é classificado, mas é
    indexado.
    Você deve utilizar ArrayList quando a demanda por percorrer frequentemente
    todos os elementos for maior que a demanda por inserções ou exclusões
    (principalmente nos primeiros elementos da lista).
    • LinkedList
    No LinkedList, o encadeamento duplo existente entre os elementos fornece
    métodos novos para que as tarefas de inserção e remoção no início ou no fim
    do conjunto sejam realizadas.
    Para realizar inserções, bem como exclusões com rapidez, utilize esse tipo de
    lista. Contudo, é preciso ressaltar que o processo de iteração de seus elementos
    pode não ser tão rápido se comparado ao ArrayList.
    • Vector
    O Vector é uma coleção bem antiga, lançada com a primeira versão da
    linguagem Java. Esta coleção é semelhante ao ArrayList, porém, em Vector(),
    os métodos são sincronizados para que as threads sejam seguras.
    Em razão do impacto que os métodos sincronizados causam no desempenho,
    é melhor utilizar o ArrayList em
     */
    public Lista(){

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
    }


}
