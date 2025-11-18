package p456rx;

import p456rx.exceptions.MissingBackpressureException;

/* compiled from: BackpressureOverflow.java */
/* renamed from: rx.a */
/* loaded from: classes3.dex */
public final class C11230a {

    /* renamed from: a */
    public static final d f42034a;

    /* renamed from: b */
    public static final d f42035b;

    /* renamed from: c */
    public static final d f42036c;

    /* renamed from: d */
    public static final d f42037d;

    /* compiled from: BackpressureOverflow.java */
    /* renamed from: rx.a$a */
    static final class a implements d {

        /* renamed from: a */
        static final a f42038a = new a();

        private a() {
        }

        @Override // p456rx.C11230a.d
        /* renamed from: a */
        public boolean mo39942a() {
            return false;
        }
    }

    /* compiled from: BackpressureOverflow.java */
    /* renamed from: rx.a$b */
    static final class b implements d {

        /* renamed from: a */
        static final b f42039a = new b();

        private b() {
        }

        @Override // p456rx.C11230a.d
        /* renamed from: a */
        public boolean mo39942a() {
            return true;
        }
    }

    /* compiled from: BackpressureOverflow.java */
    /* renamed from: rx.a$c */
    static final class c implements d {

        /* renamed from: a */
        static final c f42040a = new c();

        private c() {
        }

        @Override // p456rx.C11230a.d
        /* renamed from: a */
        public boolean mo39942a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* compiled from: BackpressureOverflow.java */
    /* renamed from: rx.a$d */
    public interface d {
        /* renamed from: a */
        boolean mo39942a() throws MissingBackpressureException;
    }

    static {
        c cVar = c.f42040a;
        f42034a = cVar;
        f42035b = cVar;
        f42036c = b.f42039a;
        f42037d = a.f42038a;
    }
}
