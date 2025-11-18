package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: SystemOutLogger.java */
/* renamed from: io.sentry.n5 */
/* loaded from: classes2.dex */
public final class C9521n5 implements InterfaceC9670w1 {
    /* renamed from: e */
    private String m31109e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: a */
    public void mo30212a(EnumC9587s4 enumC9587s4, Throwable th, String str, Object... objArr) {
        if (th == null) {
            mo30214c(enumC9587s4, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", enumC9587s4, String.format(str, objArr), th.toString(), m31109e(th)));
        }
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: b */
    public void mo30213b(EnumC9587s4 enumC9587s4, String str, Throwable th) {
        if (th == null) {
            mo30214c(enumC9587s4, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", enumC9587s4, String.format(str, th.toString()), m31109e(th)));
        }
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: c */
    public void mo30214c(EnumC9587s4 enumC9587s4, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", enumC9587s4, String.format(str, objArr)));
    }

    @Override // io.sentry.InterfaceC9670w1
    /* renamed from: d */
    public boolean mo30215d(EnumC9587s4 enumC9587s4) {
        return true;
    }
}
