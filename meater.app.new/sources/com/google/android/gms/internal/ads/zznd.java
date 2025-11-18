package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zznd extends zzmy {

    /* renamed from: c */
    public ByteBuffer f26630c;

    /* renamed from: d */
    public long f26631d;

    /* renamed from: b */
    public final zzmz f26629b = new zzmz();

    /* renamed from: e */
    private final int f26632e = 0;

    public zznd(int i2) {
    }

    /* renamed from: i */
    private final ByteBuffer m20304i(int i2) {
        ByteBuffer byteBuffer = this.f26630c;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i2);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    /* renamed from: a */
    public final void mo20292a() {
        super.mo20292a();
        ByteBuffer byteBuffer = this.f26630c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void m20305h(int i2) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f26630c;
        if (byteBuffer == null) {
            this.f26630c = m20304i(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f26630c.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            return;
        }
        ByteBuffer byteBufferM20304i = m20304i(i3);
        if (iPosition > 0) {
            this.f26630c.position(0);
            this.f26630c.limit(iPosition);
            byteBufferM20304i.put(this.f26630c);
        }
        this.f26630c = byteBufferM20304i;
    }

    /* renamed from: j */
    public final boolean m20306j() {
        return m20295d(1073741824);
    }
}
