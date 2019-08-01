package com.shirucodes.angaza.json;

import android.util.Log;

import com.shirucodes.angaza.models.Paragraph;
import com.shirucodes.angaza.models.Verification;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ResponseDiserializer {

    private static final String TAG = ResponseDiserializer.class.getSimpleName();
    public static ArrayList<Paragraph> paragraphArrayList = new ArrayList<Paragraph>();

    public static ArrayList<Paragraph> deserializeVerificationResult(StringBuffer rawApiResultStringBuffer) {


        try {
            paragraphArrayList.clear();
            JSONObject jsonObject = new JSONObject(rawApiResultStringBuffer.toString());
            Paragraph paragraph = new Paragraph();
            if (jsonObject instanceof JSONObject) {

                if (jsonObject.getString("Para") != null) {
                    paragraph.setParagraphText(jsonObject.getString("Para"));

                } else {
                    paragraph.setParagraphText("No respective paragraph");
                }

                if (jsonObject.getString("score").equalsIgnoreCase("0")) {

                    paragraph.setParagraphScore("0");
                } else {
                    paragraph.setParagraphScore("score");
                }

                paragraphArrayList.add(paragraph);

            }
            return paragraphArrayList;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "Unable to deserializeResultData: " + e);

            return new ArrayList<>();
        }


    }

}

