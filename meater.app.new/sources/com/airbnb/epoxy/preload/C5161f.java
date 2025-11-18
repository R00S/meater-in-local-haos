package com.airbnb.epoxy.preload;

import android.content.Context;
import android.view.View;
import androidx.core.view.C0311u;
import com.airbnb.epoxy.AbstractC5133d;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.C5128a0;
import com.airbnb.epoxy.C5135e;
import com.airbnb.epoxy.C5168u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10775u;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;

/* compiled from: PreloadableViewDataProvider.kt */
/* renamed from: com.airbnb.epoxy.preload.f */
/* loaded from: classes.dex */
public final class C5161f {

    /* renamed from: a */
    private final Map<a, List<C5162g<?>>> f12276a;

    /* renamed from: b */
    private final AbstractC5133d f12277b;

    /* renamed from: c */
    private final Function2<Context, RuntimeException, C10775u> f12278c;

    /* compiled from: PreloadableViewDataProvider.kt */
    /* renamed from: com.airbnb.epoxy.preload.f$a */
    private static final class a {

        /* renamed from: a */
        private final Class<? extends AbstractC5166s<?>> f12279a;

        /* renamed from: b */
        private final int f12280b;

        /* renamed from: c */
        private final int f12281c;

        /* renamed from: d */
        private final Object f12282d;

        public a(Class<? extends AbstractC5166s<?>> cls, int i2, int i3, Object obj) {
            C9801m.m32347g(cls, "epoxyModelClass");
            this.f12279a = cls;
            this.f12280b = i2;
            this.f12281c = i3;
            this.f12282d = obj;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C9801m.m32341a(this.f12279a, aVar.f12279a)) {
                        if (this.f12280b == aVar.f12280b) {
                            if (!(this.f12281c == aVar.f12281c) || !C9801m.m32341a(this.f12282d, aVar.f12282d)) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Class<? extends AbstractC5166s<?>> cls = this.f12279a;
            int iHashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f12280b) * 31) + this.f12281c) * 31;
            Object obj = this.f12282d;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "CacheKey(epoxyModelClass=" + this.f12279a + ", spanSize=" + this.f12280b + ", viewType=" + this.f12281c + ", signature=" + this.f12282d + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5161f(AbstractC5133d abstractC5133d, Function2<? super Context, ? super RuntimeException, C10775u> function2) {
        C9801m.m32347g(abstractC5133d, "adapter");
        C9801m.m32347g(function2, "errorHandler");
        this.f12277b = abstractC5133d;
        this.f12278c = function2;
        this.f12276a = new LinkedHashMap();
    }

