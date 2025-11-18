package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.util.C9314k;
import io.sentry.transport.InterfaceC9615s;

/* compiled from: AndroidTransportGate.java */
/* renamed from: io.sentry.android.core.n0 */
/* loaded from: classes2.dex */
final class C9334n0 implements InterfaceC9615s {

    /* renamed from: a */
    private final Context f36078a;

    /* renamed from: b */
    private final InterfaceC9670w1 f36079b;

    /* compiled from: AndroidTransportGate.java */
    /* renamed from: io.sentry.android.core.n0$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36080a;

        static {
            int[] iArr = new int[C9314k.a.values().length];
            f36080a = iArr;
            try {
                iArr[C9314k.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36080a[C9314k.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36080a[C9314k.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C9334n0(Context context, InterfaceC9670w1 interfaceC9670w1) {
        this.f36078a = context;
        this.f36079b = interfaceC9670w1;
    }

    /* renamed from: a */
    boolean m30352a(C9314k.a aVar) {
        int i2 = a.f36080a[aVar.ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    @Override // io.sentry.transport.InterfaceC9615s
    public boolean isConnected() {
        return m30352a(C9314k.m30281b(this.f36078a, this.f36079b));
    }
}
