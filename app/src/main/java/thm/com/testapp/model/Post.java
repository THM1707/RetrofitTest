package thm.com.testapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Post implements Serializable {
    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("userId")
    @Expose
    private int mUserId;
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("body")
    @Expose
    private String mBody;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        mUserId = userId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }
}
