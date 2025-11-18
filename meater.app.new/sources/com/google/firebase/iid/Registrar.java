package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.iid.p195w.InterfaceC8375a;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.p204r.InterfaceC8492j;
import com.google.firebase.p209u.C8555h;
import com.google.firebase.p209u.InterfaceC8556i;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    static class C8352a implements InterfaceC8375a {

        /* renamed from: a */
        final FirebaseInstanceId f31717a;

        public C8352a(FirebaseInstanceId firebaseInstanceId) {
            this.f31717a = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.p195w.InterfaceC8375a
        /* renamed from: a */
        public String mo26197a() {
            return this.f31717a.m26187o();
        }

        @Override // com.google.firebase.iid.p195w.InterfaceC8375a
        /* renamed from: b */
        public Task<String> mo26198b() {
            String strM26187o = this.f31717a.m26187o();
            return strM26187o != null ? Tasks.m23663e(strM26187o) : this.f31717a.m26186k().mo23643f(C8369q.f31753a);
        }

        @Override // com.google.firebase.iid.p195w.InterfaceC8375a
        /* renamed from: c */
        public void mo26199c(InterfaceC8375a.a aVar) {
            this.f31717a.m26180a(aVar);
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(InterfaceC8126p interfaceC8126p) {
        return new FirebaseInstanceId((C8405j) interfaceC8126p.mo24973a(C8405j.class), interfaceC8126p.mo24975c(InterfaceC8556i.class), interfaceC8126p.mo24975c(InterfaceC8492j.class), (InterfaceC8385i) interfaceC8126p.mo24973a(InterfaceC8385i.class));
    }

    static final /* synthetic */ InterfaceC8375a lambda$getComponents$1$Registrar(InterfaceC8126p interfaceC8126p) {
        return new C8352a((FirebaseInstanceId) interfaceC8126p.mo24973a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24986c(FirebaseInstanceId.class).m25006b(C8132v.m25060k(C8405j.class)).m25006b(C8132v.m25058i(InterfaceC8556i.class)).m25006b(C8132v.m25058i(InterfaceC8492j.class)).m25006b(C8132v.m25060k(InterfaceC8385i.class)).m25010f(C8367o.f31751a).m25007c().m25008d(), C8124n.m24986c(InterfaceC8375a.class).m25006b(C8132v.m25060k(FirebaseInstanceId.class)).m25010f(C8368p.f31752a).m25008d(), C8555h.m26903a("fire-iid", "21.1.0"));
    }
}
