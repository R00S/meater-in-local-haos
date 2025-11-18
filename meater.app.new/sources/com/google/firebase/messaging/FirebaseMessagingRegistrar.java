package com.google.firebase.messaging;

import androidx.annotation.Keep;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C8405j;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.iid.p195w.InterfaceC8375a;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.p203q.InterfaceC8482d;
import com.google.firebase.p204r.InterfaceC8492j;
import com.google.firebase.p209u.C8555h;
import com.google.firebase.p209u.InterfaceC8556i;
import java.util.Arrays;
import java.util.List;
import p241e.p254e.p256b.p257a.AbstractC8786c;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8788e;
import p241e.p254e.p256b.p257a.InterfaceC8789f;
import p241e.p254e.p256b.p257a.InterfaceC8790g;
import p241e.p254e.p256b.p257a.InterfaceC8791h;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    private static class C8415b<T> implements InterfaceC8789f<T> {
        private C8415b() {
        }

        @Override // p241e.p254e.p256b.p257a.InterfaceC8789f
        /* renamed from: a */
        public void mo26452a(AbstractC8786c<T> abstractC8786c) {
        }

        @Override // p241e.p254e.p256b.p257a.InterfaceC8789f
        /* renamed from: b */
        public void mo26453b(AbstractC8786c<T> abstractC8786c, InterfaceC8791h interfaceC8791h) {
            interfaceC8791h.mo26010a(null);
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$c */
    public static class C8416c implements InterfaceC8790g {
        @Override // p241e.p254e.p256b.p257a.InterfaceC8790g
        /* renamed from: a */
        public <T> InterfaceC8789f<T> mo26454a(String str, Class<T> cls, C8785b c8785b, InterfaceC8788e<T, byte[]> interfaceC8788e) {
            return new C8415b();
        }
    }

    static InterfaceC8790g determineFactory(InterfaceC8790g interfaceC8790g) {
        if (interfaceC8790g == null) {
            return new C8416c();
        }
        try {
            interfaceC8790g.mo26454a("test", String.class, C8785b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON), C8467x.f32085a);
            return interfaceC8790g;
        } catch (IllegalArgumentException unused) {
            return new C8416c();
        }
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(InterfaceC8126p interfaceC8126p) {
        return new FirebaseMessaging((C8405j) interfaceC8126p.mo24973a(C8405j.class), (InterfaceC8375a) interfaceC8126p.mo24973a(InterfaceC8375a.class), interfaceC8126p.mo24975c(InterfaceC8556i.class), interfaceC8126p.mo24975c(InterfaceC8492j.class), (InterfaceC8385i) interfaceC8126p.mo24973a(InterfaceC8385i.class), determineFactory((InterfaceC8790g) interfaceC8126p.mo24973a(InterfaceC8790g.class)), (InterfaceC8482d) interfaceC8126p.mo24973a(InterfaceC8482d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24986c(FirebaseMessaging.class).m25006b(C8132v.m25060k(C8405j.class)).m25006b(C8132v.m25057h(InterfaceC8375a.class)).m25006b(C8132v.m25058i(InterfaceC8556i.class)).m25006b(C8132v.m25058i(InterfaceC8492j.class)).m25006b(C8132v.m25057h(InterfaceC8790g.class)).m25006b(C8132v.m25060k(InterfaceC8385i.class)).m25006b(C8132v.m25060k(InterfaceC8482d.class)).m25010f(C8465w.f32083a).m25007c().m25008d(), C8555h.m26903a("fire-fcm", "20.1.7_1p"));
    }
}
