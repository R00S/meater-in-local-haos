package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.reactions.data.TopReaction;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ActionItem {
    private final String captionColor;
    private final String cardId;
    private final String date;
    private final String featureGraphic;
    private final String flair;
    private final String icon;
    private final String packageName;
    private final String subTitle;
    private final String summary;
    private final String title;
    private final String type;
    private final String url;
    private List<TopReaction> reactionList = Collections.emptyList();
    private int total = -1;
    private String userReaction = HttpUrl.FRAGMENT_ENCODE_SET;

    public ActionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.cardId = str;
        this.type = str2;
        this.title = str3;
        this.subTitle = str4;
        this.icon = str5;
        this.url = str6;
        this.date = str7;
        this.captionColor = str8;
        this.packageName = str11;
        this.featureGraphic = str12;
        this.flair = str9;
        this.summary = str10;
    }

    public String getCaptionColor() {
        return this.captionColor;
    }

    public String getCardId() {
        return this.cardId;
    }

    public String getDate() {
        return this.date;
    }

    public String getFeatureGraphic() {
        return this.featureGraphic;
    }

    public String getFlair() {
        return this.flair;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<TopReaction> getReactionList() {
        return this.reactionList;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotal() {
        return this.total;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserReaction() {
        return this.userReaction;
    }

    public void setNumberOfReactions(int i2) {
        this.total = i2;
    }

    public void setReactions(List<TopReaction> list) {
        this.reactionList = list;
    }

    public void setUserReaction(String str) {
        this.userReaction = str;
    }
}
