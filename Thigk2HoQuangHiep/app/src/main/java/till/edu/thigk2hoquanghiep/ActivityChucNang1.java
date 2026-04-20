package Thigk2.HoQuangHiep;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1Activity extends AppCompatActivity {

    EditText edtDai, edtRong;
    Button btnTinh;
    TextView txtKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang1);

        edtDai = findViewById(R.id.edtDai);
        edtRong = findViewById(R.id.edtRong);
        btnTinh = findViewById(R.id.btnTinh);
        txtKQ = findViewById(R.id.txtKQ);

        btnTinh.setOnClickListener(v -> {

            String sDai = edtDai.getText().toString().trim();
            String sRong = edtRong.getText().toString().trim();

            if (sDai.isEmpty() || sRong.isEmpty()) {
                txtKQ.setText("Vui lòng nhập đầy đủ!");
                return;
            }

            try {
                double dai = Double.parseDouble(sDai);
                double rong = Double.parseDouble(sRong);

                if(dai <= 0 || rong <= 0){
                    txtKQ.setText("Chiều dài/rộng phải > 0");
                    return;
                }

                double chuVi = 2 * (dai + rong);
                double dienTich = dai * rong;

                txtKQ.setText("Chu vi: " + chuVi + "\nDiện tích: " + dienTich);

            } catch (Exception e) {
                txtKQ.setText("Vui lòng nhập số hợp lệ!");
            }
        });
    }
}