package sub3;
// stringbuilder 실습 
public class StringBuilderTest {public static void main(String[] args) {
	//String 의 불변성(immutable)
	String str = "java";
	System.out.println("str 주소 : " + System.identityHashCode(str));
	str += "programming";
	System.out.println("str 주소 : " + System.identityHashCode(str));
	System.out.println(str);
	//빈번한 문자열 변경을 위한 StringBuilder
	StringBuffer sb = new StringBuffer("java");
	System.out.println("sb 주소 : " + System.identityHashCode(sb));
	sb.append("programming");
	System.out.println("sb 주소 : " + System.identityHashCode(sb));
	System.out.println(sb);
}

}
