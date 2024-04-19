package Dezoito;

import javax.swing.*;
import java.awt.*;

public class GerarOUCriarArquivo_Jar extends JFrame {
    public GerarOUCriarArquivo_Jar(){
        JFrame frame = new JFrame("Hello Jar");
        frame.setSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//Encerra o aplicativo ao Fechar a Janela
        frame.setLocationRelativeTo(null);//Centraliza a Janela
        frame.setVisible(true);
    }

}
