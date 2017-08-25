package schoolofnet.com.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String msg = "C Android -> ";
//    private EditText txtName;
//    private TextView lblText;
//    private Button btnDo;

    private EditText num1;
    private EditText num2;
    private Button btnSum;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.txt_num1);
        num2 = (EditText)findViewById(R.id.txt_num2);
        btnSum = (Button)findViewById(R.id.btnSum);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMult = (Button)findViewById(R.id.btnMult);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        lblResult = (TextView)findViewById(R.id.lbl_result);

        btnSum.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

//        txtName = (EditText)findViewById(R.id.txt_name);
//        lblText = (TextView)findViewById(R.id.lbl_text);
//        btnDo   = (Button)findViewById(R.id.btn_do);

// Java 8
//        btnDo.setOnClickListener(view -> {
//            if (txtName.getText() != null) {
//                lblText.setText("Hello " + txtName.getText());
//                Toast.makeText(this, "btnDo Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
// Java 7
//        btnDo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(msg, "Clicked from Listener event");
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart() method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume() method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop() method");
    }

    @Override
    protected  void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy() method");
    }

    @Override
    public void onClick(View view) {
        Double num1R = 0.0;
        Double num2R = 0.0;
        Double result = 0.0;

        num1R = Double.parseDouble(num1.getText().toString());
        num2R = Double.parseDouble(num2.getText().toString());

        switch(view.getId()) {
            case R.id.btnSum:
                result = num1R + num2R;
            break;
            case R.id.btnSub:
                result = num1R - num2R;
            break;
            case R.id.btnMult:
                result = num1R * num2R;
            break;
            case R.id.btnDiv:
                result = num1R / num2R;
            break;
        }

        lblResult.setText(result.toString());
    }
    //android:onClick="doAction"
//    public void doAction(View view) {
//        Log.d(msg, "Action doAction was called");
//    }
}
