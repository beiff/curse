package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Piece {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "size")
    private String size;
    @Column(name = "price")
    private int price;
    @Column(name = "availability")
    private boolean availability;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "sex_id", referencedColumnName = "id")
    private Sex sexId;

    @ManyToOne
    @JoinColumn(name = "collection_id", referencedColumnName = "id")
    private Collection collectionId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Sex getSexId() {
        return sexId;
    }

    public void setSexId(Sex sexId) {
        this.sexId = sexId;
    }

    public Collection getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Collection collectionId) {
        this.collectionId = collectionId;
    }
}
