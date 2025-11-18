package io.sentry;

import io.sentry.C9422d5;
import io.sentry.C9436f5;
import io.sentry.C9450h5;
import io.sentry.C9473i4;
import io.sentry.C9499k4;
import io.sentry.C9506l4;
import io.sentry.C9512m3;
import io.sentry.C9519n3;
import io.sentry.C9594t4;
import io.sentry.C9657v0;
import io.sentry.C9674w5;
import io.sentry.EnumC9493j5;
import io.sentry.EnumC9580r4;
import io.sentry.EnumC9587s4;
import io.sentry.clientreport.C9398b;
import io.sentry.profilemeasurements.C9536a;
import io.sentry.profilemeasurements.C9537b;
import io.sentry.protocol.C9539a;
import io.sentry.protocol.C9540a0;
import io.sentry.protocol.C9541b;
import io.sentry.protocol.C9542b0;
import io.sentry.protocol.C9543c;
import io.sentry.protocol.C9544c0;
import io.sentry.protocol.C9545d;
import io.sentry.protocol.C9546e;
import io.sentry.protocol.C9547f;
import io.sentry.protocol.C9548g;
import io.sentry.protocol.C9549h;
import io.sentry.protocol.C9550i;
import io.sentry.protocol.C9551j;
import io.sentry.protocol.C9552k;
import io.sentry.protocol.C9553l;
import io.sentry.protocol.C9555n;
import io.sentry.protocol.C9556o;
import io.sentry.protocol.C9557p;
import io.sentry.protocol.C9559r;
import io.sentry.protocol.C9560s;
import io.sentry.protocol.C9561t;
import io.sentry.protocol.C9562u;
import io.sentry.protocol.C9563v;
import io.sentry.protocol.C9564w;
import io.sentry.protocol.C9565x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9646q;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: JsonSerializer.java */
/* renamed from: io.sentry.s2 */
/* loaded from: classes2.dex */
public final class C9585s2 implements InterfaceC9373c2 {

    /* renamed from: a */
    private static final Charset f36822a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C9680x4 f36823b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC9504l2<?>> f36824c;

    public C9585s2(C9680x4 c9680x4) {
        this.f36823b = c9680x4;
        HashMap map = new HashMap();
        this.f36824c = map;
        map.put(C9539a.class, new C9539a.a());
        map.put(C9657v0.class, new C9657v0.a());
        map.put(C9541b.class, new C9541b.a());
        map.put(C9543c.class, new C9543c.a());
        map.put(DebugImage.class, new DebugImage.C9538a());
        map.put(C9545d.class, new C9545d.a());
        map.put(C9546e.class, new C9546e.a());
        map.put(C9546e.b.class, new C9546e.b.a());
        map.put(C9548g.class, new C9548g.a());
        map.put(C9549h.class, new C9549h.a());
        map.put(C9550i.class, new C9550i.a());
        map.put(C9551j.class, new C9551j.a());
        map.put(C9552k.class, new C9552k.a());
        map.put(C9512m3.class, new C9512m3.b());
        map.put(C9519n3.class, new C9519n3.a());
        map.put(C9536a.class, new C9536a.a());
        map.put(C9537b.class, new C9537b.a());
        map.put(C9553l.class, new C9553l.a());
        map.put(C9555n.class, new C9555n.a());
        map.put(C9556o.class, new C9556o.a());
        map.put(C9473i4.class, new C9473i4.a());
        map.put(C9499k4.class, new C9499k4.a());
        map.put(C9506l4.class, new C9506l4.a());
        map.put(C9557p.class, new C9557p.a());
        map.put(EnumC9580r4.class, new EnumC9580r4.a());
        map.put(EnumC9587s4.class, new EnumC9587s4.a());
        map.put(C9594t4.class, new C9594t4.a());
        map.put(C9559r.class, new C9559r.a());
        map.put(C9560s.class, new C9560s.a());
        map.put(C9561t.class, new C9561t.a());
        map.put(C9562u.class, new C9562u.a());
        map.put(C9563v.class, new C9563v.a());
        map.put(C9564w.class, new C9564w.a());
        map.put(C9565x.class, new C9565x.a());
        map.put(C9422d5.class, new C9422d5.a());
        map.put(C9436f5.class, new C9436f5.a());
        map.put(C9450h5.class, new C9450h5.a());
        map.put(EnumC9493j5.class, new EnumC9493j5.a());
        map.put(C9540a0.class, new C9540a0.a());
        map.put(C9547f.class, new C9547f.a());
        map.put(C9674w5.class, new C9674w5.a());
        map.put(C9398b.class, new C9398b.a());
        map.put(C9544c0.class, new C9544c0.a());
        map.put(C9542b0.class, new C9542b0.a());
    }

