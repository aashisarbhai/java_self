import java.io.*;
class inputstream{
    public static void main(String args[]){
        FileInputStream infile=null;
        try{
            infile=new FileInputStream("text.txt");
            int b;
            while(b=infile.read()!=-1){
                sustem.out.println((char)b);
            }
            infile.close();
        }
    }
}