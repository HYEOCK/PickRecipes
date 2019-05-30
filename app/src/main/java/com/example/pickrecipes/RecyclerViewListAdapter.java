package com.example.pickrecipes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewListAdapter extends RecyclerView.Adapter<RecyclerViewListAdapter.ViewHolder> {

    private final List<CardList> mDataList;

    public RecyclerViewListAdapter(List<CardList>dataList){
        mDataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) { // 뷰홀더 만드는 부분
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cards, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        CardList list = mDataList.get(i);
        viewHolder.title.setText(list.getTitle());
        viewHolder.contests.setText(list.getContents());

    }

    @Override
    public int getItemCount() {
        return mDataList.size(); // 어댑터의 리스트 갯수
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        TextView title;
        TextView contests;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_text);
            contests = itemView.findViewById(R.id.content_text);
        }
    }
}
