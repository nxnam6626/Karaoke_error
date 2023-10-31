/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
/**
 *
 * @author nxnam
 */


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.NhanVien;

public class mainView extends javax.swing.JFrame {

    private CardLayout card = null;
        private final Color color_hover = new Color(216, 238, 255);
    private final Color color_active = new Color(187, 222, 251);
    private final Color default_color = new Color(242, 242, 242);
    NhanVien nhanVien = null;
    /**
     * Creates new form Mainview
     */
    public mainView() {
        initComponents();
        card = (CardLayout) this.pnl_Main.getLayout();
//        logout();

        //        Sự kiện đóng
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(null,
                        "Bạn có muốn tắt Karaoke Night Light?", "Đóng ứng dụng?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//                    Đóng kết nối
//                    ConnectDB.disconnect();
                    System.exit(0);
                }
            }
        });
        
//        //        Sự kiện đổi size
//        this.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                ((Panel_Home) pnl_home).resize();
//            }
//        });

    
    }

//    public void connectDB() {
//        try {
//            ConnectDB.connect();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Không thể kết nối đến server!", "Lỗi", JOptionPane.DEFAULT_OPTION);
//            System.exit(0);
//        }
//    }

    
//    public void logout() {
//        this.nhanVien = null;
//
//        this.lbl_name.setText("");
//        headerRender(this.btn_login);
//        this.card.show(this.pnl_main, "home");
//
//        buttonActive(lbl_home);
//        disableAllFunction();
//    }

    public void login(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
//        pnl_PhongHat = new panel_QuanLyPhong(nhanVien);
//        pnl_Main.add(this.pnl_PhongHat, "phong");

//        this.lbl_name.setText(nhanVien.getChucDanh() + ". " + nhanVien.getHoTen());
//        headerRender(this.lbl_name);
//
//        activeAllFunction();
    }
    
        private void buttonActive(Component c) {
        Arrays.stream(new Component[]{lbl_ManHinhChinh, lbl_TaiKhoan, lbl_PhongHat, lbl_TaiLieu, lbl_KhachHang, lbl_DichVu, lbl_NhanVien, lbl_ThongKe}).forEach(item -> item.setBackground(default_color));
        c.setBackground(color_active);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Control = new javax.swing.JPanel();
        lbl_ManHinhChinh = new javax.swing.JLabel();
        lbl_TaiKhoan = new javax.swing.JLabel();
        lbl_PhongHat = new javax.swing.JLabel();
        lbl_TaiLieu = new javax.swing.JLabel();
        lbl_KhachHang = new javax.swing.JLabel();
        lbl_DichVu = new javax.swing.JLabel();
        lbl_NhanVien = new javax.swing.JLabel();
        lbl_ThongKe = new javax.swing.JLabel();
        lbl_TroGiup = new javax.swing.JLabel();
        pnl_Main = new javax.swing.JPanel();
        pnl_ManHinhChinh = new javax.swing.JPanel();
        pnl_TieuDe = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
        pnl_HinhAnh = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_TaiKhoan = new javax.swing.JPanel();
        pnl_PhongHat = new javax.swing.JPanel();
        pnl_TaiLieu = new javax.swing.JPanel();
        pnl_KhachHang = new javax.swing.JPanel();
        pnl_DichVu = new javax.swing.JPanel();
        pnl_NhanVien = new javax.swing.JPanel();
        pnl_ThongKe = new javax.swing.JPanel();
        pnl_TroGiup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        pnl_Control.setPreferredSize(new java.awt.Dimension(200, 182));
        pnl_Control.setLayout(new javax.swing.BoxLayout(pnl_Control, javax.swing.BoxLayout.Y_AXIS));

        lbl_ManHinhChinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ManHinhChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/home.png"))); // NOI18N
        lbl_ManHinhChinh.setText("Màn hình chính");
        lbl_ManHinhChinh.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_ManHinhChinh.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_ManHinhChinh.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_ManHinhChinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ManHinhChinhMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_ManHinhChinh);

        lbl_TaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_TaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/verified-account.png"))); // NOI18N
        lbl_TaiKhoan.setText("Tài khoản");
        lbl_TaiKhoan.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_TaiKhoan.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_TaiKhoan.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_TaiKhoanMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_TaiKhoan);

        lbl_PhongHat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_PhongHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/karaoke.png"))); // NOI18N
        lbl_PhongHat.setText("Phòng hát");
        lbl_PhongHat.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_PhongHat.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_PhongHat.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_PhongHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_PhongHatMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_PhongHat);

        lbl_TaiLieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_TaiLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/documentation.png"))); // NOI18N
        lbl_TaiLieu.setText("Tài liệu giao dịch");
        lbl_TaiLieu.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_TaiLieu.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_TaiLieu.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_TaiLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_TaiLieuMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_TaiLieu);

        lbl_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/management.png"))); // NOI18N
        lbl_KhachHang.setText("Khách hàng");
        lbl_KhachHang.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_KhachHang.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_KhachHang.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_KhachHangMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_KhachHang);

        lbl_DichVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_DichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/fast-food.png"))); // NOI18N
        lbl_DichVu.setText("Dịch vụ");
        lbl_DichVu.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_DichVu.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_DichVu.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_DichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DichVuMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_DichVu);

        lbl_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/user.png"))); // NOI18N
        lbl_NhanVien.setText("Nhân viên");
        lbl_NhanVien.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_NhanVien.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_NhanVien.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_NhanVienMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_NhanVien);

        lbl_ThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/description.png"))); // NOI18N
        lbl_ThongKe.setText("Thống kê");
        lbl_ThongKe.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_ThongKe.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_ThongKe.setPreferredSize(new java.awt.Dimension(200, 80));
        lbl_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ThongKeMouseClicked(evt);
            }
        });
        pnl_Control.add(lbl_ThongKe);

        lbl_TroGiup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_TroGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icon/question.png"))); // NOI18N
        lbl_TroGiup.setText("Trợ giúp");
        lbl_TroGiup.setMaximumSize(new java.awt.Dimension(200, 80));
        lbl_TroGiup.setMinimumSize(new java.awt.Dimension(200, 80));
        lbl_TroGiup.setPreferredSize(new java.awt.Dimension(200, 80));
        pnl_Control.add(lbl_TroGiup);

        pnl_Main.setLayout(new java.awt.CardLayout());

        lbl_TieuDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_TieuDe.setText("KARAOKE LIGHT NIGHT");

        javax.swing.GroupLayout pnl_TieuDeLayout = new javax.swing.GroupLayout(pnl_TieuDe);
        pnl_TieuDe.setLayout(pnl_TieuDeLayout);
        pnl_TieuDeLayout.setHorizontalGroup(
            pnl_TieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TieuDeLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lbl_TieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_TieuDeLayout.setVerticalGroup(
            pnl_TieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TieuDeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_TieuDe)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnl_HinhAnh.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/image/anhnen.jpg"))); // NOI18N
        pnl_HinhAnh.add(jLabel1, "card2");

        javax.swing.GroupLayout pnl_ManHinhChinhLayout = new javax.swing.GroupLayout(pnl_ManHinhChinh);
        pnl_ManHinhChinh.setLayout(pnl_ManHinhChinhLayout);
        pnl_ManHinhChinhLayout.setHorizontalGroup(
            pnl_ManHinhChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_HinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_ManHinhChinhLayout.setVerticalGroup(
            pnl_ManHinhChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ManHinhChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_HinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_Main.add(pnl_ManHinhChinh, "card10");

        javax.swing.GroupLayout pnl_TaiKhoanLayout = new javax.swing.GroupLayout(pnl_TaiKhoan);
        pnl_TaiKhoan.setLayout(pnl_TaiKhoanLayout);
        pnl_TaiKhoanLayout.setHorizontalGroup(
            pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_TaiKhoanLayout.setVerticalGroup(
            pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_TaiKhoan, "card2");

        javax.swing.GroupLayout pnl_PhongHatLayout = new javax.swing.GroupLayout(pnl_PhongHat);
        pnl_PhongHat.setLayout(pnl_PhongHatLayout);
        pnl_PhongHatLayout.setHorizontalGroup(
            pnl_PhongHatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_PhongHatLayout.setVerticalGroup(
            pnl_PhongHatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_PhongHat, "card3");

        javax.swing.GroupLayout pnl_TaiLieuLayout = new javax.swing.GroupLayout(pnl_TaiLieu);
        pnl_TaiLieu.setLayout(pnl_TaiLieuLayout);
        pnl_TaiLieuLayout.setHorizontalGroup(
            pnl_TaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_TaiLieuLayout.setVerticalGroup(
            pnl_TaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_TaiLieu, "card4");

        javax.swing.GroupLayout pnl_KhachHangLayout = new javax.swing.GroupLayout(pnl_KhachHang);
        pnl_KhachHang.setLayout(pnl_KhachHangLayout);
        pnl_KhachHangLayout.setHorizontalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_KhachHangLayout.setVerticalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_KhachHang, "card5");

        javax.swing.GroupLayout pnl_DichVuLayout = new javax.swing.GroupLayout(pnl_DichVu);
        pnl_DichVu.setLayout(pnl_DichVuLayout);
        pnl_DichVuLayout.setHorizontalGroup(
            pnl_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_DichVuLayout.setVerticalGroup(
            pnl_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_DichVu, "card6");

        javax.swing.GroupLayout pnl_NhanVienLayout = new javax.swing.GroupLayout(pnl_NhanVien);
        pnl_NhanVien.setLayout(pnl_NhanVienLayout);
        pnl_NhanVienLayout.setHorizontalGroup(
            pnl_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_NhanVienLayout.setVerticalGroup(
            pnl_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_NhanVien, "card7");

        javax.swing.GroupLayout pnl_ThongKeLayout = new javax.swing.GroupLayout(pnl_ThongKe);
        pnl_ThongKe.setLayout(pnl_ThongKeLayout);
        pnl_ThongKeLayout.setHorizontalGroup(
            pnl_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_ThongKeLayout.setVerticalGroup(
            pnl_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_ThongKe, "card8");

        javax.swing.GroupLayout pnl_TroGiupLayout = new javax.swing.GroupLayout(pnl_TroGiup);
        pnl_TroGiup.setLayout(pnl_TroGiupLayout);
        pnl_TroGiupLayout.setHorizontalGroup(
            pnl_TroGiupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        pnl_TroGiupLayout.setVerticalGroup(
            pnl_TroGiupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnl_Main.add(pnl_TroGiup, "card9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_Control, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_PhongHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_PhongHatMouseClicked
        // TODO add your handling code here:
        pnl_PhongHat = new panel_QuanLyPhong();
        pnl_Main.add(this.pnl_PhongHat, "phong");
        card.show(this.pnl_Main, "phong");
        buttonActive(evt.getComponent());
    }//GEN-LAST:event_lbl_PhongHatMouseClicked

    private void lbl_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TaiKhoanMouseClicked
        // TODO add your handling code here:
        pnl_TaiKhoan = new panel_QuanLyTaiKhoan();
        pnl_Main.add(this.pnl_TaiKhoan, "taikhoan");
        card.show(this.pnl_Main, "taikhoan");
        buttonActive(evt.getComponent());
    }//GEN-LAST:event_lbl_TaiKhoanMouseClicked

    private void lbl_ManHinhChinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ManHinhChinhMouseClicked
        // TODO add your handling code here:
        pnl_Main.add(pnl_ManHinhChinh, "manhinhchinh");
        card.show(this.pnl_Main, "manhinhchinh");
    }//GEN-LAST:event_lbl_ManHinhChinhMouseClicked

    private void lbl_TaiLieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TaiLieuMouseClicked
        // TODO add your handling code here:
        pnl_TaiLieu = new panel_QuanLyTaiLieu();
        pnl_Main.add(this.pnl_TaiLieu, "tailieu");
        card.show(this.pnl_Main, "tailieu");
    }//GEN-LAST:event_lbl_TaiLieuMouseClicked

    private void lbl_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_KhachHangMouseClicked
        // TODO add your handling code here:
        pnl_KhachHang = new panel_QuanLyKhachHang();
        pnl_Main.add(this.pnl_KhachHang, "khachhang");
        card.show(this.pnl_Main, "khachhang");
    }//GEN-LAST:event_lbl_KhachHangMouseClicked

    private void lbl_DichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DichVuMouseClicked
        // TODO add your handling code here:
        pnl_DichVu = new panel_QuanLyDichVu();
        pnl_Main.add(this.pnl_DichVu, "dichvu");
        card.show(this.pnl_Main, "dichvu");
    }//GEN-LAST:event_lbl_DichVuMouseClicked

    private void lbl_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NhanVienMouseClicked
        // TODO add your handling code here:
        pnl_NhanVien = new panel_QuanLyNhanVien();
        pnl_Main.add(this.pnl_NhanVien, "nhanvien");
        card.show(this.pnl_Main, "nhanvien");
    }//GEN-LAST:event_lbl_NhanVienMouseClicked

    private void lbl_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ThongKeMouseClicked
        // TODO add your handling code here:
        pnl_ThongKe = new panel_ThongKe();
        pnl_Main.add(pnl_ThongKe, "thongke");
        card.show(this.pnl_Main, "thongke");
    }//GEN-LAST:event_lbl_ThongKeMouseClicked

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
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_DichVu;
    private javax.swing.JLabel lbl_KhachHang;
    private javax.swing.JLabel lbl_ManHinhChinh;
    private javax.swing.JLabel lbl_NhanVien;
    private javax.swing.JLabel lbl_PhongHat;
    private javax.swing.JLabel lbl_TaiKhoan;
    private javax.swing.JLabel lbl_TaiLieu;
    private javax.swing.JLabel lbl_ThongKe;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_TroGiup;
    private javax.swing.JPanel pnl_Control;
    private javax.swing.JPanel pnl_DichVu;
    private javax.swing.JPanel pnl_HinhAnh;
    private javax.swing.JPanel pnl_KhachHang;
    private javax.swing.JPanel pnl_Main;
    private javax.swing.JPanel pnl_ManHinhChinh;
    private javax.swing.JPanel pnl_NhanVien;
    private javax.swing.JPanel pnl_PhongHat;
    private javax.swing.JPanel pnl_TaiKhoan;
    private javax.swing.JPanel pnl_TaiLieu;
    private javax.swing.JPanel pnl_ThongKe;
    private javax.swing.JPanel pnl_TieuDe;
    private javax.swing.JPanel pnl_TroGiup;
    // End of variables declaration//GEN-END:variables
}
