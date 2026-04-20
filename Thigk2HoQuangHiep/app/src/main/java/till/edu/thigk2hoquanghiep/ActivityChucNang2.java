package Thigk2.HoQuangHiep;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityChucNang2 extends AppCompatActivity {

    ListView listTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        listTinh = findViewById(R.id.listTinh);


        String[] tinhThanh = {
                "Hà Nội",
                "TP Hồ Chí Minh",
                "Đà Nẵng",
                "Khánh Hòa",
                "Cần Thơ",
                "Hải Phòng",
                "Huế",
                "Bình Dương",
                "Đồng Nai",
                "Hồ Quang Hiệp"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                tinhThanh
        );

        listTinh.setAdapter(adapter);


        listTinh.setOnItemClickListener((parent, view, position, id) -> {
            String ten = tinhThanh[position];
            Toast.makeText(this, "Bạn chọn: " + ten, Toast.LENGTH_SHORT).show();
        });
    }
}