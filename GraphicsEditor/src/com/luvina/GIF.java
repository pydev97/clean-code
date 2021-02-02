package com.luvina;

public class GIF implements IFile {

    @Override
    public void openFile() {
        System.out.println("open file GIF format");
    }

    @Override
    public void parseFile() {
        System.out.println("parse to format file GIF");
    }

    @Override
    public void saveFile() {
        System.out.println("save file as GIF format");
    }
}
