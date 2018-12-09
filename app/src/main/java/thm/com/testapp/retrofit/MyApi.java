package thm.com.testapp.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import thm.com.testapp.model.Post;

public interface MyApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}
