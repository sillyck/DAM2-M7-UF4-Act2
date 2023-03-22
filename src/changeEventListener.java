import java.util.EventListener;


public interface changeEventListener extends EventListener {
 
//	public abstract void setNum (int _num);
	
    public abstract void onDNIChange(changeEvent ev);
    public abstract void onDNIDelete(changeEvent ev); 
    
    public abstract void onNameChange(changeEvent ev);
    public abstract void onNameDelete(changeEvent ev); 
    
	public abstract void onCognomChange(changeEvent readerEvObj);
	public abstract void onCognomDelete(changeEvent readerEvObj); 
	
	public abstract void onEdatChange(changeEvent readerEvObj);
	public abstract void onEdatDelete(changeEvent readerEvObj);
    
}