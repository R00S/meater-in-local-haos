package androidx.media3.exoplayer.dash;

import S2.r;
import U1.s;
import a2.n;
import androidx.media3.exoplayer.dash.f;
import e2.v1;
import g2.C3382b;
import java.util.List;
import o2.InterfaceC4107i;
import q2.x;
import r2.k;

/* compiled from: DashChunkSource.java */
/* loaded from: classes.dex */
public interface a extends InterfaceC4107i {
    void f(x xVar);

    void g(h2.c cVar, int i10);

    /* compiled from: DashChunkSource.java */
    /* renamed from: androidx.media3.exoplayer.dash.a$a, reason: collision with other inner class name */
    public interface InterfaceC0377a {
        a d(k kVar, h2.c cVar, C3382b c3382b, int i10, int[] iArr, x xVar, int i11, long j10, boolean z10, List<s> list, f.c cVar2, n nVar, v1 v1Var, r2.e eVar);

        default InterfaceC0377a a(r.a aVar) {
            return this;
        }

        default InterfaceC0377a b(boolean z10) {
            return this;
        }

        default s c(s sVar) {
            return sVar;
        }
    }
}
