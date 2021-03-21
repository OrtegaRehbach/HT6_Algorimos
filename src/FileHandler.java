import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileHandler {

    public String readFromFile(String fileName) {
        String fileData = "";
        try {
            File fileObj = new File(fileName);
            Scanner fileReader = new Scanner(fileObj);
            while (fileReader.hasNextLine()) {
                fileData += fileReader.nextLine() + "\n";
            }
            fileReader.close();
            return fileData;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public String getFileInfo(String fileName) {
        File myObj = new File("filename.txt");
        String fileInfo = "";
        if (myObj.exists()) {
            fileInfo =  "File name: " + myObj.getName() + "\n" + 
                        "Absolute path: " + myObj.getAbsolutePath() + "\n" + 
                        "Writeable: " + myObj.canWrite() + "\n" + 
                        "Readable " + myObj.canRead() + "\n" + 
                        "File size in bytes " + myObj.length();
        } else {
            fileInfo = "The file " + "\"" + fileName + "\"" + " does not exist.";
        }
        return fileInfo;
    }
}
