package cm.aptoide.aptoideviews.errors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.aptoideviews.C1103R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;

/* compiled from: ErrorView.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0007¨\u0006\u0016"}, m32267d2 = {"Lcm/aptoide/aptoideviews/errors/ErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "retryClick", "Lrx/Observable;", "Ljava/lang/Void;", "setError", HttpUrl.FRAGMENT_ENCODE_SET, "error", "Lcm/aptoide/aptoideviews/errors/ErrorView$Error;", "setRetryAction", "action", "Lkotlin/Function0;", "Error", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ErrorView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;

    /* compiled from: ErrorView.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/aptoideviews/errors/ErrorView$Error;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "GENERIC", "NO_NETWORK", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Error {
        GENERIC,
        NO_NETWORK
    }

    /* compiled from: ErrorView.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Error.values().length];
            iArr[Error.GENERIC.ordinal()] = 1;
            iArr[Error.NO_NETWORK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRetryAction$lambda-0, reason: not valid java name */
    public static final void m40680setRetryAction$lambda0(Function0 function0, View view) {
        C9801m.m32346f(function0, "$action");
        function0.invoke();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    public final C11234e<Void> retryClick() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((TextView) _$_findCachedViewById(C1103R.id.retry));
        C9801m.m32345e(c11234eM28573a, "clicks(retry)");
        return c11234eM28573a;
    }

    public final void setError(Error error) {
        C9801m.m32346f(error, "error");
        int i2 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
        if (i2 == 1) {
            ((ImageView) _$_findCachedViewById(C1103R.id.error_image)).setImageResource(C1103R.drawable.generic_error);
            ((TextView) _$_findCachedViewById(C1103R.id.error_text)).setText(C1103R.string.error503);
        } else {
            if (i2 != 2) {
                return;
            }
            ((ImageView) _$_findCachedViewById(C1103R.id.error_image)).setImageResource(C1103R.drawable.no_connection_error);
            ((TextView) _$_findCachedViewById(C1103R.id.error_text)).setText(C1103R.string.could_not_connect_internet);
        }
    }

    public final void setRetryAction(final Function0<C10775u> function0) {
        C9801m.m32346f(function0, "action");
        ((TextView) _$_findCachedViewById(C1103R.id.retry)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.errors.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorView.m40680setRetryAction$lambda0(function0, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        FrameLayout.inflate(context, C1103R.layout.error_view, this);
        setError(Error.GENERIC);
    }
}
