package cm.aptoide.p092pt.blacklist;

import cm.aptoide.p092pt.blacklist.BlacklistManager;

/* loaded from: classes.dex */
public class BlacklistUnitMapper {
    public BlacklistUnit mapActionCardToBlacklistUnit(String str, String str2) {
        str.hashCode();
        if (str.equals("INFO_BUNDLE")) {
            StringBuilder sb = new StringBuilder();
            BlacklistManager.BlacklistType blacklistType = BlacklistManager.BlacklistType.APPC_CARD_INFO;
            sb.append(blacklistType.getType());
            sb.append(str2);
            return new BlacklistUnit(sb.toString(), blacklistType.getMaxPossibleImpressions());
        }
        if (!str.equals("WALLET_ADS_OFFER")) {
            throw new IllegalArgumentException("Wrong blacklist key. Please, make sure you are passing the correct action card type and id.");
        }
        StringBuilder sb2 = new StringBuilder();
        BlacklistManager.BlacklistType blacklistType2 = BlacklistManager.BlacklistType.WALLET_ADS_OFFER;
        sb2.append(blacklistType2.getType());
        sb2.append(str2);
        return new BlacklistUnit(sb2.toString(), blacklistType2.getMaxPossibleImpressions());
    }
}
