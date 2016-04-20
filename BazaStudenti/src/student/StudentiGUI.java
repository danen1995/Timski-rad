package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;

public class StudentiGUI extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentiGUI frame = new StudentiGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentiGUI() {
		setResizable(false);
		setPreferredSize(new Dimension(690, 620));
		setMinimumSize(new Dimension(690, 620));
		setMaximumSize(new Dimension(690, 620));
		setTitle("Baza podataka o studentima");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmIzlaz = new JMenuItem("Izlaz");
		mntmIzlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntmIzlaz.setIcon(new ImageIcon(StudentiGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mnNewMenu.add(mntmIzlaz);
		
		JMenu mnPomoc = new JMenu("Pomoc");
		menuBar.add(mnPomoc);
		
		JMenuItem mntmOProgramu = new JMenuItem("O programu");
		mntmOProgramu.setIcon(new ImageIcon(StudentiGUI.class.getResource("/com/sun/java/swing/plaf/motif/icons/Inform.gif")));
		mnPomoc.add(mntmOProgramu);
		
		JMenuItem mntmObrisiSvePodatke = new JMenuItem("Obrisi sve podatke");
		mntmObrisiSvePodatke.setIcon(new ImageIcon(StudentiGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
		mnPomoc.add(mntmObrisiSvePodatke);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(690, 620));
		contentPane.setMaximumSize(new Dimension(690, 620));
		contentPane.setMinimumSize(new Dimension(690, 620));
		contentPane.setPreferredSize(new Dimension(690, 620));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnDodaj = new JButton("DODAJ STUDENTA");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajStudentaGUI d = new DodajStudentaGUI();
				d.setVisible(true);
				setVisible(false);
			}
		});
		btnDodaj.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnDodaj.setPreferredSize(new Dimension(345, 310));
		btnDodaj.setBounds(22, 76, 310, 194);
		panel.add(btnDodaj);
		
		JButton button = new JButton("New button");
		button.setPreferredSize(new Dimension(345, 310));
		button.setBounds(22, 287, 310, 194);
		panel.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setPreferredSize(new Dimension(345, 310));
		button_1.setBounds(342, 76, 310, 194);
		panel.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setPreferredSize(new Dimension(345, 310));
		button_2.setBounds(342, 287, 310, 194);
		panel.add(button_2);
	}
}
