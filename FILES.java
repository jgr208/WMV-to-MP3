import it.sauronsoftware.jave.*;

//this is the class that will handle the entering of the files and then 
//pass those to the convert class to convert from an mp3 to wma
public class FILES {
	public static void main(String[] args) 
	{
		//this is the variable that will hold the name of the wma file to convert
		String wma = "";
		//calls the welcome function
		welcome();
		//calls the input function
		input(wma);
	}

	//this is just a standard message welcoming someone to the program
	private static void welcome() 
	{
		System.out.println("Welcome to WMV to MP3");
	}

	//in this function the user will input the file they want to convert
	private static void input(String wma) 
	{
		System.out.println("Enter the name of the file that you wish to convert");
		wma = "C:\\Users\\Jason\\Music\\Unknown artist\\11 Track 11";
	}
}

//this is the class that will convert the wma to mp3
class CONVERT
{
	//intializes the jave encoder function
	Encoder encoder = new Encoder();
}