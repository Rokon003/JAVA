package interfaces;

import java.lang.*;
import classes.*;

public interface FoodItemOperations
{
boolean insertFoodItem(FoodItem f);
boolean removeFoodItem(FoodItem f);
void showAllFoodItems( );
FoodItem searchFoodItem(String fid);
}