/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import control.DevicesManager;
import control.RoomManager;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Device;
import model.Room;
import model.RoomType;

/**
 *
 * @author VuDucCanh
 */
public final class PanelRoom extends javax.swing.JPanel {

    /**
     * Creates new form PanelRoom
     */
    DefaultTableModel dtbm = new DefaultTableModel();
    DefaultComboBoxModel cbbRoomTypeModel = new DefaultComboBoxModel();
    DefaultComboBoxModel cbbRoomTypeModel4S = new DefaultComboBoxModel();
    DefaultComboBoxModel cbbRoomStatus = new DefaultComboBoxModel();

    public PanelRoom() {
        initComponents();
        initData();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoomList = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        cbbRoomType4S = new javax.swing.JComboBox();
        cbbStatus4S = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JCheckBox();
        cbbRoomType = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnViewDevices = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.setName("Room List"); // NOI18N

        tblRoomList.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRoomList.setNextFocusableComponent(jPanel1);
        tblRoomList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblRoomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomListMouseClicked(evt);
            }
        });
        tblRoomList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblRoomListKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblRoomListKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblRoomList);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        cbbRoomType4S.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbStatus4S.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Start-Menu-Search-icon.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbRoomType4S, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbStatus4S, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbRoomType4S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbStatus4S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );

        jScrollPane2.getAccessibleContext().setAccessibleParent(jScrollPane2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Room ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Room type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Status");

        cbStatus.setText("Usable");

        cbbRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.png"))); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnViewDevices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Data-View-Details-icon.png"))); // NOI18N
        btnViewDevices.setText("View Devices");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(cbbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addComponent(btnViewDevices))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset)
                    .addComponent(btnViewDevices))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStatus)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName(" Room List");
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String roomtype = "";
        String status = "";
        if (!cbbRoomTypeModel4S.getSelectedItem().toString().equals("All")) {
            roomtype = cbbRoomTypeModel4S.getSelectedItem().toString();
        }
        if (!cbbRoomStatus.getSelectedItem().toString().equals("All")) {
            if (cbbRoomStatus.getSelectedItem().toString().equals("Có thể sử dụng")) {
                status = "1";
            } else {
                status = "0";
            }
        }
        loadDataRoomTable(roomtype, status);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void loadDataRoomTable(String roomtype, String status) {
        dtbm = new DefaultTableModel();
        dtbm.addColumn("Phòng Học");
        dtbm.addColumn("Kiểu Phòng");
        dtbm.addColumn("Trạng Thái");
        List<Room> list = new ArrayList<>();
        list = RoomManager.searchRooms(txtSearch.getText(), roomtype, status);
        for (Room room : list) {
            dtbm.addRow(RoomManager.convertRoomToVector(room));
        }
        tblRoomList.setModel(dtbm);
    }

    private void tblRoomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomListMouseClicked
        loadDataToControl();
    }//GEN-LAST:event_tblRoomListMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtRoomID.setText("");
       // txtRoomID.setEditable(true);
        cbbRoomType.setSelectedIndex(0);
        cbStatus.setSelected(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnViewDevices.setEnabled(false);
        tblRoomList.clearSelection();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblRoomListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRoomListKeyPressed
//        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
//            loadDataToControl();
//        }
    }//GEN-LAST:event_tblRoomListKeyPressed

    private void tblRoomListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRoomListKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            loadDataToControl();
        }
    }//GEN-LAST:event_tblRoomListKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblRoomList.getSelectedRows().length == 0) {
            return;
        }
        if (!isRoomValidated()) {
            return;
        }
        if (RoomManager.updateRoom(new Room(txtRoomID.getText(), ((RoomType) cbbRoomType.getSelectedItem()).getTYPE_ID(), cbStatus.isSelected()))) {
            JOptionPane.showMessageDialog(null, "Update completed");
        } else {
            JOptionPane.showMessageDialog(null, "Update failed");
        }
        loadDataRoomTable("", "");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (!isRoomValidated()) {
            return;
        }

        if (RoomManager.insertNewRoom(new Room(txtRoomID.getText(), ((RoomType) cbbRoomType.getSelectedItem()).getTYPE_ID(), cbStatus.isSelected()))) {
            JOptionPane.showMessageDialog(null, "Insert completed");
        } else {
            JOptionPane.showMessageDialog(null, "Insert failed");
        }
        loadDataRoomTable("", "");
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnSearchActionPerformed(null);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tblRoomList.getSelectedRows().length == 0) {
            return;
        }
        if(JOptionPane.showConfirmDialog(null, "Are u sure?")==JOptionPane.YES_OPTION){
            RoomManager.deleteRoomByID(txtRoomID.getText());
            loadDataRoomTable("", "");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    public void initData() {
        List<Room> list = new ArrayList<>();
        List<RoomType> listType = new ArrayList<>();
        List<Device> listDevice = new ArrayList<>();
//Load List room table

        dtbm.addColumn("Phòng Học");
        dtbm.addColumn("Kiểu Phòng");
        dtbm.addColumn("Trạng Thái");

        list = RoomManager.getAllRooms();
        for (Room r : list) {
            dtbm.addRow(RoomManager.convertRoomToVector(r));
        }
        tblRoomList.setModel(dtbm);

//Load room type
        listType = RoomManager.getAllRoomTypes();
        cbbRoomTypeModel.addElement("Select");
        for (RoomType rt : listType) {
            cbbRoomTypeModel.addElement(rt);
        }
        cbbRoomType.setModel(cbbRoomTypeModel);
//Load room type for search   
        cbbRoomTypeModel4S.addElement("All");
        for (RoomType rt : listType) {
            cbbRoomTypeModel4S.addElement(rt);
        }
        cbbRoomType4S.setModel(cbbRoomTypeModel4S);
//Load combobox status
        cbbRoomStatus.addElement("All");
        cbbRoomStatus.addElement("Có thể sử dụng");
        cbbRoomStatus.addElement("Không thể sử dụng");
        cbbStatus4S.setModel(cbbRoomStatus);
//Set button
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
//        btnReset.setEnabled(false);
        btnViewDevices.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewDevices;
    private javax.swing.JCheckBox cbStatus;
    private javax.swing.JComboBox cbbRoomType;
    private javax.swing.JComboBox cbbRoomType4S;
    private javax.swing.JComboBox cbbStatus4S;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRoomList;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadDataToControl() {
        if (tblRoomList.getSelectedRows().length == 0) {
            return;
        }
        String id = (String) tblRoomList.getModel().getValueAt(tblRoomList.getSelectedRow(), 0);
        List<Room> list = RoomManager.searchRooms(id, "", "");
        Room r = list.get(0);
        txtRoomID.setText(id);
        for (int i = 1; i <= cbbRoomType.getItemCount(); i++) {
            if (((RoomType) cbbRoomType.getItemAt(i)).getTYPE_NAME().equals(r.getTYPE_ID())) {
                cbbRoomType.setSelectedIndex(i);
                break;
            }
        }
        if (r.isSTATUS()) {
            cbStatus.setSelected(true);
        } else {
            cbStatus.setSelected(false);
        }
        //txtRoomID.setEditable(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnViewDevices.setEnabled(true);
    }

    private boolean isRoomValidated() {
        if (txtRoomID.getText() == null || txtRoomID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Room ID is null or empty");
            return false;
        }
        if (cbbRoomType.getSelectedIndex() > 0) {
            JOptionPane.showMessageDialog(null, "Room type is invalid");
            return false;
        }
        return true;
    }
}
