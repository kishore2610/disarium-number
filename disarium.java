import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String st;
	    int n,r=0,sum=0;
	    st=s.next();
	    n=st.length();
	    int m=Integer.parseInt(st);
	    while(m>0)
	    {
	        r=m%10;
	        sum+=Math.pow(r,n);
	        m=m/10;
	        n--;
	    }
	    System.out.println(sum);
	    
	    
		
	}
}
