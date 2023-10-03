import javax.swing.*;
import java.awt.*;

public class prueba2 extends JFrame {
    GridBagConstraints constraints;

    JPanel space;
    JButton rightButton, bt1, b2, b3;

    public prueba2(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();

        // Boton Derecha
        rightButton = new JButton("Boton");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.gridheight = 4;
        constraints.fill = GridBagConstraints.BOTH;
        this.add(rightButton, constraints);


        // Botón 1

        bt1 = new JButton("Botón 1");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.weightx=0.0;
        constraints.weighty=0.0;
        this.add(bt1, constraints);

        // Botón 2

        b2 = new JButton("Botón 2");

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.weightx=0.0;
        constraints.weighty=0.0;
        this.add(b2, constraints);

        // Espacio entre el segundo y el tercero (del alto de dos botones)

        space = new JPanel();

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; // Altura del espacio

        this.add(space, constraints);

        // Botón 3
        b3 = new JButton("Botón 3");

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.weightx=0.0;
        constraints.weighty=0.0;
        this.add(b3, constraints);

        // Se centra la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);

        //Visibilidad
        this.setVisible(true);
    }


    public static void main(String[] args) {
        prueba2 ventana = new prueba2("Fuego");
    }

}
