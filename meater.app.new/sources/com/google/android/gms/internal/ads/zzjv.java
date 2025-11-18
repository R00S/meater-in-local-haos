package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class zzjv implements zzkf {

    /* renamed from: a */
    private final zzke f26403a;

    /* renamed from: b */
    private RandomAccessFile f26404b;

    /* renamed from: c */
    private String f26405c;

    /* renamed from: d */
    private long f26406d;

    /* renamed from: e */
    private boolean f26407e;

    public zzjv() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException {
        try {
            this.f26405c = zzjqVar.f26371a.toString();
            RandomAccessFile randomAccessFile = new RandomAccessFile(zzjqVar.f26371a.getPath(), "r");
            this.f26404b = randomAccessFile;
            randomAccessFile.seek(zzjqVar.f26373c);
            long length = zzjqVar.f26374d;
            if (length == -1) {
                length = this.f26404b.length() - zzjqVar.f26373c;
            }
            this.f26406d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f26407e = true;
            zzke zzkeVar = this.f26403a;
            if (zzkeVar != null) {
                zzkeVar.m20121b();
            }
            return this.f26406d;
        } catch (IOException e2) {
            throw new zzjw(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws zzjw {
        RandomAccessFile randomAccessFile = this.f26404b;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                    throw new zzjw(e2);
                }
            } finally {
                this.f26404b = null;
                this.f26405c = null;
                if (this.f26407e) {
                    this.f26407e = false;
                    zzke zzkeVar = this.f26403a;
                    if (zzkeVar != null) {
                        zzkeVar.m20122c();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f26406d;
        if (j2 == 0) {
            return -1;
        }
        try {
            int i4 = this.f26404b.read(bArr, i2, (int) Math.min(j2, i3));
            if (i4 > 0) {
                this.f26406d -= i4;
                zzke zzkeVar = this.f26403a;
                if (zzkeVar != null) {
                    zzkeVar.m20120a(i4);
                }
            }
            return i4;
        } catch (IOException e2) {
            throw new zzjw(e2);
        }
    }

    public zzjv(zzke zzkeVar) {
        this.f26403a = zzkeVar;
    }
}
