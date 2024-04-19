package Dezesseis;

import java.io.*;

public class OutPutStream_Saida_IO {
    public OutPutStream_Saida_IO(){
        //Criando e gravando/Escrevendo em um arquivo de texto.
        try {
            FileOutputStream arquivo = new FileOutputStream("GerarArquivo.txt");
            DataOutputStream dados = new DataOutputStream(arquivo);
            String texto = "Texto";
            dados.writeChars(texto);
            dados.close();
            arquivo.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        /*
        A classe em questão trabalha com os seguintes métodos:
        • write(...): Grava bytes de saída para o destino. Possui algumas versões
        sobrecarregadas;
        • flush(): Gera a saída de um byte de gravação pendente para o stream de
        destino. O byte de gravação pendente pode estar em um buffer interno;
        • close(): Fecha o stream de saída. Em vista disso, os recursos de sistema
        que estavam sendo usados por esse stream são liberados para outros
        fins.
         */

        try {
            FileInputStream arquivo = new FileInputStream("GerarArquivo.txt");
            DataInputStream dados = new DataInputStream(arquivo);
            while (dados.available() > 0){
                char c = dados.readChar();
                System.out.println(c);

            }

            dados.close();
            arquivo.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        /*
        Neste tópico, serão apresentados cada um dos métodos da classe
        OutputStream:
        • write (int b)
        Tendo como parâmetro o argumento b (o byte), o método write (int b), cuja
        implementação se faz necessária nas subclasses de OutputStream, grava o
        byte especificado para o stream de saída.
        • write(byte[] b)
        Este método da classe OutputStream grava bytes de tamanho b.length para o
        stream de saída, a partir do array do byte especificado.
        • write(byte[] b, int off, int len)
        Este método possui os parâmetros b (dados), off (offset de início nos dados) e
        len (quantidade de bytes a ser gravada). Além disso, a partir do array de byte
        especificado, grava bytes len, com início no offset off do stream de saída.
        • flush()
        As funções principais deste método são:
        • Esvaziar o stream de saída;
        • Estimular a gravação de bytes de saída contidos em buffers.
        • close()
        O método close() fecha o stream de saída, como determina o contrato geral.
        Com o stream fechado, os recursos de sistema por ele utilizados são liberados
        para outros fins.
         */
    }
}
