package e7;

import c7.C2335d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import g7.C3445p;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3225o<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final C2335d[] f40719a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40720b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40721c;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    /* renamed from: e7.o$a */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC3223m f40722a;

        /* renamed from: c, reason: collision with root package name */
        private C2335d[] f40724c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f40723b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f40725d = 0;

        /* synthetic */ a(W w10) {
        }

        public AbstractC3225o<A, ResultT> a() {
            C3445p.b(this.f40722a != null, "execute parameter required");
            return new V(this, this.f40724c, this.f40723b, this.f40725d);
        }

        public a<A, ResultT> b(InterfaceC3223m<A, C5209k<ResultT>> interfaceC3223m) {
            this.f40722a = interfaceC3223m;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f40723b = z10;
            return this;
        }

        public a<A, ResultT> d(C2335d... c2335dArr) {
            this.f40724c = c2335dArr;
            return this;
        }
    }

    protected AbstractC3225o(C2335d[] c2335dArr, boolean z10, int i10) {
        this.f40719a = c2335dArr;
        boolean z11 = false;
        if (c2335dArr != null && z10) {
            z11 = true;
        }
        this.f40720b = z11;
        this.f40721c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a10, C5209k<ResultT> c5209k);

    public boolean c() {
        return this.f40720b;
    }

    public final int d() {
        return this.f40721c;
    }

    public final C2335d[] e() {
        return this.f40719a;
    }
}
