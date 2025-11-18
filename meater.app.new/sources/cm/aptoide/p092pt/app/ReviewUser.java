package cm.aptoide.p092pt.app;

/* loaded from: classes.dex */
public class ReviewUser {
    private final String avatar;

    /* renamed from: id */
    private final long f7569id;
    private final String name;

    public ReviewUser(long j2, String str, String str2) {
        this.f7569id = j2;
        this.avatar = str;
        this.name = str2;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f7569id;
    }

    public String getName() {
        return this.name;
    }
}
