package br.com.dio.ui.custom.button;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(final ActionListener actionListener){
        this.setText("Reiniciar jogo");
        this.setForeground(new Color(213, 213, 213));
        this.setBackground(new Color(39, 39, 39));
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.addActionListener(actionListener);
    }

}