package com.ccw.ragecomic.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ccw.ragecomic.BaseActivity;
import com.ccw.ragecomic.R;
import com.ccw.ragecomic.view.fragment.ChatFragment;
import com.ccw.ragecomic.view.fragment.FirstFragment;
import com.ccw.ragecomic.view.fragment.FoundFragment;
import com.ccw.ragecomic.view.fragment.MineFragment;

public class MainActivity extends BaseActivity {

    private RadioGroup rg;
    private LinearLayout ll;
    private Fragment fragment;
    private RadioButton rg_first;
    private RadioButton rg_found;
    private RadioButton rg_chat;
    private RadioButton rg_mine;
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rg_first.setTextColor(Color.BLACK);
                rg_found.setTextColor(Color.BLACK);
                rg_chat.setTextColor(Color.BLACK);
                rg_mine.setTextColor(Color.BLACK);
                switch (checkedId) {
                    case R.id.first:
                        fragment = new FirstFragment();
                        rg_first.setTextColor(Color.RED);
                        break;
                    case R.id.found:
                        fragment = new FoundFragment();
                        rg_found.setTextColor(Color.RED);
                        break;
                    case R.id.chat:
                        fragment = new ChatFragment();
                        rg_chat.setTextColor(Color.RED);
                        break;
                    case R.id.mine:
                        fragment = new MineFragment();
                        rg_mine.setTextColor(Color.RED);
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                if (fragment.isAdded()) {
                    transaction.hide(currentFragment).show(fragment).commit();
                } else {
                    transaction.hide(currentFragment).add(R.id.ll, fragment).commit();
                }
                currentFragment = fragment;
            }
        });
        currentFragment = new FirstFragment();
        rg_first.setTextColor(Color.RED);
        getSupportFragmentManager().beginTransaction().replace(R.id.ll, currentFragment).commit();

    }

    private void initView() {
        rg = ((RadioGroup) findViewById(R.id.rg));
        ll = ((LinearLayout) findViewById(R.id.ll));
        rg_first = ((RadioButton) findViewById(R.id.first));
        rg_found = ((RadioButton) findViewById(R.id.found));
        rg_chat = ((RadioButton) findViewById(R.id.chat));
        rg_mine = ((RadioButton) findViewById(R.id.mine));
        fragment = new Fragment();
    }
    //中间图片的点击事件
    public void ivClick(View view) {
        Toast.makeText(this, "还没有", Toast.LENGTH_SHORT).show();
    }
}
