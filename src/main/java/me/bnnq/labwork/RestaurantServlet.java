package me.bnnq.labwork;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import me.bnnq.labwork.models.Hotel;
import me.bnnq.labwork.models.Restaurant;
import me.bnnq.labwork.services.ServiceContainer;
import me.bnnq.labwork.utils.Views;

import java.io.IOException;

@WebServlet(name = "restaurantServlet", value = "/restaurant")
public class RestaurantServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        int id = Integer.parseInt(request.getParameter("id"));
        Restaurant restaurant = ServiceContainer.getRestaurantRepository().getById(id);
        request.setAttribute("restaurant", restaurant);

        Views.get(getServletContext(), "restaurant", request, response);
    }

    public void destroy()
    {

    }
}