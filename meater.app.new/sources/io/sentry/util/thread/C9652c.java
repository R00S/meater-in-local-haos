package io.sentry.util.thread;

import io.sentry.protocol.C9564w;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MainThreadChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.thread.c */
/* loaded from: classes2.dex */
public final class C9652c implements InterfaceC9651b {

    /* renamed from: a */
    private static final long f36937a = Thread.currentThread().getId();

    /* renamed from: b */
    private static final C9652c f36938b = new C9652c();

    private C9652c() {
    }

    /* renamed from: e */
    public static C9652c m31815e() {
        return f36938b;
    }

    @Override // io.sentry.util.thread.InterfaceC9651b
    /* renamed from: a */
    public boolean mo30274a(long j2) {
        return f36937a == j2;
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
