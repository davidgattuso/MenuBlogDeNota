
package funcionalidad;

import javax.swing.JFileChooser;


public class Archivo {
    
    public void abrir(){
        JFileChooser select_a = new JFileChooser();
        select_a.showOpenDialog(select_a);
        String ruta = select_a.getSelectedFile().getAbsolutePath();
    }
    
    public void salir(){
        System.exit(0);
    }
    
}
