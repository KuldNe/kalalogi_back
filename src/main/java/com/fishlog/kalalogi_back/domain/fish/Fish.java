package com.fishlog.kalalogi_back.domain.fish;

import com.fishlog.kalalogi_back.domain.catches.Acatch;
import com.fishlog.kalalogi_back.domain.species.Species;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "fish")
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "length", nullable = false)
    private Integer length;

    @NotNull
    @Column(name = "weight", nullable = false)
    private Integer weight;

    @NotNull
    @Column(name = "released", nullable = false)
    private Boolean released = false;

    @Size(max = 1000)
    @Column(name = "comment", length = 1000)
    private String comment;

    @NotNull
    @Column(name = "public", nullable = false)
    private Boolean publicField = false;

    @Column(name = "picture")
    private byte[] picture;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "acatch_id", nullable = false)
    private Acatch acatch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getReleased() {
        return released;
    }

    public void setReleased(Boolean released) {
        this.released = released;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getPublicField() {
        return publicField;
    }

    public void setPublicField(Boolean publicField) {
        this.publicField = publicField;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Acatch getAcatch() {
        return acatch;
    }

    public void setAcatch(Acatch acatch) {
        this.acatch = acatch;
    }

}