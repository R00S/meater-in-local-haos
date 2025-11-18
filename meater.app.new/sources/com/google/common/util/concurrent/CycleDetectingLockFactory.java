package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import m8.AbstractC3979B;
import m8.H;
import m8.I;

/* loaded from: classes2.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f37625a = new I().h().f();

    /* renamed from: b, reason: collision with root package name */
    private static final e f37626b = new e(CycleDetectingLockFactory.class);

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f37627c = new a();

    public static final class PotentialDeadlockException extends b {

        /* renamed from: D, reason: collision with root package name */
        private final b f37628D;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f37628D; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return H.k(3);
        }
    }

    private static class b extends IllegalStateException {

        /* renamed from: B, reason: collision with root package name */
        static final StackTraceElement[] f37629B = new StackTraceElement[0];

        /* renamed from: C, reason: collision with root package name */
        static final AbstractC3979B<String> f37630C = AbstractC3979B.L(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    private static class c {
    }
}
