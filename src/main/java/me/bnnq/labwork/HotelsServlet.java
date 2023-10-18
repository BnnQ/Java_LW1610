package me.bnnq.labwork;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.labwork.models.Hotel;
import me.bnnq.labwork.services.ServiceContainer;
import me.bnnq.labwork.utils.Views;

@WebServlet(name = "hotelsServlet", value = "/hotels")
public class HotelsServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        var hotels = ServiceContainer.getHotelRepository().getAll();
        request.setAttribute("cityName", "Kryvyi Rih");
        request.setAttribute("hotels", hotels);

        Views.get(getServletContext(), "hotels", request, response);
    }

    public void destroy()
    {

    }
}