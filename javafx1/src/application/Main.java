package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 JavaFX - Application을 상속받아 프로그램 만듦.

 Stage(창, 윈도우)
 - Scene(장면, 화면)
  - 땡땡땡Pane(배치기준을 가진 컨테이너 / 패널같은거~)
   - 컨트롤(텍스트필드, 체크박스, 라디오버튼 등등등 / 눈으로보고 제어할수있는거)

 */


public class Main extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {
			Label label = new Label("이다정이다정다정다정이");
			BorderPane borderPane = new BorderPane();
			borderPane.setCenter(label);
			
			Button btn = new Button("클릭");
			borderPane.setBottom(btn);
			
			Scene scene = new Scene(borderPane, 320, 240);
			primaryStage.setScene(scene);
			primaryStage.show(); // hide()는 윈도우 창 숨기기
	}


	public static void main(String[] args) {
		Application.launch(args);
		
		//lunch메소드는 내부적으로 아래 코드를 수행함
//		Stage stage = new Stage(); // 최초 윈도우창을 생성
//		
//		
//		Main main = new Main();
//		main.start(stage); // 윈도우창을 전달해서 start()메소드
	}


}
