package F9;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import z7.AbstractC5208j;
import z7.InterfaceC5205g;

/* compiled from: RolloutsStateSubscriptionsHandler.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private f f4573a;

    /* renamed from: b, reason: collision with root package name */
    private a f4574b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f4575c;

    /* renamed from: d, reason: collision with root package name */
    private Set<H9.f> f4576d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(f fVar, a aVar, Executor executor) {
        this.f4573a = fVar;
        this.f4574b = aVar;
        this.f4575c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(AbstractC5208j abstractC5208j, final H9.f fVar, g gVar) throws JSONException {
        try {
            g gVar2 = (g) abstractC5208j.k();
            if (gVar2 != null) {
                final H9.e eVarB = this.f4574b.b(gVar2);
                this.f4575c.execute(new Runnable() { // from class: F9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void g(g gVar) {
        try {
            final H9.e eVarB = this.f4574b.b(gVar);
            for (final H9.f fVar : this.f4576d) {
                this.f4575c.execute(new Runnable() { // from class: F9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void h(final H9.f fVar) {
        this.f4576d.add(fVar);
        final AbstractC5208j<g> abstractC5208jE = this.f4573a.e();
        abstractC5208jE.f(this.f4575c, new InterfaceC5205g() { // from class: F9.c
            @Override // z7.InterfaceC5205g
            public final void a(Object obj) throws JSONException {
                this.f4568a.f(abstractC5208jE, fVar, (g) obj);
            }
        });
    }
}
