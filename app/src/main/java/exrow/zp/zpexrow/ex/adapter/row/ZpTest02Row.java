package exrow.zp.zpexrow.ex.adapter.row;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import exrow.zp.zpexrow.R;
import exrow.zp.zpexrow.ex.adapter.data.ZpExData;
import exrow.zp.zpexrow.ex.adapter.data.ZpTest02Data;

/**
 * Created by Administrator on 2016/12/9 0009.
 */

public class ZpTest02Row extends ZpExRow{

    private Context mContext;

    public ZpTest02Row(Context context, ZpExData data) {
        super(context, data);
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.zp_row_01, null);
            viewHolder.zpRow = (LinearLayout) convertView.findViewById(R.id.zp_ll_row);
            viewHolder.zpText = (TextView) convertView.findViewById(R.id.zp_tv_row);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ZpTest02Data zpTest02Data = (ZpTest02Data) getData();
        if (zpTest02Data != null){
            viewHolder.zpRow.setBackgroundResource(zpTest02Data.getZpExRowBean().getColorId());
            viewHolder.zpText.setText(zpTest02Data.getZpExRowBean().getItem());
        }


        return convertView;
    }

    public class ViewHolder{

        LinearLayout zpRow;
        TextView zpText;

    }
}
