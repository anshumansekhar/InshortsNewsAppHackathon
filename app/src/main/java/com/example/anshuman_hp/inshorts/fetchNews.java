package com.example.anshuman_hp.inshorts;

import android.app.ProgressDialog;
import android.app.VoiceInteractor;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Anshuman-HP on 08-09-2017.
 */

public class fetchNews extends AsyncTask<Void,Integer,Integer> {

    Context ctx;
    public static ProgressDialog dialog;

    public fetchNews(Context ctx) {
        this.ctx = ctx;

    }

    String url="http://starlord.hackerearth.com/newsjson";
    @Override
    protected void onPreExecute() {

        Log.e("TAF","ASync task started");
        dialog=new ProgressDialog(ctx);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.show();
    }
    @Override
    protected Integer doInBackground(Void... params) {
        Log.e("TAF","Doing in background");
        JsonArrayRequest request=new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for(int i=0;i<response.length();i++)
                {
                    JSONObject object;
                    try {
                        object=response.getJSONObject(i);
                        Log.e("ad",object.getString("TITLE"));
                    newsObject newsObject=new newsObject(object.getInt("ID")
                    ,object.getString("TITLE")
                    ,object.getString("URL")
                    ,object.getString("PUBLISHER")
                    ,object.getString("CATEGORY")
                    ,object.getString("HOSTNAME")
                    ,object.getLong("TIMESTAMP"));
                    HomeActivity.list.set(i,newsObject);
                        if(i%20==0){
                            publishProgress(i);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        return null;
    }

    @Override
    protected void onPostExecute(Integer integer) {

        Log.e("TAF","completed");
        dialog.hide();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {


    }
}
