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

public class Fragmentuk extends Fragment {

    public static Fragmentuk newInstance()
    {
        return new Fragmentuk();
    }

    private ImageView imageViewUk;
    private ProgressBar progressBarUk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_united_kingdom,container,false);

        imageViewUk =view.findViewById(R.id.imageViewpyramid);
        progressBarUk = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1920px-Flag_of_the_United_Kingdom_%281-2%29.svg.png")
                .into(imageViewUk, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarUk.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUk.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
