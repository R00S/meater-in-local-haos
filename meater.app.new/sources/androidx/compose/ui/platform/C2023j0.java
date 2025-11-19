package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.InterfaceC4160e;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "Lt3/f;", "owner", "Landroidx/compose/ui/platform/h0;", "b", "(Landroid/view/View;Lt3/f;)Landroidx/compose/ui/platform/h0;", "", "id", "savedStateRegistryOwner", "c", "(Ljava/lang/String;Lt3/f;)Landroidx/compose/ui/platform/h0;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<? extends Object>[] f23148a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.j0$a */
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f23149B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4547d f23150C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f23151D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, C4547d c4547d, String str) {
            super(0);
            this.f23149B = z10;
            this.f23150C = c4547d;
            this.f23151D = str;
        }

        public final void a() {
            if (this.f23149B) {
                this.f23150C.j(this.f23151D);
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.j0$b */
    static final class b extends AbstractC3864v implements Ba.l<Object, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f23152B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(C2023j0.f(obj));
        }
    }

    public static final C2019h0 b(View view, InterfaceC4549f interfaceC4549f) {
        Object parent = view.getParent();
        C3862t.e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(b0.l.f29942H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, interfaceC4549f);
    }

    public static final C2019h0 c(String str, InterfaceC4549f interfaceC4549f) {
        boolean z10;
        String str2 = Y.g.class.getSimpleName() + ':' + str;
        C4547d c4547dB = interfaceC4549f.B();
        Bundle bundleB = c4547dB.b(str2);
        final Y.g gVarA = Y.i.a(bundleB != null ? h(bundleB) : null, b.f23152B);
        try {
            c4547dB.h(str2, new C4547d.c() { // from class: androidx.compose.ui.platform.i0
                @Override // t3.C4547d.c
                public final Bundle a() {
                    return C2023j0.d(gVarA);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C2019h0(gVarA, new a(z10, c4547dB, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(Y.g gVar) {
        return g(gVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof Z.g) {
            Z.g gVar = (Z.g) obj;
            if (gVar.c() != kotlin.m1.i() && gVar.c() != kotlin.m1.o() && gVar.c() != kotlin.m1.l()) {
                return false;
            }
            T value = gVar.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof InterfaceC4160e) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f23148a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            C3862t.e(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
