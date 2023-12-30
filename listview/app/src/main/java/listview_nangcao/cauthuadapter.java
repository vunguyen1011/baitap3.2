package listview_nangcao;

import android.content.Context;
import android.media.Image;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;

import java.util.ArrayList;

public class cauthuadapter extends BaseAdapter {
    private Context context;//
    private int layout;// layout trả về kiểu int
    ArrayList<list> cauthu;
    @Override
    public int getCount() {// trả ve so dong trong listview
        return cauthu.size();
    }

    public cauthuadapter(Context context, int layout, ArrayList<list> cauthu) {
        this.context = context;
        this.layout = layout;
        this.cauthu = cauthu;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);// tạo 1 view cho mỗi item
        //ánh xạ view
        TextView txtTen=(TextView) convertView.findViewById(R.id.tencauthu);
        TextView txtTuoi=(TextView) convertView.findViewById(R.id.tuoi);
        ImageView hinhanh=(ImageView) convertView.findViewById(R.id.hinhcauthu);
        // gán giá trị
        list a=cauthu.get(position);
        txtTen.setText(a.getTen());

        txtTuoi.setText(a.getTuoi()+"");
        hinhanh.setImageResource(a.getImage());
        // trả lại view
        return convertView;
    }
}
