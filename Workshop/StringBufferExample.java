public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println("append : " +sb);
        sb.insert(5 , " , ");
        System.out.println("insert : " +sb);
        sb.replace(6,11,"Java");
        System.out.println("replace: "+sb );
		 System.out.println("length: "+sb.length());

        System.out.println("charAt(2): " + sb.charAt(2));

        sb.setCharAt(2, 'X');
        System.out.println("setCharAt: " + sb);

        System.out.println("substring: " + sb.substring(1, 4));
    }
}