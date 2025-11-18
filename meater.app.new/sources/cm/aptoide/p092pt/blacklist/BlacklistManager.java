package cm.aptoide.p092pt.blacklist;

/* loaded from: classes.dex */
public class BlacklistManager {
    private BlacklistUnitMapper blacklistUnitMapper;
    private Blacklister blacklister;

    public enum BlacklistType {
        WALLET_ADS_OFFER("Wallet_Ads_Offer", 10),
        APPC_CARD_INFO("Appc_Card_Info", 10);

        private int maxPossibleImpressions;
        private String type;

        BlacklistType(String str, int i2) {
            this.type = str;
            this.maxPossibleImpressions = i2;
        }

        public int getMaxPossibleImpressions() {
            return this.maxPossibleImpressions;
        }

        public String getType() {
            return this.type;
        }
    }

    public BlacklistManager(Blacklister blacklister, BlacklistUnitMapper blacklistUnitMapper) {
        this.blacklister = blacklister;
        this.blacklistUnitMapper = blacklistUnitMapper;
    }

    public void addImpression(String str, String str2) {
        this.blacklister.addImpression(this.blacklistUnitMapper.mapActionCardToBlacklistUnit(str, str2));
    }

    public void blacklist(String str, String str2) {
        this.blacklister.blacklist(this.blacklistUnitMapper.mapActionCardToBlacklistUnit(str, str2));
    }

    public boolean isBlacklisted(String str, String str2) {
        return this.blacklister.isBlacklisted(this.blacklistUnitMapper.mapActionCardToBlacklistUnit(str, str2));
    }
}
