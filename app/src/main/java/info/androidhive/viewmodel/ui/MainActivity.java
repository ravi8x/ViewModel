package info.androidhive.viewmodel.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import info.androidhive.viewmodel.R;
import info.androidhive.viewmodel.ui.home.MenuListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // toolbar title
        getSupportActionBar().setTitle(getString(R.string.menu));

        if (savedInstanceState == null) {
            // load the fragment for the first time
            MenuListFragment fragment = new MenuListFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_container, fragment, MenuListFragment.TAG).commit();
        }
    }
}
