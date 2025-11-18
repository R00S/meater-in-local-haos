package com.liulishuo.filedownloader.exception;

import android.annotation.TargetApi;
import java.io.IOException;
import p241e.p307h.p308a.p315k0.C9036f;

/* loaded from: classes2.dex */
public class FileDownloadOutOfSpaceException extends IOException {

    /* renamed from: f */
    private long f32971f;

    /* renamed from: g */
    private long f32972g;

    /* renamed from: h */
    private long f32973h;

    @TargetApi(9)
    public FileDownloadOutOfSpaceException(long j2, long j3, long j4, Throwable th) {
        super(C9036f.m29009o("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)), th);
        m27517a(j2, j3, j4);
    }

    /* renamed from: a */
    private void m27517a(long j2, long j3, long j4) {
        this.f32971f = j2;
        this.f32972g = j3;
        this.f32973h = j4;
    }

    public FileDownloadOutOfSpaceException(long j2, long j3, long j4) {
        super(C9036f.m29009o("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)));
        m27517a(j2, j3, j4);
    }
}
