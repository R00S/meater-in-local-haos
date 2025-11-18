package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.encoders.C8326b;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import com.google.firebase.encoders.p192g.InterfaceC8331a;
import com.google.firebase.encoders.p192g.InterfaceC8332b;
import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* renamed from: com.google.firebase.crashlytics.h.o.b */
/* loaded from: classes2.dex */
public final class C8236b implements InterfaceC8331a {

    /* renamed from: a */
    public static final InterfaceC8331a f31064a = new C8236b();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.b$a */
    private static final class a implements InterfaceC8327c<AbstractC8244j> {

        /* renamed from: a */
        static final a f31065a = new a();

        /* renamed from: b */
        private static final C8326b f31066b = C8326b.m26077d("rolloutId");

        /* renamed from: c */
        private static final C8326b f31067c = C8326b.m26077d("parameterKey");

        /* renamed from: d */
        private static final C8326b f31068d = C8326b.m26077d("parameterValue");

        /* renamed from: e */
        private static final C8326b f31069e = C8326b.m26077d("variantId");

        /* renamed from: f */
        private static final C8326b f31070f = C8326b.m26077d("templateVersion");

        private a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8244j abstractC8244j, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31066b, abstractC8244j.mo25460e());
            interfaceC8328d.mo26088i(f31067c, abstractC8244j.mo25458c());
            interfaceC8328d.mo26088i(f31068d, abstractC8244j.mo25459d());
            interfaceC8328d.mo26088i(f31069e, abstractC8244j.mo25462g());
            interfaceC8328d.mo26083b(f31070f, abstractC8244j.mo25461f());
        }
    }

    private C8236b() {
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8331a
    /* renamed from: a */
    public void mo13443a(InterfaceC8332b<?> interfaceC8332b) {
        a aVar = a.f31065a;
        interfaceC8332b.mo26092a(AbstractC8244j.class, aVar);
        interfaceC8332b.mo26092a(C8237c.class, aVar);
    }
}
