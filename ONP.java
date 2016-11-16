import java.security.acl.LastOwnerException;
import java.util.Scanner;

class onp {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			String a = s.next();
			int len = a.length();
			String ans = "";
			StringBuffer stack = new StringBuffer("");
			int prec = -1, previous = -1;
			String pr = "()+-*/^";// (0,1);(2,3);(4,5);(6)
			StringBuffer xyz = new StringBuffer("");
			for (int i = 0; i < len; i++) {
				char ch = a.charAt(i);
				//System.out.print("char is: "+ch+" ");
				if (Character.isAlphabetic(ch)) {
					ans = ans + ch;
				//	System.out.println();
				} else {
					previous = prec;
					if (ch == '(') {
						stack.append(ch);
						prec = 0;

					} else if (ch == ')') {
						stack.append(ch);
						prec = 0;

					} else if (ch == '+' || ch == '-') {
						stack.append(ch);
						prec = 1;
						// xyz=xyz+prec;
					} else if (ch == '*' || ch == '/') {
						stack.append(ch);
						prec = 2;
						// xyz=xyz+prec;
					} else if (ch == '^') {
						stack.append(ch);
						prec = 3;
						// xyz=xyz+prec;
					}
					xyz.append(prec);
					int flag = 0;
					int saver = 0;
					int flagger = 0;
			//		System.out.println(prec+" stack is "+stack);
					
				/*	if(previous==0 && prec==0)
					{
						System.out.println("ghusgya");
						
					}
					else*/
					while (prec <= previous && ch!='(')// remember the length too
					{
						int length = stack.length();

						if (prec == 0 && flag == 0) {
							flag = 1;
							//System.out.println("deleting  flagy"+stack.charAt(length-1));
							stack.deleteCharAt(length - 1);
							xyz.deleteCharAt(length - 1);
							length--;

						} else if (flagger == 0 && flag == 0 ) {
							//System.out.println("flagger  "+stack.charAt(length-1));
							stack.deleteCharAt(length - 1);
							saver = xyz.charAt(length - 1);

							xyz.deleteCharAt(length - 1);
							
							length--;
							flagger = 1;

						}
						if (previous == 0 && stack.charAt(length-1)=='(') {
							//System.out.println("deleting previo "+stack.charAt(length-1));
							stack.deleteCharAt(length - 1);
							xyz.deleteCharAt(length-1);
							break;
						} 
						/*else if(stack.charAt(length-1)=='(')
						{System.out.println("le me extra");
							stack.deleteCharAt(length-1);
							xyz.deleteCharAt(length-1);
							break;
						}*/
						else {
						
							ans = ans + stack.charAt(length - 1);
							//System.out.println("inserting "+stack.charAt(length-1));
							stack.deleteCharAt(length - 1);
							xyz.deleteCharAt(length - 1);
						length = stack.length();
						}
					
							previous = xyz.charAt(length - 1) - 48;

					}
					if (flagger == 1) {
						xyz.append(saver);
						stack.append(ch);
					}
					/*
					(a+(b*c))
					((a+b)*(z+x))
					((a+t)*((b+(a+c))^(c+d)))*/

				}
				//System.out.println("ans is "+ans);
			}
			System.out.println(ans);
		}
	}
}
