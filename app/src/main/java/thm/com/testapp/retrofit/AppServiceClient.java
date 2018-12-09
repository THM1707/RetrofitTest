package thm.com.testapp.retrofit;

import android.content.Context;

/**
 * Created by thm on 15/03/2018.
 */
public class AppServiceClient extends ServiceClient {
    private static MyApi mMyApiInstance;

    public static MyApi getMyApiInstance(Context context) {
        if (mMyApiInstance == null) {
            mMyApiInstance = createService(context, "https://jsonplaceholder.typicode.com", MyApi.class);
        }
        return mMyApiInstance;
    }
}
