package com.luvina;

public class JPG implements IFile {
    @Override
    public void openFile() {
        System.out.println("open file JPG format");
    }

    @Override
    public void parseFile() {
        System.out.println("parse to format file JPG");
    }

    @Override
    public void saveFile() {
        System.out.println("save file as JPG format");
    }
}
