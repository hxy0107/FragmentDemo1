package com.hxy.app.model;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2015/1/26.
 */
public class ListFrag extends ListFragment {
    private Callbacks mCallbacks;

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        mCallbacks.onItemSelected(BookContent.bookMap.get(position).id);
    }

    public interface Callbacks
    {
        public void onItemSelected(Integer id);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(!(activity instanceof Callbacks)){
            throw new IllegalStateException("onAttach");
        }
        mCallbacks=(Callbacks)activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<BookContent.Book>(getActivity(),
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,BookContent.bookList));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks=null;
    }
}
