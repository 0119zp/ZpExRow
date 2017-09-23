package exrow.zp.zpexrow.ex.adapter.recrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import exrow.zp.zpexrow.ex.base.ExRowRecyclerView;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public abstract class RecBaseRow extends ExRowRecyclerView {

    public Context mContext;
    public LayoutInflater mLayoutInflater;

    public View mRoot;


    public RecBaseRow(Context context){
        this.mContext = context;

        mLayoutInflater = LayoutInflater.from(mContext);
    }


    protected void initRoot(int resId, ViewGroup parent) {

        mRoot = mLayoutInflater.inflate(resId, parent, false);
    }


    public enum Type {

        UNKNOWN(-1),        // 未知Row
        ZP_ROW_01(1),       // 条目1
        ZP_ROW_02(2),       // 条目2
        ZP_ROW_03(3),       // 条目3
        ZP_ROW_04(4);       // 条目4


        private final int value;

        Type(final int value) {
            this.value = value;
        }

        public static RecBaseRow.Type from(final int value) {
            for (final RecBaseRow.Type type : values()) {
                if (type.getValue() == value) {
                    return type;
                }
            }
            return UNKNOWN;
        }

        public int getValue() {
            return value;
        }
    }

}
