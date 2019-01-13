package com.kastsiuk.andrei.entitypropertysample.model;

import android.util.Pair;

import com.kastsiuk.andrei.entitypropertysample.common.Syncable;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class BaseEntity implements Syncable {

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    @Override
    public List<Pair<String, Object>> getProperties() {
        return new ArrayList<>();
    }
}
