package fr.polytech.ihm.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.DatePicker;

import java.lang.reflect.Type;
import java.util.Date;

public class Incident {

    private User user;
    private TypeIncident typeIncident;
    private StringProperty description;
    private DatePicker date;
    private Localisation localisation;
    private DegreImportance degreImportance;
    private StringProperty informationsComplementaires;

    public Incident(User user, TypeIncident typeIncident, String description, DatePicker date, Localisation localisation, DegreImportance degreImportance, String informationsComplementaires){
        this.user = user;
        this.typeIncident= typeIncident;
        this.description= new SimpleStringProperty(description);
        this.date= new DatePicker();
        this.localisation = localisation;
        this.degreImportance= degreImportance;
        this.informationsComplementaires= new SimpleStringProperty(informationsComplementaires);
    }

    public User getUser(){return this.user;}

    public TypeIncident getTypeIncident(){return typeIncident;}

    public String getDescription(){return description.get();}
    public StringProperty descriptionProperty(){return description;}

    public DatePicker getDatePicker(){return date;}
    public String getDateString(){return date.toString();}

    public DegreImportance getDegreImportance(){return this.degreImportance;}

    public String getInformationsComplementaires(){return informationsComplementaires.get();}
    public StringProperty informationsComplementairesProperty(){return informationsComplementaires;}



}
