
package Sistema_de_Notificación2;

import java.util.List;

public class Notificador {
    private final List<Notificable> notificables;

    public Notificador(List<Notificable> notificables) {
        this.notificables = notificables;
    }

    public void notificarTodos() {
        for (Notificable notificable : notificables) {
            System.out.println(notificable.mandarNotificacion());
        }
    }
}