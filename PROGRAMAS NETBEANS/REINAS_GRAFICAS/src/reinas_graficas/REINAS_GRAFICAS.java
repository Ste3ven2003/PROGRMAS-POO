package reinas_graficas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class REINAS_GRAFICAS extends JFrame implements ActionListener {
    private JTextField usuarioTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JTextArea outputTextArea;

    public REINAS_GRAFICAS() {
        setTitle("Reinas Gráficas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());
        // Crear una etiqueta para la imagen de fondo
        JLabel fondoLabel = new JLabel(new ImageIcon("Usuario.JPG")); // Reemplaza "ruta_de_la_imagen.png" con la ruta de tu imagen
        fondoLabel.setBounds(0, 0, getWidth(), getHeight()); // Ajustar posición y tamaño para cubrir toda la ventana
        add(fondoLabel);


        usuarioTextField = new JTextField(15);
        add(new JLabel("Usuario:"));
        add(usuarioTextField);

        passwordField = new JPasswordField(15);
        add(new JLabel("Contraseña:"));
        add(passwordField);

        loginButton = new JButton("Iniciar sesión");
        loginButton.addActionListener(this);
        add(loginButton);

        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        add(scrollPane);
        
        pack();
        setLocationRelativeTo(null);
    }

    //public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new REINAS_GRAFICAS().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        Usuario Usuario1 = new Usuario();
        String usuario = usuarioTextField.getText();
        String password = new String(passwordField.getPassword());
        boolean autenticado = Usuario1.miFuncion(usuario, password);
        if (autenticado) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            calificarReinas();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void calificarReinas() {
        Reinas reina1 = new Reinas();
        Reinas reina2 = new Reinas();
        Reinas reina3 = new Reinas();
        ArrayList<String> reinas = new ArrayList<String>();
        do {
            String[] opcionesReina = {"Reina 1", "Reina 2", "Reina 3", "Salir"};
            int opcionReina = JOptionPane.showOptionDialog(this, "Seleccione una reina", "Calificar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesReina, opcionesReina[0]);
            int BellezaReina,InteligenciaReina;
            switch (opcionReina) {
                case 0:
                    do {
                        BellezaReina = obtenerCalificacion("Ingrese la calificación de belleza (1-10):");
                        InteligenciaReina = obtenerCalificacion("Ingrese la calificación de inteligencia (1-10):");
                    } while (!(BellezaReina >= 1 && BellezaReina <= 10 && InteligenciaReina >= 1 && InteligenciaReina <= 10));
                    String Dato_reina1= reina1.datos_reinas(BellezaReina , InteligenciaReina);
                    reinas.add(Dato_reina1);
                    break;
                case 1:
                    do {
                        BellezaReina = obtenerCalificacion("Ingrese la calificación de belleza (1-10):");
                        InteligenciaReina = obtenerCalificacion("Ingrese la calificación de inteligencia (1-10):");
                    } while (!(BellezaReina >= 1 && BellezaReina <= 10 && InteligenciaReina >= 1 && InteligenciaReina <= 10));
                    String Dato_reina2=reina1.datos_reinas(BellezaReina , InteligenciaReina);
                    reinas.add(Dato_reina2);
                    break;
                case 2:
                    do {
                        BellezaReina = obtenerCalificacion("Ingrese la calificación de belleza (1-10):");
                        InteligenciaReina = obtenerCalificacion("Ingrese la calificación de inteligencia (1-10):");
                    } while (!(BellezaReina >= 1 && BellezaReina <= 10 && InteligenciaReina >= 1 && InteligenciaReina <= 10));
                    String Dato_reina3=reina1.datos_reinas(BellezaReina , InteligenciaReina);
                    reinas.add(Dato_reina3);
                    break;
                case 3:
                    outputTextArea.setText("CALIFICACIONES DE LAS REINAS\n");
                    //Font font = new Font(outputTextArea.getFont().getName(), Font.BOLD, 64);
                    //outputTextArea.setFont(font);
                    for (int i = 0;i < reinas.size();i++){
                            int contador=i+1;
                        outputTextArea.append("REINA #"+contador+": "+reinas.get(i)+"\n");
                        }
                    return;
            }
        } while (true);
    }

    private int obtenerCalificacion(String mensaje) {
        int calificacion;
        while (true) {
            try {
                calificacion = Integer.parseInt(JOptionPane.showInputDialog(this, mensaje));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error: Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return calificacion;
    }
}