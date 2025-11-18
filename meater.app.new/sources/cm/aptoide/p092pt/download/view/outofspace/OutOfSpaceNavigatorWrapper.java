package cm.aptoide.p092pt.download.view.outofspace;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: OutOfSpaceNavigatorWrapper.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", HttpUrl.FRAGMENT_ENCODE_SET, "clearedSuccessfully", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "(ZLjava/lang/String;)V", "getClearedSuccessfully", "()Z", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OutOfSpaceNavigatorWrapper {
    private final boolean clearedSuccessfully;
    private final String packageName;

    public OutOfSpaceNavigatorWrapper(boolean z, String str) {
        this.clearedSuccessfully = z;
        this.packageName = str;
    }

    public static /* synthetic */ OutOfSpaceNavigatorWrapper copy$default(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = outOfSpaceNavigatorWrapper.clearedSuccessfully;
        }
        if ((i2 & 2) != 0) {
            str = outOfSpaceNavigatorWrapper.packageName;
        }
        return outOfSpaceNavigatorWrapper.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getClearedSuccessfully() {
        return this.clearedSuccessfully;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final OutOfSpaceNavigatorWrapper copy(boolean clearedSuccessfully, String packageName) {
        return new OutOfSpaceNavigatorWrapper(clearedSuccessfully, packageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutOfSpaceNavigatorWrapper)) {
            return false;
        }
        OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper = (OutOfSpaceNavigatorWrapper) other;
        return this.clearedSuccessfully == outOfSpaceNavigatorWrapper.clearedSuccessfully && C9801m.m32341a(this.packageName, outOfSpaceNavigatorWrapper.packageName);
    }

    public final boolean getClearedSuccessfully() {
        return this.clearedSuccessfully;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.clearedSuccessfully;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        String str = this.packageName;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OutOfSpaceNavigatorWrapper(clearedSuccessfully=" + this.clearedSuccessfully + ", packageName=" + this.packageName + ')';
    }
}
