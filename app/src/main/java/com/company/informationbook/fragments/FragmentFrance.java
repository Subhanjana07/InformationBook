package com.company.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.company.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentFrance extends Fragment {

    public static FragmentFrance newInstance()
    {
        return new FragmentFrance();
    }

    private ImageView imageViewFrance;
    private ProgressBar progressBarFrance;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_france,container,false);

        imageViewFrance =view.findViewById(R.id.imageViewpyramid);
        progressBarFrance = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/1280px-Flag_of_France.svg.png")
                .into(imageViewFrance, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarFrance.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarFrance.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
