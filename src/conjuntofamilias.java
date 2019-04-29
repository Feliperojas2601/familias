/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;
/**
 *
 * @author Estudiante
 */
public class conjuntofamilias {
    private Familia Familias [];

    public conjuntofamilias() {
        this.Familias =  new Familia[5];
    }
    public boolean añadirfami (Familia Familias){
         for (int i = 0; i < 5; i++) {
            if (this.Familias[i] == Familias) {
                return false;
            }
            if (this.Familias[i] == null) {
                this.Familias[i] = Familias;
                return true;
            }
        }
        return false;
    }
    public boolean bfamilia (Familia Familias){
        for (int i =0;i<5;i++){
            if (Familias[i].get)
        }
    }
}
