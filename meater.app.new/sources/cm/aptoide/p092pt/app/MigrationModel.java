package cm.aptoide.p092pt.app;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: MigrationModel.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, m32267d2 = {"Lcm/aptoide/pt/app/MigrationModel;", HttpUrl.FRAGMENT_ENCODE_SET, "isMigrated", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MigrationModel {
    private final boolean isMigrated;

    public MigrationModel() {
        this(false, 1, null);
    }

    public MigrationModel(boolean z) {
        this.isMigrated = z;
    }

    public static /* synthetic */ MigrationModel copy$default(MigrationModel migrationModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = migrationModel.isMigrated;
        }
        return migrationModel.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMigrated() {
        return this.isMigrated;
    }

    public final MigrationModel copy(boolean isMigrated) {
        return new MigrationModel(isMigrated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MigrationModel) && this.isMigrated == ((MigrationModel) other).isMigrated;
    }

    public int hashCode() {
        boolean z = this.isMigrated;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isMigrated() {
        return this.isMigrated;
    }

    public String toString() {
        return "MigrationModel(isMigrated=" + this.isMigrated + ')';
    }

    public /* synthetic */ MigrationModel(boolean z, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? false : z);
    }
}
