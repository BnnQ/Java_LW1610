package me.bnnq.labwork.models;

public class Restaurant
{
    private int id;
    private String name;
    private String[] images;
    private String shortDescription;
    private String fullDescription;
    private String link;
    private String address;
    private String phone;

    public Restaurant(int id, String name, String[] images, String shortDescription, String fullDescription, String link, String address, String phone)
    {
        this.id = id;
        this.name = name;
        this.images = images;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.link = link;
        this.address = address;
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public String[] getImages()
    {
        return images;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getFullDescription()
    {
        return fullDescription;
    }

    public String getLink()
    {
        return link;
    }

    public String getAddress()
    {
        return address;
    }
    public String getPhoneNumber()
    {
        return phone;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setImages(String[] images)
    {
        this.images = images;
    }

    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public void setFullDescription(String fullDescription)
    {
        this.fullDescription = fullDescription;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhoneNumber(String phone)
    {
        this.phone = phone;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
