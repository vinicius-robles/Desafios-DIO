package br.com.dio.ui.custom.panel;



import br.com.dio.ui.custom.input.NumberText;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.List;

import static java.awt.Color.black;

public class SudokuSector extends JPanel {

    public SudokuSector(final List<NumberText> textFields) {
        var dimension = new Dimension(170, 170);
        this.setForeground(new Color(213, 213, 213));
        this.setBackground(new Color(39, 39, 39));
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(new Color(56, 56, 56), 2, true));
        this.setVisible(true);
        textFields.forEach(this::add);

    }
}
