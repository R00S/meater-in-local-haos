package kotlin.collections;

import cm.aptoide.p092pt.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m32267d2 = {"Iterable", HttpUrl.FRAGMENT_ENCODE_SET, "T", "iterator", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "collectionSizeOrDefault", HttpUrl.FRAGMENT_ENCODE_SET, BuildConfig.APTOIDE_THEME, "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "flatten", HttpUrl.FRAGMENT_ENCODE_SET, "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.w.v */
/* loaded from: classes2.dex */
public class C10819v extends C10817u {
    /* renamed from: u */
    public static <T> int m38911u(Iterable<? extends T> iterable, int i2) {
        C9801m.m32346f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    /* renamed from: v */
    public static final <T> Integer m38912v(Iterable<? extends T> iterable) {
        C9801m.m32346f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: w */
    public static <T> List<T> m38913w(Iterable<? extends Iterable<? extends T>> iterable) {
        C9801m.m32346f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList, it.next());
        }
        return arrayList;
    }
}
