/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuCliente.java
 *
 * Created on 19/06/2011, 14:45:04
 */
package Visual;

import Modelo.Cliente;
import Modelo.Venda;
import java.util.*;

/**
 *
 * @author Caio
 */
public class MenuCliente extends javax.swing.JFrame {

    private static Cliente c;

    /** Creates new form MenuCliente */
    public MenuCliente(String s) {
	c = POOView.findCliente(s);

	initComponents();

	vlUpdate();

	setVisible(true);
    }

    public static Venda findVenda(String s) {
	return c.findVenda(s);
    }

    public static void addVenda(Venda v) {
	c.addVenda(v);
    }

    public static void vlUpdate() {
	boolean teste;
	String a, t;
	listV.removeAll();
	a = findV.getText();
	for (Venda obj : c.getLV()) {
	    t = obj.getCode();
	    teste = false;
	    for (int i = 0; i < a.length(); i++) {
		if (a.charAt(i) != t.charAt(i) || a.length() > t.length()) {
		    teste = true;
		    break;
		}
	    }
	    if (!teste) {
		listV.add(t);
	    }
	}
    }

    private MenuCliente() {
	initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        nomeC = new java.awt.TextField();
        label2 = new java.awt.Label();
        cpfC = new java.awt.TextField();
        label3 = new java.awt.Label();
        rgC = new java.awt.TextField();
        label4 = new java.awt.Label();
        telC = new java.awt.TextField();
        label5 = new java.awt.Label();
        endC = new java.awt.TextField();
        cadC = new javax.swing.JButton();
        cadV = new javax.swing.JButton();
        remC = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        findV = new java.awt.TextField();
        listV = new java.awt.List();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(Modelo.POOApp.class).getContext().getResourceMap(MenuCliente.class);
        jTabbedPane1.setBackground(resourceMap.getColor("jTabbedPane1.background")); // NOI18N
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        panel1.setName("panel1"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        label1.setName("label1"); // NOI18N
        label1.setText(resourceMap.getString("label1.text")); // NOI18N

        nomeC.setName("nomeC"); // NOI18N
        nomeC.setText(c.getNome());

        label2.setName("label2"); // NOI18N
        label2.setText(resourceMap.getString("label2.text")); // NOI18N

        cpfC.setName("cpfC"); // NOI18N
        cpfC.setText(c.getCPF());

        label3.setName("label3"); // NOI18N
        label3.setText(resourceMap.getString("label3.text")); // NOI18N

        rgC.setName("rgC"); // NOI18N
        rgC.setText(c.getRG());

        label4.setName("label4"); // NOI18N
        label4.setText(resourceMap.getString("label4.text")); // NOI18N

        telC.setName("telC"); // NOI18N
        telC.setText(c.getTelefone());

        label5.setName("label5"); // NOI18N
        label5.setText(resourceMap.getString("label5.text")); // NOI18N

        endC.setName("endC"); // NOI18N
        endC.setText(c.getEndereco());

        cadC.setText(resourceMap.getString("cadC.text")); // NOI18N
        cadC.setName("cadC"); // NOI18N
        cadC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadCMouseClicked(evt);
            }
        });

        cadV.setText(resourceMap.getString("cadV.text")); // NOI18N
        cadV.setName("cadV"); // NOI18N
        cadV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadVMouseClicked(evt);
            }
        });

        remC.setText(resourceMap.getString("remC.text")); // NOI18N
        remC.setName("remC"); // NOI18N
        remC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(remC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rgC, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(cpfC, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(nomeC, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(telC, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(endC, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cadC)
                    .addComponent(cadV)
                    .addComponent(remC))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cliente", panel1);

        panel2.setName("panel2"); // NOI18N

        findV.setName("findV"); // NOI18N
        findV.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                findVTextValueChanged(evt);
            }
        });

        listV.setName("listV"); // NOI18N
        listV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVMouseClicked(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(findV, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(listV, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(findV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listV, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista de Vendas", panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
	dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
	dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void cadCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadCMouseClicked
	String s;
	String fail = new String();

	s = nomeC.getText();
	if (!s.equals("")) {
	    c.setNome(s);
	}
	if (s.equals("")) {
	    fail += "\nNome";
	}

	s = cpfC.getText();
	if (!s.equals("")) {
	    c.setCPF(s);
	}
	if (s.equals("")) {
	    fail += "\nCPF";
	}

	s = rgC.getText();
	if (!s.equals("")) {
	    c.setRG(s);
	}
	if (s.equals("")) {
	    fail += "\nRG";
	}

	s = telC.getText();
	if (!s.equals("")) {
	    c.setTelefone(s);
	}
	if (s.equals("")) {
	    fail += "\nTelefone";
	}

	s = endC.getText();
	if (!s.equals("")) {
	    c.setEndereco(s);
	}
	if (s.equals("")) {
	    fail += "\nEndereço";
	}

	if (!fail.equals("")) {
	    showErro("Os seguintes campos estão vazios:".concat(fail));
	}
	POOView.gravarCliente();
    }//GEN-LAST:event_cadCMouseClicked

    private void cadVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadVMouseClicked
	Venda v = new Venda();
	Calendar cal = new GregorianCalendar();
	String s = new String();

	cal.setTime(new Date());
	s = c.getNome() + " " + POOView.code.toString();
	POOView.code++;

	v.setData(cal);
	v.setCode(s);

	MenuVenda menuVenda = new MenuVenda(v);
	menuVenda.setLocationRelativeTo(this);

	addVenda(v);
	POOView.gravarCliente();
	dispose();
    }//GEN-LAST:event_cadVMouseClicked

    private void findVTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_findVTextValueChanged
	vlUpdate();
    }//GEN-LAST:event_findVTextValueChanged

    private void listVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVMouseClicked
	MenuVenda menuVenda;
	String s = listV.getSelectedItem();
	if (evt.getClickCount() == 2 && s != null) {
	    menuVenda = new MenuVenda(c.findVenda(s));
	    menuVenda.setLocationRelativeTo(this);
	    dispose();
	}
    }//GEN-LAST:event_listVMouseClicked

    private void remCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remCMouseClicked
	POOView.delCliente(c);
	POOView.clUpdate();
	POOView.gravarCliente();
	dispose();
    }//GEN-LAST:event_remCMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	java.awt.EventQueue.invokeLater(new Runnable() {

	    public void run() {
		new MenuCliente().setVisible(true);
	    }
	});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadC;
    private javax.swing.JButton cadV;
    private java.awt.TextField cpfC;
    private java.awt.TextField endC;
    private static java.awt.TextField findV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private static java.awt.List listV;
    private java.awt.TextField nomeC;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JButton remC;
    private java.awt.TextField rgC;
    private java.awt.TextField telC;
    // End of variables declaration//GEN-END:variables
    private Erro erro;

    public void showErro(String s) {
	erro = new Erro(s);
	erro.setLocationRelativeTo(this);
    }
}
