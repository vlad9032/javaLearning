
public class CCar extends CVehicle {


	public CCar() {
		Cost = 0;
		Speed = 0;
		Year = 0;
	}
	public CCar(int Cost, int Speed, int Year) {		
		this.Cost = 0;
		this.Speed = 0;
		this.Year = 0;
	}
	
	@Override
	public String toString() {
		return "CCar [Cost=" + Cost + ", Speed=" + Speed + ", " +", Year=" + Year +"]";
	}
	
	
}
