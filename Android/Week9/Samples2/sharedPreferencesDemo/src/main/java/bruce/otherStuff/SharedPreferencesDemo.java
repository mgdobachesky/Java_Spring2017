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

public class SharedPreferencesDemo extends Activity {

	public static final String colorPrefsFile = "myColorPrefsFile";
	
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

        // Restore preferences
        SharedPreferences settings = getSharedPreferences(colorPrefsFile, 0);
        String finalResult = settings.getString("result", "0");
        result.setText(finalResult);
        
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
    
   
    
   // use the home button to get onStop to happen, don't cancel the emulator.
    @Override
    protected void onStop(){
       super.onStop();

      // We need an Editor object to make preference changes.
      // All objects are from android.context.Context
      SharedPreferences settings = getSharedPreferences(colorPrefsFile, MODE_PRIVATE);
      SharedPreferences.Editor editor = settings.edit();
      editor.putString("result",result.getText().toString());

      // Commit the edits!
      editor.commit();
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
    	
}

