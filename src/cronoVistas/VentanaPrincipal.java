package cronoVistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.SystemColor;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelPrincipal;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setOpacity(0.0f);
		setTitle("Cronotime");
		setBackground(SystemColor.activeCaption);
		setType(Type.UTILITY);
		setForeground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(SystemColor.activeCaption);
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTituloPrograma = new JLabel("CRONOTIME");
		lblTituloPrograma.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPrograma.setFont(new Font("Sitka Text", Font.BOLD, 24));
		PanelPrincipal.add(lblTituloPrograma, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setForeground(new Color(128, 128, 255));
		PanelPrincipal.add(panel, BorderLayout.CENTER);
	}

}
