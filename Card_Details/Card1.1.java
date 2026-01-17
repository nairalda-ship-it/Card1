import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//
public class Card1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Card Details");

        // Create a VBox layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(10));

        // Card Number
        Label cardNumberLabel = new Label("Card Number:");
        TextField cardNumberField = new TextField();
        vbox.getChildren().addAll(cardNumberLabel, cardNumberField);

        // Expiration Date
        Label expirationDateLabel = new Label("Expiration Date (MM/YY):");
        TextField expirationDateField = new TextField();
        vbox.getChildren().addAll(expirationDateLabel, expirationDateField);

        // CVC
        Label cvcLabel = new Label("CVC:");
        TextField cvcField = new TextField();
        vbox.getChildren().addAll(cvcLabel, cvcField);

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String cardNumber = cardNumberField.getText();
            String expirationDate = expirationDateField.getText();
            String cvc = cvcField.getText();
            System.out.println("Card Number: " + cardNumber);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("CVC: " + cvc);
        });
        vbox.getChildren().add(submitButton);

        // Scene and Stage
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//Nairalda 