package thomc.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {

    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.context = context;
        this.dsMonAn = dsMonAn;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_monan, parent, false);
        }

        MonAn monAn = dsMonAn.get(position);

        TextView tvTen = convertView.findViewById(R.id.tvTenMonAn);
        TextView tvGia = convertView.findViewById(R.id.tvDonGia);
        TextView tvMoTa = convertView.findViewById(R.id.tvMoTa);
        ImageView img = convertView.findViewById(R.id.imAnhDaiDien);

        tvTen.setText(monAn.getTenMonAn());
        tvGia.setText(String.valueOf(monAn.getDonGia()));
        tvMoTa.setText(monAn.getMoTa());
        img.setImageResource(monAn.getHinhAnh()); //

        return convertView;
    }
}