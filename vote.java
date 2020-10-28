import java.io.*;
class isbn
{
	public static void main(String[] args) throws IOException
	{
		int n,a=0,b=0,c=0,d=0;
		String t;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of voters");
		t = input.readLine();
		n = Integer.parseInt(t);
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter your vote(A/B/C):");
			char vote=(char)input.read();
			input.readLine();
				
			switch(vote)
			{
				case 'A':a=a+1;
				       break;
				case 'B':b=b+1;
				       break;
				case 'C':c=c+1;
				       break;
				default:d=d+1;
				       break;
			}
			System.out.print("\u001B[2J");
		}
		System.out.println(a+"\t"+b+ "\t"+c+"\t"+d);
		input.close();
}
}
