package cm.aptoide.p092pt.reactions.network;

import cm.aptoide.p092pt.reactions.data.TopReaction;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class LoadReactionModel {
    private final String myReaction;
    private final List<TopReaction> topReactionList;
    private final int total;
    private final String userId;

    public LoadReactionModel(int i2, String str, String str2, List<TopReaction> list) {
        this.userId = str2;
        this.topReactionList = list;
        this.total = i2;
        this.myReaction = str;
    }

    public String getMyReaction() {
        return this.myReaction;
    }

    public List<TopReaction> getTopReactionList() {
        return this.topReactionList;
    }

    public int getTotal() {
        return this.total;
    }

    public String getUserId() {
        return this.userId;
    }

    public LoadReactionModel() {
        this.total = -1;
        this.myReaction = HttpUrl.FRAGMENT_ENCODE_SET;
        this.userId = HttpUrl.FRAGMENT_ENCODE_SET;
        this.topReactionList = Collections.emptyList();
    }
}
