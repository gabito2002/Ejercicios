
package Sistema_de_Notificación2;

public class SMS implements Notificable{
    
    @Override
    public String mandarNotificacion(){
        return "Enviando notificacion SMS";
    }
}
