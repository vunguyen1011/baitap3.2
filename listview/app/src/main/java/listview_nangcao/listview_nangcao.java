    package listview_nangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listview.R;

import java.util.ArrayList;

    public class listview_nangcao extends AppCompatActivity {
    ListView lvcauthu;
    ArrayList<list>  cauthu;
    cauthuadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_nangcao);
        lvcauthu= findViewById(R.id.listview);
        cauthu=new ArrayList<>();
        cauthu.add(new list("Messi",33,R.drawable.messi));
        cauthu.add(new list("Neymar",31,R.drawable.neymar));
        cauthu.add(new list("Pele",66,R.drawable.pele));
        cauthu.add(new list("Ronaldo",36,R.drawable.ronaldo));
        cauthu.add(new list("Ronaldinho",48,R.drawable.ronaldinho));
        cauthu.add(new list("Suarez",39,R.drawable.suarez));
        cauthu.add(new list("Xavi",42,R.drawable.xavi));
        cauthu.add(new list("Gavi",20,R.drawable.gavi));
        adapter=new cauthuadapter(this,R.layout.listitem,cauthu);
        lvcauthu.setAdapter(adapter);


    }
}