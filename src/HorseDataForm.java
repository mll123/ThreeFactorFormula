/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Net57-35
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HorseDataForm extends javax.swing.JFrame {

    /**
     * My variable declarations 
     */
    private  BufferedReader buff;
    private  String dataFile;
    private  String file;
    private  String dir;
    private  String line;
    private  String delimiter;
    //Create the analysis table for analysing the final result
    private  ArrayList AnalTable = new ArrayList(); 
    
    private void initVariables() {
        buff = null;
        //dataFile = "Data.csv";
        
        dir="C:/Users/Net57-35/HorseRace/";
        dataFile="noFile";
        line = "";
        delimiter = ",";
    }
    /**
     * Creates new form HorseDataForm
     */
    public HorseDataForm() {
        initComponents();
        initVariables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        readDataFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fileName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Three Factor Formula for Horse Race");
        setAlwaysOnTop(true);

        readDataFile.setText("Predict Race");
        readDataFile.setToolTipText("Read Data for Horse Race from default file");
        readDataFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readDataFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Data for horses in selected race:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 0));

        details.setEditable(false);
        details.setBackground(new java.awt.Color(255, 255, 0));
        details.setColumns(20);
        details.setRows(5);
        jScrollPane1.setViewportView(details);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter data file for Race");

        fileName.setText("Enter file name");
        fileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(close)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(readDataFile))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(readDataFile)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void readDataFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readDataFileActionPerformed
        // TODO add your handling code here
        file=fileName.getText();
        dataFile=dir+file;
        try {
            buff = new BufferedReader(new FileReader(dataFile));
            ArrayList horseRunner = new ArrayList();
            ArrayList horseRunner2= new ArrayList();
            ArrayList horseRunner3= new ArrayList();
            ArrayList horseRunner4= new ArrayList();
            ArrayList horseRunner5= new ArrayList();
            ArrayList horseRunner6= new ArrayList();
            
            horseRunner.add(new ArrayList());
            horseRunner2.add(new ArrayList());
            horseRunner3.add(new ArrayList());
            horseRunner4.add(new ArrayList());
            horseRunner5.add(new ArrayList());
            horseRunner6.add(new ArrayList());
            
            int i=0;
            while (null !=(line=buff.readLine())){
                if (i>0)
                {
                    horseRunner.add(new ArrayList());
                    horseRunner2.add(new ArrayList());
                    horseRunner3.add(new ArrayList());
                    horseRunner4.add(new ArrayList());
                    horseRunner5.add(new ArrayList());
                    horseRunner6.add(new ArrayList());
                }
                String[] horse = line.split(delimiter);
                
                ((ArrayList)horseRunner.get(i)).add(horse[0]);
                ((ArrayList)horseRunner2.get(i)).add(horse[0]);
                ((ArrayList)horseRunner3.get(i)).add(horse[0]);
                ((ArrayList)horseRunner4.get(i)).add(horse[0]);
                ((ArrayList)horseRunner5.get(i)).add(horse[0]);
                ((ArrayList)horseRunner6.get(i)).add(horse[0]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[1]);
                ((ArrayList)horseRunner2.get(i)).add(horse[1]);
                ((ArrayList)horseRunner3.get(i)).add(horse[1]);
                ((ArrayList)horseRunner4.get(i)).add(horse[1]);
                ((ArrayList)horseRunner5.get(i)).add(horse[1]);
                ((ArrayList)horseRunner6.get(i)).add(horse[1]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[2]);
                ((ArrayList)horseRunner2.get(i)).add(horse[2]);
                ((ArrayList)horseRunner3.get(i)).add(horse[2]);
                ((ArrayList)horseRunner4.get(i)).add(horse[2]);
                ((ArrayList)horseRunner5.get(i)).add(horse[2]);
                ((ArrayList)horseRunner6.get(i)).add(horse[2]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[3]);
                ((ArrayList)horseRunner2.get(i)).add(horse[3]);
                ((ArrayList)horseRunner3.get(i)).add(horse[3]);
                ((ArrayList)horseRunner4.get(i)).add(horse[3]);
                ((ArrayList)horseRunner5.get(i)).add(horse[3]);
                ((ArrayList)horseRunner6.get(i)).add(horse[3]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[4]);
                ((ArrayList)horseRunner2.get(i)).add(horse[4]);
                ((ArrayList)horseRunner3.get(i)).add(horse[4]);
                ((ArrayList)horseRunner4.get(i)).add(horse[4]);
                ((ArrayList)horseRunner5.get(i)).add(horse[4]);
                ((ArrayList)horseRunner6.get(i)).add(horse[4]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[5]);
                ((ArrayList)horseRunner2.get(i)).add(horse[5]);
                ((ArrayList)horseRunner3.get(i)).add(horse[5]);
                ((ArrayList)horseRunner4.get(i)).add(horse[5]);
                ((ArrayList)horseRunner5.get(i)).add(horse[5]);
                ((ArrayList)horseRunner6.get(i)).add(horse[5]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[6]);
                ((ArrayList)horseRunner2.get(i)).add(horse[6]);
                ((ArrayList)horseRunner3.get(i)).add(horse[6]);
                ((ArrayList)horseRunner4.get(i)).add(horse[6]);
                ((ArrayList)horseRunner5.get(i)).add(horse[6]);
                ((ArrayList)horseRunner6.get(i)).add(horse[6]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[7]);
                ((ArrayList)horseRunner2.get(i)).add(horse[7]);
                ((ArrayList)horseRunner3.get(i)).add(horse[7]);
                ((ArrayList)horseRunner4.get(i)).add(horse[7]);
                ((ArrayList)horseRunner5.get(i)).add(horse[7]);
                ((ArrayList)horseRunner6.get(i)).add(horse[7]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[8]);
                ((ArrayList)horseRunner2.get(i)).add(horse[8]);
                ((ArrayList)horseRunner3.get(i)).add(horse[8]);
                ((ArrayList)horseRunner4.get(i)).add(horse[8]);
                ((ArrayList)horseRunner5.get(i)).add(horse[8]);
                ((ArrayList)horseRunner6.get(i)).add(horse[8]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[9]);
                ((ArrayList)horseRunner2.get(i)).add(horse[9]);
                ((ArrayList)horseRunner3.get(i)).add(horse[9]);
                ((ArrayList)horseRunner4.get(i)).add(horse[9]);
                ((ArrayList)horseRunner5.get(i)).add(horse[9]);
                ((ArrayList)horseRunner6.get(i)).add(horse[9]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[10]);
                ((ArrayList)horseRunner2.get(i)).add(horse[10]);
                ((ArrayList)horseRunner3.get(i)).add(horse[10]);
                ((ArrayList)horseRunner4.get(i)).add(horse[10]);
                ((ArrayList)horseRunner5.get(i)).add(horse[10]);
                ((ArrayList)horseRunner6.get(i)).add(horse[10]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[11]);
                ((ArrayList)horseRunner2.get(i)).add(horse[11]);
                ((ArrayList)horseRunner3.get(i)).add(horse[11]);
                ((ArrayList)horseRunner4.get(i)).add(horse[11]);
                ((ArrayList)horseRunner5.get(i)).add(horse[11]);
                ((ArrayList)horseRunner6.get(i)).add(horse[11]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[12]);
                ((ArrayList)horseRunner2.get(i)).add(horse[12]);
                ((ArrayList)horseRunner3.get(i)).add(horse[12]);
                ((ArrayList)horseRunner4.get(i)).add(horse[12]);
                ((ArrayList)horseRunner5.get(i)).add(horse[12]);
                ((ArrayList)horseRunner6.get(i)).add(horse[12]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[13]);
                ((ArrayList)horseRunner2.get(i)).add(horse[13]);
                ((ArrayList)horseRunner3.get(i)).add(horse[13]);
                ((ArrayList)horseRunner4.get(i)).add(horse[13]);
                ((ArrayList)horseRunner5.get(i)).add(horse[13]);
                ((ArrayList)horseRunner6.get(i)).add(horse[13]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[14]);
                ((ArrayList)horseRunner2.get(i)).add(horse[14]);
                ((ArrayList)horseRunner3.get(i)).add(horse[14]);
                ((ArrayList)horseRunner4.get(i)).add(horse[14]);
                ((ArrayList)horseRunner5.get(i)).add(horse[14]);
                ((ArrayList)horseRunner6.get(i)).add(horse[14]);
                //---------------------------------------------
                ((ArrayList)horseRunner.get(i)).add(horse[15]);
                ((ArrayList)horseRunner2.get(i)).add(horse[15]);
                ((ArrayList)horseRunner3.get(i)).add(horse[15]);
                ((ArrayList)horseRunner4.get(i)).add(horse[15]);
                ((ArrayList)horseRunner5.get(i)).add(horse[15]);
                ((ArrayList)horseRunner6.get(i)).add(horse[15]);
                i++;
            }
            
            
            
            //details.append(horse[0]+", "+horse[1]+", "+horse[2]+", "+horse[3]+", "+horse[4]+", "+horse[5]+", "+horse[6]+", "+horse[7]+", "+horse[8]+"\n");
            ArrayList runner;
            for (int row=0; row<horseRunner.size(); row++)
            {
                for (int col=0; col<((ArrayList)horseRunner.get(row)).size(); col++)
                {
                    runner = (ArrayList)horseRunner.get(row);
                    if (col == (((ArrayList)horseRunner.get(row)).size()-1))
                        details.append((String)(runner.get(col))+"\n");
                    else
                        details.append((String)(runner.get(col))+"   ¦   ");
                }
            }
            details.append("\n\n ------    Highest RPR table    -------------");
            details.append(" \n");
            horseRunner.remove(0);
                //\details.append("\n");
            int no=0, nr=0;
            int anaInd;
            int prev_max=0;
            while (horseRunner.size()>0)
            {
                int maxIndex=0;
                int max = 0;
                
                for (int index=0; index<horseRunner.size(); index++)
                {
                    if (index==0)
                    {
                        max=Integer.parseInt((String)(((ArrayList)(horseRunner.get(index))).get(7)));
                    }
                    else //this is not the first row
                    {
                        if (Integer.parseInt((String)(((ArrayList)(horseRunner.get(index))).get(7)))>max)
                        {
                            max=Integer.parseInt((String)(((ArrayList)(horseRunner.get(index))).get(7)));
                            //max = (Integer)((ArrayList)(horseRunner.get(index))).get(8);
                            maxIndex = index;
                        }
                    }
                }
                anaInd=nr;
                if (max!=prev_max)
                {
                    System.out.println("max is "+Integer.toString(max)+" previous max is "+Integer.toString(prev_max));
                    no++;
                    prev_max=max;
                }
                nr++;
                runner=(ArrayList)(horseRunner.get(maxIndex));
                
                AnalTable.add(new ArrayList());
                ((ArrayList)AnalTable.get(anaInd)).add((String)runner.get(1));
                ((ArrayList)AnalTable.get(anaInd)).add("    "+Integer.toString(no));
                
                for (int data=0; data < runner.size(); data++)
                {
                    if (data==0)
                        details.append(Integer.toString(no)+"   ");
                    details.append((String)(runner.get(data)));
                    details.append("   ¦   ");
                }
                details.append("\n");
                horseRunner.remove(maxIndex);
            }
            horseRunner2.remove(0);
            rankCDcol(horseRunner2);
            horseRunner3.remove(0);
            rankPastPerf(horseRunner3);
            horseRunner4.remove(0);
            rankAge(horseRunner4);
            horseRunner5.remove(0);
            rankWt(horseRunner5);
            horseRunner6.remove(0);
            rankOR(horseRunner6);
            
            details.append("\n\n ---------- Analysis ---------------\n");
            String horseDetails;
            for (int id=0; id<AnalTable.size();id++)
            {
                for (int data=0; data<((ArrayList)AnalTable.get(id)).size(); data++)
                {
                    horseDetails = (String)(((ArrayList)(AnalTable.get(id))).get(data));
                    details.append(horseDetails);
                }
                details.append("\n");
            }
                
        }
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_readDataFileActionPerformed

    private void fileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileNameActionPerformed

    private void rankCDcol(ArrayList currentTable)
    {
        int C,D;
        ArrayList currRun;
        details.append("\n");
        details.append("-----  Highest ranking CD table ----\n");
        int no=0;

        String AnalTableEntry;
        while (currentTable.size()>0)
        { 
            int maxCD = 0;
            int maxCDrow = 0;

            for (int row=0;row<currentTable.size();row++)
            {
                C=Integer.parseInt((String)(((ArrayList)(currentTable.get(row))).get(8)));
                D=Integer.parseInt((String)(((ArrayList)(currentTable.get(row))).get(9)));
                if (C+D > maxCD)
                {
                    maxCD = C+D;
                    maxCDrow = row;
                }
            }

            no++;
            currRun = (ArrayList)(currentTable.get(maxCDrow));
            for (int i=0; i<AnalTable.size();i++)
            {
                AnalTableEntry=(String)(((ArrayList)AnalTable.get(i)).get(0));
                if (AnalTableEntry.equals((String)(currRun.get(1))))
                {
                    System.out.println(AnalTableEntry+" from AnalTable is equal to "+(String)(currRun.get(1))+" from CD table");
                    ((ArrayList)AnalTable.get(i)).add("    "+Integer.toString(no));
                }
            }
            
            for (int col=0; col<currRun.size(); col++)
            {
                if (col==0)
                    details.append(Integer.toString(no)+"    ");
                details.append((String)(currRun.get(col)));
                details.append("   ¦   ");
            }
            details.append("\n");
            currentTable.remove(maxCDrow);
        }
    }
    
    private void rankPastPerf(ArrayList currTable)
    {
        int L1,L2,L3,L4,L5,L6;
        ArrayList minSumLHorse;
        int sum,minSumL,minSumLRow;
        details.append("\n");
        details.append("-------------Highest Ranking Past Performance-----------\n");
        int no=0;
        String AnalTableEntry;
        
        while(currTable.size()>0)
        {
            minSumL=60;
            minSumLRow=0;
            sum=0;
            
            for (int row=0; row<currTable.size(); row++)
            {
                L1=Integer.parseInt((String)((ArrayList)(currTable.get(row))).get(15));
                L2=Integer.parseInt((String)((ArrayList)(currTable.get(row))).get(14));
                L3=Integer.parseInt((String)((ArrayList)(currTable.get(row))).get(13));  
                L4=Integer.parseInt((String)((ArrayList)(currTable.get(row))).get(12));
                L5=Integer.parseInt((String)((ArrayList)(currTable.get(row))).get(11));
                L6=Integer.parseInt((String)((ArrayList)(currTable.get(row))).get(10));
                sum=L1+L2+L3+L4+L5+L6;
                if(sum < minSumL)
                {
                   minSumL=sum;
                   minSumLRow=row;
                }
            }
            no++;
            minSumLHorse=(ArrayList)(currTable.get(minSumLRow));
            
            for (int i=0; i<AnalTable.size(); i++)
            {
                AnalTableEntry=(String)(((ArrayList)AnalTable.get(i)).get(0));
                if (AnalTableEntry.equals((String)(minSumLHorse).get(1)))
                    ((ArrayList)AnalTable.get(i)).add("    "+Integer.toString(no));
            }
            
            for(int col=0; col<minSumLHorse.size(); col++)
            {
                if (col==0)
                    details.append(Integer.toString(no)+"     ");
                details.append((String)minSumLHorse.get(col));
                details.append("    ¦   ");
            }
            details.append("\n");
            currTable.remove(minSumLRow);
        }
    }
    
    private void rankAge(ArrayList ct)
    {
        int minAge, minAgeRowNr; 
        ArrayList minAgeHorse;
        details.append("\n");
        details.append("----------Horse Age Ranking (Youngest first)------------\n");
        int no=0;
        String AnalTableEntry;
        
        while(ct.size()>0)
        {
            minAge=100;
            minAgeRowNr=0;
            
            for (int row=0; row<ct.size();row++)
            {
                if (Integer.parseInt((String)(((ArrayList)(ct.get(row))).get(2)))<minAge)
                {
                    minAge=Integer.parseInt((String)(((ArrayList)(ct.get(row))).get(2)));
                    minAgeRowNr=row;
                }
            }
            no++;
            minAgeHorse = (ArrayList)(ct.get(minAgeRowNr));
            
            for (int i=0; i<AnalTable.size();i++)
            {
                AnalTableEntry=(String)(((ArrayList)AnalTable.get(i)).get(0));
                if (AnalTableEntry.equals((String)(minAgeHorse.get(1))))
                    ((ArrayList)AnalTable.get(i)).add("       "+Integer.toString(no));
            }
            for (int col=0; col<minAgeHorse.size(); col++)
            {
                if (col==0)
                    details.append(Integer.toString(no)+"     ");
                details.append((String)minAgeHorse.get(col));
                details.append("    ¦   ");
            }
            details.append("\n");
            ct.remove(minAgeRowNr);
        }
    }
    
    private void rankWt(ArrayList cTable)
    {
        float minWt; 
        int minWtIndex;
        ArrayList minWtHorse;
        details.append("\n\n-----------Rank Handicap weight---------\n");
        int no=0;
        String AnalTableEntry;
        
        while(cTable.size()>0)
        {
            minWt=100;
            minWtIndex=0;
            
            for (int row=0; row<cTable.size(); row++)
            {
                if(Float.parseFloat((String)(((ArrayList)(cTable.get(row))).get(6)))<minWt)
                {
                    minWt=Float.parseFloat((String)(((ArrayList)(cTable.get(row))).get(6)));
                    minWtIndex=row;
                }
            }
            no++;
            minWtHorse=(ArrayList)(cTable.get(minWtIndex));
            
            for (int i=0; i<AnalTable.size(); i++)
            {
                AnalTableEntry = (String)(((ArrayList)AnalTable.get(i)).get(0));
                if (AnalTableEntry.equals((String)(minWtHorse).get(1)))
                    ((ArrayList)AnalTable.get(i)).add("       "+Integer.toString(no));
            }
            
            for (int col=0;col<minWtHorse.size();col++)
            {
                if (col==0)
                    details.append(Integer.toString(no)+"     ");
                details.append((String)(minWtHorse.get(col)));
                details.append("     ¦     ");
            }
            details.append("\n");
            cTable.remove(minWtIndex);
        }
    }
    
    private void rankOR(ArrayList cTable)
    {
        int maxOR, maxORIndex;
        ArrayList maxORHorse;
        details.append("\n\n-------------OR Ranking-------------------\n");
        int no=0;
        String AnalTableEntry;
        
        while(cTable.size()>0)
        {
            maxOR=0;
            maxORIndex=0;
            
            for (int row=0; row<cTable.size(); row++)
            {
                if (Integer.parseInt((String)(((ArrayList)(cTable.get(row))).get(3)))>maxOR)
                {
                    maxOR=Integer.parseInt((String)(((ArrayList)(cTable.get(row))).get(3)));
                    maxORIndex=row;
                }
            }
            no++;
            maxORHorse=(ArrayList)(cTable.get(maxORIndex));
            
            for (int i=0; i<AnalTable.size(); i++)
            {
                AnalTableEntry=(String)(((ArrayList)AnalTable.get(i)).get(0));
                if (AnalTableEntry.equals((String)(maxORHorse).get(1)))
                    ((ArrayList)AnalTable.get(i)).add("       "+Integer.toString(no));
            }
            
            for (int data=0; data < maxORHorse.size(); data++)
            {
                if (data==0)
                    details.append(Integer.toString(no)+"     ");
                details.append((String)(maxORHorse.get(data)));
                details.append("   ¦   ");
            }
            details.append("\n");
            cTable.remove(maxORIndex);
        }
    }
    
    /**
     * Removed arg param comment from here
     */
    /*11:59 public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HorseDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorseDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorseDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorseDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorseDataForm().setVisible(true);
            }
        });
    } 11:59*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTextArea details;
    private javax.swing.JTextField fileName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton readDataFile;
    // End of variables declaration//GEN-END:variables
}
