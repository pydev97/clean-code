package com.luvina;

public class PNG implements IFile {
    @Override
    public void openFile() {
        System.out.println("open file PNG format");
    }

    @Override
    public void parseFile() {
        System.out.println("parse to format file PNG");
    }

    @Override
    public void saveFile() {
        System.out.println("save file as PNG format");
    }
}
