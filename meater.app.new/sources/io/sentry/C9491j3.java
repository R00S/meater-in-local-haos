package io.sentry;

import io.sentry.hints.InterfaceC9459i;
import io.sentry.hints.InterfaceC9460j;
import io.sentry.hints.InterfaceC9461k;
import io.sentry.hints.InterfaceC9466p;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9638i;
import io.sentry.util.C9642m;
import io.sentry.util.C9645p;
import io.sentry.util.C9646q;
import io.sentry.util.C9649t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: OutboxSender.java */
@ApiStatus.Internal
/* renamed from: io.sentry.j3 */
/* loaded from: classes2.dex */
public final class C9491j3 extends AbstractC9425e1 implements InterfaceC9591t1 {

    /* renamed from: c */
    private static final Charset f36384c = Charset.forName("UTF-8");

    /* renamed from: d */
    private final InterfaceC9658v1 f36385d;

    /* renamed from: e */
    private final InterfaceC9584s1 f36386e;

    /* renamed from: f */
    private final InterfaceC9373c2 f36387f;

    /* renamed from: g */
    private final InterfaceC9670w1 f36388g;

    public C9491j3(InterfaceC9658v1 interfaceC9658v1, InterfaceC9584s1 interfaceC9584s1, InterfaceC9373c2 interfaceC9373c2, InterfaceC9670w1 interfaceC9670w1, long j2) {
        super(interfaceC9670w1, j2);
        this.f36385d = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required.");
        this.f36386e = (InterfaceC9584s1) C9646q.m31802c(interfaceC9584s1, "Envelope reader is required.");
        this.f36387f = (InterfaceC9373c2) C9646q.m31802c(interfaceC9373c2, "Serializer is required.");
        this.f36388g = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "Logger is required.");
    }

    /* renamed from: g */
    private C9574q5 m30877g(C9528o5 c9528o5) {
        String strM31131a;
        if (c9528o5 != null && (strM31131a = c9528o5.m31131a()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strM31131a));
                if (C9649t.m31811e(dValueOf, false)) {
                    return new C9574q5(Boolean.TRUE, dValueOf);
                }
                this.f36388g.mo30214c(EnumC9587s4.ERROR, "Invalid sample rate parsed from TraceContext: %s", strM31131a);
            } catch (Exception unused) {
                this.f36388g.mo30214c(EnumC9587s4.ERROR, "Unable to parse sample rate from TraceContext: %s", strM31131a);
            }
        }
        return new C9574q5(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30886j(File file, InterfaceC9461k interfaceC9461k) {
        if (interfaceC9461k.mo30474b()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f36388g.mo30214c(EnumC9587s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e2) {
            this.f36388g.mo30212a(EnumC9587s4.ERROR, e2, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    /* renamed from: k */
    private void m30880k(C9492j4 c9492j4, int i2) {
        this.f36388g.mo30214c(EnumC9587s4.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i2), c9492j4.m30910i().m30919b());
    }

    /* renamed from: l */
    private void m30881l(int i2) {
        this.f36388g.mo30214c(EnumC9587s4.DEBUG, "Item %d is being captured.", Integer.valueOf(i2));
    }

    /* renamed from: m */
    private void m30882m(C9558q c9558q) {
        this.f36388g.mo30214c(EnumC9587s4.WARNING, "Timed out waiting for event id submission: %s", c9558q);
    }

    /* renamed from: n */
    private void m30883n(C9449h4 c9449h4, C9558q c9558q, int i2) {
        this.f36388g.mo30214c(EnumC9587s4.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i2), c9449h4.m30831b().m30849a(), c9558q);
    }

    /* renamed from: o */
    private void m30884o(C9449h4 c9449h4, C9517n1 c9517n1) throws IOException {
        BufferedReader bufferedReader;
        Object objM31780c;
        this.f36388g.mo30214c(EnumC9587s4.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(C9638i.m31769d(c9449h4.m30832c())));
        int i2 = 0;
        for (C9492j4 c9492j4 : c9449h4.m30832c()) {
            i2++;
            if (c9492j4.m30910i() == null) {
                this.f36388g.mo30214c(EnumC9587s4.ERROR, "Item %d has no header", Integer.valueOf(i2));
            } else if (EnumC9580r4.Event.equals(c9492j4.m30910i().m30919b())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c9492j4.m30909h()), f36384c));
                } catch (Throwable th) {
                    this.f36388g.mo30213b(EnumC9587s4.ERROR, "Item failed to process.", th);
                }
                try {
                    C9506l4 c9506l4 = (C9506l4) this.f36387f.mo30489c(bufferedReader, C9506l4.class);
                    if (c9506l4 == null) {
                        m30880k(c9492j4, i2);
                    } else {
                        if (c9506l4.m30584L() != null) {
                            C9642m.m31792o(c9517n1, c9506l4.m30584L().m31428e());
                        }
                        if (c9449h4.m30831b().m30849a() == null || c9449h4.m30831b().m30849a().equals(c9506l4.m30579G())) {
                            this.f36385d.mo31159t(c9506l4, c9517n1);
                            m30881l(i2);
                            if (!m30885p(c9517n1)) {
                                m30882m(c9506l4.m30579G());
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            m30883n(c9449h4, c9506l4.m30579G(), i2);
                            bufferedReader.close();
                        }
                    }
                    bufferedReader.close();
                    objM31780c = C9642m.m31780c(c9517n1);
                    if (!(objM31780c instanceof InterfaceC9466p) && !((InterfaceC9466p) objM31780c).mo30478f()) {
                        this.f36388g.mo30214c(EnumC9587s4.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i2));
                        return;
                    }
                    C9642m.m31788k(c9517n1, InterfaceC9460j.class, new C9642m.a() { // from class: io.sentry.q
                        @Override // io.sentry.util.C9642m.a
                        /* renamed from: a */
                        public final void mo30156a(Object obj) {
                            ((InterfaceC9460j) obj).mo30473a();
                        }
                    });
                } finally {
                }
            } else {
                if (EnumC9580r4.Transaction.equals(c9492j4.m30910i().m30919b())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c9492j4.m30909h()), f36384c));
                        try {
                            C9565x c9565x = (C9565x) this.f36387f.mo30489c(bufferedReader, C9565x.class);
                            if (c9565x == null) {
                                m30880k(c9492j4, i2);
                            } else if (c9449h4.m30831b().m30849a() == null || c9449h4.m30831b().m30849a().equals(c9565x.m30579G())) {
                                C9528o5 c9528o5M30851c = c9449h4.m30831b().m30851c();
                                if (c9565x.m30575C().m31234e() != null) {
                                    c9565x.m30575C().m31234e().m30806n(m30877g(c9528o5M30851c));
                                }
                                this.f36385d.mo31152m(c9565x, c9528o5M30851c, c9517n1);
                                m30881l(i2);
                                if (!m30885p(c9517n1)) {
                                    m30882m(c9565x.m30579G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                m30883n(c9449h4, c9565x.m30579G(), i2);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.f36388g.mo30213b(EnumC9587s4.ERROR, "Item failed to process.", th2);
                    }
                } else {
                    this.f36385d.mo31149j(new C9449h4(c9449h4.m30831b().m30849a(), c9449h4.m30831b().m30850b(), c9492j4), c9517n1);
                    this.f36388g.mo30214c(EnumC9587s4.DEBUG, "%s item %d is being captured.", c9492j4.m30910i().m30919b().getItemType(), Integer.valueOf(i2));
                    if (!m30885p(c9517n1)) {
                        this.f36388g.mo30214c(EnumC9587s4.WARNING, "Timed out waiting for item type submission: %s", c9492j4.m30910i().m30919b().getItemType());
                        return;
                    }
                }
                objM31780c = C9642m.m31780c(c9517n1);
                if (!(objM31780c instanceof InterfaceC9466p)) {
                }
                C9642m.m31788k(c9517n1, InterfaceC9460j.class, new C9642m.a() { // from class: io.sentry.q
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9460j) obj).mo30473a();
                    }
                });
            }
        }
    }

    /* renamed from: p */
    private boolean m30885p(C9517n1 c9517n1) {
        Object objM31780c = C9642m.m31780c(c9517n1);
        if (objM31780c instanceof InterfaceC9459i) {
            return ((InterfaceC9459i) objM31780c).mo30477e();
        }
        C9645p.m31799a(InterfaceC9459i.class, objM31780c, this.f36388g);
        return true;
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
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
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
        C9646q.m31802c(file, "File is required.");
        try {
            if (!mo30757b(file.getName())) {
                this.f36388g.mo30214c(EnumC9587s4.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (IOException e2) {
                this.f36388g.mo30213b(EnumC9587s4.ERROR, "Error processing envelope.", e2);
                interfaceC9670w1 = this.f36388g;
                aVar = new C9642m.a() { // from class: io.sentry.p
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        this.f36552a.m30886j(file, (InterfaceC9461k) obj);
                    }
                };
            }
            try {
                C9449h4 c9449h4Mo30817a = this.f36386e.mo30817a(bufferedInputStream);
                if (c9449h4Mo30817a == null) {
                    this.f36388g.mo30214c(EnumC9587s4.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    m30884o(c9449h4Mo30817a, c9517n1);
                    this.f36388g.mo30214c(EnumC9587s4.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
                interfaceC9670w1 = this.f36388g;
                aVar = new C9642m.a() { // from class: io.sentry.p
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        this.f36552a.m30886j(file, (InterfaceC9461k) obj);
                    }
                };
                C9642m.m31790m(c9517n1, InterfaceC9461k.class, interfaceC9670w1, aVar);
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            C9642m.m31790m(c9517n1, InterfaceC9461k.class, this.f36388g, new C9642m.a() { // from class: io.sentry.p
                @Override // io.sentry.util.C9642m.a
                /* renamed from: a */
                public final void mo30156a(Object obj) {
                    this.f36552a.m30886j(file, (InterfaceC9461k) obj);
                }
            });
            throw th2;
        }
    }
}
