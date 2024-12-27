package com.example.coolkies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class GalleryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Set up RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.gallery_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2)); // 2 columns in the grid

        // Gallery items (image resource IDs and names)
        List<GalleryItem> galleryItems = Arrays.asList(
                new GalleryItem(R.drawable.ic_choco_collection, "Choco Collection"),
                new GalleryItem(R.drawable.ic_cocoa, "Choco Cocoa"),
                new GalleryItem(R.drawable.ic_caramel, "Caramel"),
                new GalleryItem(R.drawable.ic_chocolate, "Chocolate"),
                new GalleryItem(R.drawable.ic_eclair, "Eclair"),
                new GalleryItem(R.drawable.ic_chocolate_cake, "Choco Cake"),
                new GalleryItem(R.drawable.ic_chocolate_chip, "Chocolate Chip"),
                new GalleryItem(R.drawable.ic_oatmeal_raisin, "Oatmeal Raisin"),
                new GalleryItem(R.drawable.ic_double_chocolate, "Double Choco Cookies"),
                new GalleryItem(R.drawable.ic_gingerbread, "Gingerbread"),
                new GalleryItem(R.drawable.ic_macadamia_nut, "Macadamia Nut Cookies"),
                new GalleryItem(R.drawable.ic_peanut_butter, "Peanut Butter Cookies"),
                new GalleryItem(R.drawable.ic_sugar_cookie, "Sugar Cookies")




                );

        // Set up the adapter
        GalleryAdapter adapter = new GalleryAdapter(galleryItems);
        recyclerView.setAdapter(adapter);

        return view;
    }
}