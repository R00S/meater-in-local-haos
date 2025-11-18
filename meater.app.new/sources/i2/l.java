package i2;

import java.util.UUID;

/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: classes.dex */
public final class l implements c2.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f43054d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f43055a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f43056b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f43057c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = X1.L.f18628c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = X1.L.f18629d
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            i2.l.f43054d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.l.<clinit>():void");
    }

    public l(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public l(UUID uuid, byte[] bArr, boolean z10) {
        this.f43055a = uuid;
        this.f43056b = bArr;
        this.f43057c = z10;
    }
}
