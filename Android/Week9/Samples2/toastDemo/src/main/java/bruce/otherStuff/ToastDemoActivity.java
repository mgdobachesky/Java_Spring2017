package bruce.otherStuff;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ToastDemoActivity extends Activity {

	private TextView result;
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
        number1 = (EditText)findViewById(R.id.Number1);
        number2 = (EditText)findViewById(R.id.Number2);
        
        Button addButton = (Button) findViewById(R.id.addOperation);
/*        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	String firstNumber = number1.getText().toString();            	            	
            	String secondNumber = number2.getText().toString();
            	
            	float resultText;
            	
            	resultText = Float.valueOf(firstNumber).floatValue() * 
            			Float.valueOf(secondNumber).floatValue();
            	result.setText(Float.toString(resultText));
            	
            }
            
        });
  */
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
			try{
				String firstNumber = number1.getText().toString();
		    	String secondNumber = number2.getText().toString();
		
		    	float resultText;
		
		    	resultText = Float.valueOf(firstNumber).floatValue() +
		    			Float.valueOf(secondNumber).floatValue();
		    	result.setText(Float.toString(resultText));
			}
			catch(NumberFormatException e){				

				Toast.makeText(getApplicationContext(),"Error in number formatting", 
		                Toast.LENGTH_SHORT).show();
				
				Context context = getApplicationContext();
				CharSequence text = "My positioned toast message!";
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
				
				toast.show();
				//toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
				

			}
		}
		
    		
	};
    	
}

