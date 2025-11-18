package v2;

import U1.InterfaceC1734j;
import java.util.Arrays;

/* compiled from: TrackOutput.java */
/* loaded from: classes.dex */
public interface O {

    /* compiled from: TrackOutput.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f51065a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f51066b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51067c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51068d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f51065a = i10;
            this.f51066b = bArr;
            this.f51067c = i11;
            this.f51068d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f51065a == aVar.f51065a && this.f51067c == aVar.f51067c && this.f51068d == aVar.f51068d && Arrays.equals(this.f51066b, aVar.f51066b);
        }

        public int hashCode() {
            return (((((this.f51065a * 31) + Arrays.hashCode(this.f51066b)) * 31) + this.f51067c) * 31) + this.f51068d;
        }
    }

    int a(InterfaceC1734j interfaceC1734j, int i10, boolean z10, int i11);

    void b(X1.y yVar, int i10, int i11);

    default int c(InterfaceC1734j interfaceC1734j, int i10, boolean z10) {
        return a(interfaceC1734j, i10, z10, 0);
    }

    default void d(X1.y yVar, int i10) {
        b(yVar, i10, 0);
    }

    void e(long j10, int i10, int i11, int i12, a aVar);

    void f(U1.s sVar);
}
