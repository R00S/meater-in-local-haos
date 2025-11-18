package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface zzno {
    /* renamed from: a */
    void mo20322a(int i2) throws InterruptedException, IOException;

    /* renamed from: b */
    boolean mo20323b(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException;

    /* renamed from: c */
    void mo20324c();

    /* renamed from: d */
    void mo20325d(byte[] bArr, int i2, int i3) throws InterruptedException, IOException;

    /* renamed from: e */
    int mo20326e(int i2) throws InterruptedException, IOException;

    /* renamed from: f */
    long mo20327f();

    /* renamed from: g */
    void mo20328g(int i2) throws InterruptedException, IOException;

    long getPosition();

    int read(byte[] bArr, int i2, int i3) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int i2, int i3) throws InterruptedException, IOException;
}
