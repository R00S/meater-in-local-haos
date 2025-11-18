package p241e.p247c.p248a.p249a.p250a.base;

import android.view.View;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.airbnb.epoxy.AbstractC5164q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: BaseViewHolder.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0000\u0010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m32267d2 = {"Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "()V", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "setItemView", "(Landroid/view/View;)V", "bind", "Lkotlin/properties/ReadOnlyProperty;", "V", DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, "bindView", HttpUrl.FRAGMENT_ENCODE_SET, "Lazy", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: e.c.a.a.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public abstract class BaseViewHolder extends AbstractC5164q {
    public View itemView;

    /* compiled from: BaseViewHolder.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB#\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002¢\u0006\u0002\u0010\rR$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m32267d2 = {"Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder$Lazy;", "V", "Lkotlin/properties/ReadOnlyProperty;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "initializer", "Lkotlin/Function2;", "Lkotlin/reflect/KProperty;", "(Lkotlin/jvm/functions/Function2;)V", "value", HttpUrl.FRAGMENT_ENCODE_SET, "getValue", "thisRef", "property", "(Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "EMPTY", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: e.c.a.a.a.a.a$a */
    private static final class a<V> implements ReadOnlyProperty<BaseViewHolder, V> {

        /* renamed from: a */
        private final Function2<BaseViewHolder, KProperty<?>, V> f33362a;

        /* renamed from: b */
        private Object f33363b;

        /* compiled from: BaseViewHolder.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder$Lazy$EMPTY;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: e.c.a.a.a.a.a$a$a, reason: collision with other inner class name */
        private static final class C11521a {

            /* renamed from: a */
            public static final C11521a f33364a = new C11521a();

            private C11521a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super BaseViewHolder, ? super KProperty<?>, ? extends V> function2) {
            C9801m.m32346f(function2, "initializer");
            this.f33362a = function2;
            this.f33363b = C11521a.f33364a;
        }

        @Override // kotlin.properties.ReadOnlyProperty
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public V mo6183a(BaseViewHolder baseViewHolder, KProperty<?> kProperty) {
            C9801m.m32346f(baseViewHolder, "thisRef");
            C9801m.m32346f(kProperty, "property");
            if (C9801m.m32341a(this.f33363b, C11521a.f33364a)) {
                this.f33363b = this.f33362a.invoke(baseViewHolder, kProperty);
            }
            return (V) this.f33363b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: BaseViewHolder.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m32267d2 = {"<anonymous>", "V", "Landroid/view/View;", "holder", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "prop", "Lkotlin/reflect/KProperty;", "invoke", "(Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;Lkotlin/reflect/KProperty;)Landroid/view/View;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: e.c.a.a.a.a.a$b */
    static final class b<V> extends Lambda implements Function2<BaseViewHolder, KProperty<?>, V> {

        /* renamed from: f */
        final /* synthetic */ int f33365f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(2);
            this.f33365f = i2;
        }

        /* JADX WARN: Incorrect return type in method signature: (Le/c/a/a/a/a/a;Lkotlin/f0/l<*>;)TV; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke(BaseViewHolder baseViewHolder, KProperty kProperty) {
            C9801m.m32346f(baseViewHolder, "holder");
            C9801m.m32346f(kProperty, "prop");
            View viewFindViewById = baseViewHolder.getItemView().findViewById(this.f33365f);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new IllegalStateException("View ID " + this.f33365f + " for '" + kProperty.getF40571m() + "' not found.");
        }
    }

    protected final <V extends View> ReadOnlyProperty<BaseViewHolder, V> bind(int i2) {
        return new a(new b(i2));
    }

    @Override // com.airbnb.epoxy.AbstractC5164q
    protected void bindView(View itemView) {
        C9801m.m32346f(itemView, "itemView");
        setItemView(itemView);
    }

    public final View getItemView() {
        View view = this.itemView;
        if (view != null) {
            return view;
        }
        C9801m.m32363w("itemView");
        return null;
    }

    public final void setItemView(View view) {
        C9801m.m32346f(view, "<set-?>");
        this.itemView = view;
    }
}
