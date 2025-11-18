package io.sentry.clientreport;

import io.sentry.EnumC9688z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AtomicClientReportStorage.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.a */
/* loaded from: classes2.dex */
final class C9397a implements InterfaceC9404h {

    /* renamed from: a */
    private final Map<C9399c, AtomicLong> f36239a;

    public C9397a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (EnumC9401e enumC9401e : EnumC9401e.values()) {
            for (EnumC9688z0 enumC9688z0 : EnumC9688z0.values()) {
                concurrentHashMap.put(new C9399c(enumC9401e.getReason(), enumC9688z0.getCategory()), new AtomicLong(0L));
            }
        }
        this.f36239a = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.InterfaceC9404h
    /* renamed from: a */
    public List<C9402f> mo30678a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C9399c, AtomicLong> entry : this.f36239a.entrySet()) {
            Long lValueOf = Long.valueOf(entry.getValue().getAndSet(0L));
            if (lValueOf.longValue() > 0) {
                arrayList.add(new C9402f(entry.getKey().m30686b(), entry.getKey().m30685a(), lValueOf));
            }
        }
        return arrayList;
    }

    @Override // io.sentry.clientreport.InterfaceC9404h
    /* renamed from: b */
    public void mo30679b(C9399c c9399c, Long l) {
        AtomicLong atomicLong = this.f36239a.get(c9399c);
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }
}
