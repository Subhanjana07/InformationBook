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

public class FragmentIndian extends Fragment {

    public static FragmentIndian newInstance()
    {
        return new FragmentIndian();
    }

    private ImageView imageViewIndian;
    private ProgressBar progressBarIndian;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_indian,container,false);

        imageViewIndian =view.findViewById(R.id.imageViewpyramid);
        progressBarIndian = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/51/123551-050-78D3F9F5/Courtyard-Indian-Museum-Kolkata-India.jpg")
                .into(imageViewIndian, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarIndian.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarIndian.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
