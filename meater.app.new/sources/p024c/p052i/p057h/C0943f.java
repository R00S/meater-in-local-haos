package p024c.p052i.p057h;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p024c.p052i.p059j.C0959i;

/* compiled from: FontsContractCompat.java */
/* renamed from: c.i.h.f */
/* loaded from: classes.dex */
public class C0943f {

    /* compiled from: FontsContractCompat.java */
    /* renamed from: c.i.h.f$a */
    public static class a {

        /* renamed from: a */
        private final int f6344a;

        /* renamed from: b */
        private final b[] f6345b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.f6344a = i2;
            this.f6345b = bVarArr;
        }

        /* renamed from: a */
        static a m5997a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        /* renamed from: b */
        public b[] m5998b() {
            return this.f6345b;
        }

        /* renamed from: c */
        public int m5999c() {
            return this.f6344a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: c.i.h.f$b */
    public static class b {

        /* renamed from: a */
        private final Uri f6346a;

        /* renamed from: b */
        private final int f6347b;

        /* renamed from: c */
        private final int f6348c;

        /* renamed from: d */
        private final boolean f6349d;

        /* renamed from: e */
        private final int f6350e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            this.f6346a = (Uri) C0959i.m6065c(uri);
            this.f6347b = i2;
            this.f6348c = i3;
            this.f6349d = z;
            this.f6350e = i4;
        }

        /* renamed from: a */
        static b m6000a(Uri uri, int i2, int i3, boolean z, int i4) {
            return new b(uri, i2, i3, z, i4);
        }

        /* renamed from: b */
        public int m6001b() {
            return this.f6350e;
        }

        /* renamed from: c */
        public int m6002c() {
            return this.f6347b;
        }

        /* renamed from: d */
        public Uri m6003d() {
            return this.f6346a;
        }

        /* renamed from: e */
        public int m6004e() {
            return this.f6348c;
        }

        /* renamed from: f */
        public boolean m6005f() {
            return this.f6349d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: c.i.h.f$c */
    public static class c {
        /* renamed from: a */
        public void mo5916a(int i2) {
            throw null;
        }

        /* renamed from: b */
        public void mo5917b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m5996a(Context context, C0941d c0941d, int i2, boolean z, int i3, Handler handler, c cVar) {
        C0938a c0938a = new C0938a(cVar, handler);
        return z ? C0942e.m5989e(context, c0941d, c0938a, i2, i3) : C0942e.m5988d(context, c0941d, i2, null, c0938a);
    }
}
