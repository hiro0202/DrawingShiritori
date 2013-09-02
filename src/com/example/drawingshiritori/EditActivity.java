package com.example.drawingshiritori;

import com.example.pictureshiritori.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EditActivity extends Activity
implements OnClickListener
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit);

		Button button = (Button)findViewById(R.id.left_column_edit_exit_button);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		switch(view.getId())
		{
		case R.id.left_column_edit_exit_button:
		{
			Intent intent = new Intent(EditActivity.this, ResultActivity.class);
			startActivity(intent);
		}
		break;
		case R.id.left_column_edit_next_button:
		{

		}
		break;
		}
	}
}
