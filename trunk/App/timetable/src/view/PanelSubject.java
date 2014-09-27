/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.SubjectManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Subject;

/**
 *
 * @author VuDucCanh
 */
public class PanelSubject extends javax.swing.JPanel {

    /**
     * Creates new form PanelSubject
     */
    DefaultTableModel dtbm = new DefaultTableModel();
    boolean Insert;
    boolean Edit;
    DefaultComboBoxModel cbbSubjectSearch = new DefaultComboBoxModel();

    public PanelSubject() {
        initComponents();
        LoadTable();
        jBSave.setEnabled(false);
        jBCancel.setEnabled(false);
        cbbSubjectSearch.addElement("Mã môn học");
        cbbSubjectSearch.addElement("Tên môn học");
        cbbSubjectSearch.addElement("Bộ môn");
        jComboSearch.setModel(cbbSubjectSearch);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtSearch = new javax.swing.JTextField();
        jComboSearch = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jBSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBEdit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtSubjectName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtSubjectID = new javax.swing.JTextField();
        jBClear = new javax.swing.JButton();
        jtxtMaster = new javax.swing.JTextField();
        jBadd = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jBCancel = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jtxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSearchActionPerformed(evt);
            }
        });

        jComboSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3" }));
        jComboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tìm với");

        jBSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Start-Menu-Search-icon.png"))); // NOI18N
        jBSearch.setText("Tìm");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSearch)
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboSearch)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("Seach By");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUBJECT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jBEdit.setText("Chỉnh sửa");
        jBEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel2.setText("Tên Môn Học");

        jtxtSubjectName.setEnabled(false);

        jLabel3.setText("Bộ Môn");

        jLabel5.setText("Mã Môn Học");

        jtxtSubjectID.setEnabled(false);

        jBClear.setText("Clear TextField");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jtxtMaster.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSubjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSubjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtMaster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jBClear)))
                .addGap(32, 32, 32))
        );

        jBadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.png"))); // NOI18N
        jBadd.setText("Thêm");
        jBadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddActionPerformed(evt);
            }
        });

        jBDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jBDelete.setText("Xóa");
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });

        jBSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jBSave.setText("Lưu Lại");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        jBCancel.setText("Hủy Bỏ");
        jBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jBSave)
                        .addGap(140, 140, 140)
                        .addComponent(jBCancel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jBadd)
                .addGap(86, 86, 86)
                .addComponent(jBEdit)
                .addGap(91, 91, 91)
                .addComponent(jBDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEdit)
                    .addComponent(jBadd)
                    .addComponent(jBDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSave)
                    .addComponent(jBCancel))
                .addGap(23, 23, 23))
        );

        jPanel3.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditActionPerformed
        jBadd.setEnabled(false);
        jBEdit.setEnabled(false);
        jBDelete.setEnabled(false);
        jBSave.setEnabled(true);
        jBCancel.setEnabled(true);
        setTextField(true);
        jtxtSubjectID.setEnabled(true);
//        setTextFieldtoNull();
        Edit = true;
