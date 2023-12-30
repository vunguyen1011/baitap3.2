package radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.listview.R;

public class radio_button extends AppCompatActivity {
    RadioGroup time;
    Button btn;
    RadioButton rb1,rb2,rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        time=(RadioGroup) findViewById(R.id.radio_gr);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        btn=findViewById(R.id.buton);
        time.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.rb1==checkedId){
                    Toast.makeText(radio_button.this,"bạn xác nhận chọn sáng",Toast.LENGTH_SHORT).show();
                } else if (R.id.rb2==checkedId) {
                    Toast.makeText(radio_button.this,"bạn xác nhận chọn trưa",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(radio_button.this,"bạn xác nhận chọn tối ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(radio_button.this,"đã xác nhận",Toast.LENGTH_SHORT).show();

            }
        });
    }
}