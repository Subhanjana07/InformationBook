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

public class FragmentIndia extends Fragment {

    public static FragmentIndia newInstance()
    {
        return new FragmentIndia();
    }

    private ImageView imageViewIndia;
    private ProgressBar progressBarIndia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_india,container,false);

        imageViewIndia =view.findViewById(R.id.imageViewpyramid);
        progressBarIndia = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1280px-Flag_of_India.svg.png")
                .into(imageViewIndia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIndia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIndia.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
