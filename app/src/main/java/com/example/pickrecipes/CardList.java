package com.example.pickrecipes;

public class CardList {
    private String title;
    private String contents;
    private int listThumbnail;

    public CardList(String title, String contents, int listThumbnail) {
        this.title = title;
        this.contents = contents;
        this.listThumbnail = listThumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getListThumbnail() {
        return listThumbnail;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setListThumbnail(int listThumbnail) {
        this.listThumbnail = listThumbnail;
    }
}
