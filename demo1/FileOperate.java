package demo1;


import java.io.File;

public class FileOperate {
    public static void main(String[] args){

        File f=new File("D:/asxm/aaa");
        File[] files = f.listFiles();
        for (File file : files) {
            String aaa =file.getName();
        }

    }
}
