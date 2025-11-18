package cm.aptoide.accountmanager;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Store {
    private final String avatar;
    private final long downloadCount;

    /* renamed from: id */
    private final long f7082id;
    private final String name;
    private final String password;
    private final boolean publicAccess;
    private final String theme;
    private final String username;

    public Store(long j2, String str, long j3, String str2, String str3, String str4, String str5, boolean z) {
        this.downloadCount = j2;
        this.avatar = str;
        this.f7082id = j3;
        this.name = str2;
        this.theme = str3;
        this.username = str4;
        this.password = str5;
        this.publicAccess = z;
    }

    public static Store emptyStore() {
        return new Store();
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getId() {
        return this.f7082id;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean hasPublicAccess() {
        return this.publicAccess;
    }

    private Store() {
        this.downloadCount = 0L;
        this.avatar = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f7082id = 0L;
        this.name = HttpUrl.FRAGMENT_ENCODE_SET;
        this.theme = "DEFAULT";
        this.username = HttpUrl.FRAGMENT_ENCODE_SET;
        this.password = HttpUrl.FRAGMENT_ENCODE_SET;
        this.publicAccess = true;
    }
}
