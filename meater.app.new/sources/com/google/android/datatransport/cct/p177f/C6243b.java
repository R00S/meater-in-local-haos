package com.google.android.datatransport.cct.p177f;

import com.google.firebase.encoders.C8326b;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import com.google.firebase.encoders.p192g.InterfaceC8331a;
import com.google.firebase.encoders.p192g.InterfaceC8332b;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: com.google.android.datatransport.cct.f.b */
/* loaded from: classes2.dex */
public final class C6243b implements InterfaceC8331a {

    /* renamed from: a */
    public static final InterfaceC8331a f16600a = new C6243b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$a */
    private static final class a implements InterfaceC8327c<AbstractC6242a> {

        /* renamed from: a */
        static final a f16601a = new a();

        /* renamed from: b */
        private static final C8326b f16602b = C8326b.m26077d("sdkVersion");

        /* renamed from: c */
        private static final C8326b f16603c = C8326b.m26077d("model");

        /* renamed from: d */
        private static final C8326b f16604d = C8326b.m26077d("hardware");

        /* renamed from: e */
        private static final C8326b f16605e = C8326b.m26077d("device");

        /* renamed from: f */
        private static final C8326b f16606f = C8326b.m26077d("product");

        /* renamed from: g */
        private static final C8326b f16607g = C8326b.m26077d("osBuild");

        /* renamed from: h */
        private static final C8326b f16608h = C8326b.m26077d("manufacturer");

        /* renamed from: i */
        private static final C8326b f16609i = C8326b.m26077d("fingerprint");

        /* renamed from: j */
        private static final C8326b f16610j = C8326b.m26077d("locale");

        /* renamed from: k */
        private static final C8326b f16611k = C8326b.m26077d("country");

        /* renamed from: l */
        private static final C8326b f16612l = C8326b.m26077d("mccMnc");

        /* renamed from: m */
        private static final C8326b f16613m = C8326b.m26077d("applicationBuild");

