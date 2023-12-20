package cronoControl;

import cronoVistas.PantallaDeCarga;
import cronoVistas.VentanaPrincipal;
//Controlador principal
public class MiControlador {
	//Constructor del controlador MiControlador, lanza la ventana principal mediante un metodo
	public MiControlador(){
	LanzarPrincipal();
	}	
	
	//Metodo para lanzar la ventana principal
	public void LanzarPrincipal(){
		PantallaDeCarga ventanaC = new PantallaDeCarga();
        ventanaC.setVisible(true);	
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        ventanaC.setVisible(false);
		VentanaPrincipal ventanaP = new VentanaPrincipal();
        ventanaP.setVisible(true);	
	}

}