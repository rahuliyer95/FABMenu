package com.rahuliyer95.fabmenu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.melnykov.fab.FloatingActionButton;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private FloatingActionButton menuBase;

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        menuBase = (FloatingActionButton) findViewById(R.id.fabMenu);
        menuBase.setOnClickListener(this);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus)
            FABMenuUtil.setupFABMenu(menuBase,
                                     new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher},
                                     R.style.AppTheme_FABMenu,
                                     this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        FABMenuUtil.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        FABMenuUtil.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == menuBase.getId()) {
            FABMenuUtil.triggerMenu();
        }
    }

}
