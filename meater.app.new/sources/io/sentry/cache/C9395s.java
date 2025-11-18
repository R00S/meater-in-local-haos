package io.sentry.cache;

import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9677x1;
import io.sentry.protocol.C9556o;
import java.util.Map;

/* compiled from: PersistingOptionsObserver.java */
/* renamed from: io.sentry.cache.s */
/* loaded from: classes2.dex */
public final class C9395s implements InterfaceC9677x1 {

    /* renamed from: a */
    private final C9680x4 f36237a;

    public C9395s(C9680x4 c9680x4) {
        this.f36237a = c9680x4;
    }

    /* renamed from: g */
    private void m30638g(String str) {
        C9392p.m30620a(this.f36237a, ".options-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30656i(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.f36237a.getLogger().mo30213b(EnumC9587s4.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30657k(String str) {
        if (str == null) {
            m30638g("dist.json");
        } else {
            m30649y(str, "dist.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30658m(String str) {
        if (str == null) {
            m30638g("environment.json");
        } else {
            m30649y(str, "environment.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30659o(String str) {
        if (str == null) {
            m30638g("proguard-uuid.json");
        } else {
            m30649y(str, "proguard-uuid.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30660q(String str) {
        if (str == null) {
            m30638g("release.json");
        } else {
            m30649y(str, "release.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30661s(C9556o c9556o) {
        if (c9556o == null) {
            m30638g("sdk-version.json");
        } else {
            m30649y(c9556o, "sdk-version.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30662u(Map map) {
        m30649y(map, "tags.json");
    }

    /* renamed from: v */
    public static <T> T m30646v(C9680x4 c9680x4, String str, Class<T> cls) {
        return (T) m30647w(c9680x4, str, cls, null);
    }

    /* renamed from: w */
    public static <T, R> T m30647w(C9680x4 c9680x4, String str, Class<T> cls, InterfaceC9504l2<R> interfaceC9504l2) {
        return (T) C9392p.m30622c(c9680x4, ".options-cache", str, cls, interfaceC9504l2);
    }

    /* renamed from: x */
    private void m30648x(final Runnable runnable) {
        try {
            this.f36237a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36205f.m30656i(runnable);
                }
            });
        } catch (Throwable th) {
            this.f36237a.getLogger().mo30213b(EnumC9587s4.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    /* renamed from: y */
    private <T> void m30649y(T t, String str) {
        C9392p.m30623d(this.f36237a, t, ".options-cache", str);
    }

    @Override // io.sentry.InterfaceC9677x1
    /* renamed from: a */
    public void mo30650a(final Map<String, String> map) {
        m30648x(new Runnable() { // from class: io.sentry.cache.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f36209f.m30662u(map);
            }
        });
    }

    @Override // io.sentry.InterfaceC9677x1
    /* renamed from: b */
    public void mo30651b(final C9556o c9556o) {
        m30648x(new Runnable() { // from class: io.sentry.cache.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f36207f.m30661s(c9556o);
            }
        });
    }

    @Override // io.sentry.InterfaceC9677x1
    /* renamed from: c */
    public void mo30652c(final String str) {
        m30648x(new Runnable() { // from class: io.sentry.cache.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f36211f.m30657k(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC9677x1
    /* renamed from: d */
    public void mo30653d(final String str) {
        m30648x(new Runnable() { // from class: io.sentry.cache.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f36215f.m30658m(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC9677x1
    /* renamed from: e */
    public void mo30654e(final String str) {
        m30648x(new Runnable() { // from class: io.sentry.cache.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f36213f.m30659o(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC9677x1
    /* renamed from: f */
    public void mo30655f(final String str) {
        m30648x(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f36217f.m30660q(str);
            }
        });
    }
}
