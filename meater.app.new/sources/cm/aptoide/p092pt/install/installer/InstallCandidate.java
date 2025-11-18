package cm.aptoide.p092pt.install.installer;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: InstallCandidate.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m32267d2 = {"Lcm/aptoide/pt/install/installer/InstallCandidate;", HttpUrl.FRAGMENT_ENCODE_SET, "md5", HttpUrl.FRAGMENT_ENCODE_SET, "forceDefaultInstall", HttpUrl.FRAGMENT_ENCODE_SET, "shouldSetPackageInstaller", "(Ljava/lang/String;ZZ)V", "getForceDefaultInstall", "()Z", "getMd5", "()Ljava/lang/String;", "getShouldSetPackageInstaller", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InstallCandidate {
    private final boolean forceDefaultInstall;
    private final String md5;
    private final boolean shouldSetPackageInstaller;

    public InstallCandidate(String str, boolean z, boolean z2) {
        C9801m.m32346f(str, "md5");
        this.md5 = str;
        this.forceDefaultInstall = z;
        this.shouldSetPackageInstaller = z2;
    }

    public static /* synthetic */ InstallCandidate copy$default(InstallCandidate installCandidate, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = installCandidate.md5;
        }
        if ((i2 & 2) != 0) {
            z = installCandidate.forceDefaultInstall;
        }
        if ((i2 & 4) != 0) {
            z2 = installCandidate.shouldSetPackageInstaller;
        }
        return installCandidate.copy(str, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceDefaultInstall() {
        return this.forceDefaultInstall;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldSetPackageInstaller() {
        return this.shouldSetPackageInstaller;
    }

    public final InstallCandidate copy(String md5, boolean forceDefaultInstall, boolean shouldSetPackageInstaller) {
        C9801m.m32346f(md5, "md5");
        return new InstallCandidate(md5, forceDefaultInstall, shouldSetPackageInstaller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallCandidate)) {
            return false;
        }
        InstallCandidate installCandidate = (InstallCandidate) other;
        return C9801m.m32341a(this.md5, installCandidate.md5) && this.forceDefaultInstall == installCandidate.forceDefaultInstall && this.shouldSetPackageInstaller == installCandidate.shouldSetPackageInstaller;
    }

    public final boolean getForceDefaultInstall() {
        return this.forceDefaultInstall;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final boolean getShouldSetPackageInstaller() {
        return this.shouldSetPackageInstaller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.md5.hashCode() * 31;
        boolean z = this.forceDefaultInstall;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode + i2) * 31;
        boolean z2 = this.shouldSetPackageInstaller;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "InstallCandidate(md5=" + this.md5 + ", forceDefaultInstall=" + this.forceDefaultInstall + ", shouldSetPackageInstaller=" + this.shouldSetPackageInstaller + ')';
    }
}
