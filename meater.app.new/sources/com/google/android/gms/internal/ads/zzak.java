package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class zzak implements zzm {

    /* renamed from: a */
    private static final boolean f22076a = zzag.f21996b;

    /* renamed from: b */
    @Deprecated
    private final zzas f22077b;

    /* renamed from: c */
    private final zzaj f22078c;

    /* renamed from: d */
    private final zzal f22079d;

    @Deprecated
    public zzak(zzas zzasVar) {
        this(zzasVar, new zzal(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    /* renamed from: b */
    private static void m16629b(String str, zzr<?> zzrVar, zzaf zzafVar) throws zzaf {
        zzac zzacVarM20425R = zzrVar.m20425R();
        int iM20424Q = zzrVar.m20424Q();
        try {
            zzacVarM20425R.mo16393a(zzafVar);
            zzrVar.m20418I(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iM20424Q)));
        } catch (zzaf e2) {
            zzrVar.m20418I(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iM20424Q)));
            throw e2;
        }
    }

    /* renamed from: c */
    private final byte[] m16630c(InputStream inputStream, int i2) throws IOException, zzad {
        zzaw zzawVar = new zzaw(this.f22079d, i2);
        try {
            if (inputStream == null) {
                throw new zzad();
            }
            byte[] bArrM16646b = this.f22079d.m16646b(1024);
            while (true) {
                int i3 = inputStream.read(bArrM16646b);
                if (i3 == -1) {
                    break;
                }
                zzawVar.write(bArrM16646b, 0, i3);
            }
            byte[] byteArray = zzawVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused) {
                zzag.m16528c("Error occurred when closing InputStream", new Object[0]);
            }
            this.f22079d.m16645a(bArrM16646b);
            zzawVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzag.m16528c("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f22079d.m16645a(null);
            zzawVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    @Override // com.google.android.gms.internal.ads.zzm
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzp mo16589a(com.google.android.gms.internal.ads.zzr<?> r22) throws java.io.IOException, com.google.android.gms.internal.ads.zzaf {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzak.mo16589a(com.google.android.gms.internal.ads.zzr):com.google.android.gms.internal.ads.zzp");
    }

    @Deprecated
    private zzak(zzas zzasVar, zzal zzalVar) {
        this.f22077b = zzasVar;
        this.f22078c = new C6989o0(zzasVar);
        this.f22079d = zzalVar;
    }

    public zzak(zzaj zzajVar) {
        this(zzajVar, new zzal(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    private zzak(zzaj zzajVar, zzal zzalVar) {
        this.f22078c = zzajVar;
        this.f22077b = zzajVar;
        this.f22079d = zzalVar;
    }
}
