package cm.aptoide.p092pt.install.installer;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: InstallationCandidate.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/install/installer/InstallationCandidate;", HttpUrl.FRAGMENT_ENCODE_SET, "installation", "Lcm/aptoide/pt/install/installer/Installation;", "forceDefaultInstall", HttpUrl.FRAGMENT_ENCODE_SET, "shouldSetPackageInstaller", "(Lcm/aptoide/pt/install/installer/Installation;ZZ)V", "getForceDefaultInstall", "()Z", "getInstallation", "()Lcm/aptoide/pt/install/installer/Installation;", "getShouldSetPackageInstaller", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InstallationCandidate {
    private final boolean forceDefaultInstall;
    private final Installation installation;
    private final boolean shouldSetPackageInstaller;

    public InstallationCandidate(Installation installation, boolean z, boolean z2) {
        C9801m.m32346f(installation, "installation");
        this.installation = installation;
        this.forceDefaultInstall = z;
        this.shouldSetPackageInstaller = z2;
    }

    public static /* synthetic */ InstallationCandidate copy$default(InstallationCandidate installationCandidate, Installation installation, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            installation = installationCandidate.installation;
        }
        if ((i2 & 2) != 0) {
            z = installationCandidate.forceDefaultInstall;
        }
        if ((i2 & 4) != 0) {
            z2 = installationCandidate.shouldSetPackageInstaller;
        }
        return installationCandidate.copy(installation, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Installation getInstallation() {
        return this.installation;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceDefaultInstall() {
        return this.forceDefaultInstall;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldSetPackageInstaller() {
        return this.shouldSetPackageInstaller;
    }

    public final InstallationCandidate copy(Installation installation, boolean forceDefaultInstall, boolean shouldSetPackageInstaller) {
        C9801m.m32346f(installation, "installation");
        return new InstallationCandidate(installation, forceDefaultInstall, shouldSetPackageInstaller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallationCandidate)) {
            return false;
        }
        InstallationCandidate installationCandidate = (InstallationCandidate) other;
        return C9801m.m32341a(this.installation, installationCandidate.installation) && this.forceDefaultInstall == installationCandidate.forceDefaultInstall && this.shouldSetPackageInstaller == installationCandidate.shouldSetPackageInstaller;
    }

    public final boolean getForceDefaultInstall() {
        return this.forceDefaultInstall;
    }

    public final Installation getInstallation() {
        return this.installation;
    }

    public final boolean getShouldSetPackageInstaller() {
        return this.shouldSetPackageInstaller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.installation.hashCode() * 31;
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
        return "InstallationCandidate(installation=" + this.installation + ", forceDefaultInstall=" + this.forceDefaultInstall + ", shouldSetPackageInstaller=" + this.shouldSetPackageInstaller + ')';
    }
}
