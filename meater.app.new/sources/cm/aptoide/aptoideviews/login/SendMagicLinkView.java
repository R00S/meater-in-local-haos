package cm.aptoide.aptoideviews.login;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import cm.aptoide.aptoideviews.C1103R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p241e.p294g.p295a.p305d.C8981a;
import p241e.p294g.p295a.p305d.C8984d;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: SendMagicLinkView.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\fJ\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentState", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "getEmailChangeEvent", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "getMagicLinkSubmit", "getSecureLoginTextClick", "Ljava/lang/Void;", "resetTextFieldError", HttpUrl.FRAGMENT_ENCODE_SET, "setErrorState", "message", "textFieldError", HttpUrl.FRAGMENT_ENCODE_SET, "setInitialState", "setState", "state", "setupViews", "State", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SendMagicLinkView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private State currentState;

    /* compiled from: SendMagicLinkView.kt */
    @Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "Error", "Initial", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Initial;", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Error;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static abstract class State {

        /* compiled from: SendMagicLinkView.kt */
        @Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m32267d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Error;", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "isTextFieldError", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Z)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
        public static final /* data */ class Error extends State {
            private final boolean isTextFieldError;
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String str, boolean z) {
                super(null);
                C9801m.m32346f(str, "message");
                this.message = str;
                this.isTextFieldError = z;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = error.message;
                }
                if ((i2 & 2) != 0) {
                    z = error.isTextFieldError;
                }
                return error.copy(str, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsTextFieldError() {
                return this.isTextFieldError;
            }

            public final Error copy(String message, boolean isTextFieldError) {
                C9801m.m32346f(message, "message");
                return new Error(message, isTextFieldError);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return C9801m.m32341a(this.message, error.message) && this.isTextFieldError == error.isTextFieldError;
            }

            public final String getMessage() {
                return this.message;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = this.message.hashCode() * 31;
                boolean z = this.isTextFieldError;
                int i2 = z;
                if (z != 0) {
                    i2 = 1;
                }
                return iHashCode + i2;
            }

            public final boolean isTextFieldError() {
                return this.isTextFieldError;
            }

            public String toString() {
                return "Error(message=" + this.message + ", isTextFieldError=" + this.isTextFieldError + ')';
            }
        }

        /* compiled from: SendMagicLinkView.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Initial;", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
        public static final class Initial extends State {
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super(null);
            }
        }

        private State() {
        }

        public /* synthetic */ State(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SendMagicLinkView(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEmailChangeEvent$lambda-3, reason: not valid java name */
    public static final String m40683getEmailChangeEvent$lambda3(SendMagicLinkView sendMagicLinkView, C8984d c8984d) {
        C9801m.m32346f(sendMagicLinkView, "this$0");
        return ((AutoCompleteTextView) sendMagicLinkView._$_findCachedViewById(C1103R.id.email)).getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMagicLinkSubmit$lambda-2, reason: not valid java name */
    public static final String m40684getMagicLinkSubmit$lambda2(SendMagicLinkView sendMagicLinkView, Void r1) {
        C9801m.m32346f(sendMagicLinkView, "this$0");
        return ((AutoCompleteTextView) sendMagicLinkView._$_findCachedViewById(C1103R.id.email)).getText().toString();
    }

    private final void setErrorState(String message, boolean textFieldError) {
        ((TextView) _$_findCachedViewById(C1103R.id.tip)).setVisibility(8);
        int i2 = C1103R.id.tip_error;
        ((TextView) _$_findCachedViewById(i2)).setVisibility(0);
        ((TextView) _$_findCachedViewById(i2)).setText(message);
        if (textFieldError) {
            int i3 = C1103R.id.email;
            ((AutoCompleteTextView) _$_findCachedViewById(i3)).setTextAppearance(getContext(), C1103R.style.Aptoide_TextView_Regular_S_OrangeGradientEnd);
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(C1103R.attr.loginInputErrorBackground, typedValue, true);
            ((AutoCompleteTextView) _$_findCachedViewById(i3)).setBackgroundResource(typedValue.resourceId);
        }
    }

    private final void setInitialState() {
        ((TextView) _$_findCachedViewById(C1103R.id.tip)).setVisibility(0);
        ((TextView) _$_findCachedViewById(C1103R.id.tip_error)).setVisibility(8);
        int i2 = C1103R.id.email;
        ((AutoCompleteTextView) _$_findCachedViewById(i2)).setTextAppearance(getContext(), C1103R.style.Aptoide_TextView_Regular_S_Primary);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(C1103R.attr.loginInputBackground, typedValue, true);
        ((AutoCompleteTextView) _$_findCachedViewById(i2)).setBackgroundResource(typedValue.resourceId);
    }

    private final void setupViews() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(getContext().getText(C1103R.string.login_safe_body_1));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append(getContext().getText(C1103R.string.login_safe_body_2));
        ((TextView) _$_findCachedViewById(C1103R.id.login_benefits_textview)).setText(new SpannedString(spannableStringBuilder));
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

    public final C11234e<String> getEmailChangeEvent() {
        C11234e c11234eM40082X = C8981a.m28582b((AutoCompleteTextView) _$_findCachedViewById(C1103R.id.email)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.aptoideviews.login.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkView.m40683getEmailChangeEvent$lambda3(this.f7154f, (C8984d) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "textChangeEvents(email)\n…{ email.text.toString() }");
        return c11234eM40082X;
    }

    public final C11234e<String> getMagicLinkSubmit() {
        C11234e c11234eM40082X = C8975a.m28573a((Button) _$_findCachedViewById(C1103R.id.send_magic_link_button)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.aptoideviews.login.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkView.m40684getMagicLinkSubmit$lambda2(this.f7153f, (Void) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "clicks(send_magic_link_b…{ email.text.toString() }");
        return c11234eM40082X;
    }

    public final C11234e<Void> getSecureLoginTextClick() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((TextView) _$_findCachedViewById(C1103R.id.login_benefits_textview));
        C9801m.m32345e(c11234eM28573a, "clicks(login_benefits_textview)");
        return c11234eM28573a;
    }

    public final void resetTextFieldError() {
        State state = this.currentState;
        if (state != null && (state instanceof State.Error) && ((State.Error) state).isTextFieldError()) {
            setState(State.Initial.INSTANCE);
        }
    }

    public final void setState(State state) {
        C9801m.m32346f(state, "state");
        if (C9801m.m32341a(state, State.Initial.INSTANCE)) {
            setInitialState();
        } else if (state instanceof State.Error) {
            State.Error error = (State.Error) state;
            setErrorState(error.getMessage(), error.isTextFieldError());
        }
        this.currentState = state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SendMagicLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMagicLinkView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        FrameLayout.inflate(context, C1103R.layout.send_magic_link_layout, this);
        setupViews();
        setSaveEnabled(true);
    }
}
