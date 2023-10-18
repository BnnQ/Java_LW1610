package me.bnnq.labwork.services;

import me.bnnq.labwork.models.Hotel;
import me.bnnq.labwork.services.abstractions.IRepository;

import java.util.ArrayList;

public class HotelStubRepository implements IRepository<Hotel>
{
    private final ArrayList<Hotel> hotels;

    public HotelStubRepository()
    {
        this.hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "Park House", new String[]{"wwwroot/images/parkhouse1.jpg", "wwwroot/images/parkhouse2.jpg", "wwwroot/images/parkhouse3.jpg", "wwwroot/images/parkhouse4.jpg"}, "This is a modern hotel surrounded by parkland, about 1 km from Saksagan River. It has an exotic winter garden, a spa center with an indoor pool, a restaurant, and free Wi-Fi. It has a rating of 9.5 out of 10 and 1,003 reviews.", "Kryvyi Rih Park Hotel is a modern and elegant hotel that offers a peaceful and comfortable stay in the city of Kryvyi Rih. The hotel is surrounded by green parkland and situated near the Saksagan River, which adds to its charm and beauty. The hotel has a spa center with an indoor swimming pool, where you can relax and rejuvenate your body and mind. You can also enjoy the winter garden with exotic plants, which creates a cozy and pleasant atmosphere. The hotel has a restaurant that serves delicious dishes of traditional Ukrainian and European cuisine, as well as a bar where you can have a drink and socialize. The rooms are spacious and stylish, with air conditioning, cable TV, and a mini-bar. They also have private bathrooms with free toiletries and hairdryers. The hotel provides room service, free parking, and a terrace, where you can admire the view of the park and the river. Kryvyi Rih Park Hotel is a great choice for travelers who want to experience the culture and history of Kryvyi Rih, as well as enjoy the nature and tranquility of the area.", "http://www.parkhouse.net.ua/", "Dyshynskogo St. 11, Kryvyi Rih, Dnipropetrovsk Oblast, 50012", "0675601883"));
        hotels.add(new Hotel(2, "Reikartz Aurora", new String[]{"wwwroot/images/aurora1.jpg", "wwwroot/images/aurora2.jpg", "wwwroot/images/aurora3.jpg", "wwwroot/images/aurora4.jpg"}, "This is a business hotel located in the central area of the city, on Metalurhiv Avenue. It has a unique atrium design, free Wi-Fi, a restaurant, and a spa-fitness center. It has a rating of 8.3 out of 10 and 370 reviews.", "Reikartz Aurora Kryvyi Rih is a business hotel that offers a high-quality and comfortable stay in the city of Kryvyi Rih. The hotel is located on the main Metalurgiv Avenue, in the central area of the city, close to many attractions and facilities. The hotel has a unique design as an atrium building, which gives it a spacious and elegant look. The hotel has 70 modern and functional rooms of different categories, with air conditioning, flat-screen TV, mini-bar, and private bathrooms. Some rooms also have shared bathrooms. The hotel has a restaurant that serves delicious Ukrainian and European dishes, as well as a bar where you can enjoy a drink and watch TV. The hotel also has a spa center with an indoor swimming pool, where you can relax and pamper yourself. The hotel has three conference rooms and a meeting room, where you can hold business meetings and events. The hotel also provides free Wi-Fi, free parking, room service, baggage storage, and facilities for disabled guests. Reikartz Aurora Kryvyi Rih is a great choice for travelers who want to experience the culture and history of Kryvyi Rih, as well as enjoy the convenience and comfort of a modern business hotel.", "https://optimahotels.com.ua/uk/hotels/aurora-kryvyi-rih/photos/", "Metalurhiv Ave., 40, Kryvyi Rih, Dnipropetrovsk Oblast, 50027", "0564040808"));
        hotels.add(new Hotel(3, "Druzhba Hotel", new String[]{"wwwroot/images/druzhba1.jpg", "wwwroot/images/druzhba2.jpg", "wwwroot/images/druzhba3.jpg", "wwwroot/images/druzhba4.jpg"}, "This hotel features free Wi-Fi, sports fields, a hair salon, and air-conditioned rooms with flat-screen cable TV. It is 10 minutes' drive from Krivoy Rog-Glavnij Train Station. It has a rating of 8.5 out of 10 and 722 reviews.", "Druzhba Hotel is a business hotel that offers a convenient and comfortable stay in the city of Kryvyi Rih. The hotel is located in the business center of the city, near the most convenient road interchange, close to the bus and train stations. This makes it easy to access the main attractions and facilities of the city, which is known as the longest city of Europe. The hotel has 70 modern and functional rooms of different categories, with air conditioning, flat-screen cable TV, mini-bar, and private bathrooms. Some rooms also have shared bathrooms. The hotel has a unique design as an atrium building, which gives it a spacious and elegant look. The hotel has a restaurant that serves delicious Ukrainian and European dishes, as well as a bar where you can enjoy a drink and watch TV. The hotel also has a spa center with an indoor swimming pool, where you can relax and pamper yourself. The hotel has three conference rooms and a meeting room, where you can hold business meetings and events. The hotel also provides free Wi-Fi, free parking, room service, baggage storage, and facilities for disabled guests. Druzhba Hotel is a great choice for travelers who want to experience the culture and history of Kryvyi Rih, as well as enjoy the convenience and comfort of a modern business hotel.", "https://druzhba-hotel.com.ua/", "Televisionnaya St. 12, Kryvyi Rih, Dnipropetrovsk Oblast, 50086", "0564098220"));
        hotels.add(new Hotel(4, "Raziotel Kryvyi Rih", new String[]{"wwwroot/images/raziotel1.jpg", "wwwroot/images/raziotel2.jpg", "wwwroot/images/raziotel3.jpg", "wwwroot/images/raziotel4.jpg"}, "This hotel is a 10-minute drive from Krivoy Rog City Center and a 15-minute walk from Krivoy Rog-Glavnij Train Station. It offers soundproofed rooms with free Wi-Fi and flat-screen TV. It has a rating of 8.7 out of 10 and 300 reviews.", "Raziotel Kryvyi Rih is a business hotel that offers a comfortable and convenient stay in the city of Kryvyi Rih. The hotel has 47 modern and soundproofed rooms of different categories, with air conditioning, flat-screen TV, mini-bar, and private bathrooms. Some rooms also have shared bathrooms. The hotel has a restaurant that serves continental breakfast and tasty dishes of Ukrainian and European cuisine, as well as a bar where you can have a drink and watch TV. The hotel also has a conference hall for 85 seats, where you can hold business meetings and events. The hotel provides free Wi-Fi, free parking, room service, baggage storage, and facilities for disabled guests. Raziotel Kryvyi Rih is a great choice for travelers who want to enjoy the culture and history of Kryvyi Rih, as well as the comfort and convenience of a modern business hotel.", "https://raziotel.com/uk/hotels/raziotel-kryvyi-rih/", "Magistralna street 8, Kryvyi Rih, Dnipropetrovsk Oblast, 50055", "0564048008"));
        hotels.add(new Hotel(5, "Centralny Hotel", new String[]{"wwwroot/images/centralny1.jpg", "wwwroot/images/centralny2.jpg", "wwwroot/images/centralny3.jpg", "wwwroot/images/centralny4.jpg"}, "This hotel features free Wi-Fi, a bar, and free private parking. It is located in Krivoy Rog on Musorgskogo Street. It has a rating of 8.2 out of 10 and 281 reviews.", "Centralny Hotel is a business hotel that offers a comfortable and convenient stay in the city of Kryvyi Rih. The hotel is located near the Saksagan River, in a green parkland area, close to the city center and the train station. The hotel has a unique design as an atrium building, which gives it a spacious and elegant look. The hotel has 70 modern and air-conditioned rooms of different categories, with satellite TV, mini-bar, and private bathrooms. Some rooms also have shared bathrooms. The hotel has a restaurant that serves full English/Irish or American breakfast and tasty dishes of Ukrainian and European cuisine, as well as a bar where you can enjoy a drink and watch TV. The hotel also has a spa center with an indoor swimming pool, where you can relax and pamper yourself. The hotel has three conference rooms and a meeting room, where you can hold business meetings and events. The hotel provides free Wi-Fi, free parking, room service, baggage storage, and facilities for disabled guests. Centralny Hotel is a great choice for travelers who want to enjoy the culture and history of Kryvyi Rih, as well as the comfort and convenience of a modern business hotel.", "https://centrhotel.com.ua/", "Musorgskogo Street, 16, Kryvyi Rih, Dnipropetrovsk Oblast, 50053", "0979842575"));
    }

    @Override
    public Hotel[] getAll()
    {
        return hotels.toArray(Hotel[]::new);
    }

    @Override
    public Hotel getById(int id)
    {
        return hotels.stream().filter(hotel -> hotel.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void add(Hotel item)
    {
        hotels.add(item);
    }

    @Override
    public void update(Hotel item)
    {
        Hotel hotel = getById(item.getId());
        if (hotel != null)
        {
            hotel.setName(item.getName());
            hotel.setImages(item.getImages());
            hotel.setShortDescription(item.getShortDescription());
            hotel.setFullDescription(item.getFullDescription());
            hotel.setLink(item.getLink());
            hotel.setAddress(item.getAddress());
            hotel.setPhoneNumber(item.getPhoneNumber());
        }
    }

    @Override
    public void delete(int id)
    {
        hotels.removeIf(hotel -> hotel.getId() == id);
    }

    public void delete(Hotel hotel)
    {
        hotels.remove(hotel);
    }


}
