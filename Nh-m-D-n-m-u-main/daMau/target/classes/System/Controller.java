/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package System;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class Controller extends javax.swing.JFrame {

    /**
     * Creates new form Controller
     */
    public Controller() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        bntDangXuat = new javax.swing.JToggleButton();
        bntKetThuc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        bntChuyenDe = new javax.swing.JToggleButton();
        bntNguoiHoc = new javax.swing.JToggleButton();
        bntKhoaHoc = new javax.swing.JToggleButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        bntHuongDan = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        lbFPT = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mnitDangNhap = new javax.swing.JMenuItem();
        mnitDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnitDoiMK = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnitThoat = new javax.swing.JMenuItem();
        mnQuanLy = new javax.swing.JMenu();
        mnitNguoiHoc = new javax.swing.JMenuItem();
        mnitChuyenDe = new javax.swing.JMenuItem();
        mnitKhoaHoc = new javax.swing.JMenuItem();
        mnitNhanVien = new javax.swing.JMenuItem();
        mnThongKe = new javax.swing.JMenu();
        mnitNguoiHocTungNam = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnitBangDiemKhoa = new javax.swing.JMenuItem();
        mnitDiemTungKhoaHoc = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnitDoangThu = new javax.swing.JMenuItem();
        mnTroGiup = new javax.swing.JMenu();
        mnitHDSD = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnitGTSP = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        bntDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/door.png"))); // NOI18N
        bntDangXuat.setText("Đăng xuất");
        bntDangXuat.setFocusable(false);
        bntDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bntDangXuat);

        bntKetThuc.setText("Kết thúc");
        bntKetThuc.setFocusable(false);
        bntKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bntKetThuc);
        jToolBar1.add(jSeparator6);

        bntChuyenDe.setText("Chuyên đề");
        bntChuyenDe.setFocusable(false);
        bntChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bntChuyenDe);

        bntNguoiHoc.setText("Người học");
        bntNguoiHoc.setFocusable(false);
        bntNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bntNguoiHoc);

        bntKhoaHoc.setText("Khóa học");
        bntKhoaHoc.setFocusable(false);
        bntKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bntKhoaHoc);
        jToolBar1.add(jSeparator7);

        bntHuongDan.setText("Hướng dẫn");
        bntHuongDan.setFocusable(false);
        bntHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bntHuongDan);

        jToolBar2.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Hệ quản lý đào tạo");
        jToolBar2.add(jLabel1);

        mnHeThong.setText("Hệ Thống");

        mnitDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnitDangNhap.setText("Đăng nhập");
        mnitDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitDangNhapActionPerformed(evt);
            }
        });
        mnHeThong.add(mnitDangNhap);

        mnitDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnitDangXuat.setText("Đăng xuất");
        mnHeThong.add(mnitDangXuat);
        mnHeThong.add(jSeparator1);

        mnitDoiMK.setText("Đổi mật khẩu");
        mnHeThong.add(mnitDoiMK);
        mnHeThong.add(jSeparator2);

        mnitThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mnitThoat.setText("Kết thúc");
        mnHeThong.add(mnitThoat);

        jMenuBar1.add(mnHeThong);

        mnQuanLy.setText("Quản lý");

        mnitNguoiHoc.setText("Người học");
        mnQuanLy.add(mnitNguoiHoc);

        mnitChuyenDe.setText("Chuyên đề");
        mnitChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitChuyenDeActionPerformed(evt);
            }
        });
        mnQuanLy.add(mnitChuyenDe);

        mnitKhoaHoc.setText("Khóa học");
        mnitKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitKhoaHocActionPerformed(evt);
            }
        });
        mnQuanLy.add(mnitKhoaHoc);

        mnitNhanVien.setText("Nhân viên");
        mnQuanLy.add(mnitNhanVien);

        jMenuBar1.add(mnQuanLy);

        mnThongKe.setText("Thống kê");

        mnitNguoiHocTungNam.setText("Người học từng năm");
        mnThongKe.add(mnitNguoiHocTungNam);
        mnThongKe.add(jSeparator3);

        mnitBangDiemKhoa.setText("Bảng điểm khóa...");
        mnThongKe.add(mnitBangDiemKhoa);

        mnitDiemTungKhoaHoc.setText("Điểm từng khóa học");
        mnThongKe.add(mnitDiemTungKhoaHoc);
        mnThongKe.add(jSeparator4);

        mnitDoangThu.setText("Doang thu từng chuyên đề...");
        mnThongKe.add(mnitDoangThu);

        jMenuBar1.add(mnThongKe);

        mnTroGiup.setText("Trợ giúp");

        mnitHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnitHDSD.setText("Hướng dẫn sử dụng");
        mnTroGiup.add(mnitHDSD);
        mnTroGiup.add(jSeparator5);

        mnitGTSP.setText("Giới thiệu sản phẩm");
        mnTroGiup.add(mnitGTSP);

        jMenuBar1.add(mnTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(lbFPT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lbFPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnitDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnitDangNhapActionPerformed

    private void mnitKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitKhoaHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnitKhoaHocActionPerformed

    private void mnitChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitChuyenDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnitChuyenDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controller().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bntChuyenDe;
    private javax.swing.JToggleButton bntDangXuat;
    private javax.swing.JButton bntHuongDan;
    private javax.swing.JButton bntKetThuc;
    private javax.swing.JToggleButton bntKhoaHoc;
    private javax.swing.JToggleButton bntNguoiHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lbFPT;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenu mnQuanLy;
    private javax.swing.JMenu mnThongKe;
    private javax.swing.JMenu mnTroGiup;
    private javax.swing.JMenuItem mnitBangDiemKhoa;
    private javax.swing.JMenuItem mnitChuyenDe;
    private javax.swing.JMenuItem mnitDangNhap;
    private javax.swing.JMenuItem mnitDangXuat;
    private javax.swing.JMenuItem mnitDiemTungKhoaHoc;
    private javax.swing.JMenuItem mnitDoangThu;
    private javax.swing.JMenuItem mnitDoiMK;
    private javax.swing.JMenuItem mnitGTSP;
    private javax.swing.JMenuItem mnitHDSD;
    private javax.swing.JMenuItem mnitKhoaHoc;
    private javax.swing.JMenuItem mnitNguoiHoc;
    private javax.swing.JMenuItem mnitNguoiHocTungNam;
    private javax.swing.JMenuItem mnitNhanVien;
    private javax.swing.JMenuItem mnitThoat;
    // End of variables declaration//GEN-END:variables
}
