package cm.aptoide.p092pt.home.apps.model;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.home.apps.App;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: StateApp.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/model/StateApp;", "Lcm/aptoide/pt/home/apps/App;", "md5", HttpUrl.FRAGMENT_ENCODE_SET, "getMd5", "()Ljava/lang/String;", "packageName", "getPackageName", "progress", HttpUrl.FRAGMENT_ENCODE_SET, "getProgress", "()I", "status", "Lcm/aptoide/pt/home/apps/model/StateApp$Status;", "getStatus", "()Lcm/aptoide/pt/home/apps/model/StateApp$Status;", RoomInstalled.VERSION_CODE, "getVersionCode", "Status", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface StateApp extends App {

    /* compiled from: StateApp.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/model/StateApp$Status;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "ACTIVE", "INSTALLING", "PAUSE", "ERROR", "STANDBY", "IN_QUEUE", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Status {
        ACTIVE,
        INSTALLING,
        PAUSE,
        ERROR,
        STANDBY,
        IN_QUEUE
    }

    String getMd5();

    String getPackageName();

    int getProgress();

    Status getStatus();

    int getVersionCode();
}
