package atividade6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BotaoFechar implements ActionListener, KeyListener {

    public BotaoFechar() {}

    // -------------- Método para quando o Botão Fechar for Clicado --------------
    @Override
    public void actionPerformed(ActionEvent submitClicked) {
        Component frame = new JFrame();
        JOptionPane.showMessageDialog(frame , "Fechando...");
        System.exit(0);
    }

    // -------------- Método para quando o Botão Fechar for Acionado via Tecla Enter --------------
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_ENTER){
            Component frame = new JFrame();
            JOptionPane.showMessageDialog(frame , "Fechando...");
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyTyped(KeyEvent arg0) {}
}