package Adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 *  Activity的基类
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(contentView());
        initView();
        dataLoad();
    }

    /*
     * 该方法由子类实现，用于设置子类的布局文件
     */
    protected abstract int contentView();

    /**
     *  用于初始化控件方法
     */
    private void initView() {
    }

    /**
     *  用于加载数据
     */
    private void dataLoad() {
    }


}
