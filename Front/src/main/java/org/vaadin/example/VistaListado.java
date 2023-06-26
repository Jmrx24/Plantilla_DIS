package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class VistaListado extends VerticalLayout {
    ArrayList<Coche> listaPacientes = new ArrayList<>();
    public VistaListado()
    {

    }
    public void mostrar()
    {
        removeAll();
        HorizontalLayout horizontal= new HorizontalLayout();
        ArrayList<Coche> listaCoches = new ArrayList<>();
        ArrayList<Coche> listaAux = new ArrayList<>();

        Grid<Coche> grid = new Grid<>(Coche.class, false);
        grid.addColumn(Coche::getMarca).setHeader("Marca");
        grid.addColumn(Coche::getColor).setHeader("Color");
        grid.addColumn(Coche::getPrecio).setHeader("Precio");
        grid.addColumn(Coche::getEdad).setHeader("Edad");
        grid.addColumn(Coche::getPopularidad).setHeader("Popularidad");

        GridContextMenu<Coche> menu = grid.addContextMenu();
        menu.setOpenOnClick(true);
        menu.addItem("Delete", event ->
        {
            DataService.eliminarTweet(event.getItem().get(),listaAux);
        });
        grid.setAllRowsVisible(true);
        this.add(grid);
        add(horizontal);

        try {
            listaCoches = DataService.getProductos(listaCoches);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        grid.setItems(listaCoches);

        this.add(horizontal,grid);
    }

}