package com.aptoide.authentication.model;

import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import com.squareup.moshi.InterfaceC8715e;
import com.squareup.moshi.InterfaceC8717g;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: OAuth2.kt */
@InterfaceC8717g(generateAdapter = true)
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m32267d2 = {"Lcom/aptoide/authentication/model/OAuth2;", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "signup", HttpUrl.FRAGMENT_ENCODE_SET, "data", "Lcom/aptoide/authentication/model/OAuth2$Data;", "(Ljava/lang/String;ZLcom/aptoide/authentication/model/OAuth2$Data;)V", "getData", "()Lcom/aptoide/authentication/model/OAuth2$Data;", "getSignup", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Data", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OAuth2 {
    private final Data data;
    private final boolean signup;
    private final String type;

    /* compiled from: OAuth2.kt */
    @InterfaceC8717g(generateAdapter = true)
    @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, m32267d2 = {"Lcom/aptoide/authentication/model/OAuth2$Data;", HttpUrl.FRAGMENT_ENCODE_SET, "accessToken", HttpUrl.FRAGMENT_ENCODE_SET, "expiresIn", HttpUrl.FRAGMENT_ENCODE_SET, "refreshToken", "tokenType", "scope", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()I", "getRefreshToken", "getScope", "getTokenType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Data {
        private final String accessToken;
        private final int expiresIn;
        private final String refreshToken;
        private final String scope;
        private final String tokenType;

        public Data(@InterfaceC8715e(name = "access_token") String str, @InterfaceC8715e(name = "expires_in") int i2, @InterfaceC8715e(name = AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN) String str2, @InterfaceC8715e(name = "token_type") String str3, String str4) {
            C9801m.m32346f(str, "accessToken");
            C9801m.m32346f(str2, "refreshToken");
            C9801m.m32346f(str3, "tokenType");
            this.accessToken = str;
            this.expiresIn = i2;
            this.refreshToken = str2;
            this.tokenType = str3;
            this.scope = str4;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i2, String str2, String str3, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = data.accessToken;
            }
            if ((i3 & 2) != 0) {
                i2 = data.expiresIn;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                str2 = data.refreshToken;
            }
            String str5 = str2;
            if ((i3 & 8) != 0) {
                str3 = data.tokenType;
            }
            String str6 = str3;
            if ((i3 & 16) != 0) {
                str4 = data.scope;
            }
            return data.copy(str, i4, str5, str6, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExpiresIn() {
            return this.expiresIn;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTokenType() {
            return this.tokenType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        public final Data copy(@InterfaceC8715e(name = "access_token") String accessToken, @InterfaceC8715e(name = "expires_in") int expiresIn, @InterfaceC8715e(name = AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN) String refreshToken, @InterfaceC8715e(name = "token_type") String tokenType, String scope) {
            C9801m.m32346f(accessToken, "accessToken");
            C9801m.m32346f(refreshToken, "refreshToken");
            C9801m.m32346f(tokenType, "tokenType");
            return new Data(accessToken, expiresIn, refreshToken, tokenType, scope);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return C9801m.m32341a(this.accessToken, data.accessToken) && this.expiresIn == data.expiresIn && C9801m.m32341a(this.refreshToken, data.refreshToken) && C9801m.m32341a(this.tokenType, data.tokenType) && C9801m.m32341a(this.scope, data.scope);
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final String getScope() {
            return this.scope;
        }

        public final String getTokenType() {
            return this.tokenType;
        }

        public int hashCode() {
            int iHashCode = ((((((this.accessToken.hashCode() * 31) + this.expiresIn) * 31) + this.refreshToken.hashCode()) * 31) + this.tokenType.hashCode()) * 31;
            String str = this.scope;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Data(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", refreshToken=" + this.refreshToken + ", tokenType=" + this.tokenType + ", scope=" + this.scope + ')';
        }
    }

    public OAuth2(String str, boolean z, Data data) {
        C9801m.m32346f(str, "type");
        C9801m.m32346f(data, "data");
        this.type = str;
        this.signup = z;
        this.data = data;
    }

    public static /* synthetic */ OAuth2 copy$default(OAuth2 oAuth2, String str, boolean z, Data data, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oAuth2.type;
        }
        if ((i2 & 2) != 0) {
            z = oAuth2.signup;
        }
        if ((i2 & 4) != 0) {
            data = oAuth2.data;
        }
        return oAuth2.copy(str, z, data);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSignup() {
        return this.signup;
    }

    /* renamed from: component3, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final OAuth2 copy(String type, boolean signup, Data data) {
        C9801m.m32346f(type, "type");
        C9801m.m32346f(data, "data");
        return new OAuth2(type, signup, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OAuth2)) {
            return false;
        }
        OAuth2 oAuth2 = (OAuth2) other;
        return C9801m.m32341a(this.type, oAuth2.type) && this.signup == oAuth2.signup && C9801m.m32341a(this.data, oAuth2.data);
    }

    public final Data getData() {
        return this.data;
    }

    public final boolean getSignup() {
        return this.signup;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.signup;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((iHashCode + i2) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "OAuth2(type=" + this.type + ", signup=" + this.signup + ", data=" + this.data + ')';
    }
}
