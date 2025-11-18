package E4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oc.E;
import org.json.JSONObject;

/* compiled from: JuicyCookVideoDownload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LE4/f;", "", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: JuicyCookVideoDownload.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LE4/f$a;", "", "<init>", "()V", "LE4/f$b;", "listener", "Loa/F;", "a", "(LE4/f$b;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E4.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: JuicyCookVideoDownload.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"E4/f$a$a", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.f$a$a, reason: collision with other inner class name */
        public static final class C0067a implements nd.d<E> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f3876a;

            C0067a(b bVar) {
                this.f3876a = bVar;
            }

            @Override // nd.d
            public void onFailure(nd.b<E> call, Throwable t10) {
                C3862t.g(call, "call");
                C3862t.g(t10, "t");
                this.f3876a.a(new JSONObject());
            }

            @Override // nd.d
            public void onResponse(nd.b<E> call, s<E> response) {
                String strJ;
                C3862t.g(call, "call");
                C3862t.g(response, "response");
                if (!response.f()) {
                    this.f3876a.a(new JSONObject());
                    return;
                }
                try {
                    E eA = response.a();
                    if (eA != null && (strJ = eA.j()) != null) {
                        this.f3876a.a(new JSONObject(strJ));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final void a(b listener) {
            nd.b<E> bVarB;
            C3862t.g(listener, "listener");
            F5.a aVarG = x4.f.g(x4.f.f52783a, false, null, 3, null);
            if (aVarG == null || (bVarB = aVarG.b()) == null) {
                return;
            }
            bVarB.enqueue(new C0067a(listener));
        }

        private Companion() {
        }
    }

    /* compiled from: JuicyCookVideoDownload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE4/f$b;", "", "Lorg/json/JSONObject;", "response", "Loa/F;", "a", "(Lorg/json/JSONObject;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(JSONObject response);
    }
}
