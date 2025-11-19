package D2;

import v2.C4794A;
import v2.J;
import v2.K;
import v2.O;
import v2.r;

/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: B, reason: collision with root package name */
    private final long f3364B;

    /* renamed from: C, reason: collision with root package name */
    private final r f3365C;

    /* compiled from: StartOffsetExtractorOutput.java */
    class a extends C4794A {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f3366b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f3366b = j11;
        }

        @Override // v2.C4794A, v2.J
        public J.a k(long j10) {
            J.a aVarK = this.f3366b.k(j10);
            K k10 = aVarK.f51049a;
            K k11 = new K(k10.f51054a, k10.f51055b + e.this.f3364B);
            K k12 = aVarK.f51050b;
            return new J.a(k11, new K(k12.f51054a, k12.f51055b + e.this.f3364B));
        }
    }

    public e(long j10, r rVar) {
        this.f3364B = j10;
        this.f3365C = rVar;
    }

    @Override // v2.r
    public O a(int i10, int i11) {
        return this.f3365C.a(i10, i11);
    }

    @Override // v2.r
    public void f(J j10) {
        this.f3365C.f(new a(j10, j10));
    }

    @Override // v2.r
    public void n() {
        this.f3365C.n();
    }
}
