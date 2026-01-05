package co.istad.jdbc.view;


import co.istad.jdbc.model.Product;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.awt.*;
import java.util.List;

public class ViewUtil {
    public static void printAppMenu() {
        System.out.println("Welcome to JDBC System");
        System.out.println("--------------");
        System.out.println("""
                1. List Articles
                2. Add Article
                3. Update Article
                4. Delete Article
                5. Exit
                """);
    }
    public static void table(Product items) {
        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("PRICE");
        table.addCell("QTY");
        table.addCell("IS_DELETED");

        table.addCell(String.valueOf(items.getId()));
        table.addCell(items.getCode());
        table.addCell(items.getName());
        table.addCell(items.getPrice().toString());
        table.addCell(String.valueOf(items.getQuantity()));
        table.addCell(String.valueOf(items.getIsDeleted()));

        print(table.render(), true);
    }


    public static void table(List<Product> itemsList) {
        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("PRICE");
        table.addCell("QTY");
        table.addCell("IS_DELETED");

        for (Product items : itemsList) {
            table.addCell(String.valueOf(items.getId()));
            table.addCell(items.getCode());
            table.addCell(items.getName());
            table.addCell(items.getPrice().toString());
            table.addCell(String.valueOf(items.getQuantity()));
            table.addCell(String.valueOf(items.getIsDeleted()));
        }

        print(table.render(), true);
    }

    public static void print(String text, boolean b){
        System.out.println(text);
    }
}