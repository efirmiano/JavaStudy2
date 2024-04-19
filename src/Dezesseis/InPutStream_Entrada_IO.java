package Dezesseis;

import java.io.*;

public class InPutStream_Entrada_IO {
    /*
    Veja, a seguir, os métodos da classe InputStream:
    • read()
    O método read(), cuja implementação deve ser oferecida por uma subclasse,
    faz a leitura do próximo byte de dados que chega do stream de entrada, sendo
    que o byte de valor retornado apresentará um valor int entre 0 e 255.
    Se não houver um único byte de dados em razão de o stream ter chegado ao
    seu final, o método read() retorna o valor –1.
    O método em questão permanece bloqueado até o momento em que:
    • Os dados de entrada estejam disponíveis;
    • Uma exceção seja lançada;
    • O fim do stream seja detectado.
    • read(byte[] b)
    A partir do stream de entrada, este método lê alguns números de bytes (inteiros)
    que são, em seguida, depositados no array b do buffer.
    • read(byte[] b, int off, int len)
    Este método basicamente lê bytes de len, do stream de entrada para um array
    de bytes.
    130
    Java Programmer - Parte II
    • skip(long n)
    O método skip(n) tem como função pular e ignorar n bytes de dados do stream
    de entrada. Ele retorna o número atual de bytes pulados.
    • available()
    Este método é responsável por retornar o número de bytes que podem ser
    lidos ou pulados a partir desse stream.
    • close()
    Tal qual no stream de saída, o método close() tem a finalidade de fechar o
    stream de entrada.
    Com o stream fechado, os recursos de sistema que estavam sendo usados por
    ele são disponibilizados para outras tarefas.
    • mark(int readlimit)
    Este método estabelece a posição atual no stream de entrada. Esta posição
    definida será considerada por uma nova chamada ao método de reinicialização
    (reset), que ajustará o stream de entrada na mesma posição estabelecida
    anteriormente. O resultado será a releitura dos mesmos bytes.
    • reset()
    Cabe ao método reset(), anteriormente mencionado na descrição do método
    mark(readlimit), posicionar o stream exatamente no mesmo instante em que
    o método mark foi chamado pela última vez.
    • markSupported()
    O método markSupported() verifica
     */

    public InPutStream_Entrada_IO(){

        //Usando metodo InPutStream para acessar um arquivo.txt
        File file = new File("GerarArquivo.txt");
        try(InputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr)){

            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Veja, a seguir, duas classes utilizadas para a leitura de arquivos de texto,
        //FileReader e BufferedReader

    }
}
