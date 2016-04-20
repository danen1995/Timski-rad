package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class DodajStudentaGUI extends JFrame {

	private JPanel contentPane;
	private JTextField jtfBrIndeksa;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajStudentaGUI frame = new DodajStudentaGUI();
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
	public DodajStudentaGUI() {
		setMaximumSize(new Dimension(500, 500));
		setMinimumSize(new Dimension(500, 500));
		setPreferredSize(new Dimension(500, 500));
		setTitle("Dodaj studenta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(180, 180, 180), 3, true));
		panel_1.setMaximumSize(new Dimension(300, 300));
		panel_1.setPreferredSize(new Dimension(300, 300));
		panel_1.setMinimumSize(new Dimension(300, 300));
		panel_1.setBounds(24, 26, 375, 350);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informacije o studentu:");
		lblNewLabel.setBounds(10, 11, 122, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblBrojIndeksa = new JLabel("Broj indeksa: ");
		lblBrojIndeksa.setBounds(29, 58, 103, 14);
		panel_1.add(lblBrojIndeksa);
		
		jtfBrIndeksa = new JTextField();
		jtfBrIndeksa.setBounds(126, 55, 86, 20);
		panel_1.add(jtfBrIndeksa);
		jtfBrIndeksa.setColumns(10);
		
		JLabel lblImeIPrezime = new JLabel("Ime i prezime: ");
		lblImeIPrezime.setBounds(29, 94, 103, 14);
		panel_1.add(lblImeIPrezime);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(126, 91, 86, 20);
		panel_1.add(textField);
		
		JLabel lblProsek = new JLabel("Prosek:");
		lblProsek.setBounds(29, 136, 103, 14);
		panel_1.add(lblProsek);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 133, 86, 20);
		panel_1.add(textField_1);
		
		JLabel lblDodatneAktivnosti = new JLabel("Dodatne aktivnosti:  ");
		lblDodatneAktivnosti.setBounds(29, 174, 103, 14);
		panel_1.add(lblDodatneAktivnosti);
		
		JTextPane tpDodatneAktivnosti = new JTextPane();
		tpDodatneAktivnosti.setBounds(29, 194, 323, 145);
		panel_1.add(tpDodatneAktivnosti);
	}
}
