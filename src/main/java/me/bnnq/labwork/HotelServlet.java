package me.bnnq.labwork;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.labwork.models.Hotel;
import me.bnnq.labwork.services.ServiceContainer;
import me.bnnq.labwork.utils.Views;

@WebServlet(name = "hotelServlet", value = "/hotel")
public class HotelServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        int id = Integer.parseInt(request.getParameter("id"));
        Hotel hotel = ServiceContainer.getHotelRepository().getById(id);
        request.setAttribute("hotel", hotel);

        Views.get(getServletContext(), "hotel", request, response);
    }

    public void destroy()
    {

    }
}