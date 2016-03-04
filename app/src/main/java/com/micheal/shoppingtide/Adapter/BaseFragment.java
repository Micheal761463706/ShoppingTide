
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment的基类，项目中所有Fragment应该继承于该类
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(contentResid(), container, false);
    }

    /**
     * 该方法不属于Fragment的生命周期方法
     * 该方法会紧跟着onCreateView方法被调用
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        initView(view);
        dataLoad();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDatas(getArguments());
    }

    /**
     *  解析获得的数据
     * @param arguments
     */
    protected void getDatas(Bundle arguments) {
    }

    // 调用该方法返回Fragment的布局
    protected abstract int contentResid();

    // 用于初始化控件的方法
    protected void initView(View view){}

    // 用于数据加载的方法
    protected void dataLoad(){}
}
