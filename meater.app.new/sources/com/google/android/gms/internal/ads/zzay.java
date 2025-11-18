package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzay implements zzba {

    /* renamed from: a */
    private static Logger f22662a = Logger.getLogger(zzay.class.getName());

    /* renamed from: b */
    private ThreadLocal<ByteBuffer> f22663b = new C7401z5(this);

    @Override // com.google.android.gms.internal.ads.zzba
    /* renamed from: a */
    public final zzbd mo17211a(zzdsw zzdswVar, zzbe zzbeVar) throws IOException {
        int i2;
        long size;
        long jMo15979k0 = zzdswVar.mo15979k0();
        this.f22663b.get().rewind().limit(8);
        do {
            i2 = zzdswVar.read(this.f22663b.get());
            if (i2 == 8) {
                this.f22663b.get().rewind();
                long jM17395b = zzbc.m17395b(this.f22663b.get());
                byte[] bArr = null;
                if (jM17395b < 8 && jM17395b > 1) {
                    Logger logger = f22662a;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jM17395b);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String strM17400g = zzbc.m17400g(this.f22663b.get());
                if (jM17395b == 1) {
                    this.f22663b.get().limit(16);
                    zzdswVar.read(this.f22663b.get());
                    this.f22663b.get().position(8);
                    size = zzbc.m17397d(this.f22663b.get()) - 16;
                } else {
                    size = jM17395b == 0 ? zzdswVar.size() - zzdswVar.mo15979k0() : jM17395b - 8;
                }
                if ("uuid".equals(strM17400g)) {
                    this.f22663b.get().limit(this.f22663b.get().limit() + 16);
                    zzdswVar.read(this.f22663b.get());
                    bArr = new byte[16];
                    for (int iPosition = this.f22663b.get().position() - 16; iPosition < this.f22663b.get().position(); iPosition++) {
                        bArr[iPosition - (this.f22663b.get().position() - 16)] = this.f22663b.get().get(iPosition);
                    }
                    size -= 16;
                }
                long j2 = size;
                zzbd zzbdVarMo16039b = mo16039b(strM17400g, bArr, zzbeVar instanceof zzbd ? ((zzbd) zzbeVar).getType() : HttpUrl.FRAGMENT_ENCODE_SET);
                zzbdVarMo16039b.mo17467c(zzbeVar);
                this.f22663b.get().rewind();
                zzbdVarMo16039b.mo17466b(zzdswVar, this.f22663b.get(), j2, this);
                return zzbdVarMo16039b;
            }
        } while (i2 >= 0);
        zzdswVar.mo15978d1(jMo15979k0);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract zzbd mo16039b(String str, byte[] bArr, String str2);
}
