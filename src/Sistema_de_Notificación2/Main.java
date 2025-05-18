package Sistema_de_Notificación2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notificable correo = () -> "Enviando correo electronico";

        Notificable sms = () -> "Enviando SMS";

        Notificable push = () -> "Enviando notificacion";
       
        Notificador notificador = new Notificador(Arrays.asList(correo, sms, push));
        notificador.notificarTodos();
    }
}
