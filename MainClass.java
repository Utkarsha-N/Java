package com.example.assignment4;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

public class MainClass extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentPercentageCalculator.fxml"));
        Scene scene = new Scene(loader.load(), 500, 400);
        primaryStage.setTitle("Student Percentage Calculator");
        primaryStage.setScene(scene);

        // Get the controller instance from the FXMLLoader
        StudentPercentageCalculatorController controller = loader.getController();
        // Perform any initialization or setup for the controller here, if needed.

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
{
}
