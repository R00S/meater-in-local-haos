package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import cm.aptoide.p092pt.home.apps.model.InstalledApp;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AppsModel.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/AppsModel;", HttpUrl.FRAGMENT_ENCODE_SET, "updates", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "installed", "Lcm/aptoide/pt/home/apps/model/InstalledApp;", RoomStore.DOWNLOADS, "Lcm/aptoide/pt/home/apps/model/DownloadApp;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDownloads", "()Ljava/util/List;", "getInstalled", "getUpdates", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppsModel {
    private final List<DownloadApp> downloads;
    private final List<InstalledApp> installed;
    private final List<UpdateApp> updates;

    /* JADX WARN: Multi-variable type inference failed */
    public AppsModel(List<UpdateApp> list, List<? extends InstalledApp> list2, List<DownloadApp> list3) {
        C9801m.m32346f(list, "updates");
        C9801m.m32346f(list2, "installed");
        C9801m.m32346f(list3, RoomStore.DOWNLOADS);
        this.updates = list;
        this.installed = list2;
        this.downloads = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppsModel copy$default(AppsModel appsModel, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = appsModel.updates;
        }
        if ((i2 & 2) != 0) {
            list2 = appsModel.installed;
        }
        if ((i2 & 4) != 0) {
            list3 = appsModel.downloads;
        }
        return appsModel.copy(list, list2, list3);
    }

    public final List<UpdateApp> component1() {
        return this.updates;
    }

    public final List<InstalledApp> component2() {
        return this.installed;
    }

    public final List<DownloadApp> component3() {
        return this.downloads;
    }

    public final AppsModel copy(List<UpdateApp> updates, List<? extends InstalledApp> installed, List<DownloadApp> downloads) {
        C9801m.m32346f(updates, "updates");
        C9801m.m32346f(installed, "installed");
        C9801m.m32346f(downloads, RoomStore.DOWNLOADS);
        return new AppsModel(updates, installed, downloads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsModel)) {
            return false;
        }
        AppsModel appsModel = (AppsModel) other;
        return C9801m.m32341a(this.updates, appsModel.updates) && C9801m.m32341a(this.installed, appsModel.installed) && C9801m.m32341a(this.downloads, appsModel.downloads);
    }

    public final List<DownloadApp> getDownloads() {
        return this.downloads;
    }

    public final List<InstalledApp> getInstalled() {
        return this.installed;
    }

    public final List<UpdateApp> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        return (((this.updates.hashCode() * 31) + this.installed.hashCode()) * 31) + this.downloads.hashCode();
    }

    public String toString() {
        return "AppsModel(updates=" + this.updates + ", installed=" + this.installed + ", downloads=" + this.downloads + ')';
    }
}
