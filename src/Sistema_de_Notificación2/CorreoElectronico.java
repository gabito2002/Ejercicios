
package Sistema_de_Notificación2;


public class CorreoElectronico implements Notificable{
      @Override
    public String mandarNotificacion(){
        return "Enviando notificacion al Correo electronico";
    }
}