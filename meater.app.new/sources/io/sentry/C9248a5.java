package io.sentry;

import io.sentry.protocol.C9562u;
import io.sentry.protocol.C9563v;
import io.sentry.protocol.C9564w;
import io.sentry.util.C9646q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryThreadFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.a5 */
/* loaded from: classes2.dex */
public final class C9248a5 {

    /* renamed from: a */
    private final C9692z4 f35749a;

    /* renamed from: b */
    private final C9680x4 f35750b;

    public C9248a5(C9692z4 c9692z4, C9680x4 c9680x4) {
        this.f35749a = (C9692z4) C9646q.m31802c(c9692z4, "The SentryStackTraceFactory is required.");
        this.f35750b = (C9680x4) C9646q.m31802c(c9680x4, "The SentryOptions is required");
    }

    /* renamed from: d */
    private C9564w m30052d(boolean z, StackTraceElement[] stackTraceElementArr, Thread thread) {
        C9564w c9564w = new C9564w();
        c9564w.m31527w(thread.getName());
        c9564w.m31528x(Integer.valueOf(thread.getPriority()));
        c9564w.m31525u(Long.valueOf(thread.getId()));
        c9564w.m31523s(Boolean.valueOf(thread.isDaemon()));
        c9564w.m31530z(thread.getState().name());
        c9564w.m31521q(Boolean.valueOf(z));
        List<C9562u> listM31960a = this.f35749a.m31960a(stackTraceElementArr);
        if (this.f35750b.isAttachStacktrace() && listM31960a != null && !listM31960a.isEmpty()) {
            C9563v c9563v = new C9563v(listM31960a);
            c9563v.m31501e(Boolean.TRUE);
            c9564w.m31529y(c9563v);
        }
        return c9564w;
    }

    /* renamed from: a */
    List<C9564w> m30053a() {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return m30055c(map, null, false);
    }

    /* renamed from: b */
    List<C9564w> m30054b(List<Long> list, boolean z) {
        return m30055c(Thread.getAllStackTraces(), list, z);
    }

    /* renamed from: c */
    List<C9564w> m30055c(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(m30052d((key == threadCurrentThread && !z) || (list != null && list.contains(Long.valueOf(key.getId()))), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}
