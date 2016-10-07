package View.cardlayout;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewScontrino extends JPanel {
	private static final int index = 4;
	private JTextField textField;
	
    public ViewScontrino()  {
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
    	this.setLayout(null);
		this.setSize(800, 800);
		
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTot = new javax.swing.JLabel();
        
        jButtonStampa = new javax.swing.JButton();
        
        
        

       
        setPreferredSize(new java.awt.Dimension(670, 550));
       

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 570));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Scontrino");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 0, 170, 40);
        JLabel lblNome = new JLabel("Numero Tavolo");
		lblNome.setBounds(22, 11, 46, 14);
		jPanel1.add(lblNome);
		this.textField = new JTextField();
		textField.setBounds(95, 8, 86, 20);
		jPanel1.add(textField);
		textField.setColumns(10);
        jButtonStampa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonStampa.setText("stampare");
        jPanel1.add(jButtonStampa);
        jButtonStampa.setBounds(60, 250, 130, 50);
        
        jLabelTot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jLabelTot);
        jLabelTot.setBounds(320, 250, 110, 70);
        this.add(jPanel1);
        jPanel1.setBounds(10, 0, 620, 500);

    }// </editor-fold>//GEN-END:initComponents

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    private javax.swing.JButton jButtonStampa;
    private javax.swing.JLabel jLabel1;
   
    private javax.swing.JLabel jLabelTot;
    private javax.swing.JPanel jPanel1;
    
 

	
    // End of variables declaration//GEN-END:variables
    public void addButtonListener(ActionListener listener)
	{
		this.jButtonStampa.addActionListener(listener);
	}

    public Integer getTav() {
    	String x = this.textField.getText().trim();
    	System.out.println(x);
        return Integer.valueOf(this.textField.getText().trim());
    }
    public void SetTot(Double tot){
    	this.jLabelTot.setText("Tot:"+tot);
    }
    public static int getIndex()
    {
    	return index;
    }
}

