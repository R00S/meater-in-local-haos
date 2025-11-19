package E4;

import java.io.IOException;
import nd.s;
import oc.AbstractC4179C;
import oc.E;
import oc.x;

/* compiled from: ServerRequests.java */
/* loaded from: classes.dex */
public class k {

    /* compiled from: ServerRequests.java */
    class a implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f3932a;

        a(k kVar, j jVar) {
            this.f3932a = jVar;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> bVar, Throwable th) {
            j jVar = this.f3932a;
            if (jVar != null) {
                jVar.a(null);
            }
        }

        @Override // nd.d
        public void onResponse(nd.b<E> bVar, s<E> sVar) {
            j jVar;
            if (!sVar.f()) {
                j jVar2 = this.f3932a;
                if (jVar2 != null) {
                    jVar2.a(null);
                    return;
                }
                return;
            }
            if (sVar.a() == null || (jVar = this.f3932a) == null) {
                return;
            }
            try {
                jVar.a(sVar.a().j());
            } catch (IOException e10) {
                e10.printStackTrace();
                this.f3932a.a(null);
            }
        }
    }

    public void a(String str, String str2, j jVar) {
        if (str2 == null) {
            return;
        }
        x4.f.f52783a.d().d(str, AbstractC4179C.c(str2, x.g("text/plain"))).enqueue(new a(this, jVar));
    }
}
