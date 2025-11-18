package cm.aptoide.p092pt.search.suggestions;

import p456rx.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* loaded from: classes.dex */
public interface SearchSuggestionRemoteRepository {
    @GET("suggestion/app/{query}")
    Single<Suggestions> getSuggestionForApp(@Path("query") String str);

    @GET("suggestion/store/{query}")
    Single<Suggestions> getSuggestionForStore(@Path("query") String str);
}
