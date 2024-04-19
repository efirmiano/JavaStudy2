package Doze;

/**
 * The type Java documentacao e api.
 */
public class JavaDocumentacao_e_API {
    /*
    Uma API é uma biblioteca de classes, pacotes e interfaces disponibilizadas
    para uso dos desenvolvedores em suas aplicações. Estas APIs, de um modo
    geral, podem ser de diferentes tipos:
    • Oficiais do Java (presentes no JDK);
    • Opcionais do Java (download sob demanda);
    • Não oficiais (provenientes de terceiros).
    As APIs ajudam programadores na consulta a funções diversas dos pacotes,
    parâmetros, métodos e classes disponíveis.
     */

    //Javadoc é a forma como a documentação oficial das APIs do Java está organizada.
    /*
    A página da documentação on-line da linguagem segue o padrão: https://
    docs.oracle.com/javase/[X]/docs/api/index.html, em que [X] representa a
    versão desejada para consulta
     */
    /*
    O desenvolvedor provê uma documentação Javadoc para a aplicação de uma
    forma muito simples, bastando que coloque, em pontos chave do código
    fonte, comentários Javadoc sempre imediatamente antes de declarar classes,
    interfaces, métodos, construtores ou atributos.
    Conforme visto anteriormente, comentários Javadoc consistem em colocar um
    texto entre os símbolos |** (inicial) e *| (final), podendo formar uma ou mais
    linhas (comentário de bloco), conforme exemplo a seguir:
     */
    //Abaixo um exemplo de uso do JAVADOC
    /**
     Comentário Javadoc de uma classe
     Aqui se encontra como a classe funciona
     */
    /*
    É importante enfatizar que qualquer outro lugar além dos descritos no exemplo
    anterior (onde se coloca o comentário Javadoc) será ignorado pelo gerador.
    O gerador gera toda documentação a partir dos comentários no formato HTML,
    portanto, no texto de comentário pode-se utilizar as tags do HTML.
    Além disso, tags podem ser utilizadas para documentar alguns aspectos e
    elementos para que tenham posicionamento e formatação especiais, como:
    • @param: Documenta parâmetros de um método;
    • @returns: Documenta o tipo de retorno de um método;
    • @see: Documenta uma referência a outra classe da documentação;
    • @throws: Documenta as exceções lançadas por um método ou construtor.
     */
}
