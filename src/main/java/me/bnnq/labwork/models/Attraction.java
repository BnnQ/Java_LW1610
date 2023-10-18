package me.bnnq.labwork.models;

public class Attraction
{
    private String name;
    private String pathToImage;
    private String description;
    private String linkToDetails;

    public Attraction(String name, String pathToImage, String description, String linkToDetails)
    {
        this.name = name;
        this.pathToImage = pathToImage;
        this.description = description;
        this.linkToDetails = linkToDetails;
    }

    public String getName()
    {
        return name;
    }

    public String getPathToImage()
    {
        return pathToImage;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPathToImage(String pathToImage)
    {
        this.pathToImage = pathToImage;
    }

    public String getDescription()
    {
        return description;
    }

    public String getLinkToDetails()
    {
        return linkToDetails;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setLinkToDetails(String linkToDetails)
    {
        this.linkToDetails = linkToDetails;
    }

}
