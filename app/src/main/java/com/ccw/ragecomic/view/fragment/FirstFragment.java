package com.ccw.ragecomic.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ccw.ragecomic.BaseFragment;

/**
 * Created by 蔡灿武 on 2016/10/28 0028.
 */

public class FirstFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(getActivity());
        tv.setText("首页");
        return tv;
    }
}
