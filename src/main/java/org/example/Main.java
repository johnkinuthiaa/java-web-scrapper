package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String []args){
        String url ="https://books.toscrape.com/";

        try {
            Document connection = Jsoup.connect(url).get();
            Elements books = connection.select(".product_pod");
            System.out.println("=============BOOK SCRAPPER==============");
            System.out.println("Books-------------------------Price");
            for (Element bk : books) {
                String title = bk.select("h3>a").text();
                String price =bk.select(".price_color").text();

                System.out.println(title+"....."+price);

            }

        }catch (IOException e){
            e.getCause();
        }
    }
}