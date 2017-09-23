package exrow.zp.zpexrow.ex.adapter;

import android.content.Context;

import java.util.ArrayList;

import exrow.zp.zpexrow.ex.adapter.recrow.RecRow01;
import exrow.zp.zpexrow.ex.base.ExRowRecyclerViewAdapter;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class ZpRecExRowAdapter extends ExRowRecyclerViewAdapter {

    private ArrayList<ZpExRowBean> zpList = new ArrayList<>();  // 假数据
    private Context mContext;


    public ZpRecExRowAdapter(Context context, ArrayList<ZpExRowBean> zpData) {
        super(context);
        this.mContext = context;
        // 添加另一个集合
        this.zpList.addAll(zpData);

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

    private void addZpRow01(ZpExRowBean zpRow) {
        RecRow01 recRow01 = new RecRow01(mContext, zpRow);
        mExRowRepo.addLast(recRow01);

    }

    private void addZpRow02(ZpExRowBean zpRow) {
        RecRow01 recRow01 = new RecRow01(mContext, zpRow);
        mExRowRepo.addLast(recRow01);
    }

    private void addZpRow03(ZpExRowBean zpRow) {
        RecRow01 recRow01 = new RecRow01(mContext, zpRow);
        mExRowRepo.addLast(recRow01);
    }

    private void addZpRow04(ZpExRowBean zpRow) {
        RecRow01 recRow01 = new RecRow01(mContext, zpRow);
        mExRowRepo.addLast(recRow01);
    }



}
