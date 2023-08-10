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

public class FragmentLouvre extends Fragment {

    public static FragmentLouvre newInstance()
    {
        return new FragmentLouvre();
    }

    private ImageView imageViewLouvre;
    private ProgressBar progressBarLouvre;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_louvre,container,false);

        imageViewLouvre =view.findViewById(R.id.imageViewpyramid);
        progressBarLouvre = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/02/121002-050-92DB902F/Louvre-Museum-pyramid-Paris-Pei-IM.jpg")
                .into(imageViewLouvre, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarLouvre.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarLouvre.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
