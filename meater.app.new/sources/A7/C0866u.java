package A7;

import B7.C0888a1;
import B7.C0889b;
import B7.C0897d1;
import B7.C0898e;
import B7.C0960z;
import B7.T0;
import B7.V0;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import g7.C3443n;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0866u {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final InterfaceC0852f f1020a = new C0960z();

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final InterfaceC0847a f1021b = new C0889b();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final InterfaceC0859m f1022c = new T0();

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final InterfaceC0863q f1023d = new C0888a1();

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final InterfaceC0850d f1024e = new C0898e();

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.common.api.a<a> f1025f;

    /* renamed from: g, reason: collision with root package name */
    private static final a.g f1026g;

    /* renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0458a f1027h;

    /* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
    /* renamed from: A7.u$a */
    public static final class a implements a.d {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1028b = new a(new C0019a());

        /* renamed from: a, reason: collision with root package name */
        private final Looper f1029a;

        /* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
        /* renamed from: A7.u$a$a, reason: collision with other inner class name */
        public static class C0019a {

            /* renamed from: a, reason: collision with root package name */
            private Looper f1030a;
        }

        private a(C0019a c0019a) {
            this.f1029a = c0019a.f1030a;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return C3443n.b(a.class);
        }
    }

    static {
        a.g gVar = new a.g();
        f1026g = gVar;
        Q q10 = new Q();
        f1027h = q10;
        f1025f = new com.google.android.gms.common.api.a<>("Wearable.API", q10, gVar);
    }

    public static AbstractC0853g a(Context context) {
        return new B7.B(context, b.a.f33481c);
    }

    public static AbstractC0860n b(Context context) {
        return new V0(context, b.a.f33481c);
    }

    public static r c(Context context) {
        return new C0897d1(context, b.a.f33481c);
    }
}
