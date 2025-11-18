package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

@zzard
/* loaded from: classes2.dex */
public final class zzbfl {

    /* renamed from: a */
    private long f22963a;

    /* renamed from: a */
    public final long m17615a(ByteBuffer byteBuffer) {
        zzbg zzbgVar;
        zzbf zzbfVar;
        long j2 = this.f22963a;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator<zzbd> it = new zzbb(new C7294w9(byteBufferDuplicate), C7331x9.f20954c).m19857e().iterator();
            while (true) {
                zzbgVar = null;
                if (!it.hasNext()) {
                    zzbfVar = null;
                    break;
                }
                zzbd next = it.next();
                if (next instanceof zzbf) {
                    zzbfVar = (zzbf) next;
                    break;
                }
            }
            Iterator<zzbd> it2 = zzbfVar.m19857e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzbd next2 = it2.next();
                if (next2 instanceof zzbg) {
                    zzbgVar = (zzbg) next2;
                    break;
                }
            }
            long jM17642h = (zzbgVar.m17642h() * 1000) / zzbgVar.m17643i();
            this.f22963a = jM17642h;
            return jM17642h;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
