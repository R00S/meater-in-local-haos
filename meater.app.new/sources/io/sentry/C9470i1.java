package io.sentry;

import io.sentry.hints.InterfaceC9459i;
import io.sentry.hints.InterfaceC9461k;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeSender.java */
@ApiStatus.Internal
/* renamed from: io.sentry.i1 */
/* loaded from: classes2.dex */
public final class C9470i1 extends AbstractC9425e1 implements InterfaceC9591t1 {

    /* renamed from: c */
    private final InterfaceC9658v1 f36351c;

    /* renamed from: d */
    private final InterfaceC9373c2 f36352d;

    /* renamed from: e */
    private final InterfaceC9670w1 f36353e;

    public C9470i1(InterfaceC9658v1 interfaceC9658v1, InterfaceC9373c2 interfaceC9373c2, InterfaceC9670w1 interfaceC9670w1, long j2) {
        super(interfaceC9670w1, j2);
        this.f36351c = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required.");
        this.f36352d = (InterfaceC9373c2) C9646q.m31802c(interfaceC9373c2, "Serializer is required.");
        this.f36353e = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30842h(InterfaceC9459i interfaceC9459i) {
        if (interfaceC9459i.mo30477e()) {
            return;
        }
        this.f36353e.mo30214c(EnumC9587s4.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30843j(Throwable th, File file, InterfaceC9461k interfaceC9461k) {
        interfaceC9461k.mo30476d(false);
        this.f36353e.mo30212a(EnumC9587s4.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30844l(File file, InterfaceC9461k interfaceC9461k) {
        if (interfaceC9461k.mo30474b()) {
            this.f36353e.mo30214c(EnumC9587s4.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            m30840m(file, "after trying to capture it");
            this.f36353e.mo30214c(EnumC9587s4.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    /* renamed from: m */
    private void m30840m(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f36353e.mo30214c(EnumC9587s4.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.f36353e.mo30212a(EnumC9587s4.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.InterfaceC9591t1
    /* renamed from: a */
    public void mo30841a(String str, C9517n1 c9517n1) {
        C9646q.m31802c(str, "Path is required.");
        mo30760f(new File(str), c9517n1);
    }

    @Override // io.sentry.AbstractC9425e1
    /* renamed from: b */
    protected boolean mo30757b(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC9425e1
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo30759e(File file) {
        super.mo30759e(file);
    }

    @Override // io.sentry.AbstractC9425e1
    /* renamed from: f */
    protected void mo30760f(final File file, C9517n1 c9517n1) {
        InterfaceC9670w1 interfaceC9670w1;
        C9642m.a aVar;
        BufferedInputStream bufferedInputStream;
        if (!file.isFile()) {
            this.f36353e.mo30214c(EnumC9587s4.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!mo30757b(file.getName())) {
            this.f36353e.mo30214c(EnumC9587s4.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f36353e.mo30214c(EnumC9587s4.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    } catch (IOException e2) {
                        this.f36353e.mo30212a(EnumC9587s4.ERROR, e2, "I/O on file '%s' failed.", file.getAbsolutePath());
                        interfaceC9670w1 = this.f36353e;
                        aVar = new C9642m.a() { // from class: io.sentry.e
                            @Override // io.sentry.util.C9642m.a
                            /* renamed from: a */
                            public final void mo30156a(Object obj) {
                                this.f36286a.m30844l(file, (InterfaceC9461k) obj);
                            }
                        };
                    }
                } catch (FileNotFoundException e3) {
                    this.f36353e.mo30212a(EnumC9587s4.ERROR, e3, "File '%s' cannot be found.", file.getAbsolutePath());
                    interfaceC9670w1 = this.f36353e;
                    aVar = new C9642m.a() { // from class: io.sentry.e
                        @Override // io.sentry.util.C9642m.a
                        /* renamed from: a */
                        public final void mo30156a(Object obj) {
                            this.f36286a.m30844l(file, (InterfaceC9461k) obj);
                        }
                    };
                }
            } catch (Throwable th) {
                this.f36353e.mo30212a(EnumC9587s4.ERROR, th, "Failed to capture cached envelope %s", file.getAbsolutePath());
                C9642m.m31790m(c9517n1, InterfaceC9461k.class, this.f36353e, new C9642m.a() { // from class: io.sentry.c
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        this.f36174a.m30843j(th, file, (InterfaceC9461k) obj);
                    }
                });
                interfaceC9670w1 = this.f36353e;
                aVar = new C9642m.a() { // from class: io.sentry.e
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        this.f36286a.m30844l(file, (InterfaceC9461k) obj);
                    }
                };
            }
            try {
                C9449h4 c9449h4Mo30490d = this.f36352d.mo30490d(bufferedInputStream);
                if (c9449h4Mo30490d == null) {
                    this.f36353e.mo30214c(EnumC9587s4.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                } else {
                    this.f36351c.mo31149j(c9449h4Mo30490d, c9517n1);
                }
                C9642m.m31790m(c9517n1, InterfaceC9459i.class, this.f36353e, new C9642m.a() { // from class: io.sentry.d
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        this.f36259a.m30842h((InterfaceC9459i) obj);
                    }
                });
                bufferedInputStream.close();
                interfaceC9670w1 = this.f36353e;
                aVar = new C9642m.a() { // from class: io.sentry.e
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        this.f36286a.m30844l(file, (InterfaceC9461k) obj);
                    }
                };
                C9642m.m31790m(c9517n1, InterfaceC9461k.class, interfaceC9670w1, aVar);
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            C9642m.m31790m(c9517n1, InterfaceC9461k.class, this.f36353e, new C9642m.a() { // from class: io.sentry.e
                @Override // io.sentry.util.C9642m.a
                /* renamed from: a */
                public final void mo30156a(Object obj) {
                    this.f36286a.m30844l(file, (InterfaceC9461k) obj);
                }
            });
            throw th3;
        }
    }
}
