package Treze;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestesUnitarios_JUnit {
    /*
    Teste unitário é a prática de se testar funções ou unidades de um código. A
    partir dele, é possível verificar se a função funciona adequadamente. Uma
    função funcionar adequadamente significa que, para diferentes tipos de
    entrada, ela responde corretamente de acordo com o esperado e, mais do que
    isso, que ela se comporta bem em situações de entradas inválidas ou falhas
    diversas.
    A finalidade do teste unitário e sua automatização no código desenvolvido
     */
    /*
    Em programação orientada a objetos, a menor unidade testável é o método.
    Desta forma, um determinado método pode ser alvo de diversos testes,
    mediante chamadas com parâmetros diferentes para cada execução
     */

    //Dentre os frameworks, destaca-se o JUnit
    @Test
    public static int sortearNumero(){
        Random sorteador = new Random();
        int numero = sorteador.nextInt();
        return numero;
    }
    /*
    O desenvolvimento de casos de teste utilizando o JUnit é realizado através de
    annotations e assertions. Na sequência, serão apresentados os principais,
    acompanhados de uma explicação sucinta a respeito.
    13.3.1.1. Ciclo de vida de um teste
    • @Test: É a annotation mais básica do JUnit, que serve para marcar
    métodos que serão executados como testes.
    Antes e depois:
    • @BeforeAll: Executado uma única vez antes da execução de qualquer teste
    e antes de todos os métodos marcados com a annotation @BeforeEach;
    • @BeforeEach: Executado antes de cada teste;
    • @AfterEach: Executado após cada teste;
    • @AfterAll: Executado uma única vez depois da execução de todos os
    testes e depois de todos os métodos marcados com a annotation @
    AfterEach.
     */
    /*
    Os assertions básicos de testes unitários verificam basicamente duas coisas:
    valores esperados de atributos de uma instância (ex.: se um valor é nulo) ou
    comparações diversas (ex.: se duas instâncias são iguais).
    • assertEquals: Verifica se os parâmetros informados são iguais;
    • assertNotEquals: Verifica se os parâmetros informados são diferentes;
    • assertFalse: Verifica se determinada condição informada no parâmetro
    é falsa;
    • assertTrue: Verifica se determinada condição informada no parâmetro é
    verdadeira;
    • assertNotNull: Verifica se o parâmetro não é nulo;
    • assertNull: Verifica se o parâmetro é nulo;
    • fail: Força a falha de um teste informando uma mensagem especificada
    no parâmetro.
     */
    @Test
    int geracaoDeNumeroPositivo(){
        int numeroMenorIgualSessenta = sortearNumero();
        assert (numeroMenorIgualSessenta <= 60);
        return numeroMenorIgualSessenta;
    }
    @Test
    int geracaoDeNumeroNegativo(){
        int numeroMaiorQueZero = sortearNumero();
        assert (numeroMaiorQueZero > 0);
        return numeroMaiorQueZero;
    }
}
