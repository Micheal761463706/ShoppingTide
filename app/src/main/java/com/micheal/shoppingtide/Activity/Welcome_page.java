package com.micheal.shoppingtide.Activity;

import android.support.v4.view.ViewPager;

import com.micheal.shoppingtide.Adapter.BaseActivity;
import com.micheal.shoppingtide.R;

public class Welcome_page extends BaseActivity {

    private ViewPager viewPager;

    @Override
    protected int contentView() {
        return R.layout.activity_welcome_page;
    }

    /**
     *  初始化方法
     */
    @Override
    protected void initView() {
        viewPager = (ViewPager) findViewById(R.id.welcome_ViewPager);
    }

    /**
     *  加载数据
     */
    @Override
    protected void dataLoad() {


    }
}
