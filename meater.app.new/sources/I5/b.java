package I5;

import V4.p;
import com.apptionlabs.meater_app.data.EstimatorConfigResponse;
import com.apptionlabs.meater_app.data.EstimatorConfigResponseDataDecoder;
import com.apptionlabs.meater_app.model.Probe;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oc.AbstractC4179C;
import oc.E;
import oc.x;
import org.json.JSONObject;
import x4.f;

/* compiled from: EstimatorConfigManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LI5/b;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6682a = new b();

    /* compiled from: EstimatorConfigManager.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"I5/b$a", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements nd.d<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Probe f6683a;

        a(Probe probe) {
            this.f6683a = probe;
        }

        @Override // nd.d
        public void onFailure(nd.b<E> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            U4.b.e("Estimator Config: Failed to retrieve config data. " + t10.getLocalizedMessage(), new Object[0]);
        }

        @Override // nd.d
        public void onResponse(nd.b<E> call, s<E> response) {
            C3862t.g(call, "call");
            C3862t.g(response, "response");
            if (!response.f()) {
                U4.b.e("Estimator Config request did not succeed. probeID %s", this.f6683a.shortDeviceIDString());
                return;
            }
            E eA = response.a();
            if (eA == null) {
                return;
            }
            EstimatorConfigResponse estimateResponseDataFromJson = EstimatorConfigResponseDataDecoder.INSTANCE.getEstimateResponseDataFromJson(new JSONObject(eA.j()));
            this.f6683a.setTemperatureChangeBeforeReady(estimateResponseDataFromJson.getTemperatureChangeBeforeReady());
            this.f6683a.setSecondsDelayBeforeReady(estimateResponseDataFromJson.getSecondsDelayBeforeReady());
            this.f6683a.setSecondsDelayBeforeResting(estimateResponseDataFromJson.getSecondsDelayBeforeResting());
            this.f6683a.setTemperatureOffsetBeforeRemoveFromHeat(estimateResponseDataFromJson.getTemperatureOffsetBeforeRemoveFromHeat());
            this.f6683a.markCookSetupModified();
        }
    }

    private b() {
    }

    public final void a(Probe probe) {
        nd.b<E> bVarC;
        C3862t.g(probe, "probe");
        U4.b.e("Requesting estimator configuration", new Object[0]);
        byte[] bArrEncode = p.r(probe).encode();
        AbstractC4179C abstractC4179CF = AbstractC4179C.INSTANCE.f(bArrEncode, x.INSTANCE.b("application/octet-stream"), 0, bArrEncode.length);
        F5.a aVarG = f.g(f.f52783a, false, null, 3, null);
        if (aVarG == null || (bVarC = aVarG.c(abstractC4179CF)) == null) {
            return;
        }
        bVarC.enqueue(new a(probe));
    }
}
