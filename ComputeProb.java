
public class ComputeProb {
void compute(int n,char ch) {
	if(ch == 's') {
		int square=(int) Math.pow(n,2);
		System.out.println(square);
	}
    else {
		int cube=(int) Math.pow(n,3);
		System.out.println(cube);
	}
}
void compute(double n,char ch) {
	if(ch =='v') {
    	double volume= Math.pow(n,3);
    	System.out.println(volume);
	}
    else {
		double diag= n*Math.pow(n,0.5);
		System.out.println(diag);
	}
}
void compute(int len,int br,char ch) {
	if(ch== 'a') {
		double area= len*br;
		System.out.println(area);
	}else {
		double pmtr=2*(len+br);
		System.out.println(pmtr);
	}
}
	public static void main(String[] args) {
		ComputeProb obj = new ComputeProb();
		obj.compute(4,'s');
	    obj.compute(3.2,'v');
		obj.compute(6,3,'a');
	}
}