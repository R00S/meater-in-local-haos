package io.sentry.util.thread;

import io.sentry.protocol.C9564w;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NoOpMainThreadChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.thread.d */
/* loaded from: classes2.dex */
public final class C9653d implements InterfaceC9651b {

    /* renamed from: a */
    private static final C9653d f36939a = new C9653d();

    /* renamed from: e */
    public static C9653d m31816e() {
        return f36939a;
    }

    @Override // io.sentry.util.thread.InterfaceC9651b
    /* renamed from: a */
    public boolean mo30274a(long j2) {
        return false;
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
