package com.aptoide.authentication.model;

import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import com.aptoide.authentication.model.OAuth2;
import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.AbstractC8725o;
import com.squareup.moshi.C8728r;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p231w.C8735c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: OAuth2_DataJsonAdapter.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m32267d2 = {"Lcom/aptoide/authentication/model/OAuth2_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/OAuth2$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "nullableStringAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: com.aptoide.authentication.model.OAuth2_DataJsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends AbstractC8716f<OAuth2.Data> {
    private final AbstractC8716f<Integer> intAdapter;
    private final AbstractC8716f<String> nullableStringAdapter;
    private final AbstractC8719i.a options;
    private final AbstractC8716f<String> stringAdapter;

    public GeneratedJsonAdapter(C8728r c8728r) {
        C9801m.m32346f(c8728r, "moshi");
        AbstractC8719i.a aVarM27724a = AbstractC8719i.a.m27724a("access_token", "expires_in", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, "token_type", "scope");
        C9801m.m32345e(aVarM27724a, "of(\"access_token\", \"expi…\", \"token_type\", \"scope\")");
        this.options = aVarM27724a;
        AbstractC8716f<String> abstractC8716fM27813f = c8728r.m27813f(String.class, C10822w0.m38917d(), "accessToken");
        C9801m.m32345e(abstractC8716fM27813f, "moshi.adapter(String::cl…t(),\n      \"accessToken\")");
        this.stringAdapter = abstractC8716fM27813f;
        AbstractC8716f<Integer> abstractC8716fM27813f2 = c8728r.m27813f(Integer.TYPE, C10822w0.m38917d(), "expiresIn");
        C9801m.m32345e(abstractC8716fM27813f2, "moshi.adapter(Int::class… emptySet(), \"expiresIn\")");
        this.intAdapter = abstractC8716fM27813f2;
        AbstractC8716f<String> abstractC8716fM27813f3 = c8728r.m27813f(String.class, C10822w0.m38917d(), "scope");
        C9801m.m32345e(abstractC8716fM27813f3, "moshi.adapter(String::cl…     emptySet(), \"scope\")");
        this.nullableStringAdapter = abstractC8716fM27813f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuth2.Data");
        sb.append(')');
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.AbstractC8716f
    public OAuth2.Data fromJson(AbstractC8719i abstractC8719i) throws IOException {
        C9801m.m32346f(abstractC8719i, "reader");
        abstractC8719i.mo27711b();
        Integer numFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        while (abstractC8719i.mo27715f()) {
            int iMo27702H = abstractC8719i.mo27702H(this.options);
            String str = strFromJson4;
            if (iMo27702H == -1) {
                abstractC8719i.mo27706N();
                abstractC8719i.mo27707Q();
            } else if (iMo27702H == 0) {
                strFromJson = this.stringAdapter.fromJson(abstractC8719i);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionM27876v = C8735c.m27876v("accessToken", "access_token", abstractC8719i);
                    C9801m.m32345e(jsonDataExceptionM27876v, "unexpectedNull(\"accessTo…, \"access_token\", reader)");
                    throw jsonDataExceptionM27876v;
                }
            } else if (iMo27702H == 1) {
                numFromJson = this.intAdapter.fromJson(abstractC8719i);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionM27876v2 = C8735c.m27876v("expiresIn", "expires_in", abstractC8719i);
                    C9801m.m32345e(jsonDataExceptionM27876v2, "unexpectedNull(\"expiresI…    \"expires_in\", reader)");
                    throw jsonDataExceptionM27876v2;
                }
            } else if (iMo27702H == 2) {
                strFromJson2 = this.stringAdapter.fromJson(abstractC8719i);
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionM27876v3 = C8735c.m27876v("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, abstractC8719i);
                    C9801m.m32345e(jsonDataExceptionM27876v3, "unexpectedNull(\"refreshT… \"refresh_token\", reader)");
                    throw jsonDataExceptionM27876v3;
                }
            } else if (iMo27702H == 3) {
                strFromJson3 = this.stringAdapter.fromJson(abstractC8719i);
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionM27876v4 = C8735c.m27876v("tokenType", "token_type", abstractC8719i);
                    C9801m.m32345e(jsonDataExceptionM27876v4, "unexpectedNull(\"tokenTyp…    \"token_type\", reader)");
                    throw jsonDataExceptionM27876v4;
                }
            } else if (iMo27702H == 4) {
                strFromJson4 = this.nullableStringAdapter.fromJson(abstractC8719i);
            }
            strFromJson4 = str;
        }
        String str2 = strFromJson4;
        abstractC8719i.mo27713d();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionM27868n = C8735c.m27868n("accessToken", "access_token", abstractC8719i);
            C9801m.m32345e(jsonDataExceptionM27868n, "missingProperty(\"accessT…ken\",\n            reader)");
            throw jsonDataExceptionM27868n;
        }
        if (numFromJson == null) {
            JsonDataException jsonDataExceptionM27868n2 = C8735c.m27868n("expiresIn", "expires_in", abstractC8719i);
            C9801m.m32345e(jsonDataExceptionM27868n2, "missingProperty(\"expiresIn\", \"expires_in\", reader)");
            throw jsonDataExceptionM27868n2;
        }
        int iIntValue = numFromJson.intValue();
        if (strFromJson2 == null) {
            JsonDataException jsonDataExceptionM27868n3 = C8735c.m27868n("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, abstractC8719i);
            C9801m.m32345e(jsonDataExceptionM27868n3, "missingProperty(\"refresh…ken\",\n            reader)");
            throw jsonDataExceptionM27868n3;
        }
        if (strFromJson3 != null) {
            return new OAuth2.Data(strFromJson, iIntValue, strFromJson2, strFromJson3, str2);
        }
        JsonDataException jsonDataExceptionM27868n4 = C8735c.m27868n("tokenType", "token_type", abstractC8719i);
        C9801m.m32345e(jsonDataExceptionM27868n4, "missingProperty(\"tokenType\", \"token_type\", reader)");
        throw jsonDataExceptionM27868n4;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, OAuth2.Data data) throws IOException {
        C9801m.m32346f(abstractC8725o, "writer");
        if (data == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC8725o.mo27757b();
        abstractC8725o.mo27760l("access_token");
        this.stringAdapter.toJson(abstractC8725o, (AbstractC8725o) data.getAccessToken());
        abstractC8725o.mo27760l("expires_in");
        this.intAdapter.toJson(abstractC8725o, (AbstractC8725o) Integer.valueOf(data.getExpiresIn()));
        abstractC8725o.mo27760l(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN);
        this.stringAdapter.toJson(abstractC8725o, (AbstractC8725o) data.getRefreshToken());
        abstractC8725o.mo27760l("token_type");
        this.stringAdapter.toJson(abstractC8725o, (AbstractC8725o) data.getTokenType());
        abstractC8725o.mo27760l("scope");
        this.nullableStringAdapter.toJson(abstractC8725o, (AbstractC8725o) data.getScope());
        abstractC8725o.mo27759e();
    }
}
