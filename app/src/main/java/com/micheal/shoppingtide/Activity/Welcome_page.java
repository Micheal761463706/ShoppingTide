package com.micheal.shoppingtide.Activity;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.micheal.shoppingtide.Adapter.BaseActivity;
import com.micheal.shoppingtide.R;

import java.util.ArrayList;
import java.util.List;

/**
 *  首次打开的介绍页面
 */
public class Welcome_page extends BaseActivity implements ViewPager.OnPageChangeListener {

    private Button btn;            // 进入主页的按钮
    private ViewPager viewPager;
    private List<ImageView> listImage;
    private MyViewPagerAdapter adapter;

    @Override
    protected int contentView() {
        return R.layout.activity_welcome_page;
    }

    /**
     *  初始化方法
     */
    @Override
    protected void initView() {
        btn = (Button) findViewById(R.id.welcome_btnInto);
        viewPager = (ViewPager) findViewById(R.id.welcome_ViewPager);
        viewPager.setOnPageChangeListener(this);
    }

    /**
     *  加载数据
     */
    @Override
    protected void dataLoad() {

        // 自定义ImageView保存图片到list中
        listImage = new ArrayList<>();
        for (int i = 1 ; i <= 4 ; i++){
            int imageId = getResources().getIdentifier("y_guide_"+i,"mipmap",getPackageName());
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imageId);

            listImage.add(imageView);
        }

        // 设置适配器
        adapter = new MyViewPagerAdapter();
        viewPager.setAdapter(adapter);


    }

    /**
     *  ViewPager的监听器
     * @param position  位置
     * @param positionOffset  偏移量
     * @param positionOffsetPixels  偏移的像素
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if(position == 0){
            btn.setText("现在就购");
        }else if(position == 1){
            btn.setText("现在就抢");
        }else if(position == 2){
            btn.setText("现在就定");
        }else if(position == 3){
            btn.setText("现在开启");
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     *  ViewPager的适配器
     */
    public class MyViewPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return listImage.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(listImage.get(position));
            return listImage.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(listImage.get(position));
        }
    }
}
