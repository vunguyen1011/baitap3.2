package checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.listview.R;

public class checkbox extends AppCompatActivity {
    CheckBox box1,box2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        box1=(CheckBox) findViewById(R.id.checkBox4);

        box2=(CheckBox) findViewById(R.id.checkBox5);

        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(box1.isChecked()){
                        Toast.makeText(checkbox.this,"phương án 1",Toast.LENGTH_SHORT).show();
                    }
                    if(box2.isChecked()){
                        Toast.makeText(checkbox.this,"phương án 2",Toast.LENGTH_SHORT).show();

                    }
            }
        });
    }
}