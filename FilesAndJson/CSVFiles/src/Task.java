import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./test/iris-data.csv");
    }

    public Database readCSV(String filename) {
        String contents = "";

        /* TODO
Change what needs to go here to start reading "filename" */
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename));
        OutputStream out = new BufferedOutputStream(new FileOutputStream(contents))) {
            /* TODO
Create a byte array of about 1024 bytes or however many bytes you want. */
            byte[] buffer = new byte[1024];
            int lengthRead;
            /* TODO 
Create a while loop to read the contents of the file and put them in the variable "contents" declared at the beginning of the method. */
            while((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.write('\n');
                out.flush();
            }
        /* TODO
Put the correct Exception here. */
        } catch (FileNotFoundException e) {
            System.out.println("No file found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        /* TODO
Return a Database object initialized with the contents read. */
        return new Database(contents);
    }
}
