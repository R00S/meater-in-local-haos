package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzlv {

    /* renamed from: a */
    private static final int[] f26513a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f26514b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f26515c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f26516d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f26517e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f */
    private static final int[] f26518f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static zzlh m20221a(zzst zzstVar, String str, String str2, zzne zzneVar) {
        int i2 = f26514b[(zzstVar.m20506g() & 192) >> 6];
        int iM20506g = zzstVar.m20506g();
        int i3 = f26516d[(iM20506g & 56) >> 3];
        if ((iM20506g & 4) != 0) {
            i3++;
        }
        return zzlh.m20199d(str, "audio/ac3", null, -1, -1, i3, i2, null, null, 0, str2);
    }

    /* renamed from: b */
    public static zzlh m20222b(zzst zzstVar, String str, String str2, zzne zzneVar) {
        zzstVar.m20511l(2);
        int i2 = f26514b[(zzstVar.m20506g() & 192) >> 6];
        int iM20506g = zzstVar.m20506g();
        int i3 = f26516d[(iM20506g & 14) >> 1];
        if ((iM20506g & 1) != 0) {
            i3++;
        }
        return zzlh.m20199d(str, "audio/eac3", null, -1, -1, i3, i2, null, null, 0, str2);
    }

    /* renamed from: c */
    public static int m20223c(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f26513a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    /* renamed from: d */
    public static int m20224d() {
        return 1536;
    }
}
