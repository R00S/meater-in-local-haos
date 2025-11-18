package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: CompositePropertiesProvider.java */
/* renamed from: io.sentry.config.c */
/* loaded from: classes2.dex */
final class C9408c implements InterfaceC9412g {

    /* renamed from: a */
    private final List<InterfaceC9412g> f36256a;

    public C9408c(List<InterfaceC9412g> list) {
        this.f36256a = list;
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: a */
    public Map<String, String> mo30701a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<InterfaceC9412g> it = this.f36256a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().mo30701a(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: b */
    public String mo30702b(String str) {
        Iterator<InterfaceC9412g> it = this.f36256a.iterator();
        while (it.hasNext()) {
            String strMo30702b = it.next().mo30702b(str);
            if (strMo30702b != null) {
                return strMo30702b;
            }
        }
        return null;
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: c */
    public /* synthetic */ Boolean mo30703c(String str) {
        return C9411f.m30711a(this, str);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: d */
    public /* synthetic */ Long mo30704d(String str) {
        return C9411f.m30714d(this, str);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: e */
    public /* synthetic */ Double mo30705e(String str) {
        return C9411f.m30712b(this, str);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: f */
    public /* synthetic */ String mo30706f(String str, String str2) {
        return C9411f.m30715e(this, str, str2);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: g */
    public /* synthetic */ List mo30707g(String str) {
        return C9411f.m30713c(this, str);
    }
}
