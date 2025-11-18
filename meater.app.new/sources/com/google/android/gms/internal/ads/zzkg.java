package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzkg {

    /* renamed from: a */
    private static final int[] f26414a = {48000, 44100, 32000};

    /* renamed from: b */
    private static final int[] f26415b = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: c */
    private static final int[] f26416c = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: d */
    private static final int[] f26417d = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m20123a(int i2, int i3) {
        return (((i2 << 3) * i3) + 768000) / 1536000;
    }

    /* renamed from: b */
    public static zzhj m20124b(zzkm zzkmVar) {
        int i2 = f26414a[(zzkmVar.m20143e() & 192) >> 6];
        int iM20143e = zzkmVar.m20143e();
        int i3 = f26415b[(iM20143e & 56) >> 3];
        if ((iM20143e & 4) != 0) {
            i3++;
        }
        return zzhj.m20025g("audio/ac3", -1, -1L, i3, i2, Collections.emptyList());
    }

    /* renamed from: c */
    public static zzhj m20125c(zzkm zzkmVar) {
        zzkmVar.m20146h(2);
        int i2 = f26414a[(zzkmVar.m20143e() & 192) >> 6];
        int iM20143e = zzkmVar.m20143e();
        int i3 = f26415b[(iM20143e & 14) >> 1];
        if ((iM20143e & 1) != 0) {
            i3++;
        }
        return zzhj.m20021c("audio/eac3", -1, i3, i2, Collections.emptyList());
    }
}
