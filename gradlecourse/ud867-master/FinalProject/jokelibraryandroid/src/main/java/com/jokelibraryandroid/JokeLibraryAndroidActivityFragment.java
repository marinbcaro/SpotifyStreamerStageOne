package com.jokelibraryandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeLibraryAndroidActivityFragment extends Fragment {

    public JokeLibraryAndroidActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_joke_library_android, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra("theJoke");
        TextView jokeTextView = (TextView) root.findViewById(R.id.display_joke);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return root;

    }
}
