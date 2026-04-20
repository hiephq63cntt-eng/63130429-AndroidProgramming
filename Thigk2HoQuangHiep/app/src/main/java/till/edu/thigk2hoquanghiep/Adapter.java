package Thigk2.HoQuangHiep;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DiaDiemAdapter extends RecyclerView.Adapter<DiaDiemAdapter.ViewHolder> {

    private List<DiaDiem> list;

    public interface OnItemClickListener {
        void onClick(DiaDiem diaDiem);
    }

    private OnItemClickListener listener;

    public DiaDiemAdapter(List<DiaDiem> list, OnItemClickListener listener) {
        this.list = list;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtTen, txtDiaChi;

        public ViewHolder(View v) {
            super(v);
            img = v.findViewById(R.id.img);
            txtTen = v.findViewById(R.id.txtTen);
            txtDiaChi = v.findViewById(R.id.txtDiaChi);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_diadiem, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DiaDiem d = list.get(position);

        holder.img.setImageResource(d.hinh);
        holder.txtTen.setText(d.ten);
        holder.txtDiaChi.setText(d.diaChi);

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onClick(d);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (list != null) ? list.size() : 0;
    }
}