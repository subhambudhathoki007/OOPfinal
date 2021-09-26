
public class UserLogin {

	import java.awt.Color;
	import java.awt.EventQueue;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;
	import javax.swing.border.EmptyBorder;

	public class UserLogin extends JFrame {

	    private static final long serialVersionUID = 1L;
	    private JTextField textField;
	    private JPasswordField passwordField;
	    private JButton btnNewButton;
	    private JLabel label;
	    private JPanel contentPane;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    UserLogin frame = new UserLogin();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
