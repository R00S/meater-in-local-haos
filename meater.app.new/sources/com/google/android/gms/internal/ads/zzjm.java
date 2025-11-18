package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzjm implements zzkf {

    /* renamed from: a */
    private final AssetManager f26362a;

    /* renamed from: b */
    private final zzke f26363b;

    /* renamed from: c */
    private String f26364c;

    /* renamed from: d */
    private InputStream f26365d;

    /* renamed from: e */
    private long f26366e;

    /* renamed from: f */
    private boolean f26367f;

    public zzjm(Context context, zzke zzkeVar) {
        this.f26362a = context.getAssets();
        this.f26363b = zzkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException {
        try {
            this.f26364c = zzjqVar.f26371a.toString();
            String path = zzjqVar.f26371a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f26362a.open(path, 1);
            this.f26365d = inputStreamOpen;
            zzkh.m20129d(inputStreamOpen.skip(zzjqVar.f26373c) == zzjqVar.f26373c);
            long jAvailable = zzjqVar.f26374d;
            if (jAvailable == -1) {
                jAvailable = this.f26365d.available();
            }
            this.f26366e = jAvailable;
            if (jAvailable < 0) {
                throw new EOFException();
            }
            this.f26367f = true;
            zzke zzkeVar = this.f26363b;
            if (zzkeVar != null) {
                zzkeVar.m20121b();
            }
            return this.f26366e;
        } catch (IOException e2) {
            throw new zzjn(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws zzjn {
        InputStream inputStream = this.f26365d;
        if (inputStream != null) {
            try {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzjn(e2);
                }
            } finally {
                this.f26365d = null;
                if (this.f26367f) {
                    this.f26367f = false;
                    zzke zzkeVar = this.f26363b;
                    if (zzkeVar != null) {
                        zzkeVar.m20122c();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f26366e;
        if (j2 == 0) {
            return -1;
        }
        try {
            int i4 = this.f26365d.read(bArr, i2, (int) Math.min(j2, i3));
            if (i4 > 0) {
                this.f26366e -= i4;
                zzke zzkeVar = this.f26363b;
                if (zzkeVar != null) {
                    zzkeVar.m20120a(i4);
                }
            }
            return i4;
        } catch (IOException e2) {
            throw new zzjn(e2);
        }
    }
}
