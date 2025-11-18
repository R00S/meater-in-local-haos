package cm.aptoide.p092pt.timeline;

/* loaded from: classes.dex */
public class TimelineSocialActionData {
    private String action;
    private String cardType;
    private String packageName;
    private String publisher;
    private String socialAction;
    private String title;

    public TimelineSocialActionData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.cardType = str;
        this.action = str2;
        this.socialAction = str3;
        this.packageName = str4;
        this.publisher = str5;
        this.title = str6;
    }

    public String getAction() {
        return this.action;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getSocialAction() {
        return this.socialAction;
    }

    public String getTitle() {
        return this.title;
    }
}
