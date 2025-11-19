package p2;

import S2.j;
import S2.k;
import S2.r;

/* compiled from: DelegatingSubtitleDecoder.java */
/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4195b extends j {

    /* renamed from: p, reason: collision with root package name */
    private final r f47389p;

    public C4195b(String str, r rVar) {
        super(str);
        this.f47389p = rVar;
    }

    @Override // S2.j
    protected k C(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f47389p.b();
        }
        return this.f47389p.a(bArr, 0, i10);
    }
}
