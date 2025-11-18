package D2;

import X1.C1804a;
import v2.InterfaceC4811q;
import v2.z;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes.dex */
final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    private final long f3363b;

    public d(InterfaceC4811q interfaceC4811q, long j10) {
        super(interfaceC4811q);
        C1804a.a(interfaceC4811q.getPosition() >= j10);
        this.f3363b = j10;
    }

    @Override // v2.z, v2.InterfaceC4811q
    public long a() {
        return super.a() - this.f3363b;
    }

    @Override // v2.z, v2.InterfaceC4811q
    public long getPosition() {
        return super.getPosition() - this.f3363b;
    }

    @Override // v2.z, v2.InterfaceC4811q
    public long i() {
        return super.i() - this.f3363b;
    }
}
