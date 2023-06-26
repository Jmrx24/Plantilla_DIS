package pantilla.dis.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/Car")
    public ArrayList<Coche> listaCoches()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Coche> listaC = reader.LeerFichero("Almacen.json");
        //Mostramos los elementos leidos
        return listaC;
    }

    
}
