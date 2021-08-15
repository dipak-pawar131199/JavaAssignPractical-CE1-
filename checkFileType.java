package fileCheck;

import java.io.*;
public class checkFileType
{
   String fname;
  public  checkFileType(String fname)
   {
      this.fname=fname;
   }
   
   public String validateFile()
   {
       File f=new File(fname);
       
       if(f.isDirectory())
          return fname+" is directory";
       else if(f.isFile())
          return fname+" is File";
       else
          return "No such file or directory";       
       
   }
}
