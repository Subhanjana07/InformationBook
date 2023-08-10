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

public class FragmentTajMahal extends Fragment {

    public static FragmentTajMahal newInstance()
    {
        return new FragmentTajMahal();
    }

    private ImageView imageViewTajMAhal;
    private ProgressBar progressBarTajMahal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taj_mahal,container,false);

        imageViewTajMAhal =view.findViewById(R.id.imageViewpyramid);
        progressBarTajMahal = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/86/170586-050-AB7FEFAE/Taj-Mahal-Agra-India.jpg")
                .into(imageViewTajMAhal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTajMahal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTajMahal.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
