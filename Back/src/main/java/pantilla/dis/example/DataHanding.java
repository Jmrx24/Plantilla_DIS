package pantilla.dis.example;

import java.util.ArrayList;

public class DataHanding {
    public ArrayList<Coche> AnadirObjeto1(Coche car1, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Coche> listaAux = reader.LeerFichero(ruta);
        car1.setId(listaAux.get(listaAux.size() - 1).getId() + 1);
        listaAux.add(car1);
        return listaAux;
    }
}
