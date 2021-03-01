package com.visit.saltus.model;

import javax.persistence.*;

@Entity
@Table(name = "paths")
public class Paths
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "pathtitle")
    private String pathtitle;

    @Column(name = "pathplaces")
    private String pathplaces;

    @Column(name = "pathtime")
    private String pathtime;

    @Column(name = "pathlocation")
    private String pathlocation;

    @Column(name = "pathtype")
    private String pathtype;

    @Column(name = "pathimages")
    private String pathimages;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }


    public String getPathtitle()
    {
        return pathtitle;
    }

    public void setPathtitle(String pathtitle)
    {
        this.pathtitle = pathtitle;
    }

    public String getPathplaces()
    {
        return pathplaces;
    }

    public void setPathplaces(String pathplaces)
    {
        this.pathplaces = pathplaces;
    }

    public String getPathtime()
    {
        return pathtime;
    }

    public void setPathtime(String pathtime)
    {
        this.pathtime = pathtime;
    }

    public String getPathlocation()
    {
        return pathlocation;
    }

    public void setPathlocation(String pathlocation)
    {
        this.pathlocation = pathlocation;
    }

    public String getPathtype()
    {
        return pathtype;
    }

    public void setPathtype(String pathtype)
    {
        this.pathtype = pathtype;
    }

    public String getPathimages()
    {
        return pathimages;
    }

    public void setPathimages(String pathimages)
    {
        this.pathimages = pathimages;
    }
}