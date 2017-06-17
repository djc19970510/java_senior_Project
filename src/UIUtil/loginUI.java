package UIUtil;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Created by dingjiacheng on 2017/6/17.
 */
public class loginUI extends JDialog implements ActionListener {
    private JPanel toolBar = new JPanel();
    private JPanel workPane = new JPanel();
    private JButton btnLogin = new JButton("登陆");
    private JButton btnCancel = new JButton("退出");
    private JButton btnRegister = new JButton("注册");

    private JLabel labelUser = new JLabel("用户：");
    private JLabel labelPwd = new JLabel("密码：");
    private JTextField edtUserId = new JTextField(20);
    private JPasswordField edtPwd = new JPasswordField(20);

    public loginUI() {
        toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        toolBar.add(this.btnRegister);
        toolBar.add(btnLogin);
        toolBar.add(btnCancel);
        this.getContentPane().add(toolBar, BorderLayout.SOUTH);
        workPane.add(labelUser);
        workPane.add(edtUserId);
        workPane.add(labelPwd);
        workPane.add(edtPwd);
        this.getContentPane().add(workPane, BorderLayout.CENTER);
        this.setSize(320, 140);
        // 屏幕居中显示
        double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.setLocation((int) (width - this.getWidth()) / 2,
                (int) (height - this.getHeight()) / 2);

        this.validate();

        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        this.btnRegister.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
