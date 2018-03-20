package com.example.smartec.recyclerwithroomdatalib.recyclerActivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.smartec.recyclerwithroomdatalib.R;
import com.example.smartec.recyclerwithroomdatalib.RoomData.DataEntity;

import java.util.List;

/**
 * Created by Smartec on 3/18/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
   // public List<data>Mydata;
    public List<DataEntity>Mydata;

    public Adapter(List<DataEntity>mydata) {
        this.Mydata=mydata;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Name, Email, Password;

        public MyViewHolder(View view) {
            super(view);
            Name = (TextView) view.findViewById(R.id.name);
            Email = (TextView) view.findViewById(R.id.email);
            Password = (TextView) view.findViewById(R.id.password);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler
                ,parent,false);


        return new MyViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
         // data user=Mydata.get(position);
        DataEntity user=Mydata.get(position);

        holder.Email.setText(user.getEmail());
          holder.Name.setText(user.getName());
          holder.Password.setText(user.getPassword());
    }



    @Override
    public int getItemCount() {
        return Mydata.size();
    }
}
