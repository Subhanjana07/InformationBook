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

public class FragmentWinston extends Fragment {

    public static FragmentWinston newInstance()
    {
        return new FragmentWinston();
    }

    private ImageView imageViewWinston;
    private ProgressBar progressBarWinston;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_winston,container,false);

        imageViewWinston =view.findViewById(R.id.imageViewpyramid);
        progressBarWinston = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/35/7535-004-99D14F9B/Winston-Churchill-Yousuf-Karsh-1941.jpg?s=1500x700&q=85")
                .into(imageViewWinston, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarWinston.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarWinston.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
