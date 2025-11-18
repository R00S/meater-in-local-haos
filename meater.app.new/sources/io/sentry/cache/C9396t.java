package io.sentry.cache;

import io.sentry.C9436f5;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.C9683y1;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9689z1;
import io.sentry.protocol.C9543c;
import java.util.Collection;

/* compiled from: PersistingScopeObserver.java */
/* renamed from: io.sentry.cache.t */
/* loaded from: classes2.dex */
public final class C9396t implements InterfaceC9689z1 {

    /* renamed from: a */
    private final C9680x4 f36238a;

    public C9396t(C9680x4 c9680x4) {
        this.f36238a = c9680x4;
    }

    /* renamed from: e */
    private void m30663e(String str) {
        C9392p.m30620a(this.f36238a, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30673g(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.f36238a.getLogger().mo30213b(EnumC9587s4.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30674j(Collection collection) {
        m30672t(collection, "breadcrumbs.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30675l(C9543c c9543c) {
        m30672t(c9543c, "contexts.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30676n(C9436f5 c9436f5) {
        if (c9436f5 == null) {
            m30663e("trace.json");
        } else {
            m30672t(c9436f5, "trace.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30677p(String str) {
        if (str == null) {
            m30663e("transaction.json");
        } else {
            m30672t(str, "transaction.json");
        }
    }

    /* renamed from: q */
    public static <T> T m30669q(C9680x4 c9680x4, String str, Class<T> cls) {
        return (T) m30670r(c9680x4, str, cls, null);
    }

    /* renamed from: r */
    public static <T, R> T m30670r(C9680x4 c9680x4, String str, Class<T> cls, InterfaceC9504l2<R> interfaceC9504l2) {
        return (T) C9392p.m30622c(c9680x4, ".scope-cache", str, cls, interfaceC9504l2);
    }

    /* renamed from: s */
    private void m30671s(final Runnable runnable) {
        try {
            this.f36238a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36221f.m30673g(runnable);
                }
            });
        } catch (Throwable th) {
            this.f36238a.getLogger().mo30213b(EnumC9587s4.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    /* renamed from: t */
    private <T> void m30672t(T t, String str) {
        C9392p.m30623d(this.f36238a, t, ".scope-cache", str);
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: a */
    public void mo30480a(final Collection<C9657v0> collection) {
        m30671s(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f36223f.m30674j(collection);
            }
        });
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: b */
    public void mo30481b(final C9543c c9543c) {
        m30671s(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f36227f.m30675l(c9543c);
            }
        });
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: c */
    public void mo30482c(final C9436f5 c9436f5) {
        m30671s(new Runnable() { // from class: io.sentry.cache.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f36225f.m30676n(c9436f5);
            }
        });
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: d */
    public void mo30483d(final String str) {
        m30671s(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f36219f.m30677p(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: i */
    public /* synthetic */ void mo30484i(C9657v0 c9657v0) {
        C9683y1.m31952a(this, c9657v0);
    }
}
