package com.ccw.ragecomic.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ccw.ragecomic.BaseFragment;
import com.ccw.ragecomic.R;

/**
 * Created by 蔡灿武 on 2016/10/28 0028.
 */

public class FirstFragment extends BaseFragment {
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fg_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextView selection = (TextView) view.findViewById(R.id.selection);
        selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectionFragment s=new SelectionFragment();
                getChildFragmentManager().beginTransaction().add(R.id.ll,s).commit();
            }
        });
    }
}
