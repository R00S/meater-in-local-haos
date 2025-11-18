package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidLogger.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.i0 */
/* loaded from: classes2.dex */
public final class C9287i0 implements InterfaceC9670w1 {

    /* renamed from: a */
    private final String f35927a;

    /* compiled from: AndroidLogger.java */
    /* renamed from: io.sentry.android.core.i0$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35928a;

        static {
            int[] iArr = new int[EnumC9587s4.values().length];
            f35928a = iArr;
            try {
                iArr[EnumC9587s4.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35928a[EnumC9587s4.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35928a[EnumC9587s4.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35928a[EnumC9587s4.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35928a[EnumC9587s4.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C9287i0() {
        this("Sentry");
    }

    /* renamed from: e */
    private int m30211e(EnumC9587s4 enumC9587s4) {
        int i2 = a.f35928a[enumC9587s4.ordinal()];
        if (i2 == 1) {
            return 4;
        }
        if (i2 != 2) {
            return i2 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: a */
    public void mo30212a(EnumC9587s4 enumC9587s4, Throwable th, String str, Object... objArr) {
        mo30213b(enumC9587s4, String.format(str, objArr), th);
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: b */
    public void mo30213b(EnumC9587s4 enumC9587s4, String str, Throwable th) {
        int i2 = a.f35928a[enumC9587s4.ordinal()];
        if (i2 == 1) {
            Log.i(this.f35927a, str, th);
            return;
        }
        if (i2 == 2) {
            Log.w(this.f35927a, str, th);
            return;
        }
        if (i2 == 3) {
            Log.e(this.f35927a, str, th);
        } else if (i2 != 4) {
            Log.d(this.f35927a, str, th);
        } else {
            Log.wtf(this.f35927a, str, th);
        }
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: c */
    public void mo30214c(EnumC9587s4 enumC9587s4, String str, Object... objArr) {
        Log.println(m30211e(enumC9587s4), this.f35927a, String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: d */
    public boolean mo30215d(EnumC9587s4 enumC9587s4) {
        return true;
    }

    public C9287i0(String str) {
        this.f35927a = str;
    }
}
