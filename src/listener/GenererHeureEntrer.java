/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Fonction.Fonction;
import Interface.PointageMultipleEntre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ITU
 */
public class GenererHeureEntrer implements ActionListener {

    PointageMultipleEntre t;
    Fonction f = new Fonction();
    String heure = null;
    int retardmin =0;
    public GenererHeureEntrer(PointageMultipleEntre t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < t.data.length; i++) {
            heure = f.getEntrer(t.table.getValueAt(i, 0).toString());
//            retardmin = Integer.parseInt(t.table.getValueAt(i, 3).toString())+ t.table.getValueAt(i, 5) + t.table.getValueAt(i, 7) +t.table.getValueAt(i, 9) +t.table.getValueAt(i, 11)+t.table.getValueAt(i, 13)+t.table.getValueAt(i, 15);
            //retardmin = Integer.parseInt((String) t.table.getValueAt(i, 3))+ Integer.parseInt((String) t.table.getValueAt(i, 5));
            //t.table.setValueAt(retardmin, i,16);
            //System.err.println(retardmin);
        }
        t.model.fireTableStructureChanged();
    }

}
