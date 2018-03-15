package com.example.wiki.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "wiki_data")
public class Wiki implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "WorkstationID")
    protected String workstationID;

    @Column(name = "RetailStoreID")
    private String retailStoreID;

    @Column(name = "EndDateTime")
    private Date endDateTime;

    @Column(name = "CurrencyCode")
    private String currencyCode;

    @Column(name = "BusinessDayDate")
    private String businessDayDate;


    public Wiki() {
    }

    public Wiki(long id, String workstationID, String retailStoreID, Date endDateTime, String currencyCode, String businessDayDate) {
        this.id = id;
        this.workstationID = workstationID;
        this.retailStoreID = retailStoreID;
        this.endDateTime = endDateTime;
        this.currencyCode = currencyCode;
        this.businessDayDate = businessDayDate;
    }

    @Override
    public String toString() {
        return String.format("WIKI [id=%d, workstationID='%s', endDateTime='%s']", id, workstationID, endDateTime);
    }

}
