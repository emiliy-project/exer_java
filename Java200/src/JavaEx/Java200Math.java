package JavaEx;
// ������, 
public class Java200Math {
	public static void printAmicable(int t1, int t2){
		for (int i = t1; i < t2; i++) {
			int a=i;
			int b=divide(a);	//����� ��
			int c=divide(b);	//����� ��
			//System.out.println(i);	
			if(a<b && a==c){//���� �� �ݺ� ����
				System.out.printf("(%d,%d)�� ģȭ ��: ",a,b);
				printDivide(a);		//����� ����Ѵ�
				printDivide(b);		//����� ����Ѵ�
			}
		}
	}
	
	public static void main(String[] args) {
		printAmicable(2,10000);
	}
	public static void printDivide(int n){
		if(n==1){
			System.out.println("[1]");
		}else{
			System.out.printf("[1,");
			for (int i = 2; i <n; i++) {
				if(n%i==0){
					System.out.printf("%d,",i);
				}
			}
			System.out.println(n+"]");
		}
	}
	
    //�ڽ��� ������ ����� �� divide(6)=1+2+3
	public static int divide(int num){
		int tot=1;
		for(int i=2; i<num ; i++){
			if(num%i==0){
				tot+=i;
			}
		}
		return tot;
	}
}
