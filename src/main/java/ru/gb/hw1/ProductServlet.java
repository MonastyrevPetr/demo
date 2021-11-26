package ru.gb.hw1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Product[] product={
               new Product(1 , "item1" , 1000),
               new Product(2 , "item2" , 2000),
               new Product(3 , "item3" , 3000),
               new Product(4 , "item4" , 4000),
               new Product(5 , "item5" , 5000),
               new Product(6 , "item6" , 6000),
               new Product(7 , "item7" , 7000),
               new Product(8 , "item8" , 8000),
               new Product(9 , "item9" , 9000),
               new Product(10 , "item10" , 10000)
       };

        for (Product prod:product) {
            resp.getWriter().println(prod);
        }
    }
}
