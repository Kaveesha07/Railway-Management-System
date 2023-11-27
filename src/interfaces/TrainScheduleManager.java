/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import java.sql.Connection;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author acer
 */
public class TrainScheduleManager extends javax.swing.JFrame {

    int trainNumber,trainAvailableNumber,noOfACSeats,noOfGeneralSeats;
    String trainName;
    Date date;
    DefaultTableModel model ;
    public TrainScheduleManager() {
        initComponents();
        TrainTableDetails();
        TrainScheduleTableDetails();
        currenTime();
    }
    public void currenTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        String strLocalDateTime = now.toString();
        this.lblDateTime.setText(strLocalDateTime);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelDashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelReservation = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PanelTrains = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelSchedule = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelLogout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNoOfACTickets = new app.bolivia.swing.JCTextField();
        btnDeleterTrain = new necesario.RSMaterialButtonCircle();
        txtTrainNumber = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNoOfGeneralTicket = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        btnAddTrain = new necesario.RSMaterialButtonCircle();
        btnUpdateTrain = new necesario.RSMaterialButtonCircle();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSearchTrain = new rojeru_san.complementos.RSTableMetro();
        dateScheduleDate = new com.toedter.calendar.JDateChooser();
        panel1 = new java.awt.Panel();
        txtSearchTrainNumber = new app.bolivia.swing.JCTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTrainSchedule = new rojeru_san.complementos.RSTableMetro();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Train Schedule Management");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 480, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, -20, 40, 70));

