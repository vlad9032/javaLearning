
public class CPlane extends CVehicle{

	
	private int Height;
	private int Pass;
	public CPlane() {
		Cost = 0;
		Speed = 0;
		Year = 0;
		Height = 0;
		Pass = 0;
	}
	public CPlane(int Cost, int Speed, int Year, int Height, int Pass) {		
		this.Cost = 0;
		this.Speed = 0;
		this.Year = 0;
		this.Height = 0;
		this.Pass = 0;
	}
	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getPass() {
		return Pass;
	}
	public void setPass(int pass) {
		Pass = pass;
	}
	
	@Override
	public String toString() {
		return "CPlane [Cost=" + Cost + ", Speed=" + Speed + ", " +", Year=" + Year +", Height=" + Height +", Pass=" + Pass +"]";
	}
	
}
