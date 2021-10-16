package com.pethumjeewantha.kdubackend.api;

import com.pethumjeewantha.kdubackend.dto.dbDTO;
import com.pethumjeewantha.kdubackend.service.DB;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/db")
public class dbServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kdu_db", "root", "mysql");
            DB dbService = new DB(connection);
            List<dbDTO> details = dbService.getAllDetails();
            response.getWriter().println(JsonbBuilder.create().toJson(details));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}