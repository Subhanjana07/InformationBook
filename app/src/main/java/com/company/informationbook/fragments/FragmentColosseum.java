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

public class FragmentColosseum extends Fragment {

    public static FragmentColosseum newInstance()
    {
        return new FragmentColosseum();
    }

    private ImageView imageViewColosseum;
    private ProgressBar progressBarColosseum;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_colosseum,container,false);

        imageViewColosseum =view.findViewById(R.id.imageViewpyramid);
        progressBarColosseum = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/36/162636-050-932C5D49/Colosseum-Rome-Italy.jpg")
                .into(imageViewColosseum, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarColosseum.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarColosseum.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
