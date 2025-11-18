package io.sentry;

import io.sentry.protocol.C9562u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryStackTraceFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.z4 */
/* loaded from: classes2.dex */
public final class C9692z4 {

    /* renamed from: a */
    private final C9680x4 f37028a;

    public C9692z4(C9680x4 c9680x4) {
        this.f37028a = c9680x4;
    }

    /* renamed from: a */
    public List<C9562u> m31960a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    C9562u c9562u = new C9562u();
                    c9562u.m31489t(m31961b(className));
                    c9562u.m31492w(className);
                    c9562u.m31488s(stackTraceElement.getMethodName());
                    c9562u.m31487r(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        c9562u.m31490u(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    c9562u.m31493x(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(c9562u);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public Boolean m31961b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f37028a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f37028a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
