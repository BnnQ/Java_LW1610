package me.bnnq.labwork;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import me.bnnq.labwork.services.ServiceContainer;
import me.bnnq.labwork.utils.Views;

import java.io.IOException;

@WebServlet(name = "restaurantsServlet", value = "/restaurants")
public class RestaurantsServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        var restaurants = ServiceContainer.getRestaurantRepository().getAll();
        request.setAttribute("cityName", "Kryvyi Rih");
        request.setAttribute("restaurants", restaurants);

        Views.get(getServletContext(), "restaurants", request, response);
    }

    public void destroy()
    {

    }
}