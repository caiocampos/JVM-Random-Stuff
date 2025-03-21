/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.crud;

import controllers.FrmAeronaveController;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.AeronaveTO;

/**
 *
 * @author William
 */
public class FrmAeronave extends TrabalhoFrame {

    private FrmAeronaveController controller = new FrmAeronaveController();

    /**
     * Creates new form FrmAeronave
     */
    public FrmAeronave() {
	initComponents();
	substitutasPopulate();
	tblAeronavePopulate();
	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrAeronave = new javax.swing.JScrollPane();
        tblAeronave = new javax.swing.JTable();
        btnDeleteAeronave = new javax.swing.JButton();
        btnSaveAeronave = new javax.swing.JButton();
        btnNewAeronave = new javax.swing.JButton();
        lblSearchAeronave = new javax.swing.JLabel();
        txtSearchAeronave = new java.awt.TextField();
        lblNewCodigoAeronave = new javax.swing.JLabel();
        txtNewCodigoAeronave = new javax.swing.JTextField();
        lblNewFabricante = new javax.swing.JLabel();
        txtNewFabricante = new javax.swing.JTextField();
        lblNewModelo = new javax.swing.JLabel();
        txtNewModelo = new javax.swing.JTextField();
        lblNewSubstituta = new javax.swing.JLabel();
        cmbNewSubstituta = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAeronave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da Aeronave", "Fabricante", "Modelo", "Substituta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAeronave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAeronaveMouseClicked(evt);
            }
        });
        tblAeronave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAeronaveKeyPressed(evt);
            }
        });
        scrAeronave.setViewportView(tblAeronave);

        btnDeleteAeronave.setText("Apagar");
        btnDeleteAeronave.setEnabled(false);
        btnDeleteAeronave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAeronaveMouseClicked(evt);
            }
        });

        btnSaveAeronave.setText("Salvar");
        btnSaveAeronave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveAeronaveMouseClicked(evt);
            }
        });

        btnNewAeronave.setText("Novo");
        btnNewAeronave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewAeronaveMouseClicked(evt);
            }
        });

        lblSearchAeronave.setText("Pesquise pelo código da aeronave");

        txtSearchAeronave.setName(""); // NOI18N
        txtSearchAeronave.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                txtSearchAeronaveTextValueChanged(evt);
            }
        });

        lblNewCodigoAeronave.setText("Código da Aeronave");

        txtNewCodigoAeronave.setEnabled(false);

        lblNewFabricante.setText("Fabricante");

        lblNewModelo.setText("Modelo");

        lblNewSubstituta.setText("Código da Substituta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchAeronave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNewCodigoAeronave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNewFabricante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNewModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNewSubstituta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNewSubstituta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDeleteAeronave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveAeronave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewAeronave)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSearchAeronave)
                    .addComponent(txtSearchAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewCodigoAeronave)
                    .addComponent(txtNewCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewFabricante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewSubstituta)
                    .addComponent(cmbNewSubstituta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewAeronave)
                    .addComponent(btnSaveAeronave)
                    .addComponent(btnDeleteAeronave))
                .addContainerGap())
        );

        txtSearchAeronave.getAccessibleContext().setAccessibleName("");
        txtNewCodigoAeronave.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAeronaveSelect(int val) {
	txtNewCodigoAeronave.setEnabled(false);
	btnDeleteAeronave.setEnabled(true);
	tblAeronave.changeSelection(val, 0, false, false);
	String codAeronave, fabricante, modelo, sub;
	codAeronave = (String) tblAeronave.getValueAt(val, 0);
	fabricante = (String) tblAeronave.getValueAt(val, 1);
	modelo = (String) tblAeronave.getValueAt(val, 2);
	sub = (String) tblAeronave.getValueAt(val, 3);
	txtNewCodigoAeronave.setText(codAeronave);
	txtNewFabricante.setText(fabricante);
	txtNewModelo.setText(modelo);
	cmbNewSubstituta.setSelectedItem(sub);
    }

    private void tblAeronavePopulate() {
	List<AeronaveTO> res = controller.find(txtSearchAeronave.getText());
	DefaultTableModel modelo = (DefaultTableModel) tblAeronave.getModel();
	modelo.setRowCount(0);
	if (res == null) {
	    return;
	}
	int i = 0;
	String codSub;
	for (AeronaveTO aeronave : res) {
	    modelo.addRow(new Object[modelo.getColumnCount()]);
	    tblAeronave.setValueAt(aeronave.getCodAeronave(), i, 0);
	    tblAeronave.setValueAt(aeronave.getFabricante(), i, 1);
	    tblAeronave.setValueAt(aeronave.getModelo(), i, 2);
	    codSub = aeronave.getSubstituta().getCodAeronave();
	    tblAeronave.setValueAt(codSub, i, 3);
	    i++;
	}
    }
    
    private void substitutasPopulate() {
	cmbNewSubstituta.setModel(new javax.swing.DefaultComboBoxModel(controller.getSubstitutas()));
    }

    private void txtSearchAeronaveTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_txtSearchAeronaveTextValueChanged
	tblAeronavePopulate();
    }//GEN-LAST:event_txtSearchAeronaveTextValueChanged

    private void tblAeronaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAeronaveKeyPressed
	int val = tblAeronave.getSelectedRow();
	if (evt.getID() == java.awt.event.KeyEvent.VK_DOWN) {
	    if (val <= tblAeronave.getRowCount()) {
		val++;
	    }
	} else if (evt.getID() == java.awt.event.KeyEvent.VK_UP) {
	    if (val > 0) {
		val--;
	    }
	} else {
	    return;
	}
	tblAeronaveSelect(val);
    }//GEN-LAST:event_tblAeronaveKeyPressed

    private void tblAeronaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAeronaveMouseClicked
	int val = tblAeronave.getSelectedRow();
	tblAeronaveSelect(val);
    }//GEN-LAST:event_tblAeronaveMouseClicked

    private void btnNewAeronaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewAeronaveMouseClicked
	txtNewCodigoAeronave.setText("");
	txtNewFabricante.setText("");
	txtNewModelo.setText("");
	cmbNewSubstituta.setSelectedIndex(0);
	txtNewCodigoAeronave.setEnabled(true);
	btnDeleteAeronave.setEnabled(false);
    }//GEN-LAST:event_btnNewAeronaveMouseClicked

    private void btnSaveAeronaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveAeronaveMouseClicked
	controller.salvar(txtNewCodigoAeronave.getText(), txtNewFabricante.getText(), txtNewModelo.getText(), (String) cmbNewSubstituta.getSelectedItem());
	substitutasPopulate();
	tblAeronavePopulate();
    }//GEN-LAST:event_btnSaveAeronaveMouseClicked

    private void btnDeleteAeronaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAeronaveMouseClicked
	controller.deletar(txtNewCodigoAeronave.getText());
	substitutasPopulate();
	tblAeronavePopulate();
    }//GEN-LAST:event_btnDeleteAeronaveMouseClicked

    public static void main(String args[]) {
	/*
	 * Set the Nimbus look and feel
	 */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
	 * If Nimbus (introduced in Java SE 6) is not available, stay with the
	 * default look and feel. For details see
	 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(FrmAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(FrmAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(FrmAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(FrmAssento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/*
	 * Create and display the form
	 */
	java.awt.EventQueue.invokeLater(new Runnable() {

	    public void run() {
		new FrmAeronave().setVisible(true);
	    }
	});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAeronave;
    private javax.swing.JButton btnNewAeronave;
    private javax.swing.JButton btnSaveAeronave;
    private javax.swing.JComboBox cmbNewSubstituta;
    private javax.swing.JLabel lblNewCodigoAeronave;
    private javax.swing.JLabel lblNewFabricante;
    private javax.swing.JLabel lblNewModelo;
    private javax.swing.JLabel lblNewSubstituta;
    private javax.swing.JLabel lblSearchAeronave;
    private javax.swing.JScrollPane scrAeronave;
    private javax.swing.JTable tblAeronave;
    private javax.swing.JTextField txtNewCodigoAeronave;
    private javax.swing.JTextField txtNewFabricante;
    private javax.swing.JTextField txtNewModelo;
    private java.awt.TextField txtSearchAeronave;
    // End of variables declaration//GEN-END:variables
}
