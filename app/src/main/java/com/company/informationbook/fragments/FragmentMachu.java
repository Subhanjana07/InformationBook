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

public class FragmentMachu extends Fragment {

    public static FragmentMachu newInstance()
    {
        return new FragmentMachu();
    }

    private ImageView imageViewMacchu;
    private ProgressBar progressBarmachu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_machu,container,false);

        imageViewMacchu =view.findViewById(R.id.imageViewpyramid);
        progressBarmachu = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/27/95027-050-C0B1A761/view-Machu-Picchu-Peru.jpg")
                .into(imageViewMacchu, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarmachu.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarmachu.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
