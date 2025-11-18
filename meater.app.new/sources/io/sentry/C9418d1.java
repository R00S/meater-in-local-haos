package io.sentry;

import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DiagnosticLogger.java */
@ApiStatus.Internal
/* renamed from: io.sentry.d1 */
/* loaded from: classes2.dex */
public final class C9418d1 implements InterfaceC9670w1 {

    /* renamed from: a */
    private final C9680x4 f36261a;

    /* renamed from: b */
    private final InterfaceC9670w1 f36262b;

    public C9418d1(C9680x4 c9680x4, InterfaceC9670w1 interfaceC9670w1) {
        this.f36261a = (C9680x4) C9646q.m31802c(c9680x4, "SentryOptions is required.");
        this.f36262b = interfaceC9670w1;
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: a */
    public void mo30212a(EnumC9587s4 enumC9587s4, Throwable th, String str, Object... objArr) {
        if (this.f36262b == null || !mo30215d(enumC9587s4)) {
            return;
        }
        this.f36262b.mo30212a(enumC9587s4, th, str, objArr);
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: b */
    public void mo30213b(EnumC9587s4 enumC9587s4, String str, Throwable th) {
        if (this.f36262b == null || !mo30215d(enumC9587s4)) {
            return;
        }
        this.f36262b.mo30213b(enumC9587s4, str, th);
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: c */
    public void mo30214c(EnumC9587s4 enumC9587s4, String str, Object... objArr) {
        if (this.f36262b == null || !mo30215d(enumC9587s4)) {
            return;
        }
        this.f36262b.mo30214c(enumC9587s4, str, objArr);
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: d */
    public boolean mo30215d(EnumC9587s4 enumC9587s4) {
        return enumC9587s4 != null && this.f36261a.isDebug() && enumC9587s4.ordinal() >= this.f36261a.getDiagnosticLevel().ordinal();
    }
}
