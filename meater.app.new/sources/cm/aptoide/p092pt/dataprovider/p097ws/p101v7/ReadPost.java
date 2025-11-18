package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class ReadPost {

    @JsonProperty("uid")
    private final String postId;

    @JsonProperty("type")
    private final String postType;

    public ReadPost(String str, String str2) {
        this.postId = str;
        this.postType = str2;
    }
}
