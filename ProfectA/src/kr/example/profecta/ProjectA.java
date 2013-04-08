package kr.example.profecta;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ProjectA extends Activity {
	
	Random r1 = new Random();
	
	int index = r1.nextInt(3);
	
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		tv = (TextView) findViewById(R.id.test_text_view1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.project, menu);
		return true;
	}
	
	public void myClickHandler(View v) {
		switch(v.getId()){
		case R.id.button1:
			tv.setText("가위를 내셨습니다.");
			if(index == 0){
				Toast.makeText(ProjectA.this, "가위를 내셨습니다. 이겼습니다.", Toast.LENGTH_SHORT).show();				
				return;
			} else if(index == 1) {
				Toast.makeText(ProjectA.this, "가위를 내셨습니다. 졌습니다.", Toast.LENGTH_SHORT).show();
				return;
			} else {
				Toast.makeText(ProjectA.this, "가위를 내셨습니다. 비겼습니다.", Toast.LENGTH_SHORT).show();
				return;
			}
			//break;
		case R.id.button2:
			tv.setText("바위를 내셨습니다.");
			if(index == 0){
				Toast.makeText(ProjectA.this, "바위 내셨습니다. 이겼습니다.", Toast.LENGTH_SHORT).show();				
				return;
			} else if(index == 1) {
				Toast.makeText(ProjectA.this, "바위 내셨습니다. 졌습니다.", Toast.LENGTH_SHORT).show();
				return;
			} else {
				Toast.makeText(ProjectA.this, "바위 내셨습니다. 비겼습니다.", Toast.LENGTH_SHORT).show();
				return;
			}
			//break;
		case R.id.button3:
			tv.setText("보를 내셨습니다.");
			if(index == 0){
				Toast.makeText(ProjectA.this, "보자기를 내셨습니다. 이겼습니다.", Toast.LENGTH_SHORT).show();				
				return;
			} else if(index == 1) {
				Toast.makeText(ProjectA.this, "보자기를 내셨습니다. 졌습니다.", Toast.LENGTH_SHORT).show();
				return;
			} else {
				Toast.makeText(ProjectA.this, "보자기를 내셨습니다. 비겼습니다.", Toast.LENGTH_SHORT).show();
				return;
			}
			//break;
		}
    }	

}
