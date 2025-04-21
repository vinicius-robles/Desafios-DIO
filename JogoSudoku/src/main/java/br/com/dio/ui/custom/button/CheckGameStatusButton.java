package br.com.dio.ui.custom.button;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton(final ActionListener actionListener){

        this.setText("Verificar jogo");
        this.setForeground(new Color(213, 213, 213));
        this.setBackground(new Color(39, 39, 39));
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.addActionListener(actionListener);
    }

}

//Col, Row, Number, FIXED
// 0,0;4,false 1,0;3,false 2,0;5,false 3,0;2,true 4,0;6,true 5,0;9,false 6,0;7,true 7,0;8,false 8,0;1,true 0,1;6,true 1,1;8,true 2,1;2,false 3,1;5,false 4,1;7,true 5,1;1,false 6,1;4,false 7,1;9,true 8,1;3,false 0,2;1,true 1,2;9,true 2,2;7,false 3,2;8,false 4,2;3,false 5,2;4,true 6,2;5,true 7,2;6,false 8,2;2,false 0,3;8,true 1,3;2,true 2,3;6,false 3,3;1,true 4,3;9,false 5,3;5,false 6,3;3,false 7,3;4,true 8,3;7,false 0,4;3,false 1,4;7,false 2,4;4,true 3,4;6,true 4,4;8,false 5,4;2,true 6,4;9,true 7,4;1,false 8,4;5,false 0,5;9,false 1,5;5,true 2,5;1,false 3,5;7,false 4,5;4,false 5,5;3,true 6,5;6,false 7,5;2,true 8,5;8,true 0,6;5,false 1,6;1,false 2,6;9,true 3,6;3,true 4,6;2,false 5,6;6,false 6,6;8,false 7,6;7,true 8,6;4,true 0,7;2,false 1,7;4,true 2,7;8,false 3,7;9,false 4,7;5,true 5,7;7,false 6,7;1,false 7,7;3,true 8,7;6,true 0,8;7,true 1,8;6,false 2,8;3,true 3,8;4,false 4,8;1,true 5,8;8,true 6,8;2,false 7,8;5,false 8,8;9,false