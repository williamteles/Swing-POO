package atividade6;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Cadastro extends JPanel implements ActionListener {
    protected JButton buttonSalvar, buttonFechar;
    protected JLabel labelNome,labelTelefone,labelEndereco,labelNacionalidade,labelCurso,labelSexo,labelEscolaridade;
    protected JTextField textFieldNome, textFieldTelefone, textFieldEndereco, textFieldNacionalidade;
    protected JComboBox boxCurso,boxSexo, boxEscolaridade;

    String [] curso = {"-------------------------------------------------------------------------","Analide e desenvolvimento de Sistemas","Administração","MSI"};
    String [] sexo = {"-----","homem","Mulher"};
    String [] escolaridade = {"-----------------------", "Ensino fundamental", "Ensino fundamental", "Ensino médio", "Ensino médio incompleto", "Ensino superior", "Ensino superior incompleto", "Mestrado", "Doutorado" };
    public Cadastro() {

        labelNome = new JLabel("Nome");
        textFieldNome = new JTextField(30);

        labelTelefone = new JLabel("Telefone");
        textFieldTelefone = new JTextField(29);

        labelEndereco = new JLabel("Endereço");
        textFieldEndereco = new JTextField(28);

        labelNacionalidade = new JLabel("Nacionalidade");
        textFieldNacionalidade = new JTextField(25);

        labelCurso = new JLabel("seu Curso:");
        boxCurso = new JComboBox(curso);
        boxCurso.setSelectedIndex(0);
        boxCurso.addActionListener(this);
        
        labelSexo = new JLabel("Seu sexo:");
        boxSexo = new JComboBox(sexo);
        boxSexo.setSelectedIndex(0);
        boxSexo.addActionListener(this);

        labelEscolaridade = new JLabel("Escolaridade");
        boxEscolaridade = new JComboBox(escolaridade);
        boxEscolaridade.setSelectedIndex(0);
        boxEscolaridade.addActionListener(this);

        ImageIcon leftButtonIcon = createImageIcon("images/right.gif");
        ImageIcon middleButtonIcon = createImageIcon("images/middle.gif");

        buttonSalvar = new JButton("Salvar");
        buttonSalvar.setVerticalTextPosition(AbstractButton.CENTER);
        buttonSalvar.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
        buttonSalvar.setMnemonic(KeyEvent.VK_D);
        buttonSalvar.setActionCommand("salvar");

        buttonFechar = new JButton("Fechar");
        buttonFechar.setVerticalTextPosition(AbstractButton.CENTER);
        buttonFechar.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonFechar.setMnemonic(KeyEvent.VK_M);
        buttonFechar.setActionCommand("fechar");
        

        //Listen for actions on buttons 1 and 3.
        buttonSalvar.addActionListener(this);
        buttonFechar.addActionListener(this);

        buttonSalvar.setToolTipText("Clique neste butão para salvar seus dados.");
        buttonFechar.setToolTipText("Clique neste butão para fechar essa tela de cadastro.");
        
        //Add Components to this container, using the default GridLayout.
        GridLayout layout = new GridLayout(8,1);
        setLayout(layout);
        layout.setVgap(30);
        layout.setHgap(20);

        add(labelNome);
        add(textFieldNome);

        add(labelTelefone);
        add(textFieldTelefone);

        add(labelEndereco);
        add(textFieldEndereco);

        add(labelNacionalidade);
        add(textFieldNacionalidade);
        
        add(labelEscolaridade);
        add(boxEscolaridade);
        
        add(labelCurso);
        add(boxCurso);

        add(labelSexo);
        add(boxSexo);

        add(buttonSalvar);
        add(buttonFechar);
    }

    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            buttonFechar.setEnabled(false);
            buttonSalvar.setEnabled(false);
        } else {
            buttonFechar.setEnabled(true);
            buttonSalvar.setEnabled(true);
        }
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Cadastro.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Cadastro newContentPane = new Cadastro();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.setSize(400, 500);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}