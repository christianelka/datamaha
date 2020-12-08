/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nel
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        data cek = new data();
        try {
            cek.pilihan();
        } catch (ParseException ex) {
            Logger.getLogger(DataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
