/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Fonction.Fonction;
import Gestion.Retard;
import Insertion.Pointage;
import Interface.PointageMultipleEntre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ITU
 */
public class ConfirmerPointageMultipleEntre implements ActionListener {

    PointageMultipleEntre t;
    Pointage p = new Pointage();
    Fonction f = new Fonction();
    Retard r = new Retard();
    double retard;
    String[] ret;

    public ConfirmerPointageMultipleEntre(PointageMultipleEntre t) {
        this.t = t;
    }

    public void actionPerformed(ActionEvent arg0) {
        String str = "";
        String typePoint = "";
        int l = 0;
        retard = 0;
        if (t.type.getSelectedItem().toString().equals("Entrée")) {
            typePoint = "E";
        } else if (t.type.getSelectedItem().toString().equals("Sortie")) {
            typePoint = "S";
        }
        for (int i = 0; i < t.data.length; i++) {
            if ((Boolean) t.table.getValueAt(i, 17)) {
                if(!"".equals(t.table.getValueAt(i,2).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,2).toString()+t.columnNames[2].toString());
                }
                if(!"".equals(t.table.getValueAt(i,4).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,4).toString()+t.columnNames[4].toString());
                }
                if(!"".equals(t.table.getValueAt(i,6).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,6).toString()+t.columnNames[6].toString());
                }
                if(!"".equals(t.table.getValueAt(i,8).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,8).toString()+t.columnNames[8].toString());
                }
                if(!"".equals(t.table.getValueAt(i,10).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,10).toString()+t.columnNames[10].toString());
                }
                if(!"".equals(t.table.getValueAt(i,12).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,12).toString()+t.columnNames[12].toString());
                }
                if(!"".equals(t.table.getValueAt(i,14).toString())){
                    System.out.println("insert : " + t.table.getValueAt(i,0).toString()+t.table.getValueAt(i,14).toString()+t.columnNames[14].toString());
                }
                
            }   
        }
        String lc = str;
        double somme = 0;
        for (String ligne : lc.split(";")) {
            //System.out.println("id ligne CRedit "+ligne);
            String[] detlic = ligne.split(":");

            //System.out.println("id lc "+detlic[0]);
            //System.out.println("montant "+detlic[1]);
            // System.out.println("INSERT INTO ENGAGERCREDIT VALUES(S_ENGAGERCREDIT.NEXTVAL,4,"+detlic[0]+","+detlic[1]+",0,0);");
            //somme += Double.valueOf(detlic[1]);
            //System.out.println("Numero de Compte"+detlic[2]);
        }
        //System.out.println("somme  " + somme);
        // new Engagement().setVisible(true);

        //t.eng.setText(str);
        //t.eng.setMontant(String.valueOf(somme));
        //t.setVisible(false);
        //t.dispose();
    }
}
