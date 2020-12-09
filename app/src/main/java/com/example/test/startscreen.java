package com.example.test;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class startscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);
    }
    public void onClickMenu(View v)
    {
         setContentView(R.layout.primer);
    }
    public void onClickHistory(View v)
    {
        setContentView(R.layout.history);
    }
    public void onClickSetting(View v)
    {
        setContentView(R.layout.setting);
    }
    public void onClickstart(View v)
    {
        setContentView(R.layout.startscreen);
    }

}
