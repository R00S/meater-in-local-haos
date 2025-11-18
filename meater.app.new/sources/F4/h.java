package F4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MEATERCloudSyncingManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"LF4/h;", "", "<init>", "()V", "Loa/F;", "c", "b", "a", "d", "", "LF4/g;", "Ljava/util/List;", "SYNC_LIST", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4556a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static List<g> SYNC_LIST;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4558c;

    static {
        List<g> listAsList = Arrays.asList(d.f4532f, f.f4544f);
        C3862t.f(listAsList, "asList(...)");
        SYNC_LIST = listAsList;
        f4558c = 8;
    }

    private h() {
    }

    public final void a() {
        U4.b.v("MEATERCloudSyncingManager: clearCloudCredential", new Object[0]);
        Iterator<g> it = SYNC_LIST.iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    public final void b() {
        U4.b.v("MEATERCloudSyncingManager: resetAllFullSyncStoredHashes", new Object[0]);
        Iterator<g> it = SYNC_LIST.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void c() {
        U4.b.v("MEATERCloudSyncingManager: syncAll", new Object[0]);
        Iterator<g> it = SYNC_LIST.iterator();
        while (it.hasNext()) {
            it.next().t();
        }
    }

    public final void d() {
        U4.b.v("MEATERCloudSyncingManager: uploadAllIfNeeded", new Object[0]);
        Iterator<g> it = SYNC_LIST.iterator();
        while (it.hasNext()) {
            it.next().w();
        }
    }
}
