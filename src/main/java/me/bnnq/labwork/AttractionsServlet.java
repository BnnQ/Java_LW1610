package me.bnnq.labwork;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.labwork.models.Attraction;
import me.bnnq.labwork.utils.Views;

@WebServlet(name = "attractionsServlet", value = "/attractions")
public class AttractionsServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Fedor Mershavtsev Park", "wwwroot/images/park.jpg", "It is one of the oldest parks in the city and a monument of landscape art. It is named after Fedor Mershavtsev, a nobleman and a participant in the Crimean War, who founded the park in the 19th century. The park has a variety of trees, flowers, ponds, and sculptures.", "https://uk.wikipedia.org/wiki/%D0%9F%D0%B0%D1%80%D0%BA_%D1%96%D0%BC%D0%B5%D0%BD%D1%96_%D0%A4%D0%B5%D0%B4%D0%BE%D1%80%D0%B0_%D0%9C%D0%B5%D1%80%D1%88%D0%B0%D0%B2%D1%86%D0%B5%D0%B2%D0%B0"));
        attractions.add(new Attraction("Kryvyi Rih Botanical Garden", "wwwroot/images/botsad.jpg", "It was founded in 1971 and belongs to the National Academy of Sciences of Ukraine. It has a collection of over 4,000 plant species, including rare and endangered ones. It also has a cactus greenhouse, a rose garden, and a pond.", "https://ru.wikipedia.org/wiki/%D0%9A%D1%80%D0%B8%D0%B2%D0%BE%D1%80%D0%BE%D0%B6%D1%81%D0%BA%D0%B8%D0%B9_%D0%B1%D0%BE%D1%82%D0%B0%D0%BD%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D1%81%D0%B0%D0%B4"));
        attractions.add(new Attraction("Metrotram", "wwwroot/images/metrotram.jpg", "Metrotram is a light rail system that runs partly underground and partly on the surface. It connects different parts of the city of Kryvyi Rih, the seventh-largest city in Ukraine. It was opened in 1986 and has 11 stations, with one more unfinished.", "https://uk.wikipedia.org/wiki/%D0%9A%D1%80%D0%B8%D0%B2%D0%BE%D1%80%D1%96%D0%B7%D1%8C%D0%BA%D0%B8%D0%B9_%D1%88%D0%B2%D0%B8%D0%B4%D0%BA%D1%96%D1%81%D0%BD%D0%B8%D0%B9_%D1%82%D1%80%D0%B0%D0%BC%D0%B2%D0%B0%D0%B9"));
        attractions.add(new Attraction("Musical Fountain", "wwwroot/images/musicalFountain.jpg", "Musical fountain is a fountain that plays music and lights up in different colors at the 44th quarter of the city. It was built in 2012 as part of the city’s beautification project. It is a popular attraction, especially at night, when it creates a spectacular show of water and sound.", "https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%86%D0%B3%D0%BE%D1%80%D0%BE%D0%B4_(%D0%9A%D1%80%D0%B8%D0%B2%D0%BE%D0%B9_%D0%A0%D0%BE%D0%B3)"));
        request.setAttribute("cityName", "Kryvyi Rih");
        request.setAttribute("attractions", attractions);

        Views.get(getServletContext(), "attractions", request, response);
    }

    public void destroy()
    {

    }
}