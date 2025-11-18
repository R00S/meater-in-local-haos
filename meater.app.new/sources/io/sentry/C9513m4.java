package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.C9550i;
import io.sentry.protocol.C9557p;
import io.sentry.protocol.C9562u;
import io.sentry.protocol.C9563v;
import io.sentry.protocol.C9564w;
import io.sentry.util.C9646q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryExceptionFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.m4 */
/* loaded from: classes2.dex */
public final class C9513m4 {

    /* renamed from: a */
    private final C9692z4 f36501a;

    public C9513m4(C9692z4 c9692z4) {
        this.f36501a = (C9692z4) C9646q.m31802c(c9692z4, "The SentryStackTraceFactory is required.");
    }

    /* renamed from: b */
    private C9557p m31063b(Throwable th, C9550i c9550i, Long l, List<C9562u> list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        C9557p c9557p = new C9557p();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            C9563v c9563v = new C9563v(list);
            if (z) {
                c9563v.m31501e(Boolean.TRUE);
            }
            c9557p.m31446l(c9563v);
        }
        c9557p.m31447m(l);
        c9557p.m31448n(name);
        c9557p.m31444j(c9550i);
        c9557p.m31445k(name2);
        c9557p.m31450p(message);
        return c9557p;
    }

    /* renamed from: d */
    private List<C9557p> m31064d(Deque<C9557p> deque) {
        return new ArrayList(deque);
    }

    /* renamed from: a */
    Deque<C9557p> m31065a(Throwable th) {
        Thread threadCurrentThread;
        C9550i c9550i;
        boolean zM30782d;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                C9550i c9550iM30779a = exceptionMechanismException.m30779a();
                Throwable thM30781c = exceptionMechanismException.m30781c();
                threadCurrentThread = exceptionMechanismException.m30780b();
                zM30782d = exceptionMechanismException.m30782d();
                c9550i = c9550iM30779a;
                th = thM30781c;
            } else {
                threadCurrentThread = Thread.currentThread();
                c9550i = null;
                zM30782d = false;
            }
            arrayDeque.addFirst(m31063b(th, c9550i, Long.valueOf(threadCurrentThread.getId()), this.f36501a.m31960a(th.getStackTrace()), zM30782d));
            th = th.getCause();
        }
        return arrayDeque;
    }

    /* renamed from: c */
    public List<C9557p> m31066c(Throwable th) {
        return m31064d(m31065a(th));
    }

    /* renamed from: e */
    public List<C9557p> m31067e(C9564w c9564w, C9550i c9550i, Throwable th) {
        C9563v c9563vM31518n = c9564w.m31518n();
        if (c9563vM31518n == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(m31063b(th, c9550i, c9564w.m31516l(), c9563vM31518n.m31500d(), true));
        return arrayList;
    }
}
