import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MenuOptions {

    //sort file in ascending order
    protected static String[] sort_sub(String array[], int size){
        String temp = "";
        for(int i=0; i<size; i++){
            for(int j=1; j<(size-i); j++){
                if(array[j-1].compareToIgnoreCase(array[j])>0){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    //		file listing
    protected static void listFiles() {

        int fileCount = 0;
        ArrayList<String> filenames = new ArrayList<String>();

        File directoryPath = new File(System.getProperty("user.dir"));
        File[] listOfFiles = directoryPath.listFiles();
        fileCount = listOfFiles.length;


        System.out.println("Files In Ascending Order: ");
        for (int i = 0; i < fileCount; i++) {
            if (listOfFiles[i].isFile()) {
                filenames.add(listOfFiles[i].getName());
            }
        }

        String[] str = new String[filenames.size()];

        for (int i = 0; i < filenames.size(); i++) {
            str[i] = filenames.get(i);
        }

        String[] sorted_filenames = sort_sub(str, str.length);

        for(String currentFile: sorted_filenames) {
            System.out.println(currentFile);
        }

    }

}