    /* renamed from: g */
    private <T> boolean m31582g(Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    /* renamed from: h */
    private String m31583h(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C9532p2 c9532p2 = new C9532p2(stringWriter, this.f36823b.getMaxDepth());
        if (z) {
            c9532p2.m31166s("\t");
        }
        c9532p2.mo30824g(this.f36823b.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: a */
    public <T> void mo30487a(T t, Writer writer) throws IOException {
        C9646q.m31802c(t, "The entity is required.");
        C9646q.m31802c(writer, "The Writer object is required.");
        InterfaceC9670w1 logger = this.f36823b.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        if (logger.mo30215d(enumC9587s4)) {
            this.f36823b.getLogger().mo30214c(enumC9587s4, "Serializing object: %s", m31583h(t, this.f36823b.isEnablePrettySerializationOutput()));
        }
        new C9532p2(writer, this.f36823b.getMaxDepth()).mo30824g(this.f36823b.getLogger(), t);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: b */
    public void mo30488b(C9449h4 c9449h4, OutputStream outputStream) throws Exception {
        C9646q.m31802c(c9449h4, "The SentryEnvelope object is required.");
        C9646q.m31802c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f36822a));
        try {
            c9449h4.m30831b().serialize(new C9532p2(bufferedWriter, this.f36823b.getMaxDepth()), this.f36823b.getLogger());
            bufferedWriter.write("\n");
            for (C9492j4 c9492j4 : c9449h4.m30832c()) {
                try {
                    byte[] bArrM30909h = c9492j4.m30909h();
                    c9492j4.m30910i().serialize(new C9532p2(bufferedWriter, this.f36823b.getMaxDepth()), this.f36823b.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrM30909h);
                    bufferedWriter.write("\n");
                } catch (Exception e2) {
                    this.f36823b.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to create envelope item. Dropping it.", e2);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: c */
    public <T> T mo30489c(Reader reader, Class<T> cls) {
        try {
            C9518n2 c9518n2 = new C9518n2(reader);
            try {
                InterfaceC9504l2<?> interfaceC9504l2 = this.f36824c.get(cls);
                if (interfaceC9504l2 != null) {
                    T tCast = cls.cast(interfaceC9504l2.mo30683a(c9518n2, this.f36823b.getLogger()));
                    c9518n2.close();
                    return tCast;
                }
                if (!m31582g(cls)) {
                    c9518n2.close();
                    return null;
                }
                T t = (T) c9518n2.m31088K0();
                c9518n2.close();
                return t;
            } catch (Throwable th) {
                try {
                    c9518n2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e2) {
            this.f36823b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error when deserializing", e2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: d */
    public C9449h4 mo30490d(InputStream inputStream) {
        C9646q.m31802c(inputStream, "The InputStream object is required.");
        try {
            return this.f36823b.getEnvelopeReader().mo30817a(inputStream);
        } catch (IOException e2) {
            this.f36823b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error deserializing envelope.", e2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: e */
    public <T, R> T mo30491e(Reader reader, Class<T> cls, InterfaceC9504l2<R> interfaceC9504l2) {
        try {
            C9518n2 c9518n2 = new C9518n2(reader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    T t = (T) c9518n2.m31088K0();
                    c9518n2.close();
                    return t;
                }
                if (interfaceC9504l2 == null) {
                    T t2 = (T) c9518n2.m31088K0();
                    c9518n2.close();
                    return t2;
                }
                T t3 = (T) c9518n2.m31085F0(this.f36823b.getLogger(), interfaceC9504l2);
                c9518n2.close();
                return t3;
            } catch (Throwable th) {
                try {
                    c9518n2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36823b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: f */
    public String mo30492f(Map<String, Object> map) throws Exception {
        return m31583h(map, false);
    }
}
