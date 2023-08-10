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

public class FragmentAbrahim extends Fragment {

    public static FragmentAbrahim newInstance()
    {
        return new FragmentAbrahim();
    }

    private ImageView imageViewAbrahim;
    private ProgressBar progressBarAbrahim;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_abrahim,container,false);

        imageViewAbrahim =view.findViewById(R.id.imageViewpyramid);
        progressBarAbrahim = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/34/78134-050-3AC7D4F8/Abraham-Lincoln-photograph-Mathew-Brady.jpg")
                .into(imageViewAbrahim, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAbrahim.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAbrahim.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
