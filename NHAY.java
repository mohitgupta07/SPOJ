import java.util.Scanner;

class KMP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int t = s.nextInt();

			kmp(s.next(), s.next());
		}
		// kmp("aabaaabaaa","aaab");//0120
	}

	static void preprocess(String pattern, int lpt, int pt[]) {
		int x = 0;
		for (int i = 1; i < lpt;) {
			// System.out.println(i +" " +x);
			if (pattern.charAt(i) == pattern.charAt(x)) {

				pt[i] = ++x;
				i++;
			} else if (x > 0) {
				x = pt[x - 1];

			} else {

				i++;
			}
			// 3
			// aabbaabbabba abba

		}
		// ///Pattern is created...
	}

	static void kmp(String pattern, String text) {
		int lpt = pattern.length();
		int pt[] = new int[lpt];
		pt[0] = 0;
		preprocess(pattern, lpt, pt);
		int len = text.length();
		int x = 0;
		int flag = 0;
		boolean valid = true;
		for (int i = 0; i < len;) {
			if (text.charAt(i) == pattern.charAt(x)) {
				x++;
				i++;
				if (x == lpt) {
					System.out.println((i - x));
					x = pt[x - 1];
					valid = false;
				}

				flag = 0;
			} else {
				
				if (x>0 )
					x = pt[x-1];
				else
					{x = 0;
					i++;
					}
			}

		}
		System.out.println();

	}
}
