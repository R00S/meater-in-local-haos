package com.aptoide.authentication.model;

import com.squareup.moshi.InterfaceC8717g;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CodeAuth.kt */
@InterfaceC8717g(generateAdapter = true)
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006$"}, m32267d2 = {"Lcom/aptoide/authentication/model/CodeAuth;", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "state", "agent", "signup", HttpUrl.FRAGMENT_ENCODE_SET, "data", "Lcom/aptoide/authentication/model/CodeAuth$Data;", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/aptoide/authentication/model/CodeAuth$Data;Ljava/lang/String;)V", "getAgent", "()Ljava/lang/String;", "getData", "()Lcom/aptoide/authentication/model/CodeAuth$Data;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getSignup", "()Z", "getState", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Data", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CodeAuth {
    private final String agent;
    private final Data data;
    private String email;
    private final boolean signup;
    private final String state;
    private final String type;

    /* compiled from: CodeAuth.kt */
    @InterfaceC8717g(generateAdapter = true)
    @Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m32267d2 = {"Lcom/aptoide/authentication/model/CodeAuth$Data;", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "method", "(Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Data {
        private final String method;
        private final String type;

        public Data(String str, String str2) {
            C9801m.m32346f(str, "type");
            C9801m.m32346f(str2, "method");
            this.type = str;
            this.method = str2;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = data.type;
            }
            if ((i2 & 2) != 0) {
                str2 = data.method;
            }
            return data.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public final Data copy(String type, String method) {
            C9801m.m32346f(type, "type");
            C9801m.m32346f(method, "method");
            return new Data(type, method);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return C9801m.m32341a(this.type, data.type) && C9801m.m32341a(this.method, data.method);
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.method.hashCode();
        }

        public String toString() {
            return "Data(type=" + this.type + ", method=" + this.method + ')';
        }
    }

    public CodeAuth(String str, String str2, String str3, boolean z, Data data, String str4) {
        C9801m.m32346f(str, "type");
        C9801m.m32346f(str2, "state");
        C9801m.m32346f(data, "data");
        this.type = str;
        this.state = str2;
        this.agent = str3;
        this.signup = z;
        this.data = data;
        this.email = str4;
    }

    public static /* synthetic */ CodeAuth copy$default(CodeAuth codeAuth, String str, String str2, String str3, boolean z, Data data, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codeAuth.type;
        }
        if ((i2 & 2) != 0) {
            str2 = codeAuth.state;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = codeAuth.agent;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            z = codeAuth.signup;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            data = codeAuth.data;
        }
        Data data2 = data;
        if ((i2 & 32) != 0) {
            str4 = codeAuth.email;
        }
        return codeAuth.copy(str, str5, str6, z2, data2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgent() {
        return this.agent;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSignup() {
        return this.signup;
    }

    /* renamed from: component5, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final CodeAuth copy(String type, String state, String agent, boolean signup, Data data, String email) {
        C9801m.m32346f(type, "type");
        C9801m.m32346f(state, "state");
        C9801m.m32346f(data, "data");
        return new CodeAuth(type, state, agent, signup, data, email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeAuth)) {
            return false;
        }
        CodeAuth codeAuth = (CodeAuth) other;
        return C9801m.m32341a(this.type, codeAuth.type) && C9801m.m32341a(this.state, codeAuth.state) && C9801m.m32341a(this.agent, codeAuth.agent) && this.signup == codeAuth.signup && C9801m.m32341a(this.data, codeAuth.data) && C9801m.m32341a(this.email, codeAuth.email);
    }

    public final String getAgent() {
        return this.agent;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getSignup() {
        return this.signup;
    }

    public final String getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.state.hashCode()) * 31;
        String str = this.agent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.signup;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int iHashCode3 = (((iHashCode2 + i2) * 31) + this.data.hashCode()) * 31;
        String str2 = this.email;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public String toString() {
        return "CodeAuth(type=" + this.type + ", state=" + this.state + ", agent=" + this.agent + ", signup=" + this.signup + ", data=" + this.data + ", email=" + this.email + ')';
    }
}
