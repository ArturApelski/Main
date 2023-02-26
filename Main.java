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
        text.setText("Drzewko");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.DARKRED);

//        Line line = new Line();
//        line.setStartX(200);
//        line.setStartY(200);
//        line.setEndX(200);
//        line.setEndY(200);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.BURLYWOOD);
//        line.setOpacity(0.1);
//        line.setRotate(45);


//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(100);
//        rectangle.setY(100);
//        rectangle.setWidth(100);
//        rectangle.setHeight(100);
//        rectangle.setFill(Color.BLUE);
//        rectangle.setStrokeWidth(5);
//        rectangle.setStroke(Color.BLACK);

        Cylinder cylinder = new Cylinder();
        cylinder.setLayoutX(400);
        cylinder.setLayoutY(400);
        cylinder.setHeight(117);
        cylinder.setRadius(47);


        Rectangle rectangle1 = new Rectangle();
        rectangle1.setX(205);
        rectangle1.setY(300);
        rectangle1.setWidth(90);
        rectangle1.setHeight(270);
        rectangle1.setFill(Color.BURLYWOOD);
        rectangle1.setStrokeWidth(5);
        rectangle1.setStroke(Color.BURLYWOOD);



        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(250.0, 225.0, 300.0, 300.0, 200.0, 300.0);
        triangle.setFill(Color.FIREBRICK);

        Circle circle = new Circle();
        circle.setCenterX(347);
        circle.setCenterY(300);
        circle.setRadius(100);
        circle.setFill(Color.CHARTREUSE);

        Circle circle1 = new Circle();
        circle1.setCenterX(153);
        circle1.setCenterY(300);
        circle1.setRadius(100);
        circle1.setFill(Color.CHARTREUSE);

        Circle circle2 = new Circle();
        circle2.setCenterX(250);
        circle2.setCenterY(180);
        circle2.setRadius(100);
        circle2.setFill(Color.CHARTREUSE);

        Line line = new Line();
        line.setStartX(170);
        line.setStartY(250);
        line.setEndX(250);
        line.setEndY(270);
        line.setStrokeWidth(5);
        line.setStroke(Color.BURLYWOOD);
        line.setOpacity(1);
        line.setRotate(45);


        Line line2 = new Line();
        line2.setStartX(320);
        line2.setStartY(350);
        line2.setEndX(300);
        line2.setEndY(270);
        line2.setStrokeWidth(5);
        line2.setStroke(Color.BURLYWOOD);
        line2.setOpacity(1);
        line2.setRotate(45);

        Line line3 = new Line();
        line3.setStartX(280);
        line3.setStartY(300);
        line3.setEndX(250);
        line3.setEndY(270);
        line3.setStrokeWidth(5);
        line3.setStroke(Color.BURLYWOOD);
        line3.setRotate(45);

        Image image = new Image("facebook.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(100);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        Rectangle trawa = new Rectangle();
        trawa.setX(0);
        trawa.setY(570);
        trawa.setWidth(600);
        trawa.setHeight(50);
        trawa.setFill(Color.SPRINGGREEN);
        trawa.setStrokeWidth(5);
        trawa.setStroke(Color.FORESTGREEN);

        Circle jablko = new Circle();
        jablko.setCenterX(200);
        jablko.setCenterY(250);
        jablko.setRadius(20);
        jablko.setFill(Color.ORANGERED);

        Circle jablko2 = new Circle();
        jablko2.setCenterX(300);
        jablko2.setCenterY(200);
        jablko2.setRadius(20);
        jablko2.setFill(Color.ORANGERED);


        root.getChildren().add(text);
//        root.getChildren().add(cylinder);
        root.getChildren().add(rectangle1);
//        root.getChildren().add(triangle);
        root.getChildren().add(trawa);
        root.getChildren().add(circle);
        root.getChildren().add(circle1);
        root.getChildren().add(circle2);
        root.getChildren().add(line);
        root.getChildren().add(line2);
        root.getChildren().add(line3);
        root.getChildren().add(jablko);
        root.getChildren().add(jablko2);
//        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();


    }
}
