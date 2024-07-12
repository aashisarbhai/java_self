import java.io.*;

class File_Reading {
    File f1;

    File_Reading() throws IOException {
        // Initialize the File object
        f1 = new File("c:\\java\\My_file.doc");
        if (!f1.exists()) {
            f1.createNewFile();
        }
    }

    void write_file() throws IOException {
        // Use try-with-resources to automatically close the stream
        try (FileOutputStream out = new FileOutputStream(f1, true)) {
            String d = "\nThis is my BCA IINd shift file";
            byte[] c = d.getBytes();
            out.write(c);
            System.out.println("Data written in file");
        }
    }

    void read_file() throws IOException {
        // Use try-with-resources to automatically close the stream
        try (FileInputStream in = new FileInputStream(f1)) {
            int t_bytes = in.available();
            for (int i = 0; i < t_bytes; i++) {
                char d = (char) in.read();
                System.out.print(d);
            }
            System.out.println(" ");
            System.out.println("----------- Reach end of file -----------");
        }
    }

    public static void main(String[] args) throws IOException {
        File_Reading f1 = new File_Reading();
        System.out.println("Writing files through FileOutputStream class");
        f1.write_file();
        System.out.println(" ");
        System.out.println("Reading files through FileInputStream class");
        f1.read_file();
    }
}
