package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2507j3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2491h3 f34170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2507j3(C2491h3 c2491h3, Handler handler) {
        super(null);
        this.f34170a = c2491h3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f34170a.f();
    }
}
