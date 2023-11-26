package login;

public class Register extends CustomPanel {

    public Register() {
        initComponents();
        setAlpha(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button1 = new Swing.Button();
        customTextField1 = new Swing.CustomTextField();
        customTextField2 = new Swing.CustomTextField();
        customTextField3 = new Swing.CustomTextField();
        customTextField4 = new Swing.CustomTextField();

        setBackground(new java.awt.Color(58, 58, 58));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("___ Đăng Ký ___");

        button1.setBackground(new java.awt.Color(242, 160, 70));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Đăng ký");
        button1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        customTextField1.setBackground(new java.awt.Color(58, 58, 58));
        customTextField1.setForeground(new java.awt.Color(255, 255, 255));
        customTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        customTextField1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        customTextField1.setHint("Họ và đệm");

        customTextField2.setBackground(new java.awt.Color(58, 58, 58));
        customTextField2.setForeground(new java.awt.Color(255, 255, 255));
        customTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        customTextField2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        customTextField2.setHint("Số điện thoại");

        customTextField3.setBackground(new java.awt.Color(58, 58, 58));
        customTextField3.setForeground(new java.awt.Color(255, 255, 255));
        customTextField3.setCaretColor(new java.awt.Color(255, 255, 255));
        customTextField3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        customTextField3.setHint("Mật khẩu");

        customTextField4.setBackground(new java.awt.Color(58, 58, 58));
        customTextField4.setForeground(new java.awt.Color(255, 255, 255));
        customTextField4.setCaretColor(new java.awt.Color(255, 255, 255));
        customTextField4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        customTextField4.setHint("Tên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(customTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(customTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(customTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button button1;
    private Swing.CustomTextField customTextField1;
    private Swing.CustomTextField customTextField2;
    private Swing.CustomTextField customTextField3;
    private Swing.CustomTextField customTextField4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
