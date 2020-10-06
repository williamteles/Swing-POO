package atividade6;

import javax.swing.*;

import java.awt.*;


public class Cadastro extends JPanel {
    protected JButton buttonSalvar, buttonFechar;
    protected JLabel labelNome, labelTelefone, labelEndereco, labelNacionalidade, labelCurso, labelSexo, labelEscolaridade, labelIdade;
    protected JTextField textFieldNome, textFieldTelefone, textFieldEndereco, textFieldNacionalidade, textFielIdade;
    protected JCheckBox checkBoxMasculino, checkBoxFeminino;
    protected JComboBox<String> boxCurso;
    protected JComboBox<String> boxEscolaridade;

    protected String[] cursos = {"","Análise e Desenvolvimento de Sistemas","Administração","Manutenção e Suporte em Informática"};
    protected String[] escolaridades = {"", "Ensino Fundamental", "Ensino Médio", "Ensino Médio Incompleto", "Ensino Superior", "Ensino Superior Incompleto", "Mestrado", "Doutorado" };

    public Cadastro() {

        // -------------- Instanciando e Setando os Componentes --------------
        labelNome = new JLabel("Nome");
        textFieldNome = new JTextField(30);

        labelTelefone = new JLabel("Telefone");
        textFieldTelefone = new JTextField(29);

        labelEndereco = new JLabel("Endereço");
        textFieldEndereco = new JTextField(28);

        labelNacionalidade = new JLabel("Nacionalidade");
        textFieldNacionalidade = new JTextField(25);

        labelCurso = new JLabel("Seu Curso:");
        boxCurso = new JComboBox<>(cursos);
        boxCurso.setSelectedIndex(0);
        
        labelSexo = new JLabel("Seu Sexo:");
        checkBoxMasculino = new JCheckBox("Masculino");
        checkBoxFeminino = new JCheckBox("Feminino");

        labelEscolaridade = new JLabel("Escolaridade");
        boxEscolaridade = new JComboBox<>(escolaridades);
        boxEscolaridade.setSelectedIndex(0);

        labelIdade = new JLabel("Idade");
        textFielIdade = new JTextField(30);

        buttonSalvar = new JButton("Salvar");
        buttonSalvar.setVerticalTextPosition(AbstractButton.CENTER);
        buttonSalvar.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonSalvar.addActionListener(new BotaoSalvar());
        buttonSalvar.addKeyListener(new BotaoSalvar());

        buttonFechar = new JButton("Fechar");
        buttonFechar.setVerticalTextPosition(AbstractButton.CENTER);
        buttonFechar.setHorizontalTextPosition(AbstractButton.LEADING);
        buttonFechar.addActionListener(new BotaoFechar());
        buttonFechar.addKeyListener(new BotaoFechar());

        buttonSalvar.setToolTipText("Clique neste botão para salvar seus dados.");
        buttonFechar.setToolTipText("Clique neste botão para fechar essa tela de cadastro.");

        // -------------- Setando o Layout do JPanel --------------
        GridLayout layout = new GridLayout(9,0);
        setLayout(layout);
        layout.setVgap(30);
        layout.setHgap(20);

        // -------------- Adicionando os Componentes no JPanel --------------
        add(labelNome);
        add(textFieldNome);

        add(labelTelefone);
        add(textFieldTelefone);

        add(labelEndereco);
        add(textFieldEndereco);

        add(labelNacionalidade);
        add(textFieldNacionalidade);
        
        add(labelIdade);
        add(textFielIdade);

        add(labelEscolaridade);
        add(boxEscolaridade);

        add(labelCurso);
        add(boxCurso);

        add(labelSexo);
        add(checkBoxMasculino);
        add(checkBoxFeminino);

        add(buttonSalvar);
        add(buttonFechar);
    }

    // -------------- Método para Criar o GUI e Mostrar na Tela --------------
    private static void createAndShowGUI() {

        // -------------- Criando o JFrame e Setando-o --------------
        JFrame frame = new JFrame("Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------- Instanciando o JPanel de Cadastro e a Classe dos Menus --------------
        Cadastro newContentPane = new Cadastro();
        newContentPane.setOpaque(true);
        Menu menu = new Menu();
        frame.setJMenuBar(menu.createMenuBar());
        frame.setContentPane(newContentPane);

        // -------------- Setando Tamanho do Frame e Mostrando-o --------------
        frame.setSize(600, 500);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        // -------------- Chamando Método da GUI --------------
        javax.swing.SwingUtilities.invokeLater(Cadastro::createAndShowGUI);
    }
}