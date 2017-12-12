package com.jinming.bbva;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.jinming.bbva.list.ListViewFragment;
import com.jinming.bbva.map.MapFragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.container, new MapFragment(), "map")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toggle_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.mapBtn:
                MapFragment fragment = (MapFragment) fragmentManager.findFragmentByTag("map");
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment)
                        .commit();
                fragment.fetchData();
                break;
            case R.id.listBtn:
                ListViewFragment listViewFragment = (ListViewFragment) fragmentManager.findFragmentByTag("list");
                if (listViewFragment == null) {
                    listViewFragment = new ListViewFragment();
                    fragmentManager.beginTransaction()
                            .add(listViewFragment, "list")
                            .addToBackStack(null)
                            .commit();
                }
                fragmentManager.beginTransaction()
                        .replace(R.id.container, listViewFragment)
                        .commit();
                break;
        }
        return true;
    }
}
