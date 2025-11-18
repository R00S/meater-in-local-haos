package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation.java */
/* renamed from: androidx.work.q */
/* loaded from: classes.dex */
public interface InterfaceC0810q {

    /* renamed from: a */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f4983a;

    /* renamed from: b */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C11443b f4984b;

    /* compiled from: Operation.java */
    /* renamed from: androidx.work.q$b */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.q$b$a */
        public static final class a extends b {

            /* renamed from: a */
            private final Throwable f4985a;

            public a(Throwable th) {
                this.f4985a = th;
            }

            /* renamed from: a */
            public Throwable m5234a() {
                return this.f4985a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f4985a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.q$b$b, reason: collision with other inner class name */
        public static final class C11443b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C11443b() {
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.q$b$c */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f4983a = new b.c();
        f4984b = new b.C11443b();
    }
}
