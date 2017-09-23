package exrow.zp.zpexrow.ex.adapter.row;

import android.content.Context;

import exrow.zp.zpexrow.ex.adapter.data.ZpExData;
import exrow.zp.zpexrow.ex.base.ExRowListView;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public abstract class ZpExRow extends ExRowListView{

    private ZpExData data;
    private Context mContext;

    protected ZpExRow(Context context, ZpExData data){
        this.mContext = context;
        this.data = data;
    }

    public ZpExData getData() {
        return data;
    }

    @Override
    public int getViewType() {
        return data.getType().value;
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

        public static Type from(final int value) {
            for (final Type type : values()) {
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
