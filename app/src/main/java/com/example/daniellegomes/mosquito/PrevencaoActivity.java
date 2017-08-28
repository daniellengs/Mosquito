package com.example.daniellegomes.mosquito;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;

public class PrevencaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevencao);
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
          MenuInflater inflater = getMenuInflater();
          inflater.inflate(R.menu.menu, menu);

       // getMenuInflater().inflate(R.menu.menu, menu);
      //  MenuItem searchItem = menu.findItem(R.id.action_search);
      //  SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);




        // Define the listener

        /*MenuItemCompat.OnActionExpandListener expandListener = new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when action item collapses
                return true;  // Return true to collapse action view
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                // Do something when expanded
                return true;  // Return true to expand action view
            }

        };
*/
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings1:
                Log.i("Confirmação","Exemplo 2");
                //System.out.println("Exemplo 2");
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_settings2:
                Log.i("Confirmação","Exemplo 3");
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_settings3:
                Log.i("Confirmação","Exemplo 4");
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_teste:
                Log.i("Confirmação","DANI");
                //System.out.println("Exemplo 2");
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favorite:
                Log.i("Confirmação","FAVORITO");
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }


/* ActionViewClass: A classe de um widget que implementa a ação.
            ActionLayout: um recurso de layout descrevendo os componentes da ação. */



}
