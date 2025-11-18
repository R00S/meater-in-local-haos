package cm.aptoide.aptoideviews;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;

/* compiled from: Extensions.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a]\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\rH\u0000¨\u0006\u000e"}, m32267d2 = {"safeLet", "R", "T1", HttpUrl.FRAGMENT_ENCODE_SET, "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "childViews", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/view/View;", "Landroid/view/ViewGroup;", "aptoide-views_prodRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final List<View> childViews(ViewGroup viewGroup) {
        C9801m.m32346f(viewGroup, "<this>");
        IntRange intRangeM32428k = C9848l.m32428k(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(C10819v.m38911u(intRangeM32428k, 10));
        Iterator<Integer> it = intRangeM32428k.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).mo32397b()));
        }
        return arrayList;
    }

    public static final <T1, T2, R> R safeLet(T1 t1, T2 t2, Function2<? super T1, ? super T2, ? extends R> function2) {
        C9801m.m32346f(function2, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return function2.invoke(t1, t2);
    }
}
