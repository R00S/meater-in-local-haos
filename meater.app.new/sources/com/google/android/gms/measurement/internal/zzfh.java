package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfh {

    /* renamed from: a */
    private final String f29229a;

    /* renamed from: b */
    private final long f29230b;

    /* renamed from: c */
    private boolean f29231c;

    /* renamed from: d */
    private long f29232d;

    /* renamed from: e */
    private final /* synthetic */ C7807r3 f29233e;

    public zzfh(C7807r3 c7807r3, String str, long j2) {
        this.f29233e = c7807r3;
        Preconditions.m14368g(str);
        this.f29229a = str;
        this.f29230b = j2;
    }

    /* renamed from: a */
    public final long m23155a() {
        if (!this.f29231c) {
            this.f29231c = true;
            this.f29232d = this.f29233e.m22813N().getLong(this.f29229a, this.f29230b);
        }
        return this.f29232d;
    }

    /* renamed from: b */
    public final void m23156b(long j2) {
        SharedPreferences.Editor editorEdit = this.f29233e.m22813N().edit();
        editorEdit.putLong(this.f29229a, j2);
        editorEdit.apply();
        this.f29232d = j2;
    }
}
