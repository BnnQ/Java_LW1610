package me.bnnq.labwork;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.labwork.utils.Views;

@WebServlet(name = "cityInfoServlet", value = "/city-info")
public class CityInfoServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        request.setAttribute("cityName", "Kryvyi Rih");
        request.setAttribute("countryName", "Ukraine");
        request.setAttribute("pathToCoat", "wwwroot/images/coat.png");
        request.setAttribute("population", "603,904");
        request.setAttribute("description", "Kryvyi Rih is a city in central Ukraine. It hosts the administration of Kryvyi Rih Raion and its subordinate Kryvyi Rih urban hromada in Dnipropetrovsk Oblast. The city is part of the Kryvyi Rih Metropolitan Region. Its population is estimated at 603,904 (2022 estimate), making it the seventh-most populous city in Ukraine and the second largest by area. Kryvyi Rih is claimed to be the longest city in Europe.");

        Views.get(getServletContext(), "cityInfo", request, response);
    }

    public void destroy()
    {

    }
}