package com.hxy.FragmentTest;

import android.app.Activity;
import android.os.Bundle;
import com.hxy.app.model.ListFrag;

public class MyActivity extends Activity implements ListFrag.Callbacks {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onItemSelected(Integer id) {

    }
}
