package cm.aptoide.p092pt.bonus;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: BonusAppcModel.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m32267d2 = {"Lcm/aptoide/pt/bonus/BonusAppcModel;", HttpUrl.FRAGMENT_ENCODE_SET, "hasBonusAppc", HttpUrl.FRAGMENT_ENCODE_SET, "bonusPercentage", HttpUrl.FRAGMENT_ENCODE_SET, "(ZI)V", "getBonusPercentage", "()I", "getHasBonusAppc", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BonusAppcModel {
    private final int bonusPercentage;
    private final boolean hasBonusAppc;

    public BonusAppcModel(boolean z, int i2) {
        this.hasBonusAppc = z;
        this.bonusPercentage = i2;
    }

    public static /* synthetic */ BonusAppcModel copy$default(BonusAppcModel bonusAppcModel, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = bonusAppcModel.hasBonusAppc;
        }
        if ((i3 & 2) != 0) {
            i2 = bonusAppcModel.bonusPercentage;
        }
        return bonusAppcModel.copy(z, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasBonusAppc() {
        return this.hasBonusAppc;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBonusPercentage() {
        return this.bonusPercentage;
    }

    public final BonusAppcModel copy(boolean hasBonusAppc, int bonusPercentage) {
        return new BonusAppcModel(hasBonusAppc, bonusPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusAppcModel)) {
            return false;
        }
        BonusAppcModel bonusAppcModel = (BonusAppcModel) other;
        return this.hasBonusAppc == bonusAppcModel.hasBonusAppc && this.bonusPercentage == bonusAppcModel.bonusPercentage;
    }

    public final int getBonusPercentage() {
        return this.bonusPercentage;
    }

    public final boolean getHasBonusAppc() {
        return this.hasBonusAppc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.hasBonusAppc;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.bonusPercentage;
    }

    public String toString() {
        return "BonusAppcModel(hasBonusAppc=" + this.hasBonusAppc + ", bonusPercentage=" + this.bonusPercentage + ')';
    }
}
