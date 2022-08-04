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


}
