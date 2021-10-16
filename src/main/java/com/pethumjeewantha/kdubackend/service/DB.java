package com.pethumjeewantha.kdubackend.service;

import com.pethumjeewantha.kdubackend.dto.dbDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB {

    private Connection connection;

    public DB(Connection connection) {
        this.connection = connection;
    }

    public List<dbDTO> getAllDetails() {
        List<dbDTO> details = new ArrayList<>();

        try {
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM db_details");

            while (rst.next()) {
                details.add(new dbDTO(
                        rst.getNString(1),
                        rst.getNString(2),
                        rst.getNString(3),
                        rst.getNString(4),
                        rst.getNString(5),
                        rst.getNString(6),
                        rst.getNString(7),
                        rst.getDate(8) == null ? null : rst.getDate(8).toLocalDate(),
                        rst.getDate(9) == null ? null : rst.getDate(8).toLocalDate(),
                        rst.getString(10),
                        rst.getString(11),
                        rst.getString(12),
                        rst.getString(13),
                        rst.getString(14),
                        rst.getString(15),
                        rst.getString(16),
                        rst.getString(17),
                        rst.getDate(18).toLocalDate(),
                        rst.getString(19),
                        rst.getString(20)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(details);
        return details;
    }
}
