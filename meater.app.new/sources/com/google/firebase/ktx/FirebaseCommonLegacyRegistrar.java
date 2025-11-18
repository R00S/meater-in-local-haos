package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.p209u.C8555h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10815t;
import okhttp3.HttpUrl;

/* compiled from: Logging.kt */
@Keep
@Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/ktx/FirebaseCommonLegacyRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common-ktx"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        return C10815t.m38883e(C8555h.m26903a("fire-core-ktx", "20.4.2"));
    }
}
