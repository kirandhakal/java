// import java.io.File;
// import java.io.FileReader;

// public class filenotfound_demo {
//     static void main(String[] args){
//         try{
//         // system.out.println(" enter a file");
//         File file= new File("C:/Users/Dell/Desktop/Programming Technology");
//         FileReader fr =new FileReader(file);
//         FileReader.close();
            
//         }
//         catch(Exception e){
//         System.out.println(" enter a valid file"+e);
        

//         }
//     }
    
// }
// Import the File class
import java.io.File;
import java.io.FileWriter;
// Import the IOException class to handle errors
import java.io.IOException;

public class filenotfound_demo {
	public static void main(String[] args)
	{

		try {
			// File Obj = new File("myfile.txt");
			//  (Obj.createNewFile()) {
			// 	System.out.println("File created: "
			// 					+ Obj.getName());
			
			FileWriter myWriter = new FileWriter("myfile.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		  } catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		// finally{
		// 	System.out.println("An error has occurred.");
		// }
	}
}
}
