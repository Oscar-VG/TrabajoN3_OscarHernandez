package com.android.trabajon3_oscarhernandez;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderCalendario extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public final TextView dayOfMonth;
    private final AdaptadorCalendario.OnItemListener onItemListener;
    public ViewHolderCalendario(@NonNull View itemView, AdaptadorCalendario.OnItemListener onItemListener) {
        super(itemView);
        dayOfMonth=itemView.findViewById(R.id.cellDayText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onItemListener.onItemClick(getAdapterPosition(),(String) dayOfMonth.getText());
    }
}