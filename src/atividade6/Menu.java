package atividade6;

import javax.swing.*;

class Menu {

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        // -------------- Criando a Barra de Menu --------------
        menuBar = new JMenuBar();

        // -------------- Construindo o Primeiro Menu com seus Subs Menus --------------
        menu = new JMenu("Menu");
        menuBar.add(menu);

        submenu = new JMenu("Arquivo");

        menuItem = new JMenuItem("Importar");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Exportar");
        submenu.add(menuItem);
        menu.add(submenu);

        submenu = new JMenu("Salvar");

        menuItem = new JMenuItem("Salvar");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Salvar como...");
        submenu.add(menuItem);
        menu.add(submenu);

        // -------------- Construindo o Segundo Menu com seus Subs Menus --------------
        menu = new JMenu("Ferramentas");
        menuBar.add(menu);

        submenu = new JMenu("Editar");

        menuItem = new JMenuItem("Copiar");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Colar");
        submenu.add(menuItem);
        menu.add(submenu);

        submenu = new JMenu("Ajuda");

        menuItem = new JMenuItem("Ajuda");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Sobre");
        submenu.add(menuItem);
        menu.add(submenu);

        // -------------- Retornando a Barra de Menu Construída --------------
        return menuBar;
    }
}