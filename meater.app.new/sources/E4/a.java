package E4;

import com.apptionlabs.meater_app.cloud.requests.CookFeedBack;
import com.apptionlabs.meater_app.cloud.requests.CookMethod;
import com.apptionlabs.meater_app.cloud.requests.PurchaseChannel;
import com.apptionlabs.meater_app.data.Data;
import com.apptionlabs.meater_app.data.FeedBackLink;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import nd.s;
import oa.InterfaceC4164i;
import oc.E;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CookFeedBackRequests.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4164i<NetworkConstant> f3858a = jd.b.d(NetworkConstant.class);

    /* renamed from: b, reason: collision with root package name */
    private d f3859b;

    /* compiled from: CookFeedBackRequests.java */
    /* renamed from: E4.a$a, reason: collision with other inner class name */
    class C0062a implements nd.d<E> {
        C0062a() {
        }

        @Override // nd.d
        public void onFailure(nd.b<E> bVar, Throwable th) {
            if (a.this.f3859b != null) {
                a.this.f3859b.H(false, null);
            }
        }

        @Override // nd.d
        public void onResponse(nd.b<E> bVar, s<E> sVar) {
            if (!sVar.f()) {
                U4.b.e("[COOK_FEEDBACK] response code %s", Integer.valueOf(sVar.b()));
                if (a.this.f3859b != null) {
                    a.this.f3859b.H(false, null);
                    return;
                }
                return;
            }
            if (sVar.a() != null) {
                U4.b.e("[COOK_FEEDBACK]  Successful", new Object[0]);
                try {
                    FeedBackLink feedBackLink = (FeedBackLink) new Gson().k(String.valueOf(new JSONObject(sVar.a().j())), FeedBackLink.class);
                    if (a.this.f3859b != null) {
                        a.this.f3859b.H(true, feedBackLink.getData());
                    }
                } catch (Exception unused) {
                    if (a.this.f3859b != null) {
                        a.this.f3859b.H(true, null);
                    }
                }
            }
        }
    }

    /* compiled from: CookFeedBackRequests.java */
    class b implements nd.d<E> {

        /* compiled from: CookFeedBackRequests.java */
        /* renamed from: E4.a$b$a, reason: collision with other inner class name */
        class C0063a extends com.google.common.reflect.f<List<CookMethod>> {
            C0063a() {
            }
        }

        b() {
        }

        @Override // nd.d
        public void onFailure(nd.b<E> bVar, Throwable th) {
            if (a.this.f3859b != null) {
                a.this.f3859b.n(null);
            }
        }

        @Override // nd.d
        public void onResponse(nd.b<E> bVar, s<E> sVar) {
            if (!sVar.f()) {
                U4.b.e("[COOK_FEEDBACK] response code %s", Integer.valueOf(sVar.b()));
                if (a.this.f3859b != null) {
                    a.this.f3859b.n(null);
                    return;
                }
                return;
            }
            if (sVar.a() != null) {
                U4.b.e("[COOK_FEEDBACK]  Successful", new Object[0]);
                try {
                    List<CookMethod> list = (List) new Gson().l(new JSONObject(sVar.a().j()).getJSONArray("data").toString(), new C0063a().getType());
                    if (a.this.f3859b != null) {
                        a.this.f3859b.n(list);
                    }
                } catch (IOException | JSONException e10) {
                    e10.printStackTrace();
                    if (a.this.f3859b != null) {
                        a.this.f3859b.n(null);
                    }
                }
            }
        }
    }

    /* compiled from: CookFeedBackRequests.java */
    class c implements nd.d<E> {

        /* compiled from: CookFeedBackRequests.java */
        /* renamed from: E4.a$c$a, reason: collision with other inner class name */
        class C0064a extends com.google.common.reflect.f<List<PurchaseChannel>> {
            C0064a() {
            }
        }

        c() {
        }

        @Override // nd.d
        public void onFailure(nd.b<E> bVar, Throwable th) {
            if (a.this.f3859b != null) {
                a.this.f3859b.I(null);
            }
        }

        @Override // nd.d
        public void onResponse(nd.b<E> bVar, s<E> sVar) {
            if (!sVar.f()) {
                U4.b.e("[COOK_FEEDBACK] response code %s", Integer.valueOf(sVar.b()));
                if (a.this.f3859b != null) {
                    a.this.f3859b.I(null);
                    return;
                }
                return;
            }
            if (sVar.a() != null) {
                U4.b.e("[COOK_FEEDBACK]  Successful", new Object[0]);
                try {
                    List<PurchaseChannel> list = (List) new Gson().l(new JSONObject(sVar.a().j()).getJSONArray("data").toString(), new C0064a().getType());
                    if (a.this.f3859b != null) {
                        a.this.f3859b.I(list);
                    }
                } catch (IOException | JSONException e10) {
                    e10.printStackTrace();
                    if (a.this.f3859b != null) {
                        a.this.f3859b.I(null);
                    }
                }
            }
        }
    }

    /* compiled from: CookFeedBackRequests.java */
    public interface d {
        void H(boolean z10, Data data);

        void I(List<PurchaseChannel> list);

        void n(List<CookMethod> list);
    }

    public void b() {
        x4.f.f52783a.e(true).p().enqueue(new c());
    }

    public void c() {
        x4.f.f52783a.e(true).u().enqueue(new b());
    }

    public void d(CookFeedBack cookFeedBack) {
        x4.f.f52783a.e(true).g(this.f3858a.getValue().getCloudBaseUrl() + "v2/cook-feedback/" + cookFeedBack.cookId, cookFeedBack).enqueue(new C0062a());
    }

    public void e(d dVar) {
        this.f3859b = dVar;
    }
}
