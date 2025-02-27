package model;

import java.util.ArrayList;

public class Research {
    private String title;
    private String journal;
    private String paperAbstract;
    private ArrayList<String> authors;
    public ArrayList<String> getAuthors() {
        return authors;
    }
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getJournal() {
        return journal;
    }
    public void setJournal(String journal) {
        this.journal = journal;
    }
    public String getPaperAbstract() {
        return paperAbstract;
    }
    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }

}
