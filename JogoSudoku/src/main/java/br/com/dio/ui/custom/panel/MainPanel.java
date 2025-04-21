package br.com.dio.ui.custom.panel;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel(final Dimension dimension){
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setForeground(new Color(213, 213, 213));
        this.setBackground(new Color(39, 39, 39));

    }
}
