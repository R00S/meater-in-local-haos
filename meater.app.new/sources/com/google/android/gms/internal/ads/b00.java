package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Stack;

/* loaded from: classes2.dex */
final class b00 implements e00 {

    /* renamed from: a */
    private final byte[] f18210a = new byte[8];

    /* renamed from: b */
    private final Stack<d00> f18211b = new Stack<>();

    /* renamed from: c */
    private final g00 f18212c = new g00();

    /* renamed from: d */
    private f00 f18213d;

    /* renamed from: e */
    private int f18214e;

    /* renamed from: f */
    private int f18215f;

    /* renamed from: g */
    private long f18216g;

    b00() {
    }

    /* renamed from: d */
    private final long m14833d(zzie zzieVar, int i2) throws InterruptedException, IOException {
        zzieVar.readFully(this.f18210a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.f18210a[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.e00
    /* renamed from: a */
    public final void mo14834a() {
        this.f18214e = 0;
        this.f18211b.clear();
        this.f18212c.m15153a();
    }

    @Override // com.google.android.gms.internal.ads.e00
    /* renamed from: b */
    public final void mo14835b(f00 f00Var) {
        this.f18213d = f00Var;
    }

    @Override // com.google.android.gms.internal.ads.e00
    /* renamed from: c */
    public final boolean mo14836c(zzie zzieVar) throws InterruptedException, IOException {
        zzkh.m20129d(this.f18213d != null);
        while (true) {
            if (!this.f18211b.isEmpty() && zzieVar.getPosition() >= this.f18211b.peek().f18478b) {
                this.f18213d.mo15122k(this.f18211b.pop().f18477a);
                return true;
            }
            if (this.f18214e == 0) {
                long jM15154b = this.f18212c.m15154b(zzieVar, true, false);
                if (jM15154b == -1) {
                    return false;
                }
                this.f18215f = (int) jM15154b;
                this.f18214e = 1;
            }
            if (this.f18214e == 1) {
                this.f18216g = this.f18212c.m15154b(zzieVar, false, true);
                this.f18214e = 2;
            }
            int iMo15121j = this.f18213d.mo15121j(this.f18215f);
            if (iMo15121j != 0) {
                if (iMo15121j == 1) {
                    long position = zzieVar.getPosition();
                    this.f18211b.add(new d00(this.f18215f, this.f18216g + position));
                    this.f18213d.mo15120i(this.f18215f, position, this.f18216g);
                    this.f18214e = 0;
                    return true;
                }
                if (iMo15121j == 2) {
                    long j2 = this.f18216g;
                    if (j2 <= 8) {
                        this.f18213d.mo15117c(this.f18215f, m14833d(zzieVar, (int) j2));
                        this.f18214e = 0;
                        return true;
                    }
                    long j3 = this.f18216g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j3);
                    throw new IllegalStateException(sb.toString());
                }
                if (iMo15121j == 3) {
                    long j4 = this.f18216g;
                    if (j4 > 2147483647L) {
                        long j5 = this.f18216g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j5);
                        throw new IllegalStateException(sb2.toString());
                    }
                    f00 f00Var = this.f18213d;
                    int i2 = this.f18215f;
                    int i3 = (int) j4;
                    byte[] bArr = new byte[i3];
                    zzieVar.readFully(bArr, 0, i3);
                    f00Var.mo15118g(i2, new String(bArr, Charset.forName("UTF-8")));
                    this.f18214e = 0;
                    return true;
                }
                if (iMo15121j == 4) {
                    this.f18213d.mo15123l(this.f18215f, (int) this.f18216g, zzieVar);
                    this.f18214e = 0;
                    return true;
                }
                if (iMo15121j != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(iMo15121j);
                    throw new IllegalStateException(sb3.toString());
                }
                long j6 = this.f18216g;
                if (j6 != 4 && j6 != 8) {
                    long j7 = this.f18216g;
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j7);
                    throw new IllegalStateException(sb4.toString());
                }
                int i4 = (int) j6;
                this.f18213d.mo15119h(this.f18215f, i4 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(m14833d(zzieVar, i4)));
                this.f18214e = 0;
                return true;
            }
            zzieVar.mo20061a((int) this.f18216g);
            this.f18214e = 0;
        }
    }
}
