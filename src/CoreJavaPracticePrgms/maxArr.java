package CoreJavaPracticePrgms;

public class maxArr {

	public static void main(String[] args) {
		
		int [] mark = new int[4];
		
		mark[0]=100;
		mark[1]=110;
		mark[2]=120;
		mark[3]=95;
		
		int OriginalNumbr =0;
		
		if(mark[0]>mark[1]) {
			System.out.println("Max number"+ mark[0]);
		}else if(mark[2]>mark[3]) {
			System.out.println("max number"+mark[2]);
		}else {
				System.out.println("max number"+mark[3]);
			}
				
		}
		
		
		
	}

