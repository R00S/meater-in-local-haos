package F5;

import com.apptionlabs.meater_app.cloud.requests.CloudStatusRequest;
import com.apptionlabs.meater_app.cloud.requests.CookFeedBack;
import com.apptionlabs.meater_app.cloud.requests.FavouriteCookObj;
import com.apptionlabs.meater_app.cloud.requests.ReviewActionRequest;
import com.apptionlabs.meater_app.cloud.requests.ReviewCheckRequest;
import com.apptionlabs.meater_app.cloud.requests.UserConfigRequest;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.cloud.responses.ReviewCheckResponse;
import com.apptionlabs.meater_app.cloud.responses.SyncApiResponse;
import com.apptionlabs.meater_app.cloud.responses.UserConfigResponse;
import com.apptionlabs.meater_app.model.CookNote;
import com.google.gson.j;
import com.google.gson.l;
import oc.AbstractC4179C;
import oc.E;
import pd.f;
import pd.k;
import pd.o;
import pd.s;
import pd.t;
import pd.y;

/* compiled from: MeaterAccountAPI.java */
/* loaded from: classes2.dex */
public interface a {
    @o("/fb-login")
    nd.b<MeaterCloudAccountResponse> A(@pd.a MeaterCloudAccountResponse meaterCloudAccountResponse);

    @f
    @k({"Accept: application/json"})
    nd.b<E> B(@y String str);

    @o("/v2/review/check")
    nd.b<ReviewCheckResponse> C(@pd.a ReviewCheckRequest reviewCheckRequest);

    @f("/v2/cooks")
    nd.b<SyncApiResponse> a(@t("filter[updatedAt]") String str, @t("orderBy") String str2);

    @f("/v2/juicy-cooks")
    @k({"Accept: application/json"})
    nd.b<E> b();

    @o("/v2/estimator-configuration")
    nd.b<E> c(@pd.a AbstractC4179C abstractC4179C);

    @k({"Content-Type: application/json"})
    @o
    nd.b<E> d(@y String str, @pd.a AbstractC4179C abstractC4179C);

    @pd.b("/v2/cook-notes/{id}")
    nd.b<E> e(@s("id") String str);

    @o("/v2/user-info/me")
    nd.b<UserConfigResponse> f(@pd.a UserConfigRequest userConfigRequest);

    @k({"Content-Type: application/json"})
    @o
    nd.b<E> g(@y String str, @pd.a CookFeedBack cookFeedBack);

    @o("/v2/cook-event-list")
    nd.b<E> h(@pd.a AbstractC4179C abstractC4179C);

    @o("/sign-out")
    nd.b<MeaterCloudAccountResponse> i(@pd.a MeaterCloudAccountResponse meaterCloudAccountResponse);

    @k({"Content-Type: application/json"})
    @o
    nd.b<E> j(@y String str, @pd.a CookNote cookNote);

    @o("/google-login")
    nd.b<MeaterCloudAccountResponse> k(@pd.a MeaterCloudAccountResponse meaterCloudAccountResponse);

    @k({"Accept: application/json"})
    @o("/version-check")
    nd.b<E> l(@pd.a j jVar);

    @o("/v2/cooks")
    nd.b<E> m(@pd.a AbstractC4179C abstractC4179C);

    @f("/v2/cook-notes")
    nd.b<SyncApiResponse> n(@t("filter[updatedAt]") String str, @t("orderBy") String str2);

    @f
    nd.b<SyncApiResponse> o(@y String str);

    @f("/v2/purchase-channel")
    @k({"Accept: application/json"})
    nd.b<E> p();

    @o("/v2/review/record")
    nd.b<E> q(@pd.a ReviewActionRequest reviewActionRequest);

    @o("/delete-account")
    nd.b<MeaterCloudAccountResponse> r(@pd.a MeaterCloudAccountResponse meaterCloudAccountResponse);

    @o("/accept-updated-terms-and-conditions/accept")
    nd.b<MeaterCloudAccountResponse> s(@pd.a MeaterCloudAccountResponse meaterCloudAccountResponse);

    @k({"Content-Type: application/json"})
    @o("/v2/favourite-cooks")
    nd.b<E> t(@pd.a FavouriteCookObj favouriteCookObj);

    @f("/v2/cook-method")
    @k({"Accept: application/json"})
    nd.b<E> u();

    @f
    nd.b<SyncApiResponse> v(@y String str);

    @f
    nd.b<l> w(@y String str);

    @o("/login")
    nd.b<MeaterCloudAccountResponse> x(@pd.a MeaterCloudAccountResponse meaterCloudAccountResponse);

    @pd.b("/v2/cooks/{id}")
    nd.b<E> y(@s("id") String str);

    @o("/cloud-status")
    nd.b<MeaterCloudAccountResponse> z(@pd.a CloudStatusRequest cloudStatusRequest);
}
