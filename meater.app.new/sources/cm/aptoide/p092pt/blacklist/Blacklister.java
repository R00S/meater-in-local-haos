package cm.aptoide.p092pt.blacklist;

/* loaded from: classes.dex */
public class Blacklister {
    private BlacklistPersistence blacklistPersistence;

    public Blacklister(BlacklistPersistence blacklistPersistence) {
        this.blacklistPersistence = blacklistPersistence;
    }

    public void addImpression(BlacklistUnit blacklistUnit) {
        this.blacklistPersistence.addImpression(blacklistUnit.getId(), blacklistUnit.getMaxImpressions());
    }

    public void blacklist(BlacklistUnit blacklistUnit) {
        this.blacklistPersistence.blacklist(blacklistUnit.getId());
    }

    public boolean isBlacklisted(BlacklistUnit blacklistUnit) {
        return this.blacklistPersistence.isBlacklisted(blacklistUnit.getId(), blacklistUnit.getMaxImpressions());
    }
}
