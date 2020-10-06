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
        menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(menu);

        submenu = new JMenu("File");

        menuItem = new JMenuItem("Import");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Export");
        submenu.add(menuItem);
        menu.add(submenu);

        submenu = new JMenu("Save");

        menuItem = new JMenuItem("Save");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Save as...");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build second menu in the menu bar.
        // -------------- Construindo o Segundo Menu com seus Subs Menus --------------
        menu = new JMenu("Tools");
        menu.getAccessibleContext().setAccessibleDescription("This menu does nothing");
        menuBar.add(menu);

        submenu = new JMenu("Edit");

        menuItem = new JMenuItem("Copy");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Paste");
        submenu.add(menuItem);
        menu.add(submenu);

        submenu = new JMenu("View");

        menuItem = new JMenuItem("search");
        submenu.add(menuItem);

        menuItem = new JMenuItem("explorer");
        submenu.add(menuItem);
        menu.add(submenu);

        // -------------- Retornando a Barra de Menu Construída --------------
        return menuBar;
    }
}