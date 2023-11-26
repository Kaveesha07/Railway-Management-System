/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.sql.Connection;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
/**
 *
 * @author acer
 */
public class TrainManager extends javax.swing.JFrame {

    
    int trainNumber,trainAvailableNumber;
    String trainName,source,destination,trainAvailableDay;
    double generalFair,acfair;
    DefaultTableModel model ;
    public TrainManager() {
        
        
        initComponents();
        TrainTableDetails();
        TrainAvailableTableDetails();
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

        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelDashboard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PanelReservation = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PanelTrains = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelTrainSchedule = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelLogout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnAddAvailableDay = new necesario.RSMaterialButtonCircle();
        cmbAvailableDay = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchTrain = new rojeru_san.complementos.RSTableMetro();
        btnUpdateAvailableDay = new necesario.RSMaterialButtonCircle();
        btnDeleteAvailableDay = new necesario.RSMaterialButtonCircle();
        jLabel16 = new javax.swing.JLabel();
        txtAvailableTrainNumber = new app.bolivia.swing.JCTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTrainDestination = new app.bolivia.swing.JCTextField();
        txtTrainNumber = new app.bolivia.swing.JCTextField();
        txtTrainName = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTrainSource = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddTrain = new rojeru_san.complementos.RSTableMetro();
        jLabel26 = new javax.swing.JLabel();
        txtGeneralFair = new app.bolivia.swing.JCTextField();
        txtACFair = new app.bolivia.swing.JCTextField();
        jLabel27 = new javax.swing.JLabel();
        btnDeleteTrain = new necesario.RSMaterialButtonCircle();
        btnAddTrain = new necesario.RSMaterialButtonCircle();
        btnUpdateTrain = new necesario.RSMaterialButtonCircle();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/User.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Train Management");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 480, 40));

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

        jLabel10.setBackground(new java.awt.Color(0, 0, 51));
        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/dashboard.png"))); // NOI18N
        jLabel10.setText(" Dashboard");
        PanelDashboard.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, -1));

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

        PanelTrainSchedule.setBackground(new java.awt.Color(0, 0, 51));
        PanelTrainSchedule.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelTrainSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTrainScheduleMouseClicked(evt);
            }
        });
        PanelTrainSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Train/calendar.png"))); // NOI18N
        jLabel9.setText(" Train Schedule");
        PanelTrainSchedule.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, -1));

        jPanel2.add(PanelTrainSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 260, 70));

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

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("--");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, -1));

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

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("admin");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddAvailableDay.setBackground(new java.awt.Color(0, 0, 0));
        btnAddAvailableDay.setText("Add");
        btnAddAvailableDay.setAlignmentY(0.4F);
        btnAddAvailableDay.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddAvailableDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAvailableDayActionPerformed(evt);
            }
        });
        jPanel10.add(btnAddAvailableDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, 50));

        cmbAvailableDay.setBackground(new java.awt.Color(204, 204, 255));
        cmbAvailableDay.setForeground(new java.awt.Color(255, 255, 255));
        cmbAvailableDay.setMaximumRowCount(7);
        cmbAvailableDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        jPanel10.add(cmbAvailableDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, -1));

        jLabel24.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Available Day");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel25.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Train Number");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tblSearchTrain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train Number", "AvailableDay", "Train Name"
            }
        ));
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
        jScrollPane1.setViewportView(tblSearchTrain);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 450, 160));

        btnUpdateAvailableDay.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateAvailableDay.setText("Update");
        btnUpdateAvailableDay.setAlignmentY(0.4F);
        btnUpdateAvailableDay.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnUpdateAvailableDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAvailableDayActionPerformed(evt);
            }
        });
        jPanel10.add(btnUpdateAvailableDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, 50));

        btnDeleteAvailableDay.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteAvailableDay.setText("Delete");
        btnDeleteAvailableDay.setAlignmentY(0.4F);
        btnDeleteAvailableDay.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDeleteAvailableDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAvailableDayActionPerformed(evt);
            }
        });
        jPanel10.add(btnDeleteAvailableDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 160, 50));

        jLabel16.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Add Available days for train");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtAvailableTrainNumber.setBackground(new java.awt.Color(204, 204, 255));
        txtAvailableTrainNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtAvailableTrainNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtAvailableTrainNumber.setPlaceholder("Enter the Train Number ");
        txtAvailableTrainNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableTrainNumberActionPerformed(evt);
            }
        });
        jPanel10.add(txtAvailableTrainNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 940, 300));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Train Name");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtTrainDestination.setBackground(new java.awt.Color(255, 255, 255));
        txtTrainDestination.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTrainDestination.setForeground(new java.awt.Color(0, 0, 0));
        txtTrainDestination.setPlaceholder("Enter the Destination Station");
        txtTrainDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainDestinationActionPerformed(evt);
            }
        });
        jPanel11.add(txtTrainDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        txtTrainNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtTrainNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTrainNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtTrainNumber.setPlaceholder("Enter the Train Number ");
        txtTrainNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainNumberActionPerformed(evt);
            }
        });
        jPanel11.add(txtTrainNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        txtTrainName.setBackground(new java.awt.Color(255, 255, 255));
        txtTrainName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTrainName.setForeground(new java.awt.Color(0, 0, 0));
        txtTrainName.setPlaceholder("Enter the Train Name");
        txtTrainName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainNameActionPerformed(evt);
            }
        });
        jPanel11.add(txtTrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Source");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtTrainSource.setBackground(new java.awt.Color(255, 255, 255));
        txtTrainSource.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTrainSource.setForeground(new java.awt.Color(0, 0, 0));
        txtTrainSource.setPlaceholder("Enter the Source Station");
        txtTrainSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainSourceActionPerformed(evt);
            }
        });
        jPanel11.add(txtTrainSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel23.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Destination");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        tblAddTrain.setForeground(new java.awt.Color(0, 0, 0));
        tblAddTrain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train Number", "Train Name", "Source", "Destination", "General Ticket Fair", "AC Ticket Fair"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAddTrain.setColorBackgoundHead(new java.awt.Color(0, 0, 102));
        tblAddTrain.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblAddTrain.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblAddTrain.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblAddTrain.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        tblAddTrain.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tblAddTrain.setFuenteFilas(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblAddTrain.setFuenteFilasSelect(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblAddTrain.setFuenteHead(new java.awt.Font("Serif", 1, 16)); // NOI18N
        tblAddTrain.setRowHeight(25);
        tblAddTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddTrainMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddTrain);
        if (tblAddTrain.getColumnModel().getColumnCount() > 0) {
            tblAddTrain.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 560, 150));

        jLabel26.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("General Ticket Fair");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtGeneralFair.setBackground(new java.awt.Color(255, 255, 255));
        txtGeneralFair.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtGeneralFair.setForeground(new java.awt.Color(0, 0, 0));
        txtGeneralFair.setPlaceholder("Enter the General Ticket Price");
        txtGeneralFair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneralFairActionPerformed(evt);
            }
        });
        jPanel11.add(txtGeneralFair, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        txtACFair.setBackground(new java.awt.Color(255, 255, 255));
        txtACFair.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtACFair.setForeground(new java.awt.Color(0, 0, 0));
        txtACFair.setPlaceholder("Enter the AC Ticket Price");
        txtACFair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtACFairActionPerformed(evt);
            }
        });
        jPanel11.add(txtACFair, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jLabel27.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("AC Ticket Fair");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        btnDeleteTrain.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteTrain.setText("Delete");
        btnDeleteTrain.setAlignmentY(0.4F);
        btnDeleteTrain.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDeleteTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTrainActionPerformed(evt);
            }
        });
        jPanel11.add(btnDeleteTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 140, 50));

        btnAddTrain.setBackground(new java.awt.Color(0, 0, 0));
        btnAddTrain.setText("Add Train");
        btnAddTrain.setAlignmentY(0.4F);
        btnAddTrain.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAddTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTrainActionPerformed(evt);
            }
        });
        jPanel11.add(btnAddTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 150, 50));

        btnUpdateTrain.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateTrain.setText("Update");
        btnUpdateTrain.setAlignmentY(0.4F);
        btnUpdateTrain.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnUpdateTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateTrainMouseClicked(evt);
            }
        });
        btnUpdateTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTrainActionPerformed(evt);
            }
        });
        jPanel11.add(btnUpdateTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, 50));

        jLabel15.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Add Train");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel18.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Train Number");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 990, 350));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 1080, 760));

        setSize(new java.awt.Dimension(1300, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtTrainDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainDestinationActionPerformed
         
    }//GEN-LAST:event_txtTrainDestinationActionPerformed

    //train delete Evenet
    private void btnDeleteTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTrainActionPerformed
         int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue delete train ", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(DeleteTrain()==true){
                JOptionPane.showMessageDialog(this,"Train Number "+trainNumber+" Deleted Sucessfully");
            }
            else{
                JOptionPane.showMessageDialog(this,"Something worng with the train deletion,Please try again");
               
            }
        }
        else{
                reset();
        }
    }//GEN-LAST:event_btnDeleteTrainActionPerformed
    //train delete method
    public boolean DeleteTrain(){
        boolean isdelete =false;
        trainNumber = Integer.parseInt(this.txtTrainNumber.getText());
        String sql = "delete from trainlist where trainNumber=?";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
       
              
        try {
            pst = db.prepareStatement(sql);
            pst.setInt(1, trainNumber);
            
            int rowCount = pst.executeUpdate();
            
             if(rowCount>0){
                   
                   reset();
                   isdelete=true;
                   ClearTrainTableDetails();
                   TrainTableDetails(); 
                   ClearAvailableTrainTableDetails();
                   TrainAvailableTableDetails();
                   
                   
            }
            else{
                isdelete=false;
                reset();
            }
            
        } 
      
        catch (Exception ex) {
           ex.printStackTrace();
        }
        
        return isdelete;
    }
    private void btnAddAvailableDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAvailableDayActionPerformed
        int avaialbleTrainNumber = Integer.parseInt(txtAvailableTrainNumber.getText());
        String availableDay = this.cmbAvailableDay.getSelectedItem().toString();
        String sql = "insert into trainavailableday(TrainNumber,AvailableDay) values(?,?)";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
        
       int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue add train available day", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
              
        try {
            pst = db.prepareStatement(sql);
            pst.setInt(1, avaialbleTrainNumber);
            pst.setString(2, availableDay);
            
            int rowCount = pst.executeUpdate();
            
             if(rowCount>0){
                   JOptionPane.showMessageDialog(this,"Train Available Day Sucessfully Added");
                   resetAvailbleDay();
                   ClearAvailableTrainTableDetails();
                   TrainAvailableTableDetails();
                   
                   
            }
            else{
                JOptionPane.showMessageDialog(this,"Something worng with the train available day adding,Please try again");
                resetAvailbleDay();
            }
            
        } 
        catch(SQLIntegrityConstraintViolationException pk){
            JOptionPane.showMessageDialog(this,"The available day for particular train already exsists. Add correct available day");
            this.cmbAvailableDay.setSelectedItem(0);
        }
        catch (Exception ex) {
           ex.printStackTrace();
        }
        }
        else{
            reset();
        }
        
    }//GEN-LAST:event_btnAddAvailableDayActionPerformed
    public void resetAvailbleDay(){
        this.txtAvailableTrainNumber.setText("");
        this.cmbAvailableDay.setSelectedItem(0);

        
    }
    private void txtTrainNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrainNumberActionPerformed

    private void txtTrainNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrainNameActionPerformed

    private void txtTrainSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrainSourceActionPerformed

    private void txtGeneralFairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneralFairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneralFairActionPerformed

    private void txtACFairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtACFairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtACFairActionPerformed

    private void btnAddTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTrainActionPerformed
        
        int trainNumber = Integer.parseInt(this.txtTrainNumber.getText());
        String trainName = this.txtTrainName.getText();
        String trainSource = this.txtTrainSource.getText();
        String trainDestination = this.txtTrainDestination.getText();
        Double generalFair = Double. parseDouble(this.txtGeneralFair.getText());
        Double acFair = Double. parseDouble(this.txtACFair.getText());
        String sql = "insert into trainlist(TrainNumber,TrainName,Source,Destination,ACTicketFair,GeneralTicketFair) values(?,?,?,?,?,?)";
        
        if(validation(trainNumber,trainName,trainSource,trainDestination,generalFair,acFair)){
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
        
       int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue add train", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
              
        try {
            pst = db.prepareStatement(sql);
            pst.setInt(1, trainNumber);
            pst.setString(2, trainName);
            pst.setString(3, trainSource);
            pst.setString(4, trainDestination);
            pst.setDouble(5, acFair);
            pst.setDouble(6, generalFair);
            
            int rowCount = pst.executeUpdate();
            
             if(rowCount>0){
                   JOptionPane.showMessageDialog(this,"Train Sucessfully Added");
                   reset();
                   ClearTrainTableDetails();
                   TrainTableDetails();
                   
                   
            }
            else{
                JOptionPane.showMessageDialog(this,"Something worng with the train adding,Please try again");
            }
            
        } 
        catch(SQLIntegrityConstraintViolationException pk){
            JOptionPane.showMessageDialog(this,"This train number already exisit,Enter valid train number");
            this.txtTrainNumber.setText("");
        }
        catch (Exception ex) {
           ex.printStackTrace();
        }
        }
        else{
            reset();
        }
        

        }
    }//GEN-LAST:event_btnAddTrainActionPerformed
    public void reset(){
        this.txtTrainNumber.setText("");
        this.txtTrainName.setText("");
        this.txtTrainSource.setText("");
        this.txtTrainDestination.setText("");
        this.txtGeneralFair.setText("");
        this.txtACFair.setText("");
        
    }
    
    public boolean validation(int trainNumber,String trainName,String trainSource,String trainDestination,Double generalFair,Double acFair){
        boolean str= true;
        if(trainNumber<=0){
            JOptionPane.showMessageDialog(this,"Enter the valid train number");
            str= false;
        }
        if(trainName.equals("")) {
            JOptionPane.showMessageDialog(this,"Train name can't be empty,Enter the train name");
            str= false;
        }
        if(trainSource.equals("")) {
            JOptionPane.showMessageDialog(this,"Source can't be empty,Enter the source station");
            str= false;
        }
        if(trainDestination.equals("")) {
            JOptionPane.showMessageDialog(this,"Destination  can't be empty,Enter the destination station");
            str= false;
        }
        if(generalFair<=0.00) {
            JOptionPane.showMessageDialog(this,"General Fair  can't be empty,Enter the valid General Fair");
            str= false;
        }
        if(acFair<=0.00) {
            JOptionPane.showMessageDialog(this,"AC Fair  can't be empty,Enter the valid AC Fair");
            str= false;
        }
        return str;
        
    }
    
    public void TrainTableDetails(){
        
        try {
            Connection db = DbConnector.getConnection();
            Statement sql = db.createStatement();
            ResultSet rs = sql.executeQuery("select * from trainlist ");
            
            while (rs.next()){
                int trainNumber = rs.getInt("TrainNumber");
                String trainName = rs.getString("TrainName");
                String source = rs.getString("source");
                String destination = rs.getString("Destination");
                Double acTicketFair = rs.getDouble("ACTicketFair");
                Double generalTicketFair = rs.getDouble("GeneralTicketFair");
                
                Object[] row = {trainNumber,trainName,source,destination,generalTicketFair,acTicketFair};
                model = (DefaultTableModel)tblAddTrain.getModel();
                model.addRow(row);
                
                
            }
            
            
        } 
      
        
        catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    public void ClearTrainTableDetails(){
        DefaultTableModel model = (DefaultTableModel)tblAddTrain.getModel();
        model.setRowCount(0);
    }
    private void btnUpdateTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTrainActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue update train", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(updateTrain()==true){
                JOptionPane.showMessageDialog(this,"Train Update Sucessfully Updated");
            }
            else{
                JOptionPane.showMessageDialog(this,"Something went worng with the train details update,Please try again");
            }
        }
        else{
                reset();
        }
    }//GEN-LAST:event_btnUpdateTrainActionPerformed

    private void btnUpdateAvailableDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAvailableDayActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Do you really want to continue update train available day", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(updateAvailableDay()==true){
                JOptionPane.showMessageDialog(this,"Train Available Day Update Sucessfully Updated");
            }
            else{
                JOptionPane.showMessageDialog(this,"Something went worng with the Train Available Day Update,Please try again");
            }
        }
        else{
                reset();
        }
    }//GEN-LAST:event_btnUpdateAvailableDayActionPerformed

    public boolean updateAvailableDay(){
         boolean isUpdateAvailableDay =false;
        trainAvailableNumber = Integer.parseInt(this.txtAvailableTrainNumber.getText());
        trainAvailableDay= this.cmbAvailableDay.getSelectedItem().toString();
        String sqlupdate = "update trainavailableday set trainNumber= ?,AvailableDay=?";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
        
       
              
        try {
            pst = db.prepareStatement(sqlupdate);
            pst.setInt(1, trainAvailableNumber);
            pst.setString(2, trainAvailableDay);
  
            
            int rowCount = pst.executeUpdate();
            
             if(rowCount>0){
                   isUpdateAvailableDay=true;
                   resetAvailbleDay();
                   ClearAvailableTrainTableDetails();
                   TrainAvailableTableDetails();
                   
            }
             else{
                 isUpdateAvailableDay=false;
                 resetAvailbleDay();
                 
             }
             reset();
             
            
            
        } 
        
        catch (Exception ex) {
           ex.printStackTrace();
        }
        return isUpdateAvailableDay;
    }
    private void btnDeleteAvailableDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAvailableDayActionPerformed
         int reply = JOptionPane.showConfirmDialog(null, "Do you really want to delete train available day", "Confirmation message", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if(DeleteAvailableDay()==true){
                JOptionPane.showMessageDialog(this,"Train Available day Sucessfully Updated");
            }
            else{
                JOptionPane.showMessageDialog(this,"Something went worng with the Available day deletion,Please try again");
            }
        }
        else{
                reset();
        }
    }//GEN-LAST:event_btnDeleteAvailableDayActionPerformed
    public boolean DeleteAvailableDay(){
        boolean isDeleteAvailableDay =false;
        trainAvailableNumber = Integer.parseInt(this.txtAvailableTrainNumber.getText());
        trainAvailableDay= this.cmbAvailableDay.getSelectedItem().toString();
        String sql = "delete from trainavailableday where trainNumber=? and AvailableDay=? ";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
       
              
        try {
            pst = db.prepareStatement(sql);
            pst.setInt(1, trainAvailableNumber);
            pst.setString(2, trainAvailableDay);
            
            int rowCount = pst.executeUpdate();
            
             if(rowCount>0){
                   isDeleteAvailableDay=true;
                   resetAvailbleDay();
                   ClearAvailableTrainTableDetails();
                   TrainAvailableTableDetails();
                   
            }
            else{
                isDeleteAvailableDay=false;
                resetAvailbleDay();
            }
            
        } 
      
        catch (Exception ex) {
           ex.printStackTrace();
        }
        
        return isDeleteAvailableDay;
    }
    
    private void PanelReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelReservationMouseClicked
         Reservation window = new Reservation();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelReservationMouseClicked

    private void PanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseClicked
        Dashboard window = new Dashboard();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelDashboardMouseClicked

    private void PanelTrainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTrainsMouseClicked
        TrainManager window = new TrainManager();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelTrainsMouseClicked

    private void PanelTrainScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTrainScheduleMouseClicked
        TrainScheduleManager window = new TrainScheduleManager();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelTrainScheduleMouseClicked

    private void PanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMouseClicked
        Login window = new Login();
        window.show();
        this.dispose();
    }//GEN-LAST:event_PanelLogoutMouseClicked

    private void tblAddTrainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddTrainMouseClicked
       int rowNo = tblAddTrain.getSelectedRow();
       TableModel model = tblAddTrain.getModel();
       int column=0;
       this.txtTrainNumber.setText(model.getValueAt(rowNo, column).toString());
       this.txtTrainName.setText(model.getValueAt(rowNo, column+1).toString());
       this.txtTrainSource.setText(model.getValueAt(rowNo, column+2).toString());
       this.txtTrainDestination.setText(model.getValueAt(rowNo, column+3).toString());
       this.txtGeneralFair.setText(model.getValueAt(rowNo, column+4).toString());
       this.txtACFair.setText(model.getValueAt(rowNo, column+5).toString());
    }//GEN-LAST:event_tblAddTrainMouseClicked
    
    
    public void TrainAvailableTableDetails(){
        
        try {
            Connection db = DbConnector.getConnection();
            Statement sql = db.createStatement();
            ResultSet rs = sql.executeQuery("select ta.*,tl.trainName from trainavailableday as ta,trainList as tl where tl.trainnumber=ta.trainnumber");
            
            while (rs.next()){
                int trainNumber = rs.getInt("TrainNumber");
                String availableDay = rs.getString("AvailableDay");
                String trainName = rs.getString("TrainName");
              
                
                Object[] row = {trainNumber,availableDay,trainName};
                model = (DefaultTableModel)tblSearchTrain.getModel();
                model.addRow(row);
                
                
            }
            
            
        } 
      
        
        catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
    public void ClearAvailableTrainTableDetails(){
        DefaultTableModel model = (DefaultTableModel)tblSearchTrain.getModel();
        model.setRowCount(0);
    }
    
    private void tblSearchTrainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchTrainMouseClicked
       int rowNo = tblSearchTrain.getSelectedRow();
       TableModel model = tblSearchTrain.getModel();
       int column=0;
       this.txtAvailableTrainNumber.setText(model.getValueAt(rowNo, column).toString());
       //add seperate logic to select index
       this.cmbAvailableDay.setSelectedItem(model.getValueAt(rowNo, column+1).toString());
      
    }//GEN-LAST:event_tblSearchTrainMouseClicked

    private void btnUpdateTrainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateTrainMouseClicked
        
    }//GEN-LAST:event_btnUpdateTrainMouseClicked

    private void txtAvailableTrainNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableTrainNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableTrainNumberActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void lblDateTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDateTimeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDateTimeMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here: private void PanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {                                            
        Dashboard window = new Dashboard();
        window.show();
        this.dispose();
     
    }//GEN-LAST:event_lblBackMouseClicked

    public boolean updateTrain(){
        boolean isUpdate =false;
        trainNumber = Integer.parseInt(this.txtTrainNumber.getText());
        trainName = this.txtTrainName.getText();
        source = this.txtTrainSource.getText();
        destination = this.txtTrainDestination.getText();
        generalFair = Double. parseDouble(this.txtGeneralFair.getText());
        acfair = Double. parseDouble(this.txtACFair.getText());
        String sqlupdate = "update trainlist set Source= ?,Destination=?,ACTicketFair=?,GeneralTicketFair=? where trainNumber=?";
        Connection db = DbConnector.getConnection();
        PreparedStatement pst;
        
       
              
        try {
            pst = db.prepareStatement(sqlupdate);
            //pst.setInt(1, trainNumber);
            //pst.setString(2, trainName);
            pst.setString(1, source);
            pst.setString(2, destination);
            pst.setDouble(3, generalFair);
            pst.setDouble(4, acfair);
            pst.setInt(5, trainNumber);
            
            int rowCount = pst.executeUpdate();
            
             if(rowCount>0){
                   isUpdate=true;
                   reset();
                   ClearTrainTableDetails();
                   TrainTableDetails(); 
                   
            }
             else{
                 isUpdate=false;
                 
             }
             reset();
             
            
            
        } 
        
        catch (Exception ex) {
           ex.printStackTrace();
        }
        return isUpdate;
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
            java.util.logging.Logger.getLogger(TrainManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelLogout;
    private javax.swing.JPanel PanelReservation;
    private javax.swing.JPanel PanelTrainSchedule;
    private javax.swing.JPanel PanelTrains;
    private necesario.RSMaterialButtonCircle btnAddAvailableDay;
    private necesario.RSMaterialButtonCircle btnAddTrain;
    private necesario.RSMaterialButtonCircle btnDeleteAvailableDay;
    private necesario.RSMaterialButtonCircle btnDeleteTrain;
    private necesario.RSMaterialButtonCircle btnUpdateAvailableDay;
    private necesario.RSMaterialButtonCircle btnUpdateTrain;
    private javax.swing.JComboBox<String> cmbAvailableDay;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDateTime;
    private rojeru_san.complementos.RSTableMetro tblAddTrain;
    private rojeru_san.complementos.RSTableMetro tblSearchTrain;
    private app.bolivia.swing.JCTextField txtACFair;
    private app.bolivia.swing.JCTextField txtAvailableTrainNumber;
    private app.bolivia.swing.JCTextField txtGeneralFair;
    private app.bolivia.swing.JCTextField txtTrainDestination;
    private app.bolivia.swing.JCTextField txtTrainName;
    private app.bolivia.swing.JCTextField txtTrainNumber;
    private app.bolivia.swing.JCTextField txtTrainSource;
    // End of variables declaration//GEN-END:variables
}
