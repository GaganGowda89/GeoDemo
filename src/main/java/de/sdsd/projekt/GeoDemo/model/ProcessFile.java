package de.sdsd.projekt.GeoDemo.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ProcessFile {

    private String fileName;
    private String status;
    private Timestamp createdAt;
    private Timestamp completedAt;

}
