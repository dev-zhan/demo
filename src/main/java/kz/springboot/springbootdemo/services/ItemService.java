package kz.springboot.springbootdemo.services;

import kz.springboot.springbootdemo.entities.Categories;
import kz.springboot.springbootdemo.entities.Countries;
import kz.springboot.springbootdemo.entities.ShopItems;

import java.util.List;

public interface ItemService {
    ShopItems addItem(ShopItems items);
    List<ShopItems> getALLItems();
    ShopItems getItem(Long id);
    void deleteItem(ShopItems item);
    ShopItems saveItem(ShopItems item);

    List<Countries> getAllCountries();
    Countries addCountry(Countries country);
    Countries saveCountry(Countries country);
    Countries getCountry(Long id);

    List<Categories> getAllCategories();
    Categories getCategory(Long id);
    Categories saveCategory(Categories category);
    Categories addCategory(Categories category);

}
