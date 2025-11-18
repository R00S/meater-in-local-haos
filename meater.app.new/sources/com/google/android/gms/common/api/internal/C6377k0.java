package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes2.dex */
final class C6377k0 implements IBinder.DeathRecipient, InterfaceC6379l0 {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f17422a;

    /* renamed from: b */
    private final WeakReference<com.google.android.gms.common.api.zac> f17423b;

    /* renamed from: c */
    private final WeakReference<IBinder> f17424c;

    private C6377k0(BasePendingResult<?> basePendingResult, com.google.android.gms.common.api.zac zacVar, IBinder iBinder) {
        this.f17423b = new WeakReference<>(zacVar);
        this.f17422a = new WeakReference<>(basePendingResult);
        this.f17424c = new WeakReference<>(iBinder);
    }

    /* renamed from: b */
    private final void m14064b() {
        BasePendingResult<?> basePendingResult = this.f17422a.get();
        com.google.android.gms.common.api.zac zacVar = this.f17423b.get();
        if (zacVar != null && basePendingResult != null) {
            zacVar.m14255a(basePendingResult.mo13900g().intValue());
        }
        IBinder iBinder = this.f17424c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC6379l0
    /* renamed from: a */
    public final void mo14063a(BasePendingResult<?> basePendingResult) {
        m14064b();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        m14064b();
    }

    /* synthetic */ C6377k0(BasePendingResult basePendingResult, com.google.android.gms.common.api.zac zacVar, IBinder iBinder, C6375j0 c6375j0) {
        this(basePendingResult, null, iBinder);
    }
}
