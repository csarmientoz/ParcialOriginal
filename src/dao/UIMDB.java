
package dao;

import Clases.UIM;
import java.io.FileNotFoundException;


public interface UIMDB  {
    public void escribir(UIM s) 
            throws FileNotFoundException;
    public UIM leer();
}
