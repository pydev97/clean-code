package com.luvina;

public class BMP implements IFile{

    @Override
    public void openFile() {
        System.out.println("open file BMP format");
    }

    @Override
    public void parseFile() {
        System.out.println("parse to format file BMP");
    }

    @Override
    public void saveFile() {
        System.out.println("save file as BMP format");
    }
}
