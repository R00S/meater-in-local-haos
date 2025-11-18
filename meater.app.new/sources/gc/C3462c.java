package gc;

import cc.C2361F;
import kotlin.Metadata;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "locked", "Lgc/a;", "a", "(Z)Lgc/a;", "Lcc/F;", "Lcc/F;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: gc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3462c {

    /* renamed from: a, reason: collision with root package name */
    private static final C2361F f42154a = new C2361F("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final C2361F f42155b = new C2361F("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC3460a a(boolean z10) {
        return new C3461b(z10);
    }

    public static /* synthetic */ InterfaceC3460a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
