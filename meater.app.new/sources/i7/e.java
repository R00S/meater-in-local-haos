package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c7.C2335d;
import e7.InterfaceC3215e;
import e7.InterfaceC3222l;
import g7.AbstractC3437h;
import g7.C3434e;
import g7.C3451w;
import p7.f;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class e extends AbstractC3437h {

    /* renamed from: j0, reason: collision with root package name */
    private final C3451w f43149j0;

    public e(Context context, Looper looper, C3434e c3434e, C3451w c3451w, InterfaceC3215e interfaceC3215e, InterfaceC3222l interfaceC3222l) {
        super(context, looper, 270, c3434e, interfaceC3215e, interfaceC3222l);
        this.f43149j0 = c3451w;
    }

    @Override // g7.AbstractC3433d
    protected final Bundle A() {
        return this.f43149j0.d();
    }

    @Override // g7.AbstractC3433d
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // g7.AbstractC3433d
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // g7.AbstractC3433d
    protected final boolean I() {
        return true;
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 203400000;
    }

    @Override // g7.AbstractC3433d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C3630a ? (C3630a) iInterfaceQueryLocalInterface : new C3630a(iBinder);
    }

    @Override // g7.AbstractC3433d
    public final C2335d[] v() {
        return f.f47658b;
    }
}
