package Onze;

import java.io.*;

public class TratamentoExcecoes{
    //Tratamento de Erros com Try/Catch
    //Abaixo um Exemplo de codigo.
        /*
            try {
         bloco de código
        }
        blocos catch e finally. . .
       */
/*
Encerrando o código em um bloco try, as possíveis exceções que forem
lançadas serão tratadas por um manipulador de exceções associado a elas.
Para associar um manipulador de exceções a um bloco try, é preciso inserir
um bloco catch imediatamente após o bloco try, sem nenhum código entre
eles. Veja a seguir:

        try {
        }catch(tipo_de_exceção identificador){
        }catch(tipo_de_exceção identificador){
        }

        A partir de Java 7, é possível manipular mais de um tipo de exceção com um
        único bloco catch

        try {
        Codigo:
        }catch(IOException | ArithmeticException ex){
        System.out.println(ex);
        }

 */
//    int i;
//    try{
//        i = 1 / 0;
//        System.out.println(" Valor de i é: " + i);
//
//
//    }catch(ArithmeticException e){
//        System.out.println(" Tratamento do erro: ");
//        e.printStackTrace();
//    }

    //Para indicar que um método pode gerar uma exceção, utilizamos o comand throws na sua declaração
    void falar() throws FileNotFoundException {
        String nomeArquivo= "arquivo.txt";
        File file = new File(nomeArquivo);
        InputStream is = new FileInputStream(file);
                System.out.println("nome do Arquivo");
    }

//Um bloco finally (e as instruções contidas nele) é sempre executado após a
//finalização de um bloco try, mesmo quando ocorre uma exceção inesperada.
    void falar2() throws IOException {
        String nomeArquivo= "arquivo.txt";
        InputStream is = null;
        try {

            File file = new File(nomeArquivo);
            is = new FileInputStream(file);
            System.out.println("nome do Arquivo");
        } finally {
            is.close(); // Fecha o InputStream
        /*
            Usar o finally é importante também para evitar o desperdício de recursos,
            podendo ser usado para fechar um arquivo ou recuperar recursos. Basta colocar
            o código correspondente dentro do finally e assegurar que os recursos sejam
            sempre recuperados.
            O uso do bloco finally é opcional. Em determinadas situações, o bloco catch
            também não é necessário, por isso, pode ser que encontremos um bloco try
            seguido de um bloco finally em um código.
         */
        }
    }

    //Usando a Exceção que acabei de criar
    void criarExcecao() throws CriarUmaExcecao{
        int i = 0;
        if (i < 10){
            CriarUmaExcecao e = new CriarUmaExcecao();
            throw e;
        }else {

            System.out.println("Teste da Exception Criada" );

        }

    }





}
