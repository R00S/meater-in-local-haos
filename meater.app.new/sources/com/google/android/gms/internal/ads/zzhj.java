package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhj {

    /* renamed from: a */
    public final String f26191a;

    /* renamed from: b */
    private final int f26192b;

    /* renamed from: c */
    public final long f26193c;

    /* renamed from: d */
    public final int f26194d;

    /* renamed from: e */
    public final int f26195e;

    /* renamed from: f */
    public final float f26196f;

    /* renamed from: g */
    private final int f26197g;

    /* renamed from: h */
    private final int f26198h;

    /* renamed from: i */
    public final List<byte[]> f26199i;

    /* renamed from: j */
    private int f26200j;

    /* renamed from: k */
    private int f26201k;

    /* renamed from: l */
    private int f26202l;

    /* renamed from: m */
    private MediaFormat f26203m;

    @TargetApi(16)
    private zzhj(MediaFormat mediaFormat) {
        this.f26203m = mediaFormat;
        this.f26191a = mediaFormat.getString("mime");
        this.f26192b = m20019a(mediaFormat, "max-input-size");
        this.f26194d = m20019a(mediaFormat, "width");
        this.f26195e = m20019a(mediaFormat, "height");
        this.f26197g = m20019a(mediaFormat, "channel-count");
        this.f26198h = m20019a(mediaFormat, "sample-rate");
        this.f26196f = mediaFormat.containsKey("com.google.android.videos.pixelWidthHeightRatio") ? mediaFormat.getFloat("com.google.android.videos.pixelWidthHeightRatio") : -1.0f;
        this.f26199i = new ArrayList();
        int i2 = 0;
        while (true) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            if (!mediaFormat.containsKey(sb.toString())) {
                break;
            }
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i2);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            this.f26199i.add(bArr);
            byteBuffer.flip();
            i2++;
        }
        this.f26193c = mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : -1L;
        this.f26200j = -1;
        this.f26201k = -1;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static final int m20019a(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    @TargetApi(16)
    /* renamed from: b */
    public static zzhj m20020b(MediaFormat mediaFormat) {
        return new zzhj(mediaFormat);
    }

    /* renamed from: c */
    public static zzhj m20021c(String str, int i2, int i3, int i4, List<byte[]> list) {
        return m20025g(str, -1, -1L, i3, i4, list);
    }

    /* renamed from: d */
    public static zzhj m20022d(String str, int i2, long j2, int i3, int i4, float f2, List<byte[]> list) {
        return new zzhj(str, -1, j2, i3, i4, f2, -1, -1, list);
    }

    /* renamed from: e */
    public static zzhj m20023e(String str, int i2, long j2, int i3, int i4, List<byte[]> list) {
        return m20022d(str, -1, j2, i3, i4, 1.0f, list);
    }

    @TargetApi(16)
    /* renamed from: f */
    private static final void m20024f(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    /* renamed from: g */
    public static zzhj m20025g(String str, int i2, long j2, int i3, int i4, List<byte[]> list) {
        return new zzhj(str, i2, j2, -1, -1, -1.0f, i3, i4, list);
    }

    /* renamed from: h */
    public static zzhj m20026h() {
        return new zzhj("application/ttml+xml", -1, -1L, -1, -1, -1.0f, -1, -1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhj.class == obj.getClass()) {
            zzhj zzhjVar = (zzhj) obj;
            if (this.f26192b == zzhjVar.f26192b && this.f26194d == zzhjVar.f26194d && this.f26195e == zzhjVar.f26195e && this.f26196f == zzhjVar.f26196f && this.f26200j == zzhjVar.f26200j && this.f26201k == zzhjVar.f26201k && this.f26197g == zzhjVar.f26197g && this.f26198h == zzhjVar.f26198h && zzkq.m20158d(this.f26191a, zzhjVar.f26191a) && this.f26199i.size() == zzhjVar.f26199i.size()) {
                for (int i2 = 0; i2 < this.f26199i.size(); i2++) {
                    if (!Arrays.equals(this.f26199i.get(i2), zzhjVar.f26199i.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26202l == 0) {
            String str = this.f26191a;
            int iHashCode = (((((((((((((((((((str == null ? 0 : str.hashCode()) + 527) * 31) + this.f26192b) * 31) + this.f26194d) * 31) + this.f26195e) * 31) + Float.floatToRawIntBits(this.f26196f)) * 31) + ((int) this.f26193c)) * 31) + this.f26200j) * 31) + this.f26201k) * 31) + this.f26197g) * 31) + this.f26198h;
            for (int i2 = 0; i2 < this.f26199i.size(); i2++) {
                iHashCode = (iHashCode * 31) + Arrays.hashCode(this.f26199i.get(i2));
            }
            this.f26202l = iHashCode;
        }
        return this.f26202l;
    }

    @TargetApi(16)
    /* renamed from: i */
    public final MediaFormat m20027i() {
        if (this.f26203m == null) {
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.f26191a);
            m20024f(mediaFormat, "max-input-size", this.f26192b);
            m20024f(mediaFormat, "width", this.f26194d);
            m20024f(mediaFormat, "height", this.f26195e);
            m20024f(mediaFormat, "channel-count", this.f26197g);
            m20024f(mediaFormat, "sample-rate", this.f26198h);
            float f2 = this.f26196f;
            if (f2 != -1.0f) {
                mediaFormat.setFloat("com.google.android.videos.pixelWidthHeightRatio", f2);
            }
            for (int i2 = 0; i2 < this.f26199i.size(); i2++) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("csd-");
                sb.append(i2);
                mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f26199i.get(i2)));
            }
            long j2 = this.f26193c;
            if (j2 != -1) {
                mediaFormat.setLong("durationUs", j2);
            }
            m20024f(mediaFormat, "max-width", this.f26200j);
            m20024f(mediaFormat, "max-height", this.f26201k);
            this.f26203m = mediaFormat;
        }
        return this.f26203m;
    }

    public final String toString() {
        String str = this.f26191a;
        int i2 = this.f26192b;
        int i3 = this.f26194d;
        int i4 = this.f26195e;
        float f2 = this.f26196f;
        int i5 = this.f26197g;
        int i6 = this.f26198h;
        long j2 = this.f26193c;
        int i7 = this.f26200j;
        int i8 = this.f26201k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 143);
        sb.append("MediaFormat(");
        sb.append(str);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }

    private zzhj(String str, int i2, long j2, int i3, int i4, float f2, int i5, int i6, List<byte[]> list) {
        this.f26191a = str;
        this.f26192b = i2;
        this.f26193c = j2;
        this.f26194d = i3;
        this.f26195e = i4;
        this.f26196f = f2;
        this.f26197g = i5;
        this.f26198h = i6;
        this.f26199i = list == null ? Collections.emptyList() : list;
        this.f26200j = -1;
        this.f26201k = -1;
    }
}
