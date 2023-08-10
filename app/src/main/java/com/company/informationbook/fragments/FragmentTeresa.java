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

public class FragmentTeresa extends Fragment {

    public static FragmentTeresa newInstance()
    {
        return new FragmentTeresa();
    }

    private ImageView imageViewTeresa;
    private ProgressBar progressBarTeresa;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teresa,container,false);

        imageViewTeresa =view.findViewById(R.id.imageViewpyramid);
        progressBarTeresa = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/42/155442-004-AEE30B6C/Mother-Teresa.jpg?s=1500x700&q=85")
                .into(imageViewTeresa, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTeresa.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTeresa.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
