package io.sentry;

import io.sentry.InterfaceC9662v5;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.AbstractC9455e;
import io.sentry.hints.EnumC9458h;
import io.sentry.hints.InterfaceC9462l;
import io.sentry.protocol.C9550i;
import io.sentry.protocol.C9558q;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.lang.Thread;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements Integration, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: f */
    private Thread.UncaughtExceptionHandler f35736f;

    /* renamed from: g */
    private InterfaceC9658v1 f35737g;

    /* renamed from: h */
    private C9680x4 f35738h;

    /* renamed from: i */
    private boolean f35739i;

    /* renamed from: j */
    private final InterfaceC9662v5 f35740j;

    @ApiStatus.Internal
    /* renamed from: io.sentry.UncaughtExceptionHandlerIntegration$a */
    public static class C9241a extends AbstractC9455e implements InterfaceC9462l {
        public C9241a(long j2, InterfaceC9670w1 interfaceC9670w1) {
            super(j2, interfaceC9670w1);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(InterfaceC9662v5.a.m31850c());
    }

    /* renamed from: b */
    static Throwable m30005b(Thread thread, Throwable th) {
        C9550i c9550i = new C9550i();
        c9550i.m31371i(Boolean.FALSE);
        c9550i.m31372j("UncaughtExceptionHandler");
        return new ExceptionMechanismException(c9550i, th, thread);
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public final void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        if (this.f35739i) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f35739i = true;
        this.f35737g = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required");
        C9680x4 c9680x42 = (C9680x4) C9646q.m31802c(c9680x4, "SentryOptions is required");
        this.f35738h = c9680x42;
        InterfaceC9670w1 logger = c9680x42.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f35738h.isEnableUncaughtExceptionHandler()));
        if (this.f35738h.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandlerMo31849b = this.f35740j.mo31849b();
            if (uncaughtExceptionHandlerMo31849b != null) {
                this.f35738h.getLogger().mo30214c(enumC9587s4, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerMo31849b.getClass().getName() + "'", new Object[0]);
                this.f35736f = uncaughtExceptionHandlerMo31849b;
            }
            this.f35740j.mo31848a(this);
            this.f35738h.getLogger().mo30214c(enumC9587s4, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            mo30003a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f35740j.mo31849b()) {
            this.f35740j.mo31848a(this.f35736f);
            C9680x4 c9680x4 = this.f35738h;
            if (c9680x4 != null) {
                c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C9680x4 c9680x4 = this.f35738h;
        if (c9680x4 == null || this.f35737g == null) {
            return;
        }
        c9680x4.getLogger().mo30214c(EnumC9587s4.INFO, "Uncaught exception received.", new Object[0]);
        try {
            C9241a c9241a = new C9241a(this.f35738h.getFlushTimeoutMillis(), this.f35738h.getLogger());
            C9506l4 c9506l4 = new C9506l4(m30005b(thread, th));
            c9506l4.m31011z0(EnumC9587s4.FATAL);
            C9517n1 c9517n1M31778a = C9642m.m31778a(c9241a);
            boolean zEquals = this.f35737g.mo31159t(c9506l4, c9517n1M31778a).equals(C9558q.f36725f);
            EnumC9458h enumC9458hM31779b = C9642m.m31779b(c9517n1M31778a);
            if ((!zEquals || EnumC9458h.MULTITHREADED_DEDUPLICATION.equals(enumC9458hM31779b)) && !c9241a.mo30477e()) {
                this.f35738h.getLogger().mo30214c(EnumC9587s4.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c9506l4.m30579G());
            }
        } catch (Throwable th2) {
            this.f35738h.getLogger().mo30213b(EnumC9587s4.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f35736f != null) {
            this.f35738h.getLogger().mo30214c(EnumC9587s4.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f35736f.uncaughtException(thread, th);
        } else if (this.f35738h.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(InterfaceC9662v5 interfaceC9662v5) {
        this.f35739i = false;
        this.f35740j = (InterfaceC9662v5) C9646q.m31802c(interfaceC9662v5, "threadAdapter is required.");
    }
}
