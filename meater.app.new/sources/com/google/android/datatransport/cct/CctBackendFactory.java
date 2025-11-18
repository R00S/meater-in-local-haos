package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.AbstractC6265h;
import com.google.android.datatransport.runtime.backends.InterfaceC6261d;
import com.google.android.datatransport.runtime.backends.InterfaceC6270m;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements InterfaceC6261d {
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6261d
    public InterfaceC6270m create(AbstractC6265h abstractC6265h) {
        return new C6240d(abstractC6265h.mo13516b(), abstractC6265h.mo13519e(), abstractC6265h.mo13518d());
    }
}
