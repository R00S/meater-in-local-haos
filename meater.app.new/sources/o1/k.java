package o1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import j1.C3724i;
import j1.C3725j;
import java.util.Collections;
import java.util.List;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class k {

    /* compiled from: FontsContractCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f46301a;

        /* renamed from: b, reason: collision with root package name */
        private final int f46302b;

        /* renamed from: c, reason: collision with root package name */
        private final int f46303c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f46304d;

        /* renamed from: e, reason: collision with root package name */
        private final int f46305e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f46301a = (Uri) r1.i.g(uri);
            this.f46302b = i10;
            this.f46303c = i11;
            this.f46304d = z10;
            this.f46305e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f46305e;
        }

        public int c() {
            return this.f46302b;
        }

        public Uri d() {
            return this.f46301a;
        }

        public int e() {
            return this.f46303c;
        }

        public boolean f() {
            return this.f46304d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return C3725j.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, C3724i.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List<e> list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C4098a c4098a = new C4098a(cVar, l.b(handler));
        if (!z10) {
            return i.d(context, list, i10, null, c4098a);
        }
        if (list.size() <= 1) {
            return i.e(context, list.get(0), c4098a, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* compiled from: FontsContractCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f46299a;

        /* renamed from: b, reason: collision with root package name */
        private final List<b[]> f46300b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f46299a = i10;
            this.f46300b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List<b[]> list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return this.f46300b.get(0);
        }

        public List<b[]> d() {
            return this.f46300b;
        }

        public int e() {
            return this.f46299a;
        }

        boolean f() {
            return this.f46300b.size() > 1;
        }

        a(int i10, List<b[]> list) {
            this.f46299a = i10;
            this.f46300b = list;
        }
    }
}
