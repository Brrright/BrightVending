/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brightvending;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author User
 */
    class filterImg extends FileFilter {
        public final static String jpegExtension = "jpeg";
        public final static String jpgExtension = "jpg";
        public final static String gifExtension = "gif";
        public final static String tiffExtension = "tiff";
        public final static String tifExtension = "tif";
        public final static String pngExtension = "png";

        @Override
        public boolean accept(File f) {
           if (f.isDirectory()) {
              return true;
           }

           String fileExtension = getExtension(f);
           if (fileExtension != null) {
               return fileExtension.equals(jpegExtension) ||
                       fileExtension.equals(jpgExtension) ||
                       fileExtension.equals(tiffExtension) ||
                       fileExtension.equals(tifExtension) ||
                       fileExtension.equals(gifExtension) ||
                       fileExtension.equals(pngExtension);
           }
           return false;
        }

        @Override
        public String getDescription() {
           return "Image Only";
        }

        String getExtension(File f) {
           String ext = null;
           String s = f.getName();
           int index = s.lastIndexOf('.');

           if (index > 0 &&  index < s.length() - 1) {
               //getting extension of file by using substring
              ext = s.substring(index+1).toLowerCase();
           }
           return ext;
        } 
}