    /* renamed from: a */
    private final <T extends AbstractC5166s<?>, U extends InterfaceC5163h, P extends InterfaceC5158c> C5162g<U> m9344a(View view, AbstractC5156a<T, U, P> abstractC5156a, T t) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width > 0 && height > 0) {
            return new C5162g<>(view.getId(), width, height, abstractC5156a.m9328a(view));
        }
        Function2<Context, RuntimeException, C10775u> function2 = this.f12278c;
        Context context = view.getContext();
        C9801m.m32342b(context, "context");
        function2.invoke(context, new EpoxyPreloadException(view.getClass().getSimpleName() + " in " + t.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
        return null;
    }

    /* renamed from: b */
    private final <T extends AbstractC5166s<?>> a m9345b(AbstractC5156a<T, ?, ?> abstractC5156a, T t, int i2) {
        return new a(t.getClass(), this.f12277b.m9271n() ? t.spanSize(this.f12277b.m9269l(), i2, this.f12277b.getItemCount()) : 1, C5128a0.m9200d(t), abstractC5156a.m9332e(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private final <T extends AbstractC5166s<?>, U extends InterfaceC5163h, P extends InterfaceC5158c> List<C5162g<U>> m9346d(AbstractC5156a<T, U, P> abstractC5156a, T t, a aVar) {
        C5168u next;
        View view;
        C5135e c5135eM9197a = C5128a0.m9197a(this.f12277b);
        C9801m.m32342b(c5135eM9197a, "adapter.boundViewHoldersInternal()");
        Iterator<C5168u> it = c5135eM9197a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C5168u c5168u = next;
            C9801m.m32342b(c5168u, "it");
            AbstractC5166s<?> abstractC5166sM9364c = c5168u.m9364c();
            boolean z = false;
            if (C9801m.m32341a(C9790g0.m32298b(abstractC5166sM9364c.getClass()), C9790g0.m32298b(t.getClass())) && C0311u.m2101N(c5168u.itemView) && C0311u.m2102O(c5168u.itemView) && C9801m.m32341a(m9345b(abstractC5156a, abstractC5166sM9364c, c5168u.getAdapterPosition()), aVar)) {
                z = true;
            }
            if (z) {
                break;
            }
        }
        C5168u c5168u2 = next;
        if (c5168u2 == null || (view = c5168u2.itemView) == 0) {
            return null;
        }
        C9801m.m32342b(view, "holderMatch?.itemView ?: return null");
        Object objM9199c = C5128a0.m9199c(c5168u2);
        List<View> listM9347e = abstractC5156a.m9330c().isEmpty() ^ true ? m9347e(view, abstractC5156a.m9330c(), t) : view instanceof InterfaceC5160e ? ((InterfaceC5160e) view).m9343a() : objM9199c instanceof InterfaceC5160e ? ((InterfaceC5160e) objM9199c).m9343a() : C10817u.m38888j();
        if (listM9347e.isEmpty()) {
            Function2<Context, RuntimeException, C10775u> function2 = this.f12278c;
            Context context = view.getContext();
            C9801m.m32342b(context, "rootView.context");
            function2.invoke(context, new EpoxyPreloadException("No preloadable views were found in " + t.getClass().getSimpleName()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listM9347e.iterator();
        while (it2.hasNext()) {
            C10827z.m38933z(arrayList, m9348f((View) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C5162g c5162gM9344a = m9344a((View) it3.next(), abstractC5156a, t);
            if (c5162gM9344a != null) {
                arrayList2.add(c5162gM9344a);
            }
        }
        return arrayList2;
    }

    /* renamed from: e */
    private final <T extends AbstractC5166s<?>> List<View> m9347e(View view, List<Integer> list, T t) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            View viewFindViewById = view.findViewById(iIntValue);
            if (viewFindViewById == null) {
                Function2<Context, RuntimeException, C10775u> function2 = this.f12278c;
                Context context = view.getContext();
                C9801m.m32342b(context, "context");
                function2.invoke(context, new EpoxyPreloadException("View with id " + iIntValue + " in " + t.getClass().getSimpleName() + " could not be found."));
            }
            if (viewFindViewById != null) {
                arrayList.add(viewFindViewById);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private final <T extends View> List<View> m9348f(T t) {
        if (!(t instanceof InterfaceC5160e)) {
            return C10815t.m38883e(t);
        }
        List<View> listM9343a = ((InterfaceC5160e) t).m9343a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM9343a.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList, m9348f((View) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T extends AbstractC5166s<?>, U extends InterfaceC5163h, P extends InterfaceC5158c> List<C5162g<U>> m9349c(AbstractC5156a<T, U, P> abstractC5156a, T t, int i2) {
        C9801m.m32347g(abstractC5156a, "preloader");
        C9801m.m32347g(t, "epoxyModel");
        a aVarM9345b = m9345b(abstractC5156a, t, i2);
        Map<a, List<C5162g<?>>> map = this.f12276a;
        Object objM9346d = map.get(aVarM9345b);
        if (objM9346d == null) {
            objM9346d = m9346d(abstractC5156a, t, aVarM9345b);
            map.put(aVarM9345b, objM9346d);
        }
        if (!(objM9346d instanceof List)) {
            objM9346d = null;
        }
        List<C5162g<U>> list = (List) objM9346d;
        return list != null ? list : C10817u.m38888j();
    }
}
