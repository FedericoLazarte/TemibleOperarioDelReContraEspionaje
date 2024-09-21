package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.JMapViewer;

public class Mapa {

	private JFrame marcoPrincipal;
	private JPanel contenedorMapa;
	private JMapViewer mapa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa mapaAplicacion = new Mapa();
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mapa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		crearMarcoPrincipal();
	}
	
	private void crearMarcoPrincipal() {
		marcoPrincipal = new JFrame();
		int anchoFrame = 800;
        int altoFrame = 650;
        marcoPrincipal.setBounds((PantallaUtils.anchoPantalla - anchoFrame) / 2,
                (PantallaUtils.altoPantalla - altoFrame) / 2, anchoFrame, altoFrame);
		marcoPrincipal.setVisible(true);
		marcoPrincipal.setTitle("Temible Operario del Recontra Espionaje");
		marcoPrincipal.getContentPane().setLayout(null);
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		crearContenedorDelMapa();
	}
	
	private void crearContenedorDelMapa() {
		contenedorMapa = new JPanel();
		contenedorMapa.setSize(800, 325);
		agregarMapaAlContenedor();
		marcoPrincipal.getContentPane().add(contenedorMapa);
	}
	
	private void agregarMapaAlContenedor() {
		contenedorMapa.setLayout(null);
		mapa = new JMapViewer();
		mapa.setBounds(0, 0, 800, 325);
		mapa.setZoomControlsVisible(true);
		contenedorMapa.add(mapa);
	}

}
