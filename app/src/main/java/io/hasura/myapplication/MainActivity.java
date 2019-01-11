package io.hasura.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;
import android.widget.TextView;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

import org.jetbrains.annotations.NotNull;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://gql.limon.limo/fu89reshguiwgfb3wahnt";

    OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

    ApolloClient apolloClient = ApolloClient.builder()
            .serverUrl(BASE_URL)
            .okHttpClient(okHttpClient)
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SerachQuery q = SerachQuery.builder().build().builder().build();
        ApolloCall<SerachQuery.Data> users = apolloClient.query(q);
        users.enqueue(new ApolloCall.Callback<SerachQuery.Data>() {
            @Override
            public void onResponse(@NotNull Response<SerachQuery.Data> response) {
                SerachQuery.Data data = response.data();
                Log.d("respone", "response = " + data.toString());
            }

            @Override
            public void onFailure(@NotNull ApolloException e) {
                Log.d("error = ", e.toString());
            }
        });
    }
}
