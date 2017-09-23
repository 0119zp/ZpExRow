package exrow.zp.zpexrow.ex.adapter.recrow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import exrow.zp.zpexrow.R;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class RecRow01 extends RecBaseRow{

    private ZpExRowBean zpRow;

    public RecRow01(Context context, ZpExRowBean zpRow) {
        super(context);
        this.zpRow = zpRow;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup parent) {

        initRoot(R.layout.zp_row_01, parent);

        return new HomeHolder(mRoot);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        HomeHolder homeHolder = (HomeHolder) holder;
        homeHolder.textView.setText(zpRow.getItem());
        homeHolder.zp_ll_row.setBackgroundResource(zpRow.getColorId());

    }

    @Override
    public int getViewType() {
        return Type.ZP_ROW_01.getValue();
    }

    private static class HomeHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public LinearLayout zp_ll_row;

        public HomeHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.zp_tv_row);
            zp_ll_row = (LinearLayout) itemView.findViewById(R.id.zp_ll_row);
        }
    }


}
