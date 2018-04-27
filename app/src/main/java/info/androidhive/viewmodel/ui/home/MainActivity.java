package info.androidhive.viewmodel.ui.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import info.androidhive.viewmodel.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            MenuListFragment fragment = new MenuListFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_container, fragment, MenuListFragment.TAG).commit();
        }
    }
}
