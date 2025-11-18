package p456rx.exceptions;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import p456rx.p471q.C11412f;

/* loaded from: classes3.dex */
public final class OnErrorThrowable extends RuntimeException {

    public static class OnNextValue extends RuntimeException {

        /* renamed from: f */
        private final Object f42135f;

        /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        static final class C11239a {

            /* renamed from: a */
            static final Set<Class<?>> f42136a = m40135a();

            /* renamed from: a */
            private static Set<Class<?>> m40135a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + m40133b(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.f42135f = obj;
        }

        /* renamed from: b */
        static String m40133b(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (C11239a.f42136a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String strM40567b = C11412f.m40607c().m40611b().m40567b(obj);
            if (strM40567b != null) {
                return strM40567b;
            }
            return obj.getClass().getName() + ".class";
        }

        /* renamed from: a */
        public Object m40134a() {
            return this.f42135f;
        }
    }

    /* renamed from: a */
    public static Throwable m40132a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thM40137b = C11240a.m40137b(th);
        if ((thM40137b instanceof OnNextValue) && ((OnNextValue) thM40137b).m40134a() == obj) {
            return th;
        }
        C11240a.m40136a(th, new OnNextValue(obj));
        return th;
    }
}
