package exrow.zp.zpexrow.ex.base;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public abstract class ExRowListView extends ExRowBaseView{

    /**
     * Method 获得视图
     * @param position      位置
     * @param convertView   视图
     * @param parent        父容器
     * @return              视图
     */
    public abstract View getView(int position, View convertView, ViewGroup parent);

}
