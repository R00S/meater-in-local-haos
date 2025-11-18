package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class zzdmb {

    /* renamed from: a */
    private static final AbstractC7203tt f25655a;

    /* renamed from: b */
    private static final int f25656b;

    /* renamed from: com.google.android.gms.internal.ads.zzdmb$a */
    static final class C7436a extends AbstractC7203tt {
        C7436a() {
        }

        @Override // com.google.android.gms.internal.ads.AbstractC7203tt
        /* renamed from: a */
        public final void mo15905a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }

        @Override // com.google.android.gms.internal.ads.AbstractC7203tt
        /* renamed from: b */
        public final void mo15906b(Throwable th, Throwable th2) {
        }

        @Override // com.google.android.gms.internal.ads.AbstractC7203tt
        /* renamed from: c */
        public final void mo15907c(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x0007, B:7:0x000f, B:8:0x0015, B:10:0x001e, B:11:0x0024), top: B:25:0x0007 }] */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m19581c()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.ads.xt r2 = new com.google.android.gms.internal.ads.xt     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.ads.wt r2 = new com.google.android.gms.internal.ads.wt     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L24:
            com.google.android.gms.internal.ads.zzdmb$a r2 = new com.google.android.gms.internal.ads.zzdmb$a     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.ads.zzdmb$a> r4 = com.google.android.gms.internal.ads.zzdmb.C7436a.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.ads.zzdmb$a r2 = new com.google.android.gms.internal.ads.zzdmb$a
            r2.<init>()
        L5f:
            com.google.android.gms.internal.ads.zzdmb.f25655a = r2
            if (r1 != 0) goto L64
            goto L68
        L64:
            int r0 = r1.intValue()
        L68:
            com.google.android.gms.internal.ads.zzdmb.f25656b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmb.<clinit>():void");
    }

    /* renamed from: a */
    public static void m19579a(Throwable th, PrintWriter printWriter) {
        f25655a.mo15905a(th, printWriter);
    }

    /* renamed from: b */
    public static void m19580b(Throwable th, Throwable th2) {
        f25655a.mo15906b(th, th2);
    }

    /* renamed from: c */
    private static Integer m19581c() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e2) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: d */
    public static void m19582d(Throwable th) {
        f25655a.mo15907c(th);
    }
}
