package com.visit.saltus.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "categorytitle")
    private String categorytitle;

    @Column(name = "categoryimage")
    private String categoryimage;


    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getCategorytitle()
    {
        return categorytitle;
    }

    public void setCategorytitle(String categorytitle)
    {
        this.categorytitle = categorytitle;
    }

    public String getCategoryimage()
    {
        return categoryimage;
    }

    public void setCategoryimage(String categoryimage)
    {
        this.categoryimage = categoryimage;
    }
}