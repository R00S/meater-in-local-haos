package io.sentry;

import io.sentry.protocol.C9565x;
import io.sentry.util.C9646q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: DuplicateEventDetectionEventProcessor.java */
/* renamed from: io.sentry.g1 */
/* loaded from: classes2.dex */
public final class C9439g1 implements InterfaceC9496k1 {

    /* renamed from: f */
    private final Map<Throwable, Object> f36335f = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: g */
    private final C9680x4 f36336g;

    public C9439g1(C9680x4 c9680x4) {
        this.f36336g = (C9680x4) C9646q.m31802c(c9680x4, "options are required");
    }

    /* renamed from: a */
    private static List<Throwable> m30810a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th.getCause() != null) {
            arrayList.add(th.getCause());
            th = th.getCause();
        }
        return arrayList;
    }

    /* renamed from: c */
    private static <T> boolean m30811c(Map<T, Object> map, List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        if (this.f36336g.isEnableDeduplication()) {
            Throwable thM30587O = c9506l4.m30587O();
            if (thM30587O != null) {
                if (this.f36335f.containsKey(thM30587O) || m30811c(this.f36335f, m30810a(thM30587O))) {
                    this.f36336g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c9506l4.m30579G());
                    return null;
                }
                this.f36335f.put(thM30587O, null);
            }
        } else {
            this.f36336g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return c9506l4;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public /* synthetic */ C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        return C9489j1.m30876a(this, c9565x, c9517n1);
    }
}
