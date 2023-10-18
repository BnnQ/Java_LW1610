package me.bnnq.labwork.services;

import me.bnnq.labwork.models.Restaurant;
import me.bnnq.labwork.services.abstractions.IRepository;

import java.util.ArrayList;

public class RestaurantStubRepository implements IRepository<Restaurant>
{
    private final ArrayList<Restaurant> restaurants;

    public RestaurantStubRepository()
    {
        this.restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1, "Gastro Cafe", new String[]{"wwwroot/images/gastrocafe1.jpg", "wwwroot/images/gastrocafe2.jpg", "wwwroot/images/gastrocafe3.jpg"}, "This is a cozy and stylish cafe that serves European cuisine and cocktails. It has a rating of 4.5 out of 5 and 73 reviews.", "Gastro Cafe is a cozy and stylish cafe that offers a great place to enjoy European cuisine and cocktails. The cafe has a nice ambience and friendly staff, who are always ready to help you with your order. The menu features a variety of dishes, such as salads, soups, pasta, burgers, steaks, and desserts. You can also try their signature cocktails, such as the Gastro Mojito, the Gastro Margarita, or the Gastro Sangria. The cafe also hosts live music events and parties, where you can have fun and dance with your friends. Gastro Cafe is a great place to have a delicious meal and a good time in Kryvyi Rih.", "http://gastrocafe.com.ua/", "Dyshynskogo St. 11, Kryvyi Rih, Dnipropetrovsk Oblast, 50012", "0675601883"));
        restaurants.add(new Restaurant(2, "Garden Resto Bar", new String[]{"wwwroot/images/gardenrestobar1.jpg", "wwwroot/images/gardenrestobar2.jpg", "wwwroot/images/gardenrestobar3.jpg"}, "This is a modern and elegant bar that serves European cuisine and drinks. It has a rating of 4.5 out of 5 and 33 reviews.", "Garden Resto Bar is a modern and elegant bar that offers a relaxing and comfortable atmosphere to enjoy European cuisine and drinks. The bar has a spacious and stylish interior, with a large screen TV, a fireplace, and a terrace. The menu features a variety of dishes, such as pizza, sushi, salads, sandwiches, burgers, and seafood. You can also try their drinks, such as beer, wine, cocktails, or coffee. The bar also hosts karaoke nights and sports broadcasts, where you can have fun and cheer with your friends. Garden Resto Bar is a great place to have a tasty meal and a refreshing drink in Kryvyi Rih.", "http://gardenrestobar.com.ua/", "Metalurhiv Ave., 40a/1a (2nd floor), Kryvyi Rih", "+380675601883"));
        restaurants.add(new Restaurant(3, "Restaurant PRIRODA", new String[]{"wwwroot/images/restaurantpriroda1.jpg", "wwwroot/images/restaurantpriroda2.jpg", "wwwroot/images/restaurantpriroda3.jpg"}, "This is a cozy and rustic restaurant that serves European cuisine and barbecue. It has a rating of 4.5 out of 5 and 92 reviews.", "Restaurant PRIRODA is a cozy and rustic restaurant that offers a warm and welcoming atmosphere to enjoy European cuisine and barbecue. The restaurant has a wooden and stone interior, with a fireplace, a fountain, and a terrace. The menu features a variety of dishes, such as borscht, vareniki, pelmeni, golubtsi, and kholodets. You can also try their barbecue dishes, such as shashlik, kebab, or ribs. The restaurant also has a wine cellar, where you can taste different kinds of wine from around the world. Restaurant PRIRODA is a great place to have a hearty meal and a fine wine in Kryvyi Rih.", "http://restaurantpriroda.com.ua/", "Metalurhiv Ave., 40a/1a (2nd floor), Kryvyi Rih", "+380675601883"));
        restaurants.add(new Restaurant(4, "I Feel City Cafe", new String[]{"wwwroot/images/ifeelcitycafe1.jpg", "wwwroot/images/ifeelcitycafe2.jpg", "wwwroot/images/ifeelcitycafe3.jpg"}, "This is a trendy and colorful cafe that serves European cuisine and coffee. It has a rating of 4 out of 5 and 47 reviews.", "I Feel City Cafe is a trendy and colorful cafe that offers a lively and vibrant atmosphere to enjoy European cuisine and coffee. The cafe has a bright and cheerful interior, with graffiti walls, neon lights, and funky furniture. The menu features a variety of dishes, such as pancakes, waffles, sandwiches, salads, pasta, burgers, and wraps. You can also try their coffee drinks, such as espresso, cappuccino, latte, or frappe. The cafe also hosts art exhibitions and music events, where you can admire the works of local artists and listen to live music. I Feel City Cafe is a great place to have a delicious meal and a good coffee in Kryvyi Rih.", "http://ifeelcitycafe.com.ua/", "Metalurhiv Ave., 40a/1a (2nd floor), Kryvyi Rih", "+380675601883"));
        restaurants.add(new Restaurant(5, "Kopot i Baklazhan", new String[]{"wwwroot/images/kopotibaklazhan1.jpg", "wwwroot/images/kopotibaklazhan2.jpg", "wwwroot/images/kopotibaklazhan3.jpg"}, "This is a cozy and elegant restaurant that serves Eastern European cuisine and steak. It has a rating of 4 out of 5 and 80 reviews.", "Kopot i Baklazhan is a cozy and elegant restaurant that offers a sophisticated and refined atmosphere to enjoy Eastern European cuisine and steak. The restaurant has a classic and chic interior, with a fireplace, a piano, and a wine rack. The menu features a variety of dishes, such as borscht, vareniki, pelmeni, golubtsi, and kholodets. You can also try their steak dishes, such as ribeye, sirloin, or filet mignon. The restaurant also has a bar, where you can enjoy a drink and watch TV. Kopot i Baklazhan is a great place to have a fine meal and a classy drink in Kryvyi Rih.", "http://kopotibaklazhan.com.ua/", "Metalurhiv Ave., 40a/1a (2nd floor), Kryvyi Rih", "+380675601883"));
    }

    @Override
    public Restaurant[] getAll()
    {
        return restaurants.toArray(Restaurant[]::new);
    }

    @Override
    public Restaurant getById(int id)
    {
        return restaurants.stream().filter(restaurant -> restaurant.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void add(Restaurant item)
    {
        restaurants.add(item);
    }

    @Override
    public void update(Restaurant item)
    {
        Restaurant restaurant = getById(item.getId());
        if (restaurant != null)
        {
            restaurant.setName(item.getName());
            restaurant.setImages(item.getImages());
            restaurant.setShortDescription(item.getShortDescription());
            restaurant.setFullDescription(item.getFullDescription());
            restaurant.setLink(item.getLink());
            restaurant.setAddress(item.getAddress());
            restaurant.setPhoneNumber(item.getPhoneNumber());
        }
    }

    @Override
    public void delete(int id)
    {
        restaurants.removeIf(hotel -> hotel.getId() == id);
    }

    public void delete(Restaurant restaurant)
    {
        restaurants.remove(restaurant);
    }


}
