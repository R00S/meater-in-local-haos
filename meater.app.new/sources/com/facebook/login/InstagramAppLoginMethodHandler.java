package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C5641a0;
import com.facebook.EnumC5956w;
import com.facebook.internal.C5686k0;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: InstagramAppLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* renamed from: k */
    private final String f14710k;

    /* renamed from: l */
    private final EnumC5956w f14711l;

    /* renamed from: j */
    public static final C5760b f14709j = new C5760b(null);
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C5759a();

    /* compiled from: InstagramAppLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    public static final class C5759a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        C5759a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new InstagramAppLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int i2) {
            return new InstagramAppLoginMethodHandler[i2];
        }
    }

    /* compiled from: InstagramAppLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$b */
    public static final class C5760b {
        private C5760b() {
        }

        public /* synthetic */ C5760b(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
        this.f14710k = "instagram_login";
        this.f14711l = EnumC5956w.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14710k;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        LoginClient.C5770c c5770c = LoginClient.f14714f;
        String strM11995a = c5770c.m11995a();
        C5686k0 c5686k0 = C5686k0.f14437a;
        Context contextM11940i = m12000d().m11940i();
        if (contextM11940i == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            contextM11940i = C5641a0.m11284c();
        }
        String strM11954a = request.m11954a();
        Set<String> setM11967n = request.m11967n();
        boolean zM11972s = request.m11972s();
        boolean zM11969p = request.m11969p();
        EnumC5798r enumC5798rM11960g = request.m11960g();
        if (enumC5798rM11960g == null) {
            enumC5798rM11960g = EnumC5798r.NONE;
        }
        Intent intentM11467i = C5686k0.m11467i(contextM11940i, strM11954a, setM11967n, strM11995a, zM11972s, zM11969p, enumC5798rM11960g, m11999c(request.m11955b()), request.m11956c(), request.m11965l(), request.m11968o(), request.m11970q(), request.m11979z());
        m11998a("e2e", strM11995a);
        return m12016B(intentM11467i, c5770c.m11996b()) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* renamed from: s */
    public EnumC5956w mo11920s() {
        return this.f14711l;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        super.writeToParcel(parcel, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "source");
        this.f14710k = "instagram_login";
        this.f14711l = EnumC5956w.INSTAGRAM_APPLICATION_WEB;
    }
}
