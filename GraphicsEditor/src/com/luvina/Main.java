package com.luvina;

public class Main {

    public static void main(String[] args) {

        IFile jpg = new JPG();
        IFile png = new PNG();
        IFile gif = new GIF();
        IFile bmp = new BMP();
        jpg.openFile();
        jpg.parseFile();
        jpg.saveFile();
        png.openFile();
        png.parseFile();
        png.saveFile();
        gif.openFile();
        gif.parseFile();
        gif.saveFile();
        bmp.openFile();
        bmp.parseFile();
        bmp.saveFile();
    }
}
