package com.company.ClassDay6;

import java.io.FileWriter;
import java.io.IOException;

public class Demo20 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data2.txt", true);
        fw.write(100);
        fw.write("\n");
        fw.write("This is a message!");
        fw.write("\n");
        char[] c1 = {'h', 'i',' ','t','h','e','r','e'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
