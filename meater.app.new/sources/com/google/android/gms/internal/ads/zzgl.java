package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

@TargetApi(16)
@Deprecated
/* loaded from: classes2.dex */
public final class zzgl implements zzhn {

    /* renamed from: a */
    private final Context f26117a;

    /* renamed from: b */
    private final Uri f26118b;

    /* renamed from: c */
    private final Map<String, String> f26119c;

    /* renamed from: d */
    private final FileDescriptor f26120d;

    /* renamed from: e */
    private final long f26121e;

    /* renamed from: f */
    private final long f26122f;

    /* renamed from: g */
    private MediaExtractor f26123g;

    /* renamed from: h */
    private zzho[] f26124h;

    /* renamed from: i */
    private boolean f26125i;

    /* renamed from: j */
    private int f26126j;

    /* renamed from: k */
    private int[] f26127k;

    /* renamed from: l */
    private boolean[] f26128l;

    /* renamed from: m */
    private long f26129m;

    public zzgl(Context context, Uri uri, Map<String, String> map, int i2) {
        zzkh.m20129d(zzkq.f26428a >= 16);
        this.f26126j = 2;
        this.f26117a = (Context) zzkh.m20128c(context);
        this.f26118b = (Uri) zzkh.m20128c(uri);
        this.f26119c = null;
        this.f26120d = null;
        this.f26121e = 0L;
        this.f26122f = 0L;
    }

    /* renamed from: a */
    private final void m19968a(long j2, boolean z) {
        if (!z && this.f26129m == j2) {
            return;
        }
        this.f26129m = j2;
        int i2 = 0;
        this.f26123g.seekTo(j2, 0);
        while (true) {
            int[] iArr = this.f26127k;
            if (i2 >= iArr.length) {
                return;
            }
            if (iArr[i2] != 0) {
                this.f26128l[i2] = true;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: c */
    public final void mo19969c() {
        MediaExtractor mediaExtractor;
        zzkh.m20129d(this.f26126j > 0);
        int i2 = this.f26126j - 1;
        this.f26126j = i2;
        if (i2 != 0 || (mediaExtractor = this.f26123g) == null) {
            return;
        }
        mediaExtractor.release();
        this.f26123g = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: q */
    public final void mo19970q(int i2, long j2) {
        zzkh.m20129d(this.f26125i);
        zzkh.m20129d(this.f26127k[i2] == 0);
        this.f26127k[i2] = 1;
        this.f26123g.selectTrack(i2);
        m19968a(j2, j2 != 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: r */
    public final long mo19971r() {
        zzkh.m20129d(this.f26125i);
        long cachedDuration = this.f26123g.getCachedDuration();
        if (cachedDuration == -1) {
            return -1L;
        }
        long sampleTime = this.f26123g.getSampleTime();
        if (sampleTime == -1) {
            return -3L;
        }
        return sampleTime + cachedDuration;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: s */
    public final int mo19972s() {
        zzkh.m20129d(this.f26125i);
        return this.f26127k.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: t */
    public final void mo19973t(long j2) {
        zzkh.m20129d(this.f26125i);
        m19968a(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: u */
    public final boolean mo19974u(long j2) throws IOException {
        if (!this.f26125i) {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.f26123g = mediaExtractor;
            Context context = this.f26117a;
            if (context != null) {
                mediaExtractor.setDataSource(context, this.f26118b, (Map<String, String>) null);
            } else {
                mediaExtractor.setDataSource((FileDescriptor) null, 0L, 0L);
            }
            int[] iArr = new int[this.f26123g.getTrackCount()];
            this.f26127k = iArr;
            this.f26128l = new boolean[iArr.length];
            this.f26124h = new zzho[iArr.length];
            for (int i2 = 0; i2 < this.f26127k.length; i2++) {
                MediaFormat trackFormat = this.f26123g.getTrackFormat(i2);
                this.f26124h[i2] = new zzho(trackFormat.getString("mime"), trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1L);
            }
            this.f26125i = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: v */
    public final zzho mo19975v(int i2) {
        zzkh.m20129d(this.f26125i);
        return this.f26124h[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: w */
    public final int mo19976w(int i2, long j2, zzhk zzhkVar, zzhm zzhmVar, boolean z) {
        Map<UUID, byte[]> psshInfo;
        zzkh.m20129d(this.f26125i);
        zzkh.m20129d(this.f26127k[i2] != 0);
        boolean[] zArr = this.f26128l;
        if (zArr[i2]) {
            zArr[i2] = false;
            return -5;
        }
        if (z) {
            return -2;
        }
        if (this.f26127k[i2] != 2) {
            zzhkVar.f26204a = zzhj.m20020b(this.f26123g.getTrackFormat(i2));
            zzhx zzhxVar = null;
            if (zzkq.f26428a >= 18 && (psshInfo = this.f26123g.getPsshInfo()) != null && !psshInfo.isEmpty()) {
                zzhxVar = new zzhx("video/mp4");
                zzhxVar.m20054a(psshInfo);
            }
            zzhkVar.f26205b = zzhxVar;
            this.f26127k[i2] = 2;
            return -4;
        }
        int sampleTrackIndex = this.f26123g.getSampleTrackIndex();
        if (sampleTrackIndex != i2) {
            return sampleTrackIndex < 0 ? -1 : -2;
        }
        ByteBuffer byteBuffer = zzhmVar.f26207b;
        if (byteBuffer != null) {
            int iPosition = byteBuffer.position();
            int sampleData = this.f26123g.readSampleData(zzhmVar.f26207b, iPosition);
            zzhmVar.f26208c = sampleData;
            zzhmVar.f26207b.position(iPosition + sampleData);
        } else {
            zzhmVar.f26208c = 0;
        }
        zzhmVar.f26210e = this.f26123g.getSampleTime();
        zzhmVar.f26209d = this.f26123g.getSampleFlags() & 3;
        if (zzhmVar.m20028a()) {
            zzhmVar.f26206a.m19964b(this.f26123g);
        }
        this.f26129m = -1L;
        this.f26123g.advance();
        return -3;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: x */
    public final boolean mo19977x(long j2) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: y */
    public final void mo19978y(int i2) {
        zzkh.m20129d(this.f26125i);
        zzkh.m20129d(this.f26127k[i2] != 0);
        this.f26123g.unselectTrack(i2);
        this.f26128l[i2] = false;
        this.f26127k[i2] = 0;
    }
}
