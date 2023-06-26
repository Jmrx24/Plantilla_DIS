package pantilla.dis.example;

import java.util.ArrayList;

public class DataHanding {
    public ArrayList<Coche> AnadirObjeto1(Coche car1, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Coche> listaAux = reader.LeerFichero(ruta);
        //Hacemos un id autoincremental sumandole 1 al ultimo id de la lista
        car1.setId(listaAux.get(listaAux.size() - 1).getId() + 1);
        listaAux.add(car1);
        return listaAux;
    }

    public ArrayList<Coche> EliminarObjeto (int id, String ruta)
    {
        //Primero leemos la lista que hay, y vamos recorriendola hasta encontrar el id que queremos borrar
        LeerJson reader = new LeerJson();
        ArrayList<Coche> listaAux = reader.LeerFichero(ruta);
        for (int i = 0; i < listaAux.size() ; i++ )
        {
            if(listaAux.get(i).getId() == id)
            {
                listaAux.remove(i);
            }
        }
        //Devolvemos la lista con el elemento ya borrado
        return listaAux;
    }
}
