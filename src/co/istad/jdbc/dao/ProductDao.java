package co.istad.jdbc.dao;

import co.istad.jdbc.config.DbConfig;
import co.istad.jdbc.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements ProDao {

    private final Connection conn;

    public ProductDao() {
        conn = DbConfig.getInstance();
    }

    @Override
    public List<Product> findAll() {
        try {
            // Step 4: Create statement object
            Statement stmt = conn.createStatement();

            // Step 5: Start executing SQL Query
            final String sql = """
                    SELECT *
                    FROM products
                    """;

            // Step 6: Handle ResultSet
            ResultSet rs = stmt.executeQuery(sql);

            List<Product> products = new ArrayList<>();
            // Multiple rows
            while(rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setCode(rs.getString("code"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getBigDecimal("price"));
                product.setQty(rs.getInt("qty"));
                product.setDeleted(rs.getBoolean("is_deleted"));
                products.add(product);
            }

            return products;

        } catch (SQLException e) {
            System.out.println("SQL errored: " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(Integer id) {

    }

}