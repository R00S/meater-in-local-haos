package com.aptoide.authentication.network;

import com.aptoide.authentication.network.RemoteAuthenticationService;
import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.AbstractC8725o;
import com.squareup.moshi.C8728r;
import com.squareup.moshi.C8731u;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p231w.C8735c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: RemoteAuthenticationService_CredentialsJsonAdapter.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService_CredentialsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "arrayOfStringAdapter", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: com.aptoide.authentication.network.RemoteAuthenticationService_CredentialsJsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends AbstractC8716f<RemoteAuthenticationService.Credentials> {
    private final AbstractC8716f<String[]> arrayOfStringAdapter;
    private final AbstractC8719i.a options;
    private final AbstractC8716f<String> stringAdapter;

    public GeneratedJsonAdapter(C8728r c8728r) {
        C9801m.m32346f(c8728r, "moshi");
        AbstractC8719i.a aVarM27724a = AbstractC8719i.a.m27724a("credential", "supported");
        C9801m.m32345e(aVarM27724a, "of(\"credential\", \"supported\")");
        this.options = aVarM27724a;
        AbstractC8716f<String> abstractC8716fM27813f = c8728r.m27813f(String.class, C10822w0.m38917d(), "credential");
        C9801m.m32345e(abstractC8716fM27813f, "moshi.adapter(String::cl…et(),\n      \"credential\")");
        this.stringAdapter = abstractC8716fM27813f;
        AbstractC8716f<String[]> abstractC8716fM27813f2 = c8728r.m27813f(C8731u.m27843b(String.class), C10822w0.m38917d(), "supported");
        C9801m.m32345e(abstractC8716fM27813f2, "moshi.adapter(Types.arra… emptySet(), \"supported\")");
        this.arrayOfStringAdapter = abstractC8716fM27813f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteAuthenticationService.Credentials");
        sb.append(')');
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.AbstractC8716f
    public RemoteAuthenticationService.Credentials fromJson(AbstractC8719i abstractC8719i) throws IOException {
        C9801m.m32346f(abstractC8719i, "reader");
        abstractC8719i.mo27711b();
        String strFromJson = null;
        String[] strArrFromJson = null;
        while (abstractC8719i.mo27715f()) {
            int iMo27702H = abstractC8719i.mo27702H(this.options);
            if (iMo27702H == -1) {
                abstractC8719i.mo27706N();
                abstractC8719i.mo27707Q();
            } else if (iMo27702H == 0) {
                strFromJson = this.stringAdapter.fromJson(abstractC8719i);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionM27876v = C8735c.m27876v("credential", "credential", abstractC8719i);
                    C9801m.m32345e(jsonDataExceptionM27876v, "unexpectedNull(\"credenti…    \"credential\", reader)");
                    throw jsonDataExceptionM27876v;
                }
            } else if (iMo27702H == 1 && (strArrFromJson = this.arrayOfStringAdapter.fromJson(abstractC8719i)) == null) {
                JsonDataException jsonDataExceptionM27876v2 = C8735c.m27876v("supported", "supported", abstractC8719i);
                C9801m.m32345e(jsonDataExceptionM27876v2, "unexpectedNull(\"supported\", \"supported\", reader)");
                throw jsonDataExceptionM27876v2;
            }
        }
        abstractC8719i.mo27713d();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionM27868n = C8735c.m27868n("credential", "credential", abstractC8719i);
            C9801m.m32345e(jsonDataExceptionM27868n, "missingProperty(\"credent…l\", \"credential\", reader)");
            throw jsonDataExceptionM27868n;
        }
        if (strArrFromJson != null) {
            return new RemoteAuthenticationService.Credentials(strFromJson, strArrFromJson);
        }
        JsonDataException jsonDataExceptionM27868n2 = C8735c.m27868n("supported", "supported", abstractC8719i);
        C9801m.m32345e(jsonDataExceptionM27868n2, "missingProperty(\"supported\", \"supported\", reader)");
        throw jsonDataExceptionM27868n2;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, RemoteAuthenticationService.Credentials credentials) throws IOException {
        C9801m.m32346f(abstractC8725o, "writer");
        if (credentials == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC8725o.mo27757b();
        abstractC8725o.mo27760l("credential");
        this.stringAdapter.toJson(abstractC8725o, (AbstractC8725o) credentials.getCredential());
        abstractC8725o.mo27760l("supported");
        this.arrayOfStringAdapter.toJson(abstractC8725o, (AbstractC8725o) credentials.getSupported());
        abstractC8725o.mo27759e();
    }
}
