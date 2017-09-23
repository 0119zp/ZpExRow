package exrow.zp.zpexrow.ex.adapter;


import android.content.Context;

import java.util.ArrayList;
import exrow.zp.zpexrow.ex.adapter.data.ZpTest01Data;
import exrow.zp.zpexrow.ex.adapter.data.ZpTest02Data;
import exrow.zp.zpexrow.ex.adapter.data.ZpTest03Data;
import exrow.zp.zpexrow.ex.adapter.data.ZpTest04Data;
import exrow.zp.zpexrow.ex.adapter.row.ZpExRow;
import exrow.zp.zpexrow.ex.adapter.row.ZpTest01Row;
import exrow.zp.zpexrow.ex.adapter.row.ZpTest02Row;
import exrow.zp.zpexrow.ex.adapter.row.ZpTest03Row;
import exrow.zp.zpexrow.ex.adapter.row.ZpTest04Row;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;
import exrow.zp.zpexrow.ex.base.ExRowListViewAdapter;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public class ZpExRowAdapter extends ExRowListViewAdapter {

    private ArrayList<ZpExRowBean> zpList = new ArrayList<>();  // 假数据
    private Context mContext;


    public ZpExRowAdapter(Context context, ArrayList<ZpExRowBean> zpData) {
        super(context);
        this.mContext = context;
        // 添加另一个集合
        this.zpList.addAll(zpData);
        // 添加Row
        setData();
    }

    public void setData(){
        for (ZpExRowBean zpRow : zpList){
            switch (zpRow.getType()){
                case 1:
                    addZpRow01(zpRow);
                    break;
                case 2:
                    addZpRow02(zpRow);
                    break;
                case 3:
                    addZpRow03(zpRow);
                    break;
                case 4:
                    addZpRow04(zpRow);
                    break;
            }
        }
    }

    /**
     * 条目一
     * @param zpRow
     */
    private void addZpRow01(ZpExRowBean zpRow) {
        ZpTest01Row zpTest01Row = new ZpTest01Row(mContext, new ZpTest01Data(zpRow));
        mExRowRepo.addLast(zpTest01Row);
    }

    /**
     * 条目二
     * @param zpRow
     */
    private void addZpRow02(ZpExRowBean zpRow) {
        ZpTest02Row zpTest02Row = new ZpTest02Row(mContext, new ZpTest02Data(zpRow));
        mExRowRepo.addLast(zpTest02Row);
    }

    /**
     * 条目三
     * @param zpRow
     */
    private void addZpRow03(ZpExRowBean zpRow) {
        ZpTest03Row zpTest03Row = new ZpTest03Row(mContext, new ZpTest03Data(zpRow));
        mExRowRepo.addLast(zpTest03Row);
    }

    /**
     * 条目四
     * @param zpRow
     */
    private void addZpRow04(ZpExRowBean zpRow) {
        ZpTest04Row zpTest04Row = new ZpTest04Row(mContext, new ZpTest04Data(zpRow));
        mExRowRepo.addLast(zpTest04Row);
    }


    @Override
    protected int getRowViewTypeCount() {
        return ZpExRow.Type.values().length;
    }
}
