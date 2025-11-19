package l3;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;

/* compiled from: AdServicesInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll3/b;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3898b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3898b f44354a = new C3898b();

    /* compiled from: AdServicesInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll3/b$a;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l3.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44355a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private C3898b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f44355a.a();
        }
        return 0;
    }
}
