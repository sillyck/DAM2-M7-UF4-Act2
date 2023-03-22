
public class inici {

	static changeEventListener events= new changeEventListener (){

		int num;
		
		@Override
		public void onDNIChange(changeEvent ev) {
			System.out.println("Ha cambiado el DNI");
						
		}

		@Override
		public void onDNIDelete(changeEvent ev) {
			System.out.println("Ha eliminado el DNI");
			
		}
		
		@Override
		public void onNameChange(changeEvent ev) {
			System.out.println("Ha cambiado el nombre");
			
		}
		
		@Override
		public void onNameDelete(changeEvent ev) {
			System.out.println("Ha eliminado el nombre");
			
		}

		@Override
		public void onCognomChange(changeEvent readerEvObj) {
			System.out.println("Ha cambiado el apellido");
			
		}
		
		@Override
		public void onCognomDelete(changeEvent readerEvObj) {
			System.out.println("Ha eliminado el apellido");
			
		}

		@Override
		public void onEdatChange(changeEvent readerEvObj) {
			System.out.println("Ha cambiado la edad");
			
		}
		
		@Override
		public void onEdatDelete(changeEvent readerEvObj) {
			System.out.println("Ha eliminado la edad");
			
		}
		

	};
	
	public static void main(String[] args) {

		Persona persona = new Persona("11111111A", "Luis", "Gomez", 36);
		
		persona.addEventListener(events);
		persona.addEventListener(events);
		
		persona.removeEventListener(events);
		
		persona.setDNI("22222222B");
        persona.setName("Pedro");
        persona.setCognom("Recasens");
        persona.setEdat(28);

 	}

}
