package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML //FXML파일에서 ID속성값이랑 일치된 필드를 찾아서 객체
	private TextField id;
	
	@FXML
	private PasswordField pw;
	
	@FXML
	private Label lblResult;
	
	
	public void onLoginClicked() {
		String strId = id.getText();
		String strPw = pw.getText();
		System.out.println("로그인버튼 눌려짐");
		System.out.println(strId + " : " + strPw);
		
		lblResult.setText(strId + " : " + strPw); 
		
	}
	
	
	
	public void onCancelClicked(ActionEvent event){
		System.out.println("취소버튼이 눌려짐");
	}
	
	
}
