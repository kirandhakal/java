import java.io.*;
public file_example
 { 
 public static void main(String args[ ])
{
try
{ 
// Create File
File f = new File ( "c:\\myfile.txt");
if (f.createNewFile()==true)
{
System.out.println("File created.");
//Write Content
FileWriter w= new FileWriter(f);
w.write(" This is Test Data.");
w.close();
System.out.println("Data Written.");
}
else
System.out.println("File already exists");
}
catch (IOException e)
{
 e.printStackTrace();
}
}
 }