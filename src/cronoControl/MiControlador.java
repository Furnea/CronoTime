package cronoControl;

import cronoVistas.PantallaDeCarga;
import cronoVistas.VentanaPrincipal;

public class MiControlador {
	
	public MiControlador(){
	LanzarPrincipal();
	}	
	
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