
public class Main {

	public static void main(String[] args) {
		CCar cc = new CCar(20000,200,2010);//cost speed year
		CPlane cp = new CPlane(20000,200,2010,10000,120);//cost speed year height pass
		CShip cs = new CShip(20000,200,2010,120);//cost speed year pass
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cs);
		CVehicle[] masObj = new CVehicle[4];
		masObj[0]= cc;
		masObj[1]= cp;
		masObj[2]= cs;
		for (int i = 0; i < masObj.length; i++) {
			System.out.println(masObj[i]);
		}

	}

}
