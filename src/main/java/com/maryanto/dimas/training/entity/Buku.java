package com.maryanto.dimas.training.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Buku {

    @Id
    private String id;
    private String isbn;
    private String judul;
    private String namaPengarang;
    private Integer tahunTerbit;
    private String namaPenerbit;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp lastUpdateDate;
    private String lastUpdateBy;
}
