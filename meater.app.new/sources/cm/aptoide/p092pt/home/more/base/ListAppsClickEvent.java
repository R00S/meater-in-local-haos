package cm.aptoide.p092pt.home.more.base;

import cm.aptoide.p092pt.view.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ListAppsClickEvent.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "T", "Lcm/aptoide/pt/view/app/Application;", HttpUrl.FRAGMENT_ENCODE_SET, "application", "appPosition", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcm/aptoide/pt/view/app/Application;I)V", "getAppPosition", "()I", "getApplication", "()Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/view/app/Application;", "component1", "component2", "copy", "(Lcm/aptoide/pt/view/app/Application;I)Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListAppsClickEvent<T extends Application> {
    private final int appPosition;
    private final T application;

    public ListAppsClickEvent(T t, int i2) {
        C9801m.m32346f(t, "application");
        this.application = t;
        this.appPosition = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListAppsClickEvent copy$default(ListAppsClickEvent listAppsClickEvent, Application application, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            application = listAppsClickEvent.application;
        }
        if ((i3 & 2) != 0) {
            i2 = listAppsClickEvent.appPosition;
        }
        return listAppsClickEvent.copy(application, i2);
    }

    public final T component1() {
        return this.application;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAppPosition() {
        return this.appPosition;
    }

    public final ListAppsClickEvent<T> copy(T application, int appPosition) {
        C9801m.m32346f(application, "application");
        return new ListAppsClickEvent<>(application, appPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListAppsClickEvent)) {
            return false;
        }
        ListAppsClickEvent listAppsClickEvent = (ListAppsClickEvent) other;
        return C9801m.m32341a(this.application, listAppsClickEvent.application) && this.appPosition == listAppsClickEvent.appPosition;
    }

    public final int getAppPosition() {
        return this.appPosition;
    }

    public final T getApplication() {
        return this.application;
    }

    public int hashCode() {
        return (this.application.hashCode() * 31) + this.appPosition;
    }

    public String toString() {
        return "ListAppsClickEvent(application=" + this.application + ", appPosition=" + this.appPosition + ')';
    }
}
