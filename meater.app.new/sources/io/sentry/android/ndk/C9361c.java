package io.sentry.android.ndk;

import io.sentry.C9244a1;
import io.sentry.C9436f5;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.C9683y1;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9689z1;
import io.sentry.protocol.C9543c;
import io.sentry.util.C9646q;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NdkScopeObserver.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.ndk.c */
/* loaded from: classes2.dex */
public final class C9361c implements InterfaceC9689z1 {

    /* renamed from: a */
    private final C9680x4 f36142a;

    /* renamed from: b */
    private final InterfaceC9360b f36143b;

    public C9361c(C9680x4 c9680x4) {
        this(c9680x4, new NativeScope());
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: a */
    public /* synthetic */ void mo30480a(Collection collection) {
        C9683y1.m31953b(this, collection);
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: b */
    public /* synthetic */ void mo30481b(C9543c c9543c) {
        C9683y1.m31954c(this, c9543c);
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: c */
    public /* synthetic */ void mo30482c(C9436f5 c9436f5) {
        C9683y1.m31955d(this, c9436f5);
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: d */
    public /* synthetic */ void mo30483d(String str) {
        C9683y1.m31956e(this, str);
    }

    @Override // io.sentry.InterfaceC9689z1
    /* renamed from: i */
    public void mo30484i(C9657v0 c9657v0) {
        try {
            String strMo30492f = null;
            String lowerCase = c9657v0.m31836h() != null ? c9657v0.m31836h().name().toLowerCase(Locale.ROOT) : null;
            String strM30012g = C9244a1.m30012g(c9657v0.m31838j());
            try {
                Map<String, Object> mapM31835g = c9657v0.m31835g();
                if (!mapM31835g.isEmpty()) {
                    strMo30492f = this.f36142a.getSerializer().mo30492f(mapM31835g);
                }
            } catch (Throwable th) {
                this.f36142a.getLogger().mo30212a(EnumC9587s4.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
            }
            this.f36143b.mo30479a(lowerCase, c9657v0.m31837i(), c9657v0.m31834f(), c9657v0.m31839k(), strM30012g, strMo30492f);
        } catch (Throwable th2) {
            this.f36142a.getLogger().mo30212a(EnumC9587s4.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    C9361c(C9680x4 c9680x4, InterfaceC9360b interfaceC9360b) {
        this.f36142a = (C9680x4) C9646q.m31802c(c9680x4, "The SentryOptions object is required.");
        this.f36143b = (InterfaceC9360b) C9646q.m31802c(interfaceC9360b, "The NativeScope object is required.");
    }
}
