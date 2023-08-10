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

public class FragmentGreatWall extends Fragment {

    public static FragmentGreatWall newInstance()
    {
        return new FragmentGreatWall();
    }

    private ImageView imageViewGreatwall;
    private ProgressBar progressBarGreatwall;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_greatwall,container,false);

        imageViewGreatwall =view.findViewById(R.id.imageViewpyramid);
        progressBarGreatwall = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/82/94382-050-20CF23DB/Great-Wall-of-China-Beijing.jpg")
                .into(imageViewGreatwall, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarGreatwall.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGreatwall.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
