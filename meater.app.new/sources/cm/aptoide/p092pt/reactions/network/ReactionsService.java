package cm.aptoide.p092pt.reactions.network;

import p456rx.Single;

/* loaded from: classes.dex */
public interface ReactionsService {
    Single<ReactionsResponse> deleteReaction(String str);

    Single<LoadReactionModel> loadReactionModel(String str, String str2);

    Single<ReactionsResponse> setReaction(String str, String str2, String str3);

    Single<ReactionsResponse> setSecondReaction(String str, String str2);
}
