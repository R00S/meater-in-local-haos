package com.airbnb.epoxy.preload;

import android.view.View;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.preload.InterfaceC5158c;
import com.airbnb.epoxy.preload.InterfaceC5163h;
import java.util.List;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: EpoxyModelPreloader.kt */
/* renamed from: com.airbnb.epoxy.preload.a */
/* loaded from: classes.dex */
public abstract class AbstractC5156a<T extends AbstractC5166s<?>, U extends InterfaceC5163h, P extends InterfaceC5158c> {

    /* renamed from: a */
    public static final a f12262a = new a(null);

    /* renamed from: b */
    private final Class<T> f12263b;

    /* renamed from: c */
    private final List<Integer> f12264c;

    /* compiled from: EpoxyModelPreloader.kt */
    /* renamed from: com.airbnb.epoxy.preload.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* renamed from: a */
    public abstract U m9328a(View view);

    /* renamed from: b */
    public final Class<T> m9329b() {
        return this.f12263b;
    }

    /* renamed from: c */
    public final List<Integer> m9330c() {
        return this.f12264c;
    }

    /* renamed from: d */
    public abstract void m9331d(T t, P p, C5162g<? extends U> c5162g);

    /* renamed from: e */
    public Object m9332e(T t) {
        C9801m.m32347g(t, "epoxyModel");
        return null;
    }
}
