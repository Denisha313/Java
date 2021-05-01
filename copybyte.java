import java.io.FileInputSream;
import java.io.FileOutputSream;
import java.io.IOException;

public class copybyte
{
	public static void main(String[] args) throws IOException
	{
			FileInputSream in=null;
			FileOutputSream out=null;
			try
			{
					in=new FileInputSream("text.txt");
					out=new FileOutputSream("text1.txt");
					int c;
					
					while((c=in.read())!=-1)
					{
						out.write(c);
					}
			}
			finally
			{
					if(in!=null)
					{
						in.close();
					}	
					if(out!=null)
					{
							out.close();
					}
			}
	}
}