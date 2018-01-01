package com.nictas.store;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;


public abstract class SearchCapableActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);

        SearchableInfo searchableInfo = getSearchableInfo();
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchableInfo);

        return true;
    }

    private SearchableInfo getSearchableInfo() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        ComponentName searchActivityName = new ComponentName(
                getPackageName(),
                SearchResultsActivity.class.getName());
        return searchManager.getSearchableInfo(searchActivityName);
    }

}
