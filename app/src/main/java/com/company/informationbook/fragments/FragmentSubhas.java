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

public class FragmentSubhas extends Fragment {

    public static FragmentSubhas newInstance()
    {
        return new FragmentSubhas();
    }

    private ImageView imageViewSubhas;
    private ProgressBar progressBarSubhas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subhas,container,false);

        imageViewSubhas =view.findViewById(R.id.imageViewpyramid);
        progressBarSubhas = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://img.jagranjosh.com/images/2022/January/2112022/Netaji-Subhas-Chandra-Bose-Biography-Birth-Death-Anniversary-Parakram%20Divas-Achievements-Contributions.jpg")
                .into(imageViewSubhas, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSubhas.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSubhas.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
