package switch_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.listview.MainActivity;
import com.example.listview.R;

public class switch_activity extends AppCompatActivity {
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        sw=(Switch)  findViewById(R.id.switch2);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    Toast.makeText(switch_activity.this,"ĐÃ Mở", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(switch_activity.this,"ĐÃ ĐÓNG",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}