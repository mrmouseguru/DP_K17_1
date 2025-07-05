package composition;

public class Body {
	//instance fields
	private Heart heartRef;
	
	public Body() {
		this.heartRef = new Heart(5);
	}
	
	public void control() {
		heartRef.beat();
	}
	
	
	class Heart{
		//instance fields
		private float size;
		
		Heart(float size){
			this.size = size;
		}
		
		public void beat() {
			System.out.println("beating ...");
		}
		
	}

}
