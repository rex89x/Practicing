/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.ui;

import com.abc.Electricity;
import com.abc.GEPTstudent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class MyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyJFrame
     */
    public MyJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        openMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        openMenu.setText("File");
        openMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(openMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuMouseClicked
        //---------------------------------------------
//???MenuBar??????Open????????????	
//---------------------------------------------     
//??????FileChooser??????
JFileChooser jFileChooser = new JFileChooser();
jFileChooser.setDialogTitle("????????????");

//?????????????????????   
int returnVal = jFileChooser.showOpenDialog(this);
if (returnVal == JFileChooser.APPROVE_OPTION) {
    //??????????????????
    File file = jFileChooser.getSelectedFile();

    //????????????????????????	
    try {
        //????????????BufferedReader??????, ????????????????????????	
        BufferedReader b = new BufferedReader(new FileReader(file));

        //?????????????????????????????????		
        String data; 

        //??????????????????
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0); 

        //=======================================================
        // (1)?????????????????????????????????????????????????????????arrayList
        //=======================================================
        ArrayList<GEPTstudent> arrayList = new ArrayList();
        //=======================================================

        while ((data = b.readLine()) != null) {
            //???????????????????????????
            String items[]=data.split(",", -1);

            //=====================================================================
            // (2)??????????????????, ??????, ??????, ??????, ??????, ??????, ??????, ??????, ??????????????????
            //=====================================================================
            String stuNo = items[0];
            String gender = items[1];            
            int chi = Integer.parseInt(items[2]);
            int eng = Integer.parseInt(items[3]);
            int mat = Integer.parseInt(items[4]);
            int soc = Integer.parseInt(items[5]);
            int nat = Integer.parseInt(items[6]);	    
            int lec = Integer.parseInt(items[7]);
            String gept = items[8]; 	    
            //=====================================================================

            //=================================================================================
            // (3)????????????????????????????????????, ????????????arrayList???
            //=================================================================================
            arrayList.add(new GEPTstudent(stuNo, gender, chi, eng, mat, soc, nat, lec, gept));          
            //=================================================================================
        }  


        //==========================================================================
        // (4)????????????????????????????????????, ?????????????????????, ?????????????????????
        //==========================================================================
        for(int i=0; i<arrayList.size(); i++){
            //??????arrayList?????????i?????????????????????
            GEPTstudent s = arrayList.get(i);

            //????????????????????????????????????
            Object[] row = {s.getStuNo(), s.getGender(), s.getGept(), s.total()};

            //?????????????????????????????????
            model.addRow(row);
        }
        //==========================================================================        
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "?????????????????????!");
    }
} else {
    System.out.println("??????????????????");
}         
//---------------------------------------------    


    }//GEN-LAST:event_openMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JMenu openMenu;
    // End of variables declaration//GEN-END:variables
}
