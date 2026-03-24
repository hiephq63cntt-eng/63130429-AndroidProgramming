package thomc.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView lvDSmonAn = findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<>();

        dsMonAn.add(new MonAn("Cơm Tấm Sườn", 25000, "Mô Tả ở đây", R.drawable.pukachi));
        dsMonAn.add(new MonAn("Cơm Sườn Trứng", 27000, "Mô Tả ở đây", R.drawable.conca));
        dsMonAn.add(new MonAn("Gà Xối Mỡ", 29000, "Mô Tả ở đây", R.drawable.conech));
        dsMonAn.add(new MonAn("Sườn Bì Chả", 30000, "Mô Tả ở đây", R.drawable.conrong));
        dsMonAn.add(new MonAn("Đặc Biệt", 25000, "Mô Tả ở đây", R.drawable.conma));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSmonAn.setAdapter(adapter);

        lvDSmonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this,
                        monAnChon.getTenMonAn(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}