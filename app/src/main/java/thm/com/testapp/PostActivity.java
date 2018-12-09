package thm.com.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import thm.com.testapp.model.Post;
import thm.com.testapp.retrofit.AppServiceClient;

public class PostActivity extends AppCompatActivity {

    private TextView mTextPosts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        mTextPosts = findViewById(R.id.tv_posts);
        AppServiceClient.getMyApiInstance(this).getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                List<Post> result = response.body();
                for (Post p: result){
                    mTextPosts.append(p.getBody() + "\n");
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });
    }
}
