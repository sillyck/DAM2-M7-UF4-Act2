import java.util.ArrayList;
import java.util.ListIterator;

@SuppressWarnings("rawtypes")
public class Persona {
	 
    private String DNI;
    private String Nom;
    private String cognom;
    private int Edat;
    
    private static ArrayList listeners;
 
    public Persona (String _DNI){
    	DNI=_DNI;
    }
        
    public Persona (String _DNI, String _Nom, String _cognom, int _Edat) {
        DNI=_DNI;
        Nom=_Nom;
        cognom=_cognom;
        Edat=_Edat;
        
        listeners=new ArrayList();
    }
    public String getDNI() {
        return DNI;
    }
 
    public String getName() {
        return Nom;
    }
 
    public void setDNI(String _DNI) {
        DNI = _DNI;
        this.triggerDNIEvent();
    }
 
    public void setName(String _Nom) {
        Nom = _Nom;
        this.triggerNameEvent();
    }

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
		this.triggerCognomEvent();
	}

	public int getEdat() {
		return Edat;
	}

	public void setEdat(int edat) {
		Edat = edat;
		this.triggerEdatEvent();
	}

	public void addEventListener(changeEventListener listener) {
        listeners.add(listener);
    }

	//Triggers
    private void triggerDNIEvent() {
    	 
        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            listener.onDNIChange(readerEvObj);
        }
    }
    
    private void triggerNameEvent() {
    	
    	ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            listener.onNameChange(readerEvObj);
        }
	}
    
    private void triggerCognomEvent() {
    	
    	ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            listener.onCognomChange(readerEvObj);
        }
	}
    
    private void triggerEdatEvent() {
    	
    	ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            listener.onEdatChange(readerEvObj);
        }
	}

	public void removeEventListener(changeEventListener listener) {
		listeners.remove(listener);
		changeEvent readerEvObj = new changeEvent(this, this);
		
		listener.onDNIDelete(readerEvObj);
        listener.onNameDelete(readerEvObj);
        listener.onCognomDelete(readerEvObj);
        listener.onEdatDelete(readerEvObj);
	}
  
 }
