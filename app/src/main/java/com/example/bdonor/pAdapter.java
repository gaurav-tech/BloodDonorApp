package com.example.bdonor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.bdonor.R.id.img;

public class pAdapter extends RecyclerView.Adapter<pAdapter.ProgrammingViewHolder> {
  //  private String data[],more[];
    private ArrayList<String> name=new ArrayList<>();
    private ArrayList<String> phone=new ArrayList<>();


    Context con;
    public pAdapter(Context con, ArrayList name, ArrayList phone)
    {
        this.con = con;
       this.name=name;
        this.phone=phone;

    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(con);
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view,con);
    }
    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {


        holder.tvl1.setText(name.get(position));
        holder.tvl2.setText(phone.get(position));

    }
    @Override
    public int getItemCount() {

        return name.size();

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public  class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        TextView tvl1,tvl2;


        public ProgrammingViewHolder(@NonNull View itemView,Context context) {
            super(itemView);
            con = context;
            tvl1=itemView.findViewById(R.id.tvl1);
            tvl2=itemView.findViewById(R.id.tvl2);

        }
    }
}
