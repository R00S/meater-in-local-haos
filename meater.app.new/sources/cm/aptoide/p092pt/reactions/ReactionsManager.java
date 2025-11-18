package cm.aptoide.p092pt.reactions;

import cm.aptoide.p092pt.reactions.network.LoadReactionModel;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import cm.aptoide.p092pt.reactions.network.ReactionsService;
import java.util.HashMap;
import okhttp3.HttpUrl;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ReactionsManager {
    private final ReactionsService reactionsService;
    private HashMap<String, UserReaction> userReactions;

    public ReactionsManager(ReactionsService reactionsService, HashMap<String, UserReaction> map) {
        this.reactionsService = reactionsService;
        this.userReactions = map;
    }

    private String getUID(String str) {
        UserReaction userReaction = this.userReactions.get(str);
        return userReaction != null ? userReaction.getUserId() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p456rx.Single<java.lang.Boolean> hasNotReacted(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.getUID(r0)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r1.getUID(r2)
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            goto L33
        L31:
            r2 = 0
            goto L34
        L33:
            r2 = 1
        L34:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            rx.Single r2 = p456rx.Single.m39913m(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.reactions.ReactionsManager.hasNotReacted(java.lang.String, java.lang.String):rx.Single");
    }

    private boolean isSameReaction(String str, String str2, String str3) {
        UserReaction userReaction = this.userReactions.get(str + str2);
        return userReaction != null && userReaction.getReaction().equals(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteReaction$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8587a(String str, String str2, ReactionsResponse reactionsResponse) {
        if (reactionsResponse.wasSuccess()) {
            this.userReactions.remove(str + str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8588b(String str, String str2, LoadReactionModel loadReactionModel) {
        this.userReactions.put(str + str2, new UserReaction(loadReactionModel.getUserId(), loadReactionModel.getMyReaction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setReaction$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8589c(String str, String str2, String str3, Boolean bool) {
        if (bool.booleanValue()) {
            return this.reactionsService.setReaction(str, str2, str3);
        }
        if (isSameReaction(str, str2, str3)) {
            return Single.m39913m(new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.SAME_REACTION));
        }
        return this.reactionsService.setSecondReaction(getUID(str + str2), str3);
    }

    public Single<ReactionsResponse> deleteReaction(final String str, final String str2) {
        return this.reactionsService.deleteReaction(getUID(str + str2)).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.reactions.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10938f.m8587a(str, str2, (ReactionsResponse) obj);
            }
        });
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return hasNotReacted(str, str2);
    }

    public Single<LoadReactionModel> loadReactionModel(final String str, final String str2) {
        return this.reactionsService.loadReactionModel(str, str2).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.reactions.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10941f.m8588b(str, str2, (LoadReactionModel) obj);
            }
        });
    }

    public Single<ReactionsResponse> setReaction(final String str, final String str2, final String str3) {
        return hasNotReacted(str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.reactions.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10944f.m8589c(str, str2, str3, (Boolean) obj);
            }
        });
    }
}
