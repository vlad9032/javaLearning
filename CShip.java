
public class CShip extends CVehicle{

	private int Pass;
	public CShip() {
		Cost = 0;
		Speed = 0;
		Year = 0;
		Pass = 0;
	}
	public CShip(int Cost, int Speed, int Year, int Pass) {		
		this.Cost = 0;
		this.Speed = 0;
		this.Year = 0;
		this.Pass = 0;
	}
	
	public String toString() {
		return "CShip [Cost=" + Cost + ", Speed=" + Speed + ", " +", Year=" + Year +", Pass=" + Pass +"]";
	}
	
}
