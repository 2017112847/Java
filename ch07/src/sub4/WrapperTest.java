package sub4;
//
public class WrapperTest {public static void main(String[] args) {
	//기본타입(primitive)
	int var1 = 1;
	double var2 = 2.1;
	boolean var3 = true;
	System.out.println("var1:"+var1);
	System.out.println("var2:"+var2);
	System.out.println("var3:"+var3);
	//wrapper 포징(boxing)
	Integer box1 = var1;
	Double box2 = var2;
	Boolean box3 = var3;
	System.out.println("box1:"+box1);
	System.out.println("box2:"+box2);
	System.out.println("box3:"+box3);
	//문자열 -> 기본타입 변환
	String str1 = "1";
	String str2 = "2.1";
	String str3 = "false";
	int		value1 = Integer.parseInt(str1);
	double	value2 = Double.parseDouble(str2);
	boolean value3 = Boolean.parseBoolean(str3);
	System.out.println(" "+value1);
	System.out.println(" "+value2);
	System.out.println(" "+value3);
	//문자열 -> wrapper 변환
	Integer w1 = Integer.valueOf(str1);
	Double	w2 = Double.valueOf(str2);
	Boolean w3 = Boolean.valueOf(str3);
	System.out.println(""+w1);
	System.out.println(""+w2);
	System.out.println(""+w3);
	//wrapper -> 문자열 변환
	String s1 = w1.toString();
	String s2 = w2.toString();
	String s3 = w3.toString();
	System.out.println(""+s1);
	System.out.println(""+s2);
	System.out.println(""+s3);
	//wrapper -> 기본타입 변환
	int 	v1 = w1;	//자동 언박싱
	double 	v2 = w2;
	boolean v3 = w3;
	System.out.println(""+v1);
	System.out.println(""+v2);
	System.out.println(""+v3);
	// 기본타입 -> wrapper 변환
	Integer wr1 = v1;	//자동 언박싱
	Double 	wr2 = v2;
	Boolean wr3 = v3;
	System.out.println(""+wr1);
	System.out.println(""+wr2);
	System.out.println(""+wr3);
}

}
