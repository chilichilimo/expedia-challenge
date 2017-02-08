package com.expedia.www;

public class History {

    private String url;
    private String[] titles = {"title", "meta description", "meta keywords"};
    private static int TITLE = 0;
    private static int METADESC = 1;
    private static int METAKEYWORD = 2;
    private String[] oldValues;
    private String[] newValues;

    /*URL | TITLE | OLD VALUE | NEW VALUE
    */
    public History(String url, String[] oldValues) {
        this.url = url;
        this.oldValues = oldValues;
    }

    public void setTitle(String newTitle) {
        newValues[TITLE] = newTitle;
    }

    public void setMetaDesc(String newDesc) {
        newValues[METADESC] = newDesc;
    }

    public void setKeyword(String newKeyword) {
        newValues[METAKEYWORD] = newKeyword;
    }

    @Override
    public String toString() {
        return url + "\n|"
                + "\nTitle: " + oldValues[TITLE]
                + "\nMeta description: " + oldValues[METADESC]
                + "\nMeta keywords: " + oldValues[METAKEYWORD]
                + "\n|"
                + "\nTitle: " + newValues[TITLE]
                + "\nMeta description: " + newValues[METADESC]
                + "\nMeta keywords: " + newValues[METAKEYWORD];
    }
}
