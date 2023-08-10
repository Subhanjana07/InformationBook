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

public class FragmentPyramid extends Fragment {

    public static FragmentPyramid newInstance()
    {
        return new FragmentPyramid();
    }

    private ImageView imageViewPyramid;
    private ProgressBar progressPyramid;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pyramid,container,false);

        imageViewPyramid =view.findViewById(R.id.imageViewpyramid);
        progressPyramid = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/06/122506-050-C8E03A8A/Pyramid-of-Khafre-Giza-Egypt.jpg")
                .into(imageViewPyramid, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressPyramid.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressPyramid.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
