import java.util.EventObject;


public class changeEvent extends EventObject {
 
    Persona persona;
    public changeEvent(Object source, Persona _persona) {
        super(source);
        persona=_persona;
    }
}