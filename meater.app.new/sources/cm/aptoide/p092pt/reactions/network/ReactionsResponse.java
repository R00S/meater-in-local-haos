package cm.aptoide.p092pt.reactions.network;

import retrofit2.Response;

/* loaded from: classes.dex */
public class ReactionsResponse {
    private final ReactionResponseMessage reactionResponseMessage;

    public static class ReactionResponseMapper {
        public static ReactionResponseMessage mapReactionResponse(Response response) {
            ReactionResponseMessage reactionResponseMessage = ReactionResponseMessage.GENERAL_ERROR;
            int iCode = response.code();
            return (iCode == 200 || iCode == 201 || iCode == 204) ? ReactionResponseMessage.SUCCESS : iCode != 403 ? iCode != 429 ? (iCode == 500 || iCode == 400 || iCode == 401 || iCode != 405) ? reactionResponseMessage : reactionResponseMessage : ReactionResponseMessage.REACTIONS_EXCEEDED : reactionResponseMessage;
        }
    }

    public enum ReactionResponseMessage {
        SUCCESS,
        GENERAL_ERROR,
        REACTIONS_EXCEEDED,
        SAME_REACTION,
        NETWORK_ERROR
    }

    public ReactionsResponse(ReactionResponseMessage reactionResponseMessage) {
        this.reactionResponseMessage = reactionResponseMessage;
    }

    public boolean differentReaction() {
        return this.reactionResponseMessage != ReactionResponseMessage.SAME_REACTION;
    }

    public boolean reactionsExceeded() {
        return this.reactionResponseMessage == ReactionResponseMessage.REACTIONS_EXCEEDED;
    }

    public boolean wasGeneralError() {
        return this.reactionResponseMessage == ReactionResponseMessage.GENERAL_ERROR;
    }

    public boolean wasNetworkError() {
        return this.reactionResponseMessage == ReactionResponseMessage.NETWORK_ERROR;
    }

    public boolean wasSuccess() {
        return this.reactionResponseMessage == ReactionResponseMessage.SUCCESS;
    }
}
