package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzdrw {

    /* renamed from: a */
    protected volatile int f25854a = -1;

    /* renamed from: b */
    public static final byte[] m19824b(zzdrw zzdrwVar) {
        int iM19825c = zzdrwVar.m19825c();
        byte[] bArr = new byte[iM19825c];
        try {
            zzdrp zzdrpVarM19808v = zzdrp.m19808v(bArr, 0, iM19825c);
            zzdrwVar.mo19818a(zzdrpVarM19808v);
            zzdrpVarM19808v.m19811f();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public void mo19818a(zzdrp zzdrpVar) throws IOException {
    }

    /* renamed from: c */
    public final int m19825c() {
        int iMo19820e = mo19820e();
        this.f25854a = iMo19820e;
        return iMo19820e;
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public zzdrw clone() throws CloneNotSupportedException {
        return (zzdrw) super.clone();
    }

    /* renamed from: e */
    protected int mo19820e() {
        return 0;
    }

    public String toString() {
        return zzdrx.m19827b(this);
    }
}
