package com.kastsiuk.andrei.entitypropertysample.common;

import android.util.Pair;

import java.util.List;

import androidx.annotation.NonNull;

public interface Syncable {

    @NonNull
    List<Pair<String, Object>> getProperties();
}
