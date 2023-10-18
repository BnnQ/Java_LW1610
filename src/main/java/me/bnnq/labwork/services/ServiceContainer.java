package me.bnnq.labwork.services;

import me.bnnq.labwork.models.Hotel;
import me.bnnq.labwork.models.Restaurant;
import me.bnnq.labwork.services.abstractions.IRepository;

public class ServiceContainer
{
    private static IRepository<Hotel> hotelRepository;

    public static IRepository<Hotel> getHotelRepository()
    {
        if (hotelRepository == null)
        {
            hotelRepository = new HotelStubRepository();
        }

        return hotelRepository;
    }

    private static IRepository<Restaurant> restaurantRepository;

    public static IRepository<Restaurant> getRestaurantRepository()
    {
        if (restaurantRepository == null)
        {
            restaurantRepository = new RestaurantStubRepository();
        }

        return restaurantRepository;
    }

}
