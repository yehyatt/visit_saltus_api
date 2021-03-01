package com.visit.saltus.model;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Locations
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "categoryid")
    private long categoryid;

    @Column(name = "locationtitle")
    private String locationtitle;

    @Column(name = "locationdescription")
    private String locationdescription;

    @Column(name = "locationimage")
    private String locationimage;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getCategoryid()
    {
        return categoryid;
    }

    public void setCategoryid(long categoryid)
    {
        this.categoryid = categoryid;
    }

    public String getLocationtitle()
    {
        return locationtitle;
    }

    public void setLocationtitle(String locationtitle)
    {
        this.locationtitle = locationtitle;
    }

    public String getLocationdescription()
    {
        return locationdescription;
    }

    public void setLocationdescription(String locationdescription)
    {
        this.locationdescription = locationdescription;
    }

    public String getLocationimage()
    {
        return locationimage;
    }

    public void setLocationimage(String locationimage)
    {
        this.locationimage = locationimage;
    }
}