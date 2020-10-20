package com.mini_project.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="BOOK_TBL")
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String ISBN;
    private String title;
    private String author;
    private String borrower;
    private String issuedon;
    private String duedate;

    public int getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getIssuedon() {
        return issuedon;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setIssuedon(String issuedon) {
        this.issuedon = issuedon;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
}
