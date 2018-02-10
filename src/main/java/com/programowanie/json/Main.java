package com.programowanie.json;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.programowanie.json.model.Item;
import com.programowanie.json.model.Order;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Item item = new Item("mleko", "2", "TESCO");
        Item item1 = new Item("baton", "2", "TESCO");
        Item item2 = new Item("gruszki", "2", "TESCO");

        List<Item> itemList = Arrays.asList(item, item1, item2);

        Order order = new Order(itemList, 1);

        ObjectMapper mapper = new ObjectMapper();
        File filename = new File("order.json");
        filename.createNewFile();
        mapper.writeValue(filename,order);

    }
}
