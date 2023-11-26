package login;

import Swing.EventLogin;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.Timer;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class LoginAndRegister extends Background {
    private MigLayout layout;
    private Register register;
    private Login login;
    private Animator animator;
    private boolean isLogin = true;
    
    public LoginAndRegister() {
        initComponents();
        login = new Login();
        register = new Register();
        applyEvent(login, true);
        applyEvent(register, false);
        Timer timer = new Timer(3500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setVisible(false);
                init();
                initAnimator();  
            }
        });
        // Kích hoạt Timer để bắt đầu đợi
        timer.setRepeats(false);  // Đặt timer chỉ chạy một lần
        timer.start();
    }
    
    public void setAnimate(int animate) {
        layout.setComponentConstraints(login, "pos (50%)-290px-" + animate + " 0.5al n n");
        layout.setComponentConstraints(register, "pos (50%)-10px+" + animate + " 0.5al n n");
        if (animate == 20) {
            if (isLogin) {
                setComponentZOrder(login, 0);
            } else {
                setComponentZOrder(register, 0);
            }
        }
        revalidate();
    }

    private void init() {   
        layout = new MigLayout("fill", "fill", "fill");
        setLayout(layout);
        add(login, "pos (50%)-290px 0.5al n n");
        add(register, "pos (50%)-10px 0.5al n n");
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                    showLogin(true);
            }
        });
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                    showLogin(false);
            }
        });
    }

    private void initAnimator() {
        animator = new Animator(1000, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (isLogin) {
                    login.setAlpha(1f - fraction);
                    register.setAlpha(fraction);
                    
                } else {
                    login.setAlpha(fraction);
                    register.setAlpha(1f - fraction);
                }
            }
        });
        animator.addTarget(new PropertySetter(this, "animate", 20, 30, 0));
        animator.setResolution(0);
    }
    
    public void showLogin(boolean show) {
        if (show != isLogin) {
            if (!animator.isRunning()) {
                isLogin = show;
                animator.start();
            }
        }
    }

    private void applyEvent(JComponent panel, boolean login) {
        for (Component com : panel.getComponents()) {
            com.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    showLogin(login);
                }
            });
        }
    }

    public void setEventLogin(EventLogin event) {
        login.setEventLogin(event);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new Swing.ButtonBadges();

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/img/loading.gif"))); // NOI18N
        startButton.setText("START . . .");
        startButton.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonBadges startButton;
    // End of variables declaration//GEN-END:variables
}
