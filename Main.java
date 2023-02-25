package aplikacja;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Cylinder;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE); // szerokość, wysokość
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Dzieło Sztuki");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.DARKRED);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.1);
        line.setRotate(45);


//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(100);
//        rectangle.setY(100);
//        rectangle.setWidth(100);
//        rectangle.setHeight(100);
//        rectangle.setFill(Color.BLUE);
//        rectangle.setStrokeWidth(5);
//        rectangle.setStroke(Color.BLACK);

        Cylinder cylinder = new Cylinder();
        cylinder.setLayoutX(470);
        cylinder.setLayoutY(120);
        cylinder.setHeight(100);
        cylinder.setRadius(100);


        Rectangle rectangle1 = new Rectangle();
        rectangle1.setX(80);
        rectangle1.setY(80);
        rectangle1.setWidth(100);
        rectangle1.setHeight(100);
        rectangle1.setFill(Color.PINK);
        rectangle1.setStrokeWidth(5);
        rectangle1.setStroke(Color.SANDYBROWN);



        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        Line line1 = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(100);
        line.setStrokeWidth(10);
        line.setStroke(Color.ANTIQUEWHITE);
        line.setOpacity(1);
        line.setRotate(45);

        Image image = new Image("facebook.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(line1);
        root.getChildren().add(cylinder);
        root.getChildren().add(rectangle1);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();


    }
}
