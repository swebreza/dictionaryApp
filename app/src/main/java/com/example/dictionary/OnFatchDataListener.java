package com.example.dictionary;

import com.example.dictionary.models.APIResponse;

public interface OnFatchDataListener {
    void onFatchData(APIResponse apiResponse,String message);
    void onError(String message);
}
