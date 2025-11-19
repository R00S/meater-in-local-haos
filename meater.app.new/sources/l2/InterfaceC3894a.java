package l2;

import J2.h;
import U1.s;

/* compiled from: MetadataDecoderFactory.java */
/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3894a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3894a f44342a = new C0588a();

    /* compiled from: MetadataDecoderFactory.java */
    /* renamed from: l2.a$a, reason: collision with other inner class name */
    class C0588a implements InterfaceC3894a {
        C0588a() {
        }

        @Override // l2.InterfaceC3894a
        public boolean a(s sVar) {
            String str = sVar.f17162o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // l2.InterfaceC3894a
        public E2.a b(s sVar) {
            String str = sVar.f17162o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new F2.b();
                    case "application/x-icy":
                        return new I2.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new G2.b();
                    case "application/x-scte35":
                        return new L2.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(s sVar);

    E2.a b(s sVar);
}
