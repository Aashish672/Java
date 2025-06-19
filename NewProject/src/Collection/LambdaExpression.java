package Collection;

interface Lambda{
	int method(int a,int b);
}
public class LambdaExpression {
//	public static void main(String[] args) {
//		Lambda obj=(String x)->System.out.println(x);
//		obj.method("aashish");
//	}
	public static void main(String[] args) {
		Lambda obj=(int a, int b)->a+b;
		
		int result=obj.method(10,20);
		System.out.println(result);
	}
}
