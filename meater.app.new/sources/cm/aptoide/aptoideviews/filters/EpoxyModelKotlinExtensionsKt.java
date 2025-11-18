package cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.AbstractC5153n;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EpoxyModelKotlinExtensions.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m32267d2 = {"clearFilters", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/epoxy/EpoxyController;", "modelInitializer", "Lkotlin/Function1;", "Lcm/aptoide/aptoideviews/filters/ClearFiltersModelBuilder;", "Lkotlin/ExtensionFunctionType;", "filter", "Lcm/aptoide/aptoideviews/filters/FilterModelBuilder;", "aptoide-views_prodRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EpoxyModelKotlinExtensionsKt {
    public static final void clearFilters(AbstractC5153n abstractC5153n, Function1<? super ClearFiltersModelBuilder, C10775u> function1) {
        C9801m.m32346f(abstractC5153n, "<this>");
        C9801m.m32346f(function1, "modelInitializer");
        ClearFiltersModel_ clearFiltersModel_ = new ClearFiltersModel_();
        function1.invoke(clearFiltersModel_);
        clearFiltersModel_.addTo(abstractC5153n);
    }

    public static final void filter(AbstractC5153n abstractC5153n, Function1<? super FilterModelBuilder, C10775u> function1) {
        C9801m.m32346f(abstractC5153n, "<this>");
        C9801m.m32346f(function1, "modelInitializer");
        FilterModel_ filterModel_ = new FilterModel_();
        function1.invoke(filterModel_);
        filterModel_.addTo(abstractC5153n);
    }
}
