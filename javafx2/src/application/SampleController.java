package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML //FXML���Ͽ��� ID�Ӽ����̶� ��ġ�� �ʵ带 ã�Ƽ� ��ü
	private TextField id;
	
	@FXML
	private PasswordField pw;
	
	@FXML
	private Label lblResult;
	
	
	public void onLoginClicked() {
		String strId = id.getText();
		String strPw = pw.getText();
		System.out.println("�α��ι�ư ������");
		System.out.println(strId + " : " + strPw);
		
		lblResult.setText(strId + " : " + strPw); 
		
	}
	
	
	
	public void onCancelClicked(ActionEvent event){
		System.out.println("��ҹ�ư�� ������");
	}
	
	
}
