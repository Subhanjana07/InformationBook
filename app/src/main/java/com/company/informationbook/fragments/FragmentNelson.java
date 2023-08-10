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

public class FragmentNelson extends Fragment {

    public static FragmentNelson newInstance()
    {
        return new FragmentNelson();
    }

    private ImageView imageViewNelson;
    private ProgressBar progressBarNelson;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nelson,container,false);

        imageViewNelson =view.findViewById(R.id.imageViewpyramid);
        progressBarNelson = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/67/75567-050-4EBBE84D/Nelson-Mandela.jpg")
                .into(imageViewNelson, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNelson.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNelson.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
