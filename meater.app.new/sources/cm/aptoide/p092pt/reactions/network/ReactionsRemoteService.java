package cm.aptoide.p092pt.reactions.network;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.reactions.data.TopReaction;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import cm.aptoide.p092pt.reactions.network.TopReactionsResponse;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import java.net.ConnectException;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* loaded from: classes.dex */
public class ReactionsRemoteService implements ReactionsService {
    private AbstractC11243h ioScheduler;
    private ServiceV8 service;

    public interface ServiceV8 {
        @DELETE("echo/8.20181122/reactions/{uid}/")
        C11234e<Response<Void>> deleteReaction(@Path("uid") String str);

        @GET("echo/8.20181122/groups/{group_id}/objects/{id}/reactions/summary")
        C11234e<TopReactionsResponse> getTopReactionsResponse(@Path(StoreTabGridRecyclerFragment.BundleCons.GROUP_ID) String str, @Path(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID) String str2);

        @POST("echo/8.20181122/reactions/")
        C11234e<Response<Void>> setFirstUserReaction(@retrofit2.http.Body Body body);

        @PATCH("echo/8.20181122/reactions/{uid}/")
        C11234e<Response<Void>> setSecondUserReaction(@Path("uid") String str, @retrofit2.http.Body Body body);
    }

    public ReactionsRemoteService(ServiceV8 serviceV8, AbstractC11243h abstractC11243h) {
        this.service = serviceV8;
        this.ioScheduler = abstractC11243h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactionsResponse mapErrorResponse(Throwable th) {
        return ((th instanceof NoNetworkConnectionException) || (th instanceof ConnectException)) ? new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.NETWORK_ERROR) : new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.GENERAL_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactionsResponse mapResponse(Response response) {
        return new ReactionsResponse(ReactionsResponse.ReactionResponseMapper.mapReactionResponse(response));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LoadReactionModel mapToTopReactionsList(TopReactionsResponse topReactionsResponse) {
        String uid;
        ArrayList arrayList = new ArrayList();
        for (TopReactionsResponse.ReactionTypeResponse reactionTypeResponse : topReactionsResponse.getTop()) {
            arrayList.add(new TopReaction(reactionTypeResponse.getType(), reactionTypeResponse.getTotal()));
        }
        TopReactionsResponse.C4123My my = topReactionsResponse.getMy();
        String type = HttpUrl.FRAGMENT_ENCODE_SET;
        if (my != null) {
            type = topReactionsResponse.getMy().getType();
            uid = topReactionsResponse.getMy().getUid();
        } else {
            uid = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new LoadReactionModel(topReactionsResponse.getTotal(), type, uid, arrayList);
    }

    @Override // cm.aptoide.p092pt.reactions.network.ReactionsService
    public Single<ReactionsResponse> deleteReaction(String str) {
        return this.service.deleteReaction(str).m40082X(new C4124a(this)).m40085Z0().m39930v(this.ioScheduler).m39926r(new C4125b(this));
    }

    @Override // cm.aptoide.p092pt.reactions.network.ReactionsService
    public Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.service.getTopReactionsResponse(str2, str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.reactions.network.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10951f.mapToTopReactionsList((TopReactionsResponse) obj);
            }
        }).m40085Z0().m39930v(this.ioScheduler);
    }

    @Override // cm.aptoide.p092pt.reactions.network.ReactionsService
    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.service.setFirstUserReaction(new Body(str, str2, str3)).m40082X(new C4124a(this)).m40085Z0().m39930v(this.ioScheduler).m39926r(new C4125b(this));
    }

    @Override // cm.aptoide.p092pt.reactions.network.ReactionsService
    public Single<ReactionsResponse> setSecondReaction(String str, String str2) {
        return this.service.setSecondUserReaction(str, new Body(str2)).m40082X(new C4124a(this)).m40085Z0().m39930v(this.ioScheduler).m39926r(new C4125b(this));
    }

    public static class Body {
        private String groupUid;
        private String objectUid;
        private String type;

        public Body(String str, String str2, String str3) {
            this.objectUid = str;
            this.groupUid = str2;
            this.type = str3;
        }

        public String getGroupUid() {
            return this.groupUid;
        }

        public String getObjectUid() {
            return this.objectUid;
        }

        public String getType() {
            return this.type;
        }

        public void setGroupUid(String str) {
            this.groupUid = str;
        }

        public void setObjectUid(String str) {
            this.objectUid = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public Body(String str) {
            this.type = str;
        }
    }
}
