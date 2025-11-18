package E4;

import Ub.n;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import nd.s;
import oc.C4178B;
import oc.C4180D;
import oc.E;
import oc.F;
import oc.InterfaceC4182b;

/* compiled from: TokenAuthenticator.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LE4/l;", "Loc/b;", "<init>", "()V", "Loc/D;", "response", "", "b", "(Loc/D;)I", "Loc/F;", "route", "Loc/B;", "a", "(Loc/F;Loc/D;)Loc/B;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements InterfaceC4182b {

    /* compiled from: TokenAuthenticator.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"E4/l$a", "Lnd/d;", "Lcom/apptionlabs/meater_app/cloud/responses/MeaterCloudAccountResponse;", "Lnd/b;", "call", "Lnd/s;", "responses", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements nd.d<MeaterCloudAccountResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MEATERCloudAccount f3933a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4180D f3934b;

        a(MEATERCloudAccount mEATERCloudAccount, C4180D c4180d) {
            this.f3933a = mEATERCloudAccount;
            this.f3934b = c4180d;
        }

        @Override // nd.d
        public void onFailure(nd.b<MeaterCloudAccountResponse> call, Throwable t10) {
            C3862t.g(call, "call");
            C3862t.g(t10, "t");
            U4.b.e("_Referesh_tokenToken refresh failed: " + t10.getLocalizedMessage(), new Object[0]);
        }

        @Override // nd.d
        public void onResponse(nd.b<MeaterCloudAccountResponse> call, s<MeaterCloudAccountResponse> responses) {
            C3862t.g(call, "call");
            C3862t.g(responses, "responses");
            if (!responses.f()) {
                E eD = responses.d();
                U4.b.e("Refresh_Token Access token refresh failed: " + (eD != null ? eD.j() : null), new Object[0]);
                return;
            }
            MeaterCloudAccountResponse meaterCloudAccountResponseA = responses.a();
            String str = meaterCloudAccountResponseA != null ? meaterCloudAccountResponseA.accessToken : null;
            if (str == null) {
                U4.b.e("Refresh_Token  token refresh failed: Token is null", new Object[0]);
                return;
            }
            this.f3933a.accessToken = str;
            x4.g.t().j1(this.f3933a);
            U4.b.e("Refresh_Token Access token refresh successful", new Object[0]);
            this.f3934b.getRequest().i().d("Authorization", "Bearer " + str).b();
        }
    }

    private final int b(C4180D response) {
        int i10 = 0;
        while (response != null) {
            i10++;
            response = response.getPriorResponse();
        }
        return i10;
    }

    @Override // oc.InterfaceC4182b
    public C4178B a(F route, C4180D response) {
        MEATERCloudAccount mEATERCloudAccountL;
        String str;
        nd.b<MeaterCloudAccountResponse> bVarX;
        C3862t.g(response, "response");
        if (b(response) < 2 && (mEATERCloudAccountL = x4.g.t().l()) != null && (str = mEATERCloudAccountL.password) != null && !n.a0(str)) {
            MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
            meaterCloudAccountResponse.setEmail(mEATERCloudAccountL.email);
            V v10 = V.f43983a;
            String str2 = String.format(Locale.US, "MEATER-Android-v%s", Arrays.copyOf(new Object[]{x4.g.i()}, 1));
            C3862t.f(str2, "format(...)");
            meaterCloudAccountResponse.setClientVersion(str2);
            meaterCloudAccountResponse.setPassword(mEATERCloudAccountL.password);
            F5.a aVarG = x4.f.g(x4.f.f52783a, false, null, 3, null);
            if (aVarG != null && (bVarX = aVarG.x(meaterCloudAccountResponse)) != null) {
                bVarX.enqueue(new a(mEATERCloudAccountL, response));
            }
        }
        return null;
    }
}
