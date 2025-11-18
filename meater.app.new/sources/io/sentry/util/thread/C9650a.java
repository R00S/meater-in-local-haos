package io.sentry.util.thread;

import io.sentry.protocol.C9564w;

/* compiled from: IMainThreadChecker.java */
/* renamed from: io.sentry.util.thread.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9650a {
    /* renamed from: a */
    public static boolean m31812a(InterfaceC9651b _this) {
        return _this.mo30276c(Thread.currentThread());
    }

    /* renamed from: b */
    public static boolean m31813b(InterfaceC9651b _this, C9564w c9564w) {
        Long lM31516l = c9564w.m31516l();
        return lM31516l != null && _this.mo30274a(lM31516l.longValue());
    }

    /* renamed from: c */
    public static boolean m31814c(InterfaceC9651b _this, Thread thread) {
        return _this.mo30274a(thread.getId());
    }
}
