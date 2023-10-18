package me.bnnq.labwork;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.labwork.models.Attraction;
import me.bnnq.labwork.utils.Views;

@WebServlet(name = "historyServlet", value = "/history")
public class HistoryServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String history = "Kryvyi Rih was founded as a military staging post by Zaporozhian Cossacks in 1775. It was a small village with only 2,184 inhabitants in 1781. The name of the city means \"crooked horn\" and refers to the shape of the nearby river.\n\nThe city's industrial development began in the late 19th century, when a French company started to exploit the rich iron-ore deposits in the region, known as Kryvbas. A railway was built to connect the mines with the ports of the Black Sea. The city attracted many foreign investors and workers, especially from Belgium, France, and Britain.\n\nThe city gained city status after the October Revolution in 1919. It became a major center of metallurgy and mining in the Soviet Union. In 1934, the largest integrated steel plant in the USSR, Kryvorizhstal, was built. The city suffered a brutal German occupation during World War II, but recovered after the war and continued to grow until the 1970s.\n\nThe collapse of the Soviet Union in 1991 brought economic and social challenges to the city. Many people left the city in search of better opportunities elsewhere. The privatization of Kryvorizhstal in 2005 sparked a controversy and a legal battle between different oligarchs. However, it also attracted more foreign and private investment, which helped finance urban regeneration and modernization projects.\n\nToday, Kryvyi Rih is the seventh-most populous city in Ukraine and the second largest by area. It is still an important industrial hub, producing about 70% of Ukraine's iron ore. It is also a cultural and educational center, with several universities, museums, theaters, and parks. It is claimed to be the longest city in Europe, stretching for about 120 km along the river valley.";
        var links = new ArrayList<String>();
        links.add("https://en.wikipedia.org/wiki/Kryvyi_Rih");
        links.add("https://www.britannica.com/place/Kryvyy-Rih");
        links.add("https://www.welcometoukraine.info/ukraine/krivoy-rog.html");

        var images = new String[] { "wwwroot/images/kryvyirih1.jpg", "wwwroot/images/kryvyirih2.jpg", "wwwroot/images/kryvyirih3.jpg" };
        request.setAttribute("cityName", "Kryvyi Rih");
        request.setAttribute("history", history);
        request.setAttribute("links", links);
        request.setAttribute("images", images);

        Views.get(getServletContext(), "history", request, response);
    }

    public void destroy()
    {

    }
}