package Thigk2.HoQuangHiep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityChucNang3 extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<DiaDiem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        rv = findViewById(R.id.rvDiaDiem);
        rv.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();


        list.add(new DiaDiem(R.drawable.vinpearl, "Vinpearl Land", "Đảo Hòn Tre"));
        list.add(new DiaDiem(R.drawable.honchong, "Hòn Chồng", "Phạm Văn Đồng"));
        list.add(new DiaDiem(R.drawable.thapba, "Tháp Bà Ponagar", "2/4 Nha Trang"));
        list.add(new DiaDiem(R.drawable.vienhai, "Viện Hải Dương Học", "Cầu Đá"));
        list.add(new DiaDiem(R.drawable.baidai, "Bãi Dài", "Cam Lâm"));

        DiaDiemAdapter adapter = new DiaDiemAdapter(list);
        rv.setAdapter(adapter);
    }
}