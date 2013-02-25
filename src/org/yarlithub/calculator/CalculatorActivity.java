package org.yarlithub.calculator;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends Activity  implements OnClickListener{

	EditText Number1, Number2;
	Button Plus, Minus, Multiple, Divide;
	TextView Answer;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        
        Number1 = (EditText)findViewById(R.id.editText_No1); 
        Number2 = (EditText)findViewById(R.id.editText_No2); 
        Answer = (TextView) findViewById(R.id.editText_No3); 

	     Plus = (Button)findViewById(R.id.button_plus); 
	     Minus = (Button)findViewById(R.id.button_minus); 
	     Multiple = (Button)findViewById(R.id.button_multiple); 
	     Divide= (Button)findViewById(R.id.button_divide); 

	     Plus.setOnClickListener(this); 
	     Minus.setOnClickListener(this); 
	     Multiple.setOnClickListener(this); 
	     Divide.setOnClickListener(this); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_calculator, menu);
        return true;
    }
    
    public void onClick(View v) { 

	    Double No1 = Double.parseDouble(Number1.getText().toString()); 
	    Double No2 = Double.parseDouble(Number2.getText().toString()); 
	    switch (v.getId()) { 
	    case R.id.button_plus: 
	    	Answer.setText(Double.toString(No1+No2)); 
	    break; 
	    case R.id.button_minus: 
	    	Answer.setText(Double.toString(No1-No2)); 
	    break; 
	    case R.id.button_multiple: 
	    	Answer.setText(Double.toString(No1*No2)); 
	    break; 
	    case R.id.button_divide: 
	    	Answer.setText(Double.toString(No1/No2)); 
	    break; 
	    default: 
	    break; 
	   }
	}
}
