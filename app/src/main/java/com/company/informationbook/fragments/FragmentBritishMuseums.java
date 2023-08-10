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

public class FragmentBritishMuseums extends Fragment {

    public static FragmentBritishMuseums newInstance()
    {
        return new FragmentBritishMuseums();
    }

    private ImageView imageViewBritishMuseums;
    private ProgressBar progressBarBritishMuseums;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_british_museums,container,false);

        imageViewBritishMuseums =view.findViewById(R.id.imageViewpyramid);
        progressBarBritishMuseums = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/12/127112-050-F4DD3B7A/British-Museum-London.jpg")
                .into(imageViewBritishMuseums, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBritishMuseums.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBritishMuseums.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
