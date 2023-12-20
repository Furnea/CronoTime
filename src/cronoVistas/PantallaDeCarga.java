package cronoVistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridLayout;

/**
 *  Pantalla de carga previa a la ventanaprincipal
 *  @author Roberto
 */
public class PantallaDeCarga extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelCarga;

	/**
	 * Constructor Pantalla de carga previa a la ventanaprincipal
	 */
	public PantallaDeCarga() {
		setTitle("Cronotime");
		setBackground(Color.WHITE);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		PanelCarga = new JPanel();
		PanelCarga.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelCarga);
		PanelCarga.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCargando = new JLabel("Cargando...");
		lblCargando.setForeground(SystemColor.controlText);
		lblCargando.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCargando.setHorizontalAlignment(SwingConstants.CENTER);
		PanelCarga.add(lblCargando);
		
		JLabel lblMensajeEspera = new JLabel("Esto puede durar varios segundos");
		lblMensajeEspera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMensajeEspera.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeEspera.setVerticalAlignment(SwingConstants.BOTTOM);
		PanelCarga.add(lblMensajeEspera, BorderLayout.SOUTH);
	}

}
