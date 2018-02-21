public class Begin2{
	public static void main(String args[]){
		int a=3; //定义整形变量，并且赋值
		int b=4;
		int c=getTotal(a,b); //调用子方法,并且传递参数
		System.out.println("a,b的和："+c);
	}
	/* 此方法返回两个整数的和 */
	public static int getTotal(int x,int y){ //参数列表需写数据类型，返回值需写数据类型
		return x+y;
	}
}