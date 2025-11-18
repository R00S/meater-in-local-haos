package P5;

import kotlin.Metadata;

/* compiled from: ExternalBrowserTracker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"LP5/o;", "", "<init>", "()V", "Loa/F;", "b", "", "c", "()Z", "a", "Z", "launchedToBrowser", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1607o {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean launchedToBrowser;

    /* renamed from: a, reason: collision with root package name */
    public static final C1607o f14055a = new C1607o();

    /* renamed from: c, reason: collision with root package name */
    public static final int f14057c = 8;

    private C1607o() {
    }

    public final void a() {
        launchedToBrowser = false;
    }

    public final void b() {
        launchedToBrowser = true;
    }

    public final boolean c() {
        return launchedToBrowser;
    }
}
