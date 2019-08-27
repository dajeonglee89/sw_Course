package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 JavaFX - Application�� ��ӹ޾� ���α׷� ����.

 Stage(â, ������)
 - Scene(���, ȭ��)
  - ������Pane(��ġ������ ���� �����̳� / �гΰ�����~)
   - ��Ʈ��(�ؽ�Ʈ�ʵ�, üũ�ڽ�, ������ư ���� / �����κ��� �����Ҽ��ִ°�)

 */


public class Main extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {
			Label label = new Label("�̴����̴�������������");
			BorderPane borderPane = new BorderPane();
			borderPane.setCenter(label);
			
			Button btn = new Button("Ŭ��");
			borderPane.setBottom(btn);
			
			Scene scene = new Scene(borderPane, 320, 240);
			primaryStage.setScene(scene);
			primaryStage.show(); // hide()�� ������ â �����
	}


	public static void main(String[] args) {
		Application.launch(args);
		
		//lunch�޼ҵ�� ���������� �Ʒ� �ڵ带 ������
//		Stage stage = new Stage(); // ���� ������â�� ����
//		
//		
//		Main main = new Main();
//		main.start(stage); // ������â�� �����ؼ� start()�޼ҵ�
	}


}
