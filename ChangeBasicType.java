/**-------文件名:
 * ChangeBasicType
 * --------*/
package bookbasic;

public class ChangeBasicType{
/**基本类型的自动提升*/
private void typeAutoUpgrade(){
       byte b=44;
       char c='b';
       short s=1024;
       int i=40000;
       long l=124631;
       float f=35.67f;
       double d=3.1234d;
       double result=(f*b)+ +(l*f)+(i/c)-(d*s);
       System.out.println((f*b)+"+"+(l*f)+"+"+(i/c)+"-"+(d*s));
       System.out.println("="+result);
}
//基本类型的自动转换
private void autoChange(){
       char c='a';
       byte b=44;
       short s0=b;
       int i0=s0;
       int i1=c;
       long l=i0;
       float f=l;
       double d=f;
       System.out.print("c="+c+";b="+b+";s0="+s0);
       System.out.print(";i0="+i0+";i1="+i1+";l="+l);
       System.out.println(";f="+f+";d="+d);

       float fl=1.7f;
       double dou=fl;
       System.out.println("fl="+fl+";dou="+dou);
}
private void forceChange(){
	double d=123.456d;
	float f=(float)d;
	long l=(long)d;
	int i=(int)d;
	short s=(short)d;
	byte b=(byte)d;
	System.out.print("d="+d+";f="+f+";l="+l);
	System.out.println(";i="+i+";s="+s+";b="+b);
	d=567.89d;
	b=(byte)d;


	System.out.println("d="+d+";b="+b);
}
public static void main(String[] args){
        ChangeBasicType test=new ChangeBasicType();
	test.typeAutoUpgrade();
	test.autoChange();
	test.forceChange();
}}
