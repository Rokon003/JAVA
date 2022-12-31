package interfaces;

import java.lang.*;
import classes.*;

public interface RestaurantOperations
{
boolean insertRestaurant(Restaurant r);
boolean removeRestaurant(Restaurant r);
void showAllRestaurants( );
Restaurant searchRestaurant(String rid);
}