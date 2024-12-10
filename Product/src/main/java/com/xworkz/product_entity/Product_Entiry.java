package com.xworkz.product_entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_info")
public class Product_Entiry {
@Id
    private int id;
@Column(name="fname")
    private String product_name;
@Column(name="c_no")
    private String Contact_number;


}
