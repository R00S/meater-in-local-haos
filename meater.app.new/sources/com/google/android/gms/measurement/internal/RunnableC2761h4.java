package com.google.android.gms.measurement.internal;

import g7.C3445p;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2761h4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final URL f35385B;

    /* renamed from: C, reason: collision with root package name */
    private final byte[] f35386C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC2740e4 f35387D;

    /* renamed from: E, reason: collision with root package name */
    private final String f35388E;

    /* renamed from: F, reason: collision with root package name */
    private final Map<String, String> f35389F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2747f4 f35390G;

    public RunnableC2761h4(C2747f4 c2747f4, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC2740e4 interfaceC2740e4) {
        this.f35390G = c2747f4;
        C3445p.e(str);
        C3445p.k(url);
        C3445p.k(interfaceC2740e4);
        this.f35385B = url;
        this.f35386C = bArr;
        this.f35387D = interfaceC2740e4;
        this.f35388E = str;
        this.f35389F = map;
    }

    private final void a(final int i10, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f35390G.o().E(new Runnable() { // from class: com.google.android.gms.measurement.internal.g4
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2761h4 runnableC2761h4 = this.f35365B;
                runnableC2761h4.f35387D.a(runnableC2761h4.f35388E, i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC2761h4.run():void");
    }
}
