//create read write File 
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateWriteReadFile {
    
    public static void main(String []args) {
        
        //creating folder 
        File obj1=new File("/Users/mac/Desktop/Jeni");
        if(!obj1.mkdir()){
            System.out.println(obj1.getName());
            System.out.println("folder created");
        }
        else{
            System.out.println("folder not created");
        }
        
        //creating file
        try{
             File obj=new File("JENITA.txt");
             if(!obj.exists()){
                 obj.createNewFile();
                 System.out.println("\n"+obj.getName());
                 System.out.println("\ndirectory: "+obj.getAbsolutePath());
                 System.out.println("file created");
                 System.out.println("\nWriteable: " + obj.canWrite());
                 System.out.println("\nReadable : " + obj.canRead());
                System.out.println("\nFile size in bytes :" + obj.length());
          }
             else{
                 System.out.println("file exists!!");
             }
        }
        catch(IOException e){
            System.out.println("error 0!");
        }
        
        //writing file
        try{
            FileWriter wobj=new FileWriter("JENITA.txt");
            wobj.write("im jeni!\nim in second year");
            wobj.flush();
            wobj.close();
            System.out.println("\nsuccessfully wrote");
            
        }
        catch(IOException e){
            System.out.println("error 1!");
        }
        
        //reading file   
        try{
            File robj=new File("JENITA.txt");
            Scanner sreader=new Scanner(robj);
            System.out.println("\nReading the file:-");
            while(sreader.hasNextLine()){
                String data = sreader.nextLine();
                System.out.println(data);  
                
            }
            System.out.println("\nFile size in bytes :" + robj.length());
            sreader.close();
         }
        catch(FileNotFoundException e){
         System.out.println("error 2!");   
        }
 //---------------------------------------------------------------------------------       
        //rename
        File oldn=new File("JENITA.txt");
        File newn =new File("YUVA.txt");

        if(oldn.renameTo(newn)){
            System.out.println("renamed!!");   
            System.out.println(newn.getName());
        }
        else{
            System.out.println("not renamed");   
        }
        try{
            FileWriter wobj2 = new FileWriter("YUVA.txt");
            wobj2.write("\nhello guys. im yuvalkshmi. im in first year");
            wobj2.close();
            System.out.println("\nsuccessfully wrote");
           
        }
        catch(IOException e){
            System.out.println("error 1!");
        }
        
        try{
            File robj2=new File("YUVA.txt");
            Scanner s2=new Scanner(robj2);
            while(s2.hasNextLine()){
              
                String data2= s2.nextLine();
                System.out.println(data2);
            }
      
            System.out.println("\nFile size in bytes :" + robj2.length());
            s2.close();
       }
         catch(FileNotFoundException e){
         System.out.println("error 2!");   
        }
 //---------------------------------------------------------------------------------  
        // //listing all files and folders
        
        // File file= new File("/Users/mac/Desktop");
        // String[] mylist= file.list();
        
        // for(int i=0;i< mylist.length; i++){
        //     System.out.println(mylist[i]);
        // }
        
        // //listing only files 
        // File[] mylist2= file.listFiles();
        // for( File f: mylist2 ){
        //     if(f.isFile()){
        //         System.out.println(f);
        //     }
        // }
 //---------------------------------------------------------------------------------  
        
        //to append 
        
 //       FileWriter fw = new FileWriter(file,true); 
        
        
        //delete
        
        File obj2 = new File("YUVA.txt");
        if(obj2.delete()){
            System.out.println("\n"+obj2.getName() +" deleted");   
        }
        else{
            System.out.println("\nnot deleted");   
        }
    }
}


//line,chr,word count 
//copy image from one file to another
import java.io.*;
import java.util.*;
public class HelloWorld {

    public static void main(String []args) {
        try {
            File obj=new File("yuva.txt");
            obj.createNewFile();
        } catch(IOException e) {

            System.out.println("Herror 1");
        }

        try {
            FileWriter wobj=new FileWriter("yuva.txt");
            wobj.write("im yuva. \nhello. \nhow are you?");
            wobj.close();
        } catch(IOException e) {

            System.out.println("Herror 2");
        }

//=====================
        BufferedReader reader = null;
         
        //Initializing charCount, wordCount and lineCount to 0
         
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
        try{
            reader = new BufferedReader(new FileReader("yuva.txt"));

        //Reading the first line into currentLine

        String currentLine = reader.readLine();

        while (currentLine != null) {
            //Updating the lineCount

            lineCount++;

            //Getting number of words in currentLine

            String[] words = currentLine.split(" ");

            //Updating the wordCount

            wordCount = wordCount + words.length;

            //Iterating each word

            for (String word : words) {
                //Updating the charCount

                charCount = charCount + word.length();
                
            }

            System.out.println(currentLine);
            //Reading next line into currentLine
            currentLine = reader.readLine();
            
        }

        //Printing charCount, wordCount and lineCount

        System.out.println("Number Of Chars In A File : "+charCount);

        System.out.println("Number Of Words In A File : "+wordCount);

        System.out.println("Number Of Lines In A File : "+lineCount);
    }
    catch(IOException e) {

            System.out.println("Herror 3");
        }


}
}
//to copy image
//  try{
//      FileInputStream in=new FileInputStream("yuva.txt");
//      FileOutputStream out=new FileOutputStream("jeni.txt");

//      int content=in.read();
//      while(content!=-1){
//          out.write(content);
//          content=in.read();
//      }
//      out.flush();
//      in.close();
//      out.close();

//  }

//  catch(Exception e){

//   System.out.println("Herror");
//  }

//  using scanner to read
// try{
//      File robj=new File("yuva.txt");
//      Scanner s=new Scanner(robj);
//      int lc=0,chr=0,w=0;
//      while(s.hasNextLine()){
//          lc++;
//          chr+=s.length;
//          String[] word= s.split(" ");
//          w+=word.length;
//          System.out.println(s.nextLine());
//      }
//      System.out.println(lc);
//      System.out.println(chr);
//      System.out.println(w);
//  }

