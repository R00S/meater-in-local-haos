package Xb;

import cc.C2361F;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lcc/F;", "a", "Lcc/F;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "LXb/e0;", "f", "LXb/e0;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2361F f19013a = new C2361F("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final C2361F f19014b = new C2361F("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final C2361F f19015c = new C2361F("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final C2361F f19016d = new C2361F("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final C2361F f19017e = new C2361F("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C1834e0 f19018f = new C1834e0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C1834e0 f19019g = new C1834e0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC1858q0 ? new C1859r0((InterfaceC1858q0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC1858q0 interfaceC1858q0;
        C1859r0 c1859r0 = obj instanceof C1859r0 ? (C1859r0) obj : null;
        return (c1859r0 == null || (interfaceC1858q0 = c1859r0.state) == null) ? obj : interfaceC1858q0;
    }
}
