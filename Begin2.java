public class Begin2{
	public static void main(String args[]){
		int a=3; //�������α��������Ҹ�ֵ
		int b=4;
		int c=getTotal(a,b); //�����ӷ���,���Ҵ��ݲ���
		System.out.println("a,b�ĺͣ�"+c);
	}
	/* �˷����������������ĺ� */
	public static int getTotal(int x,int y){ //�����б���д�������ͣ�����ֵ��д��������
		return x+y;
	}
}