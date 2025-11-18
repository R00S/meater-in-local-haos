package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.C9564w;
import io.sentry.util.thread.C9650a;
import io.sentry.util.thread.InterfaceC9651b;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidMainThreadChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.h */
/* loaded from: classes2.dex */
public final class C9311h implements InterfaceC9651b {

    /* renamed from: a */
    private static final C9311h f35995a = new C9311h();

    private C9311h() {
    }

    /* renamed from: e */
    public static C9311h m30273e() {
        return f35995a;
    }

    @Override // io.sentry.util.thread.InterfaceC9651b
    /* renamed from: a */
    public boolean mo30274a(long j2) {
        return Looper.getMainLooper().getThread().getId() == j2;
    }

    @Override // io.sentry.util.thread.InterfaceC9651b
    /* renamed from: b */
    public /* synthetic */ boolean mo30275b(C9564w c9564w) {
        return C9650a.m31813b(this, c9564w);
    }

    @Override // io.sentry.util.thread.InterfaceC9651b
    /* renamed from: c */
    public /* synthetic */ boolean mo30276c(Thread thread) {
        return C9650a.m31814c(this, thread);
    }

    @Override // io.sentry.util.thread.InterfaceC9651b
    /* renamed from: d */
    public /* synthetic */ boolean mo30277d() {
        return C9650a.m31812a(this);
    }
}
