package com.laxlimboo.testproject.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.laxlimboo.testproject.R;
import com.laxlimboo.testproject.model.TruckCenterDatum;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TruckCenterDatumAdapter extends RecyclerView.Adapter<TruckCenterDatumAdapter.ViewHolder> {

    List<TruckCenterDatum> truckCenterDatumList;
    List<TruckCenterDatum> truckCenterDatumListCopy;

    public TruckCenterDatumAdapter(List<TruckCenterDatum> truckCenterDatumList) {
        this.truckCenterDatumList = truckCenterDatumList;
        notifyDataSetChanged();
    }

    public void setTruckCenterDatumList(List<TruckCenterDatum> truckCenterDatumList) {
        this.truckCenterDatumList = truckCenterDatumList;
        this.truckCenterDatumListCopy = new ArrayList<>();
        this.truckCenterDatumListCopy.addAll(truckCenterDatumList);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_truck_center_datum_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_trailerID.setText(truckCenterDatumList.get(position).getTrailerID());
        holder.tv_trailerStatus.setText(truckCenterDatumList.get(position).getTrailerStatus());
        holder.tv_currentTrailerInfoID.setText(truckCenterDatumList.get(position).getCurrentTrailerInfoID());
        holder.tv_facilityName.setText(truckCenterDatumList.get(position).getFacilityName());
        holder.tv_lastAction.setText(truckCenterDatumList.get(position).getLastAction());
        holder.tv_lastActionBy.setText(truckCenterDatumList.get(position).getLastActionBy());
        holder.tv_lastActionOn.setText(truckCenterDatumList.get(position).getLastActionOn());
        holder.tv_location.setText(truckCenterDatumList.get(position).getLocation());
        holder.tv_readyForRack.setText(truckCenterDatumList.get(position).getReadyForRack());
        holder.tv_readyForRackSince.setText(truckCenterDatumList.get(position).getReadyForRackSince());
        holder.tv_requestedRack.setText(truckCenterDatumList.get(position).getRequestedRack());
        holder.tv_requestedToRack.setText(truckCenterDatumList.get(position).getRequestedToRack());
        holder.tv_comment.setText(truckCenterDatumList.get(position).getComment());
    }

    @Override
    public int getItemCount() {
        return truckCenterDatumList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_trailerID)
        TextView tv_trailerID;
        @BindView(R.id.tv_trailerStatus)
        TextView tv_trailerStatus;
        @BindView(R.id.tv_currentTID)
        TextView tv_currentTrailerInfoID;
        @BindView(R.id.tv_facilityName)
        TextView tv_facilityName;
        @BindView(R.id.tv_lastAction)
        TextView tv_lastAction;
        @BindView(R.id.tv_lastActionBy)
        TextView tv_lastActionBy;
        @BindView(R.id.tv_lastActionOn)
        TextView tv_lastActionOn;
        @BindView(R.id.tv_location)
        TextView tv_location;
        @BindView(R.id.tv_readyForRack)
        TextView tv_readyForRack;
        @BindView(R.id.tv_readyForRackSince)
        TextView tv_readyForRackSince;
        @BindView(R.id.tv_requestedRack)
        TextView tv_requestedRack;
        @BindView(R.id.tv_requestedToRack)
        TextView tv_requestedToRack;
        @BindView(R.id.tv_Comment)
        TextView tv_comment;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void filter(String text) {
        truckCenterDatumList.clear();
        if (text.isEmpty()) {
            truckCenterDatumList.addAll(truckCenterDatumListCopy);
        } else {
            text = text.toLowerCase();
            for (TruckCenterDatum item : truckCenterDatumListCopy) {
                if (item.getTrailerID().toLowerCase().contains(text) ||
                        item.getTrailerStatus().toLowerCase().contains(text)) {
                    truckCenterDatumList.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }
}
