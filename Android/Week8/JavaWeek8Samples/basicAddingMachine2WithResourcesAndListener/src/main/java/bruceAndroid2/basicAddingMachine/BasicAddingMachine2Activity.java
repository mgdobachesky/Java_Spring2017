package bruceAndroid2.basicAddingMachine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class BasicAddingMachine2Activity extends Activity {

	private TextView result;
	private Button addOperation;
	private EditText number1;
	private EditText number2;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      
        if (savedInstanceState == null)
        {
        }
        else
        {
        }
        
        result = (TextView)findViewById (R.id.result);
        addOperation = (Button)findViewById(R.id.addOperation);
        number1 = (EditText)findViewById(R.id.Number1);
        number2 = (EditText)findViewById(R.id.Number2);
        
        Button addButton = (Button) findViewById(R.id.addOperation);
       addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	String firstNumber = number1.getText().toString();            	            	
            	String secondNumber = number2.getText().toString();
            	
            	float resultText;
            	
            	resultText = Float.valueOf(firstNumber).floatValue() +
            			Float.valueOf(secondNumber).floatValue();
            	result.setText(Float.toString(resultText));
            	
            }
            
        });

        addButton.setOnClickListener(ResultClickListener);
        		
        }
    	/* public void ProcessNumbers(View view){
    		int test;
    		test = 15;
    	}
    */	
    	// Create an anonymous implementation of OnClickListener
		private OnClickListener ResultClickListener = new OnClickListener() {
			public void onClick(View v) {
    	String firstNumber = number1.getText().toString();
    	String secondNumber = number2.getText().toString();

    	float resultText;

    	resultText = Float.valueOf(firstNumber).floatValue() +
    			Float.valueOf(secondNumber).floatValue();
    	result.setText(Float.toString(resultText));
    }
		
};
    	
    	     }

