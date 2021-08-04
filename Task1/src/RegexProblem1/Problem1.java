//Given a website address as a string, extract the domain name. For example, if the website address is "https://en.wikipedia.org/wiki/Main_Page", then it should return "en.wikipedia.org" as the domain name.

package RegexProblem1;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="https://en.wikipedia.org/wiki/Main_Page";
		String s2="https://join.slack.com/t/revatureindia-sq55269/shared_invite/zt-tpxicwbl-\r\n";
		String s3="https://mail.google.com/mail/u/0/#inbox/FMfcgzGkZZlxTcjPWgzgpMnFFjWQhcph";
		extract(s1);
		extract(s2);
		extract(s3);
	}
	
	public static void extract(String s) {
		
		String s1 = s.substring(8);
		int j = s1.indexOf('/');
		String s2 = s1.substring(0,j);
		System.out.println(s2);
	}

}

// Input  : "https://en.wikipedia.org/wiki/Main_Page"
// Output :  en.wikipedia.org