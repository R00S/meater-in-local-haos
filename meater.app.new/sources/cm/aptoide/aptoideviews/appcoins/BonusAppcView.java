package cm.aptoide.aptoideviews.appcoins;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.aptoideviews.C1103R;
import com.google.android.material.card.MaterialCardView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: BonusAppcView.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\tH\u0003J\u001a\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002¨\u0006\u001c"}, m32267d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "applyPreferences", HttpUrl.FRAGMENT_ENCODE_SET, "preferences", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Preferences;", "dpToPx", HttpUrl.FRAGMENT_ENCODE_SET, "dp", "retrievePreferences", "setPercentage", "percentage", "setSide", "side", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "setupViews", "Preferences", "Side", "Size", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class BonusAppcView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;

    /* compiled from: BonusAppcView.kt */
    @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Preferences;", HttpUrl.FRAGMENT_ENCODE_SET, "enableCardPadding", HttpUrl.FRAGMENT_ENCODE_SET, "side", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "size", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;", "(ZLcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;)V", "getEnableCardPadding", "()Z", "getSide", "()Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "getSize", "()Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Preferences {
        private final boolean enableCardPadding;
        private final Side side;
        private final Size size;

        public Preferences(boolean z, Side side, Size size) {
            C9801m.m32346f(side, "side");
            C9801m.m32346f(size, "size");
            this.enableCardPadding = z;
            this.side = side;
            this.size = size;
        }

        public static /* synthetic */ Preferences copy$default(Preferences preferences, boolean z, Side side, Size size, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = preferences.enableCardPadding;
            }
            if ((i2 & 2) != 0) {
                side = preferences.side;
            }
            if ((i2 & 4) != 0) {
                size = preferences.size;
            }
            return preferences.copy(z, side, size);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnableCardPadding() {
            return this.enableCardPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Side getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        public final Preferences copy(boolean enableCardPadding, Side side, Size size) {
            C9801m.m32346f(side, "side");
            C9801m.m32346f(size, "size");
            return new Preferences(enableCardPadding, side, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Preferences)) {
                return false;
            }
            Preferences preferences = (Preferences) other;
            return this.enableCardPadding == preferences.enableCardPadding && this.side == preferences.side && this.size == preferences.size;
        }

        public final boolean getEnableCardPadding() {
            return this.enableCardPadding;
        }

        public final Side getSide() {
            return this.side;
        }

        public final Size getSize() {
            return this.size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enableCardPadding;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.side.hashCode()) * 31) + this.size.hashCode();
        }

        public String toString() {
            return "Preferences(enableCardPadding=" + this.enableCardPadding + ", side=" + this.side + ", size=" + this.size + ')';
        }
    }

    /* compiled from: BonusAppcView.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Side {
        LEFT,
        RIGHT
    }

    /* compiled from: BonusAppcView.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "REGULAR", "COMPACT", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Size {
        REGULAR,
        COMPACT
    }

    /* compiled from: BonusAppcView.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            iArr[Side.LEFT.ordinal()] = 1;
            iArr[Side.RIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BonusAppcView(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    private final void applyPreferences(Preferences preferences) {
        if (preferences.getSize() == Size.REGULAR) {
            if (!preferences.getEnableCardPadding()) {
                int i2 = C1103R.id.card_view;
                ViewGroup.LayoutParams layoutParams = ((MaterialCardView) _$_findCachedViewById(i2)).getLayoutParams();
                layoutParams.width = (int) dpToPx(66);
                layoutParams.height = (int) dpToPx(72);
                ((MaterialCardView) _$_findCachedViewById(i2)).setLayoutParams(layoutParams);
            }
        } else if (preferences.getSize() == Size.COMPACT) {
            int i3 = C1103R.id.card_view;
            ViewGroup.LayoutParams layoutParams2 = ((MaterialCardView) _$_findCachedViewById(i3)).getLayoutParams();
            layoutParams2.width = (int) dpToPx(62);
            layoutParams2.height = (int) dpToPx(56);
            ((MaterialCardView) _$_findCachedViewById(i3)).setLayoutParams(layoutParams2);
            int i4 = C1103R.id.root_layout;
            ViewGroup.LayoutParams layoutParams3 = ((ConstraintLayout) _$_findCachedViewById(i4)).getLayoutParams();
            layoutParams3.width = (int) dpToPx(62);
            layoutParams3.height = (int) dpToPx(56);
            ((ConstraintLayout) _$_findCachedViewById(i4)).setLayoutParams(layoutParams3);
            ((TextView) _$_findCachedViewById(C1103R.id.up_to_textview)).setTranslationY(dpToPx(2));
            ((TextView) _$_findCachedViewById(C1103R.id.bonus_textview)).setTranslationY(dpToPx(-2));
        }
        setSide(preferences.getSide());
    }

    private final float dpToPx(int dp) {
        return TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    private final Preferences retrievePreferences(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C1103R.styleable.BonusAppcView, defStyleAttr, 0);
        C9801m.m32345e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ppcView, defStyleAttr, 0)");
        Preferences preferences = new Preferences(typedArrayObtainStyledAttributes.getBoolean(C1103R.styleable.BonusAppcView_enable_card_padding, true), Side.values()[typedArrayObtainStyledAttributes.getInt(C1103R.styleable.BonusAppcView_side, 0)], Size.values()[typedArrayObtainStyledAttributes.getInt(C1103R.styleable.BonusAppcView_size, 0)]);
        typedArrayObtainStyledAttributes.recycle();
        return preferences;
    }

    private final void setSide(Side side) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i2 == 1) {
            ((ConstraintLayout) _$_findCachedViewById(C1103R.id.root_layout)).setBackgroundResource(C1103R.drawable.appc_gradient_right_rounded);
        } else {
            if (i2 != 2) {
                return;
            }
            ((ConstraintLayout) _$_findCachedViewById(C1103R.id.root_layout)).setBackgroundResource(C1103R.drawable.appc_gradient_left_rounded);
        }
    }

    private final void setupViews() {
        TextView textView = (TextView) _$_findCachedViewById(C1103R.id.up_to_textview);
        String lowerCase = getContext().getText(C1103R.string.incentives_badge_up_to).toString().toLowerCase();
        C9801m.m32345e(lowerCase, "this as java.lang.String).toLowerCase()");
        textView.setText(lowerCase);
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

    public final void setPercentage(int percentage) {
        ((TextView) _$_findCachedViewById(C1103R.id.percentage_number_textview)).setText(String.valueOf(percentage));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BonusAppcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusAppcView(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        Preferences preferencesRetrievePreferences = retrievePreferences(attributeSet, i2);
        if (preferencesRetrievePreferences.getSide() == Side.RIGHT) {
            i3 = C1103R.style.BonusAppcViewCardStyle_BorderRight;
        } else {
            i3 = C1103R.style.BonusAppcViewCardStyle_BorderLeft;
        }
        FrameLayout.inflate(new ContextThemeWrapper(context, i3), C1103R.layout.bonus_appc_view, this);
        setupViews();
        applyPreferences(preferencesRetrievePreferences);
        setSaveEnabled(true);
    }
}
