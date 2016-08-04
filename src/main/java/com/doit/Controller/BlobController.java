package com.doit.Controller;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;


/**
 * Created by mounika on 03/08/16.
 */
public class BlobController {
    public static void main(String[] args) {
        //First you need to load the file into a stream
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("//Users/mounika/Desktop/tlapplication/src/main/java/com/doit/Controller/01 Rab Diyan Rab Jaane (SongsMp3.Com).mp3");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //BufferedInputStream and saves its argument
        BufferedInputStream bis = new BufferedInputStream(fis);


        //convert base64 to byte aaray
        byte[] bFile = new byte[1024];
        String l = new BASE64Encoder().encode(bFile);
        org.slf4j.Logger logger= LoggerFactory.getLogger(BlobController.class);
        logger.info(l);
        try {
            bFile = new sun.misc.BASE64Decoder().decodeBuffer(l);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //byte array to blob
         String m="insert into BLOBTEST(content) values(bfile)";


    }




}

