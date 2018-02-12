package fr.polytech.ihm.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.awt.*;

public class DeclarationIncidentController extends Controllers {
    public static class ModificationDéclarationController extends Controllers {

        @FXML
        private Button annuler;

        @FXML
        private Button mettre;

        @FXML
        private AnchorPane anchorPane;

        @FXML
        public void handleAnnulerButton() {

            String fxmlFile = "/fxml/ApercuIncident.fxml";
            showScene(fxmlFile,anchorPane,"Aperçu incident");
        }

        @FXML
        public void handleMettreButton() {

            String fxmlFile = "/fxml/ConfirmationDeclarationIncident.fxml";
            showScene(fxmlFile,anchorPane,"Confirmation déclaration incident");

        }

    }
}
