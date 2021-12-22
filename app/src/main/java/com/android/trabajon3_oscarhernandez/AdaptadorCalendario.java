package com.android.trabajon3_oscarhernandez;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorCalendario extends RecyclerView.Adapter<ViewHolderCalendario>
{
    private final ArrayList<String> daysOfMonth;
    private final OnItemListener onItemListener;

    public AdaptadorCalendario(ArrayList<String> daysOfMonth, OnItemListener onItemListener) {
        this.daysOfMonth = daysOfMonth;
        this.onItemListener = onItemListener;
    }

    @NonNull
    @Override
    public ViewHolderCalendario onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calendario_celda, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height=(int)(parent.getHeight()*0.166666666);
        return new ViewHolderCalendario(view, onItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCalendario holder, int position) {

        holder.dayOfMonth.setText(daysOfMonth.get(position));
    }

    @Override
    public int getItemCount() { return daysOfMonth.size();
    }
    public interface OnItemListener
    {
        void onItemClick(int position, String dayText);
    }
}
