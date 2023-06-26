package pantilla.dis.example;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addCoche")
    public ArrayList<Coche> create(@RequestBody Coche coche1)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Coche> listaC;
        listaC = dataHanding.AnadirObjeto1(coche1,"Almacen.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirFichero(listaC);
        return listaC;
    }

    //Vamos a borrar buscando el id
    @DeleteMapping("/Coche/{id}")
    public ArrayList<Coche> delete(@RequestParam int id)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Coche> listaC;
        listaC = dataHanding.EliminarObjeto(id,"Almacen.json");
        //Despues de eliminar, sobreescribes la lista devuelta
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirFichero(listaC);
        return listaC;
    }
}
