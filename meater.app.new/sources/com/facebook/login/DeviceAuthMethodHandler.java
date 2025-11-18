package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import com.facebook.AccessToken;
import com.facebook.EnumC5956w;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: DeviceAuthMethodHandler.kt */
/* loaded from: classes2.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* renamed from: j */
    private static ScheduledThreadPoolExecutor f14701j;

    /* renamed from: k */
    private final String f14702k;

    /* renamed from: i */
    public static final C5755b f14700i = new C5755b(null);
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C5754a();

    /* compiled from: DeviceAuthMethodHandler.kt */
    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    public static final class C5754a implements Parcelable.Creator<DeviceAuthMethodHandler> {
        C5754a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i2) {
            return new DeviceAuthMethodHandler[i2];
        }
    }

    /* compiled from: DeviceAuthMethodHandler.kt */
    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$b */
    public static final class C5755b {
        private C5755b() {
        }

        public /* synthetic */ C5755b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final synchronized ScheduledThreadPoolExecutor m11911a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (DeviceAuthMethodHandler.f14701j == null) {
                DeviceAuthMethodHandler.f14701j = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f14701j;
            if (scheduledThreadPoolExecutor == null) {
                C9801m.m32363w("backgroundExecutor");
                throw null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
        this.f14702k = "device_auth";
    }

    /* renamed from: v */
    private final void m11904v(LoginClient.Request request) {
        ActivityC0468d activityC0468dM11940i = m12000d().m11940i();
        if (activityC0468dM11940i == null || activityC0468dM11940i.isFinishing()) {
            return;
        }
        DeviceAuthDialog deviceAuthDialogM11905r = m11905r();
        deviceAuthDialogM11905r.show(activityC0468dM11940i.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialogM11905r.m11878E(request);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14702k;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        m11904v(request);
        return 1;
    }

    /* renamed from: r */
    protected DeviceAuthDialog m11905r() {
        return new DeviceAuthDialog();
    }

    /* renamed from: s */
    public void m11906s() {
        m12000d().m11939g(LoginClient.Result.f14746f.m11987a(m12000d().m11945o(), "User canceled log in."));
    }

    /* renamed from: t */
    public void m11907t(Exception exc) {
        C9801m.m32346f(exc, "ex");
        m12000d().m11939g(LoginClient.Result.C5767c.m11986d(LoginClient.Result.f14746f, m12000d().m11945o(), null, exc.getMessage(), null, 8, null));
    }

    /* renamed from: u */
    public void m11908u(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC5956w enumC5956w, Date date, Date date2, Date date3) {
        C9801m.m32346f(str, "accessToken");
        C9801m.m32346f(str2, "applicationId");
        C9801m.m32346f(str3, AndroidAccountManagerPersistence.ACCOUNT_ID);
        m12000d().m11939g(LoginClient.Result.f14746f.m11990e(m12000d().m11945o(), new AccessToken(str, str2, str3, collection, collection2, collection3, enumC5956w, date, date2, date3, null, 1024, null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "parcel");
        this.f14702k = "device_auth";
    }
}
