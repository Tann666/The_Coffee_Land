import AppGUI.App;
import Swing.EventLogin;
import login.LoginAndRegister;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {
    private CardLayout cardLayout;
    private App app;
    private LoginAndRegister loginAndRegister;
    
    public Main() {
        initComponents();
        init();
    }
    
    private void init() {
        ImageIcon iconApp = new ImageIcon("src/data/img/logo app.png");
        setIconImage(iconApp.getImage());
        
        cardLayout = new CardLayout(0, 0);
        panel.setLayout(cardLayout);
        
        loginAndRegister = new LoginAndRegister();
        app = new App();
        
        panel.add("log", loginAndRegister);
        panel.add("app", app);
        
        EventLogin event = new EventLogin() {
            @Override
            public void loginDone() {
                cardLayout.show(panel, "app");
            }

            @Override
            public void logOut() {
                
            }
        };
        loginAndRegister.setEventLogin(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The coffee Land");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
