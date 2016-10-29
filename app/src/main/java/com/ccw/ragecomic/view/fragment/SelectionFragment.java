package com.ccw.ragecomic.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ccw.ragecomic.BaseFragment;
import com.ccw.ragecomic.R;
import com.ccw.ragecomic.view.Adapter.FirstFgAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 蔡灿武 on 2016/10/29 0029.
 */

public class SelectionFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_selection_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        ViewPager vp = (ViewPager) view.findViewById(R.id.viewPager);
        String title[] = new String[]{"推荐","暴漫","趣图","视频","文字"};
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            MyFragment fragment = new MyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("name",title[i]);
            fragment.setArguments(bundle);
           fragments.add(fragment);
        }
        FirstFgAdapter adapter = new FirstFgAdapter(getChildFragmentManager(),fragments,title);
        vp.setAdapter(adapter);
        tabLayout.setupWithViewPager(vp);
    }
}
