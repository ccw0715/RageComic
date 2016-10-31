package com.ccw.ragecomic.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ccw.ragecomic.BaseFragment;
import com.ccw.ragecomic.R;
import com.squareup.picasso.Picasso;

/**
 * Created by 蔡灿武 on 2016/10/31 0031.
 */

public class RecommendFragment extends BaseFragment {
    private ViewPager vp;
    private String picPath[] = new String[]{"http://ww3.sinaimg.cn/large/005O399qjw1f95r1t2lagj30hs0a0tda.jpg",
    "http://ww2.sinaimg.cn/large/005PQVrUjw1f98155tdtuj30hs0a00tt.jpg",
    "http://ww2.sinaimg.cn/large/0066cVLNjw1f9360pbaftj30hs0a0acn.jpg"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recommend_layout, container, false);
        initView(view);
        return view;

    }

    private void initView(View view) {
        vp = ((ViewPager) view.findViewById(R.id.viewPager));
        for (int i = 0; i < picPath.length; i++) {
            ImageView iv =new ImageView(getActivity());
            Picasso.with(getContext()).load(picPath[i]).into(iv);
        }

    }
}