//        int index = jTable1.getSelectedRow();
//
//        Vector Row = (Vector) dtbm.getDataVector().get(index);
//
//        for (int i = 0; i < Row.size(); i++) {
//            System.out.println(Row.get(i));
//        }
//        int CurrentID = Integer.parseInt(Row.get(0).toString());
//        System.out.println(index);
//        System.out.println(Row.size());
    }//GEN-LAST:event_jBEditActionPerformed

    private void jtxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSearchActionPerformed

    private void jComboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSearchActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        reset();
        dtbm.addColumn("Mã Môn Học");
        dtbm.addColumn("Tên Môn Học");
        dtbm.addColumn("Bộ Môn");
        List<Subject> list = new ArrayList<>();
        if (jComboSearch.getSelectedItem().toString().equals("Tên môn học")) {
            try {
                list = SubjectManager.searchSubjectbyName(jtxtSearch.getText());
                for (Subject subject : list) {
                    Vector v = new Vector();
                    v.add(subject.getSUBJECT_ID());
                    v.add(subject.getSUBJECT_NAME());
                    v.add(subject.getMASTER_SUBJECT());
                    dtbm.addRow(v);
                }
                jTable1.setModel(dtbm);
            } catch (SQLException ex) {
                Logger.getLogger(PanelSubject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (jComboSearch.getSelectedItem().toString().equals("Mã môn học")) {
            try {
                list = SubjectManager.searchSubjectbyID(jtxtSearch.getText());
                for (Subject subject : list) {
                    Vector v = new Vector();
                    v.add(subject.getSUBJECT_ID());
                    v.add(subject.getSUBJECT_NAME());
                    v.add(subject.getMASTER_SUBJECT());
                    dtbm.addRow(v);
                }
                jTable1.setModel(dtbm);
            } catch (SQLException ex) {
                Logger.getLogger(PanelSubject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (jComboSearch.getSelectedItem().toString().equals("Bộ môn")) {
            try {
                list = SubjectManager.searchSubjectbyID(jtxtSearch.getText());
                for (Subject subject : list) {
                    Vector v = new Vector();
                    v.add(subject.getSUBJECT_ID());
                    v.add(subject.getSUBJECT_NAME());
                    v.add(subject.getMASTER_SUBJECT());
                    dtbm.addRow(v);
                }
                jTable1.setModel(dtbm);
            } catch (SQLException ex) {
                Logger.getLogger(PanelSubject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddActionPerformed
        jBadd.setEnabled(false);
        jBEdit.setEnabled(false);
        jBDelete.setEnabled(false);
        jBSave.setEnabled(true);
        jBCancel.setEnabled(true);
        setTextField(true);
        setTextFieldtoNull();
        Insert = true;
    }//GEN-LAST:event_jBaddActionPerformed

    private void jBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelActionPerformed
//        setTextFieldtoNull();
        jBadd.setEnabled(true);
        jBEdit.setEnabled(true);
        jBDelete.setEnabled(true);
        jBSave.setEnabled(false);
        jBCancel.setEnabled(false);
        setTextField(false);
        Edit = false;
        Insert = false;
    }//GEN-LAST:event_jBCancelActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        if (Edit) {
            editSubject();
            reset();
            LoadTable();
        }
        if (Insert) {
            insertSubject();
            reset();
            LoadTable();
        }
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
        jBadd.setEnabled(true);
        jBEdit.setEnabled(true);
        jBDelete.setEnabled(true);
        jBSave.setEnabled(false);
        jBCancel.setEnabled(false);
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa môn học có mã môn học là " + jtxtSubjectID.getText() + "?", "Cảnh Báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            SubjectManager.DeleteSubject(jtxtSubjectID.getText());
            setTextFieldtoNull();
            reset();
            LoadTable();
        }
    }//GEN-LAST:event_jBDeleteActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        setTextFieldtoNull();
    }//GEN-LAST:event_jBClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        Vector Row = (Vector) dtbm.getDataVector().get(index);
        String subjectID = Row.get(0).toString();
        Subject item = SubjectManager.GetSubjectbyID(subjectID);
        loadtoTextField(item);
    }//GEN-LAST:event_jTable1MouseClicked
    private void loadtoTextField(Subject subject) {
        jtxtSubjectID.setText(subject.getSUBJECT_ID());
        jtxtMaster.setText(subject.getMASTER_SUBJECT());
        jtxtSubjectName.setText(subject.getSUBJECT_NAME());
    }

    public void LoadTable() {
        List<Subject> list = new ArrayList<>();
        dtbm.addColumn("Mã Môn Học");
        dtbm.addColumn("Tên Môn Học");
        dtbm.addColumn("Bộ Môn");
        try {
            list = SubjectManager.SelectSubject();
            for (Subject subject : list) {
                Vector v = new Vector();
                v.add(subject.getSUBJECT_ID());
                v.add(subject.getSUBJECT_NAME());
                v.add(subject.getMASTER_SUBJECT());
                dtbm.addRow(v);
            }
            jTable1.setModel(dtbm);
        } catch (SQLException ex) {
            Logger.getLogger(PanelRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reset() {
        dtbm.setRowCount(0);
        dtbm.setColumnCount(0);
    }

    private void setTextField(boolean settextfield) {
        jtxtSubjectID.setEnabled(settextfield);
        jtxtSubjectName.setEnabled(settextfield);
        jtxtMaster.setEnabled(settextfield);
    }

    private void setTextFieldtoNull() {
        jtxtMaster.setText("");
        jtxtSubjectID.setText("");
        jtxtSubjectName.setText("");
    }

    private String checkTextField() {
        String Error = "";
        if (jtxtSubjectID.getText().equals("")) {
            Error += "Mã môn học không được để trống\n";
        }
        if (jtxtSubjectName.getText().equals("")) {
            Error += "Môn học không được để trống\n";
        }
        if (jtxtMaster.getText().equals("")) {
            Error += "Bộ môn không được để trống";
        }
        return Error;
    }

    private void insertSubject() {
        String Error = checkTextField();
        String Error2 = "";
        if (Error.equals("") == true) {
            if (SubjectManager.checkSubjectID(jtxtSubjectID.getText())) {
                Error2 += "Mã môn học đã tồn tại\n";
            }
            if (SubjectManager.checkSubjectName(jtxtSubjectName.getText())) {
                Error2 += "Tên môn học đã tồn tại\n";
            }
            if (Error2.equals("") == true) {
                Subject subject = new Subject();
                subject.setSUBJECT_ID(jtxtSubjectID.getText());
                subject.setSUBJECT_NAME(jtxtSubjectName.getText());
                subject.setMASTER_SUBJECT(jtxtMaster.getText());
                boolean test = SubjectManager.InsertSubject(subject);
                if (test) {
                    JOptionPane.showMessageDialog(this, "Thêm môn học thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm môn học thất bại");
                }
            } else {
                JOptionPane.showMessageDialog(this, Error2);
            }
        } else {
            JOptionPane.showMessageDialog(this, Error);
        }
    }

    private void editSubject() {
        Subject item = SubjectManager.GetSubjectbyID(jtxtSubjectID.getText());
        String Older = "";
        Older = item.getSUBJECT_NAME();
        String Error = checkTextField();
        if (Error.equals("")) {
            if (SubjectManager.checkSubjectID(jtxtSubjectID.getText())) {
                if (jtxtSubjectName.getText().equals(Older) == false && SubjectManager.checkSubjectName(jtxtSubjectName.getText())) {
                    JOptionPane.showMessageDialog(this, "Tên môn học đã tồn tại");
                } else {
                    Subject subject = new Subject();
                    subject.setSUBJECT_ID(jtxtSubjectID.getText());
                    subject.setSUBJECT_NAME(jtxtSubjectName.getText());
                    subject.setMASTER_SUBJECT(jtxtMaster.getText());
                    boolean test = SubjectManager.UpdateSubject(subject);
                    if (test) {
                        JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Chỉnh sửa thất bại");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mã môn học không tồn tại");
            }
        } else {
            JOptionPane.showMessageDialog(this, Error);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBEdit;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBadd;
    private javax.swing.JComboBox jComboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtMaster;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTextField jtxtSubjectID;
    private javax.swing.JTextField jtxtSubjectName;
    // End of variables declaration//GEN-END:variables
}
