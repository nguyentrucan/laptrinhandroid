package com.an.cuoiki.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.an.cuoiki.R;
import com.an.cuoiki.model.Item;
import com.bumptech.glide.Glide;

import java.util.List;

public class ChiTietDonHangAdapter extends RecyclerView.Adapter<ChiTietDonHangAdapter.MyViewHolder> {
    private Context context;
    private List<Item> itemList;

    public ChiTietDonHangAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chitiet, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.txttensp.setText(item.getTensp() + "");
        holder.txtsoluongsp.setText("Số lượng: "+item.getSoluong() + "");
        Glide.with(context).load(item.getHinhanh()).into(holder.imgchitiet);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imgchitiet;
        TextView txttensp, txtsoluongsp;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgchitiet = itemView.findViewById(R.id.item_imgchitiet);
            txttensp = itemView.findViewById(R.id.item_tenspchitiet);
            txtsoluongsp = itemView.findViewById(R.id.item_soluongchitiet);
        }
    }
}
