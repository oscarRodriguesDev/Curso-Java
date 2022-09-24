package br.com.aed.Eventos_java;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*classe destinada a tratar eventos de movimento 
 * mouse, atravez da interface MouseMotionListener*/
public class TrataMouse1 implements MouseMotionListener {

	/* mouse pressionado e se movendo */
	@Override
	public void mouseDragged(MouseEvent e) {
		/* aqui apenas apresentamos as coordenadas onde o cursor do moue esta */
		System.out.println(e.getX() + "///" + e.getY());

	}

	/* mouse solto e se movendo */
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX() + "///" + e.getY());

	}

}
