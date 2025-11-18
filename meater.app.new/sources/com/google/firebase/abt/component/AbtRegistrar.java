package com.google.firebase.abt.component;

import D9.h;
import K8.c;
import K8.d;
import K8.g;
import K8.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.d(I8.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.j(I8.a.class)).f(new g() { // from class: H8.a
            @Override // K8.g
            public final Object a(d dVar) {
                return AbtRegistrar.lambda$getComponents$0(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
