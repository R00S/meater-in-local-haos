package o2;

import S2.r;
import U1.s;
import e2.v1;
import java.util.List;
import v2.C4801g;
import v2.InterfaceC4811q;
import v2.O;

/* compiled from: ChunkExtractor.java */
/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4104f {

    /* compiled from: ChunkExtractor.java */
    /* renamed from: o2.f$b */
    public interface b {
        O a(int i10, int i11);
    }

    s[] b();

    void c();

    boolean d(InterfaceC4811q interfaceC4811q);

    void e(b bVar, long j10, long j11);

    C4801g g();

    /* compiled from: ChunkExtractor.java */
    /* renamed from: o2.f$a */
    public interface a {
        InterfaceC4104f d(int i10, s sVar, boolean z10, List<s> list, O o10, v1 v1Var);

        default a a(r.a aVar) {
            return this;
        }

        default a b(boolean z10) {
            return this;
        }

        default s c(s sVar) {
            return sVar;
        }
    }
}