        private a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6242a abstractC6242a, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f16602b, abstractC6242a.mo13429m());
            interfaceC8328d.mo26088i(f16603c, abstractC6242a.mo13426j());
            interfaceC8328d.mo26088i(f16604d, abstractC6242a.mo13422f());
            interfaceC8328d.mo26088i(f16605e, abstractC6242a.mo13420d());
            interfaceC8328d.mo26088i(f16606f, abstractC6242a.mo13428l());
            interfaceC8328d.mo26088i(f16607g, abstractC6242a.mo13427k());
            interfaceC8328d.mo26088i(f16608h, abstractC6242a.mo13424h());
            interfaceC8328d.mo26088i(f16609i, abstractC6242a.mo13421e());
            interfaceC8328d.mo26088i(f16610j, abstractC6242a.mo13423g());
            interfaceC8328d.mo26088i(f16611k, abstractC6242a.mo13419c());
            interfaceC8328d.mo26088i(f16612l, abstractC6242a.mo13425i());
            interfaceC8328d.mo26088i(f16613m, abstractC6242a.mo13418b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$b */
    private static final class b implements InterfaceC8327c<AbstractC6251j> {

        /* renamed from: a */
        static final b f16614a = new b();

        /* renamed from: b */
        private static final C8326b f16615b = C8326b.m26077d("logRequest");

        private b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6251j abstractC6251j, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f16615b, abstractC6251j.mo13451c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$c */
    private static final class c implements InterfaceC8327c<AbstractC6252k> {

        /* renamed from: a */
        static final c f16616a = new c();

        /* renamed from: b */
        private static final C8326b f16617b = C8326b.m26077d("clientType");

        /* renamed from: c */
        private static final C8326b f16618c = C8326b.m26077d("androidClientInfo");

        private c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6252k abstractC6252k, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f16617b, abstractC6252k.mo13453c());
            interfaceC8328d.mo26088i(f16618c, abstractC6252k.mo13452b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$d */
    private static final class d implements InterfaceC8327c<AbstractC6253l> {

        /* renamed from: a */
        static final d f16619a = new d();

        /* renamed from: b */
        private static final C8326b f16620b = C8326b.m26077d("eventTimeMs");

        /* renamed from: c */
        private static final C8326b f16621c = C8326b.m26077d("eventCode");

        /* renamed from: d */
        private static final C8326b f16622d = C8326b.m26077d("eventUptimeMs");

        /* renamed from: e */
        private static final C8326b f16623e = C8326b.m26077d("sourceExtension");

        /* renamed from: f */
        private static final C8326b f16624f = C8326b.m26077d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C8326b f16625g = C8326b.m26077d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C8326b f16626h = C8326b.m26077d("networkConnectionInfo");

        private d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6253l abstractC6253l, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26083b(f16620b, abstractC6253l.mo13458c());
            interfaceC8328d.mo26088i(f16621c, abstractC6253l.mo13457b());
            interfaceC8328d.mo26083b(f16622d, abstractC6253l.mo13459d());
            interfaceC8328d.mo26088i(f16623e, abstractC6253l.mo13461f());
            interfaceC8328d.mo26088i(f16624f, abstractC6253l.mo13462g());
            interfaceC8328d.mo26083b(f16625g, abstractC6253l.mo13463h());
            interfaceC8328d.mo26088i(f16626h, abstractC6253l.mo13460e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$e */
    private static final class e implements InterfaceC8327c<AbstractC6254m> {

        /* renamed from: a */
        static final e f16627a = new e();

        /* renamed from: b */
        private static final C8326b f16628b = C8326b.m26077d("requestTimeMs");

        /* renamed from: c */
        private static final C8326b f16629c = C8326b.m26077d("requestUptimeMs");

        /* renamed from: d */
        private static final C8326b f16630d = C8326b.m26077d("clientInfo");

        /* renamed from: e */
        private static final C8326b f16631e = C8326b.m26077d("logSource");

        /* renamed from: f */
        private static final C8326b f16632f = C8326b.m26077d("logSourceName");

        /* renamed from: g */
        private static final C8326b f16633g = C8326b.m26077d("logEvent");

        /* renamed from: h */
        private static final C8326b f16634h = C8326b.m26077d("qosTier");

        private e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6254m abstractC6254m, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26083b(f16628b, abstractC6254m.mo13477g());
            interfaceC8328d.mo26083b(f16629c, abstractC6254m.mo13478h());
            interfaceC8328d.mo26088i(f16630d, abstractC6254m.mo13472b());
            interfaceC8328d.mo26088i(f16631e, abstractC6254m.mo13474d());
            interfaceC8328d.mo26088i(f16632f, abstractC6254m.mo13475e());
            interfaceC8328d.mo26088i(f16633g, abstractC6254m.mo13473c());
            interfaceC8328d.mo26088i(f16634h, abstractC6254m.mo13476f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$f */
    private static final class f implements InterfaceC8327c<AbstractC6256o> {

        /* renamed from: a */
        static final f f16635a = new f();

        /* renamed from: b */
        private static final C8326b f16636b = C8326b.m26077d("networkType");

        /* renamed from: c */
        private static final C8326b f16637c = C8326b.m26077d("mobileSubtype");

        private f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6256o abstractC6256o, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f16636b, abstractC6256o.mo13489c());
            interfaceC8328d.mo26088i(f16637c, abstractC6256o.mo13488b());
        }
    }

    private C6243b() {
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8331a
    /* renamed from: a */
    public void mo13443a(InterfaceC8332b<?> interfaceC8332b) {
        b bVar = b.f16614a;
        interfaceC8332b.mo26092a(AbstractC6251j.class, bVar);
        interfaceC8332b.mo26092a(C6245d.class, bVar);
        e eVar = e.f16627a;
        interfaceC8332b.mo26092a(AbstractC6254m.class, eVar);
        interfaceC8332b.mo26092a(C6248g.class, eVar);
        c cVar = c.f16616a;
        interfaceC8332b.mo26092a(AbstractC6252k.class, cVar);
        interfaceC8332b.mo26092a(C6246e.class, cVar);
        a aVar = a.f16601a;
        interfaceC8332b.mo26092a(AbstractC6242a.class, aVar);
        interfaceC8332b.mo26092a(C6244c.class, aVar);
        d dVar = d.f16619a;
        interfaceC8332b.mo26092a(AbstractC6253l.class, dVar);
        interfaceC8332b.mo26092a(C6247f.class, dVar);
        f fVar = f.f16635a;
        interfaceC8332b.mo26092a(AbstractC6256o.class, fVar);
        interfaceC8332b.mo26092a(C6250i.class, fVar);
    }
}
