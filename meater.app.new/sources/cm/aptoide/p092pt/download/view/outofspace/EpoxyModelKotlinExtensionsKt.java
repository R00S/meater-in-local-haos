package cm.aptoide.p092pt.download.view.outofspace;

import com.airbnb.epoxy.AbstractC5153n;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EpoxyModelKotlinExtensions.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m32267d2 = {"installedAppCard", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/epoxy/EpoxyController;", "modelInitializer", "Lkotlin/Function1;", "Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModelBuilder;", "Lkotlin/ExtensionFunctionType;", "app_vanillaProdRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EpoxyModelKotlinExtensionsKt {
    public static final void installedAppCard(AbstractC5153n abstractC5153n, Function1<? super InstalledAppCardModelBuilder, C10775u> function1) {
        C9801m.m32346f(abstractC5153n, "<this>");
        C9801m.m32346f(function1, "modelInitializer");
        InstalledAppCardModel_ installedAppCardModel_ = new InstalledAppCardModel_();
        function1.invoke(installedAppCardModel_);
        installedAppCardModel_.addTo(abstractC5153n);
    }
}
