
public class Triangle {
	static boolean CalTriangle(int a) {
		int tempsum=0;
		for(int i=1; i<a; i++) {
			tempsum=tempsum+i;
			if(tempsum==a) {
				return true;
			}
		}	
		return false;
	}
	static int Checkdiv(int b) {
		int count=0;
		for(int z=1; z<b; z++) {
			if(b%z==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		boolean triangle;
		int lim=999999999;
		int divisors=0;
		for(int j=1; j<lim; j++) {
			triangle= CalTriangle(j);
			if(triangle==true) {
				divisors= Checkdiv(j)+1;
					System.out.println(j);
					System.out.println(divisors);
					if(divisors>500) {
						System.out.println(j);
						break;
					}
				}
			}
		}
	}




