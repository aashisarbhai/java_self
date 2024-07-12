import java.io.File;
class file{
    public static void main(String[] args) throws Exception {
        File myfile=new File("laila.txt");
        myfile.createNewFile();
        System.out.println(myfile.exists());
    }
}