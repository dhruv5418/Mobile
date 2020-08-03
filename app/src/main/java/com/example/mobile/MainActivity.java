package com.example.mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav=(BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListner);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener  navListner=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.fragment_home:
                            navController= Navigation.findNavController(MainActivity.this,R.id.nav_dashboard);
                            navController.navigate(R.id.homeFragment);
                            break;
                        case R.id.fragment_cart:
                            navController=Navigation.findNavController(MainActivity.this,R.id.nav_dashboard);
                            navController.navigate(R.id.cartFragment);
                            break;
                        case R.id.fragment_profile:
                            navController=Navigation.findNavController(MainActivity.this,R.id.nav_dashboard);
                            navController.navigate(R.id.profileFragment);
                            break;

                    }
                    return true;
                }
            };
}