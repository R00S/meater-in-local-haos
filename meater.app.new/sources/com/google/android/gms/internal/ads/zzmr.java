package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzmr {

    /* renamed from: a */
    private static final int[] f26583a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f26584b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f26585c = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, RecyclerView.AbstractC0599l.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    /* renamed from: a */
    public static int m20270a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        return ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) << 5;
    }
}
