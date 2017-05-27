package bruce.otherStuff;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InstanceStateDemo extends Activity {

	public static final String colorPrefsFile = "myColorPrefsFile";
	
	private TextView result;
	private EditText number1;
	private EditText number2;
	private TextView statusText;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String resultValue;
      
        result = (TextView)findViewById (R.id.result);     
        number1 = (EditText)findViewById(R.id.Number1);
        number2 = (EditText)findViewById(R.id.Number2);
        statusText = (TextView)findViewById(R.id.statusText);

        if (savedInstanceState == null)
        {
        	result.setText("0");
        	statusText.setText("Welcome To The Program!");
        }
        else
        {
        	result.setText(savedInstanceState.getString("RESULT_VALUE"));
        	statusText.setText("Welcome Back!");
        }
                              
        
        Button addButton = (Button) findViewById(R.id.addOperation);
        addButton.setOnClickListener(ResultClickListener);
        		
        }
    	
    
   
    
   // use the home button to get onStop to happen, don't cancel the emulator.
    @Override
    protected void onStop(){
       super.onStop();

    }
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
				result.setText("Error in calculation are both inputs numbers?");
				Log.e("OnClickListener","Invalid Numbers - " + number1.getText().toString() + 
							" - " + number2.getText().toString());
				

				
			}
		}
		
    		
	};
		// in Windows - press ctrl-F11 to change orientation
		@Override
		protected void onSaveInstanceState(Bundle outState) {
			// TODO Auto-generated method stub
			super.onSaveInstanceState(outState);
			outState.putString("RESULT_VALUE",result.getText().toString());

		}
    	
}

