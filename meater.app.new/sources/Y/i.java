package Y;

import Ub.C1786a;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "LY/g;", "a", "(Ljava/util/Map;LBa/l;)LY/g;", "", "c", "(Ljava/lang/CharSequence;)Z", "LO/G0;", "LO/G0;", "d", "()LO/G0;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<g> f19179a = C1576w.f(a.f19180B);

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LY/g;", "a", "()LY/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<g> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f19180B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return null;
        }
    }

    public static final g a(Map<String, ? extends List<? extends Object>> map, Ba.l<Object, Boolean> lVar) {
        return new h(map, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C1786a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final AbstractC1501G0<g> d() {
        return f19179a;
    }
}
