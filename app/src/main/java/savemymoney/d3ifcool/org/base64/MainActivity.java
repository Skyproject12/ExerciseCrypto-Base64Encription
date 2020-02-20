package savemymoney.d3ifcool.org.base64;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputOutput;
    Button buttonEncypt;
    Button buttonDecrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputName= findViewById(R.id.input_name);
        inputOutput= findViewById(R.id.input_output);
        buttonEncypt= findViewById(R.id.button_encrypt);
        buttonDecrypt= findViewById(R.id.button_decrypt);
        buttonEncypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                encrypt();
            }
        });
        buttonDecrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrypt();
            }
        });

    }

    public void encrypt(){
        byte [] base64Data = inputName.getText().toString().getBytes();
        String base64Str = "";
        try {
            base64Str = base64.encryptBASE64(base64Data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        inputOutput.setText(base64Str);
    }
    public void decrypt(){
        String base64Str = inputName.getText().toString();
        byte[] base64Byte = null;
        try {
            base64Byte= base64.decryptBASE64(base64Str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String output = new String(base64Byte);
        inputOutput.setText(output);
    }
}
