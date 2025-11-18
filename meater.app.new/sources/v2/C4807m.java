package v2;

import U1.InterfaceC1734j;
import java.io.EOFException;
import v2.O;

/* compiled from: DiscardingTrackOutput.java */
/* renamed from: v2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4807m implements O {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51204a = new byte[4096];

    @Override // v2.O
    public int a(InterfaceC1734j interfaceC1734j, int i10, boolean z10, int i11) throws EOFException {
        int iE = interfaceC1734j.e(this.f51204a, 0, Math.min(this.f51204a.length, i10));
        if (iE != -1) {
            return iE;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // v2.O
    public void b(X1.y yVar, int i10, int i11) {
        yVar.X(i10);
    }

    @Override // v2.O
    public void f(U1.s sVar) {
    }

    @Override // v2.O
    public void e(long j10, int i10, int i11, int i12, O.a aVar) {
    }
}