        lblBack.setBackground(new java.awt.Color(255, 255, 255));
        lblBack.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/undo.png"))); // NOI18N
        lblBack.setText("  Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel4.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDashboard.setBackground(new java.awt.Color(0, 0, 51));
        PanelDashboard.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDashboardMouseClicked(evt);
            }
        });
        PanelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/dashboard.png"))); // NOI18N
        jLabel5.setText(" Dashboard");
        PanelDashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, -1));

        jPanel2.add(PanelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 70));

        PanelReservation.setBackground(new java.awt.Color(0, 0, 51));
        PanelReservation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelReservation.setForeground(new java.awt.Color(255, 255, 255));
        PanelReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelReservationMouseClicked(evt);
            }
        });
        PanelReservation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/tickets.png"))); // NOI18N
        jLabel7.setText(" Reservation");
        PanelReservation.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, -1));

        jPanel2.add(PanelReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 70));

        PanelTrains.setBackground(new java.awt.Color(0, 0, 51));
        PanelTrains.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelTrains.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTrainsMouseClicked(evt);
            }
        });
        PanelTrains.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/train.png"))); // NOI18N
        jLabel6.setText(" Trains");
        PanelTrains.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, -1));

        jPanel2.add(PanelTrains, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 70));

        PanelSchedule.setBackground(new java.awt.Color(0, 0, 51));
        PanelSchedule.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelScheduleMouseClicked(evt);
            }
        });
        PanelSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/calendar.png"))); // NOI18N
        jLabel9.setText(" Train Schedule");
        PanelSchedule.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, -1));

        jPanel2.add(PanelSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 260, 70));

        jPanel8.setBackground(new java.awt.Color(0, 0, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/report.png"))); // NOI18N
        jLabel8.setText(" Reports");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 70));

        PanelLogout.setBackground(new java.awt.Color(0, 0, 51));
        PanelLogout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelLogoutMouseClicked(evt);
            }
        });
        PanelLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/icons8-logout-30.png"))); // NOI18N
        jLabel3.setText(" Logout");
        PanelLogout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 220, -1));

        jPanel2.add(PanelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 260, 70));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/User.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, -1));

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("admin");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        lblDateTime.setBackground(new java.awt.Color(0, 0, 102));
        lblDateTime.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        lblDateTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime.setText("--");
        lblDateTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDateTimeMouseClicked(evt);
            }
        });
        jPanel2.add(lblDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Train Number");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Date");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        txtNoOfACTickets.setBackground(new java.awt.Color(255, 255, 255));
        txtNoOfACTickets.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtNoOfACTickets.setForeground(new java.awt.Color(0, 0, 0));
        txtNoOfACTickets.setPlaceholder("Enter the No Of AC Tickets");
        txtNoOfACTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfACTicketsActionPerformed(evt);
            }
        });
        jPanel11.add(txtNoOfACTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        btnDeleterTrain.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleterTrain.setText("Delete");
        btnDeleterTrain.setAlignmentY(0.4F);
        btnDeleterTrain.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDeleterTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleterTrainActionPerformed(evt);
            }
        });
        jPanel11.add(btnDeleterTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 170, 50));

        txtTrainNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtTrainNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTrainNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtTrainNumber.setPlaceholder("Enter the Train Number ");
        txtTrainNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainNumberActionPerformed(evt);
            }
        });
        jPanel11.add(txtTrainNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel22.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Number of General Seats");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        txtNoOfGeneralTicket.setBackground(new java.awt.Color(255, 255, 255));
        txtNoOfGeneralTicket.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtNoOfGeneralTicket.setForeground(new java.awt.Color(0, 0, 0));
        txtNoOfGeneralTicket.setPlaceholder("Enter the No Of General Tickets ");
        txtNoOfGeneralTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfGeneralTicketActionPerformed(evt);
            }
        });
        jPanel11.add(txtNoOfGeneralTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel23.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Number of AC Seats");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        btnAddTrain.setBackground(new java.awt.Color(0, 0, 0));
        btnAddTrain.setText("Add ");
        btnAddTrain.setAlignmentY(0.4F);
        btnAddTrain.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTrainActionPerformed(evt);
            }
        });
        jPanel11.add(btnAddTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 170, 50));

        btnUpdateTrain.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateTrain.setText("Update");
        btnUpdateTrain.setAlignmentY(0.4F);
        btnUpdateTrain.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnUpdateTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTrainActionPerformed(evt);
            }
        });
        jPanel11.add(btnUpdateTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 170, 50));

        tblSearchTrain.setForeground(new java.awt.Color(0, 0, 0));
        tblSearchTrain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train Number", "Train Name", "Source", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSearchTrain.setColorBackgoundHead(new java.awt.Color(0, 0, 102));
        tblSearchTrain.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSearchTrain.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSearchTrain.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSearchTrain.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        tblSearchTrain.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tblSearchTrain.setFuenteFilas(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblSearchTrain.setFuenteFilasSelect(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblSearchTrain.setFuenteHead(new java.awt.Font("Serif", 1, 16)); // NOI18N
        tblSearchTrain.setRowHeight(25);
        tblSearchTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchTrainMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSearchTrain);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 570, 150));

        dateScheduleDate.setBackground(new java.awt.Color(255, 255, 255));
        dateScheduleDate.setForeground(new java.awt.Color(255, 255, 255));
        dateScheduleDate.setDateFormatString("yyyy-MM-dd");
        jPanel11.add(dateScheduleDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchTrainNumber.setBackground(new java.awt.Color(204, 204, 255));
        txtSearchTrainNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearchTrainNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchTrainNumber.setPlaceholder("Enter the Train Number ");
        txtSearchTrainNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTrainNumberActionPerformed(evt);
            }
        });
        panel1.add(txtSearchTrainNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel26.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Search Train");
        panel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 30));

        tblTrainSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule Date", "Train Number", "Train Name", "No Of AC Tickets", "No Of General Tickets"
            }
        ));
        tblTrainSchedule.setColorBackgoundHead(new java.awt.Color(0, 0, 102));
        tblTrainSchedule.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblTrainSchedule.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblTrainSchedule.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblTrainSchedule.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        tblTrainSchedule.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tblTrainSchedule.setFuenteFilas(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblTrainSchedule.setFuenteFilasSelect(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblTrainSchedule.setFuenteHead(new java.awt.Font("Serif", 1, 16)); // NOI18N
        tblTrainSchedule.setRowHeight(25);
        tblTrainSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrainScheduleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTrainSchedule);
        if (tblTrainSchedule.getColumnModel().getColumnCount() > 0) {
            tblTrainSchedule.getColumnModel().getColumn(3).setResizable(false);
        }

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 820, 190));

        jPanel11.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 950, 280));

        jLabel15.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Add Train Schedule");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 990, 660));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 1080, 760));

        setSize(new java.awt.Dimension(1300, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoOfACTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfACTicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfACTicketsActionPerformed

    private void btnDeleterTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleterTrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleterTrainActionPerformed

    private void txtTrainNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainNumberActionPerformed
        
    }//GEN-LAST:event_txtTrainNumberActionPerformed

    private void txtNoOfGeneralTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfGeneralTicketActionPerformed
        
    }//GEN-LAST:event_txtNoOfGeneralTicketActionPerformed

    private void txtSearchTrainNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTrainNumberActionPerformed
       
    }//GEN-LAST:event_txtSearchTrainNumberActionPerformed

    private void PanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseClicked
        Dashboard window = new Dashboard();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelDashboardMouseClicked

    private void PanelReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelReservationMouseClicked
        Reservation window = new Reservation();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelReservationMouseClicked

    private void PanelTrainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTrainsMouseClicked
        TrainManager window = new TrainManager();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelTrainsMouseClicked

    private void PanelScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelScheduleMouseClicked
        TrainScheduleManager window = new TrainScheduleManager();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelScheduleMouseClicked

    private void btnAddTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTrainActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue add train status(Schedule)", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(addTrainSchedule()==true){
                JOptionPane.showMessageDialog(this,"Train Status Sucessfully Added");
            }
            else{
                JOptionPane.showMessageDialog(this,"Something went worng with the train status add,Please try again");
            }
        }
        else{
                reset();
        }
    }//GEN-LAST:event_btnAddTrainActionPerformed
    
    public boolean addTrainSchedule(){
        boolean sAddSchedule= false;
        trainNumber = Integer.parseInt(this.txtTrainNumber.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date2 =sdf.format(dateScheduleDate.getDate()) ;
        noOfACSeats = Integer.parseInt(this.txtNoOfACTickets.getText());
        noOfGeneralSeats = Integer.parseInt(this.txtNoOfGeneralTicket.getText());
        String sql = "insert into trainstatus(TrainNumber,ScheduleDate,NoOfACSeats,NoOfGeneralSeats) values(?,?,?,?)";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
        try {
            pst = db.prepareStatement(sql);
            pst.setInt(1, trainNumber);
            pst.setString(2, date2);
            pst.setInt(3, noOfACSeats);
            pst.setInt(4, noOfGeneralSeats);
      
            int rowCount = pst.executeUpdate();
            
            if(rowCount>0){
                   sAddSchedule=true;
                   reset();
                   ClearTrainScheduleTableDetails();
                   TrainScheduleTableDetails();
                   
                   
            }
            else{
                reset();
            }
            
        } 
        catch (SQLIntegrityConstraintViolationException e) {
            String message = e.getMessage();
            if (message.contains("foreign key")) {
                 JOptionPane.showMessageDialog(this,"This train number invalid, You can't enter trains that not in the train list");
            this.txtTrainNumber.setText(""); 
            } else if (message.contains("primary key")) {
                JOptionPane.showMessageDialog(this,"This train schedule already exisit,Enter valid train schedule");
                this.txtTrainNumber.setText("");
            } else {
            // handle other constraint violations
            }
        }
        catch (Exception ex) {
           ex.printStackTrace();
        }
        
        return sAddSchedule;
    }
    private void btnUpdateTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTrainActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue update train status", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(updateTrainSchedule()==true){
                JOptionPane.showMessageDialog(this,"Train Status Update Sucessfully Updated");
            }
            else{
                JOptionPane.showMessageDialog(this,"Something went worng with the train status details update,Please try again");
            }
        }
        else{
                reset();
        }
    }//GEN-LAST:event_btnUpdateTrainActionPerformed
    public boolean updateTrainSchedule(){
        boolean isupdateSchedule= false;
        trainNumber = Integer.parseInt(this.txtTrainNumber.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date2 =sdf.format(dateScheduleDate.getDate()) ;
        noOfACSeats = Integer.parseInt(this.txtNoOfGeneralTicket.getText());
        noOfGeneralSeats = Integer.parseInt(this.txtNoOfGeneralTicket.getText());
        String sql = "update trainstatus set TrainNumber=?,ScheduleDate=?,NoOfACSeats=?,NoOfGeneralSeats=?";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
        try {
            pst = db.prepareStatement(sql);
            pst.setInt(1, trainNumber);
            pst.setString(2, date2);
            pst.setInt(3, noOfACSeats);
            pst.setInt(4, noOfGeneralSeats);
      
            int rowCount = pst.executeUpdate();
            
            if(rowCount>0){
                   isupdateSchedule=true;
                   reset();
                   ClearTrainScheduleTableDetails();
                   TrainScheduleTableDetails();
                   
                   
            }
            else{
                reset();
            }
            
        }
        catch (SQLIntegrityConstraintViolationException e) {
            String message = e.getMessage();
            if (message.contains("foreign key")) {
                 JOptionPane.showMessageDialog(this,"This train number invalid, You can't enter trains that not in the train list");
            this.txtTrainNumber.setText(""); 
            } else if (message.contains("primary key")) {
                JOptionPane.showMessageDialog(this,"This train schedule already exisit,Enter valid train schedule");
                this.txtTrainNumber.setText("");
            } else {
            // handle other constraint violations
    }
}
        catch (Exception ex) {
           ex.printStackTrace();
        }
        return isupdateSchedule;
    }
    private void PanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMouseClicked
       Login window = new Login();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelLogoutMouseClicked

    private void tblSearchTrainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchTrainMouseClicked
        int rowNo = tblSearchTrain.getSelectedRow();
        TableModel model = tblSearchTrain.getModel();
        int column=0;
        this.txtTrainNumber.setText(model.getValueAt(rowNo, column).toString());
      
    }//GEN-LAST:event_tblSearchTrainMouseClicked

    private void tblTrainScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrainScheduleMouseClicked
        try {
            int rowNo = tblTrainSchedule.getSelectedRow();
            TableModel model = tblTrainSchedule.getModel();
            int column=0;
            
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(rowNo, column));
            this.txtTrainNumber.setText(model.getValueAt(rowNo, column+1).toString());
            this.dateScheduleDate.setDate(date);
            this.txtNoOfACTickets.setText(model.getValueAt(rowNo, column+3).toString());
            this.txtNoOfGeneralTicket.setText(model.getValueAt(rowNo, column+4).toString());
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_tblTrainScheduleMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here: private void PanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {
            Dashboard window = new Dashboard();
            window.show();
            this.dispose();

    }//GEN-LAST:event_lblBackMouseClicked

    private void lblDateTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDateTimeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDateTimeMouseClicked
    public void TrainScheduleTableDetails(){
        
        try {
            Connection db = DbConnector.getConnection();
            Statement sql = db.createStatement();
            ResultSet rs = sql.executeQuery("select ts.*,tl.trainName from trainstatus as ts,trainList as tl where tl.trainnumber=ts.trainnumber ORDER BY ScheduleDate");
            
            while (rs.next()){
               
                trainNumber = rs.getInt("TrainNumber");
                String ScheduleDate = rs.getString("ScheduleDate");
                noOfACSeats = rs.getInt("NoOfACSeats");
                noOfGeneralSeats = rs.getInt("NoOfGeneralSeats");
                trainName = rs.getString("TrainName");
                Object[] row = {ScheduleDate,trainNumber,trainName,noOfACSeats,noOfGeneralSeats};
                model = (DefaultTableModel)tblTrainSchedule.getModel();
                model.addRow(row);
                
                
            }
            
            
        } 
      
        
        catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    public void ClearTrainScheduleTableDetails(){
        DefaultTableModel model = (DefaultTableModel)tblTrainSchedule.getModel();
        model.setRowCount(0);
    }
    public void TrainTableDetails(){
        
        try {
            Connection db = DbConnector.getConnection();
            Statement sql = db.createStatement();
            ResultSet rs = sql.executeQuery("select * from trainlist");
            
            while (rs.next()){
                int trainNumber = rs.getInt("TrainNumber");
                String trainName = rs.getString("TrainName");
                String source = rs.getString("source");
                String destination = rs.getString("Destination");
                Object[] row = {trainNumber,trainName,source,destination};
                model = (DefaultTableModel)tblSearchTrain.getModel();
                model.addRow(row);
                
                
            }
            
            
        } 
      
        
        catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    public void ClearTrainTableDetails(){
        DefaultTableModel model = (DefaultTableModel)tblSearchTrain.getModel();
        model.setRowCount(0);
    }

    public void reset(){
        this.txtTrainNumber.setText("");
        this.dateScheduleDate.setDate(null);
        this.txtNoOfGeneralTicket.setText("");
        this.txtNoOfACTickets.setText("");
      
        
    }
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
            java.util.logging.Logger.getLogger(TrainScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainScheduleManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainScheduleManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelLogout;
    private javax.swing.JPanel PanelReservation;
    private javax.swing.JPanel PanelSchedule;
    private javax.swing.JPanel PanelTrains;
    private necesario.RSMaterialButtonCircle btnAddTrain;
    private necesario.RSMaterialButtonCircle btnDeleterTrain;
    private necesario.RSMaterialButtonCircle btnUpdateTrain;
    private com.toedter.calendar.JDateChooser dateScheduleDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDateTime;
    private java.awt.Panel panel1;
    private rojeru_san.complementos.RSTableMetro tblSearchTrain;
    private rojeru_san.complementos.RSTableMetro tblTrainSchedule;
    private app.bolivia.swing.JCTextField txtNoOfACTickets;
    private app.bolivia.swing.JCTextField txtNoOfGeneralTicket;
    private app.bolivia.swing.JCTextField txtSearchTrainNumber;
    private app.bolivia.swing.JCTextField txtTrainNumber;
    // End of variables declaration//GEN-END:variables
}
