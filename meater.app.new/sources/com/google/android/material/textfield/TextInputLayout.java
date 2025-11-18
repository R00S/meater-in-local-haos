package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0166h;
import androidx.appcompat.widget.C0185q0;
import androidx.appcompat.widget.C0190t;
import androidx.appcompat.widget.C0200y;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0280a;
import androidx.core.view.C0297g;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.core.widget.C0330k;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.C8023a;
import com.google.android.material.internal.C8024b;
import com.google.android.material.internal.C8032j;
import com.google.android.material.internal.C8033k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.theme.p178a.C8079a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import okhttp3.HttpUrl;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p058i.C0945a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8909c;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8916j;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p273m.C8919a;
import p241e.p254e.p256b.p271c.p278q.C8937a;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = C8917k.f33988m;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private ValueAnimator animator;
    private C8900g boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private final int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private C8900g boxUnderline;
    final C8023a collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<InterfaceC8068f> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final LinkedHashSet<InterfaceC8069g> endIconChangedListeners;
    private final SparseArray<AbstractC8074e> endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private final LinearLayout endLayout;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private final CheckableImageButton errorIconView;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final C8075f indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private boolean placeholderEnabled;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private boolean restoringSavedState;
    private C8904k shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final LinearLayout startLayout;
    private ColorStateList strokeErrorColor;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8062a();

        /* renamed from: h */
        CharSequence f30507h;

        /* renamed from: i */
        boolean f30508i;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        static class C8062a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8062a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f30507h) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f30507h, parcel, i2);
            parcel.writeInt(this.f30508i ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f30507h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f30508i = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C8063a implements TextWatcher {
        C8063a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            TextInputLayout.this.updateLabelState(!r0.restoringSavedState);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.counterEnabled) {
                textInputLayout.updateCounter(editable.length());
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class RunnableC8064b implements Runnable {
        RunnableC8064b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.endIconView.performClick();
            TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class RunnableC8065c implements Runnable {
        RunnableC8065c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C8066d implements ValueAnimator.AnimatorUpdateListener {
        C8066d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            TextInputLayout.this.collapsingTextHelper.m24637d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C8067e extends C0280a {

        /* renamed from: d */
        private final TextInputLayout f30513d;

        public C8067e(TextInputLayout textInputLayout) {
            this.f30513d = textInputLayout;
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            EditText editText = this.f30513d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f30513d.getHint();
            CharSequence helperText = this.f30513d.getHelperText();
            CharSequence error = this.f30513d.getError();
            int counterMaxLength = this.f30513d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f30513d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(string)) ? ", " : HttpUrl.FRAGMENT_ENCODE_SET);
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb2.append((Object) helperText);
            String string3 = sb2.toString();
            if (z) {
                c0289c.m2007v0(text);
            } else if (!TextUtils.isEmpty(string3)) {
                c0289c.m2007v0(string3);
            }
            if (!TextUtils.isEmpty(string3)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c0289c.m1987j0(string3);
                } else {
                    if (z) {
                        string3 = ((Object) text) + ", " + string3;
                    }
                    c0289c.m2007v0(string3);
                }
                c0289c.m2003s0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c0289c.m1988k0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                c0289c.m1981f0(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC8068f {
        /* renamed from: a */
        void mo24796a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC8069g {
        /* renamed from: a */
        void mo24797a(TextInputLayout textInputLayout, int i2);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void applyBoxAttributes() {
        C8900g c8900g = this.boxBackground;
        if (c8900g == null) {
            return;
        }
        c8900g.setShapeAppearanceModel(this.shapeAppearanceModel);
        if (canDrawOutlineStroke()) {
            this.boxBackground.m28291e0(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.m28284X(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        if (this.endIconMode == 3) {
            this.editText.getBackground().invalidateSelf();
        }
        applyBoxUnderlineAttributes();
        invalidate();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderline.m28284X(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.boxLabelCutoutPaddingPx;
        rectF.left = f2 - i2;
        rectF.top -= i2;
        rectF.right += i2;
        rectF.bottom += i2;
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    private void applyIconTint(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0265a.m1821r(drawable).mutate();
            if (z) {
                C0265a.m1818o(drawable, colorStateList);
            }
            if (z2) {
                C0265a.m1819p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private void assignBoxBackgroundByMode() {
        int i2 = this.boxBackgroundMode;
        if (i2 == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
            return;
        }
        if (i2 == 1) {
            this.boxBackground = new C8900g(this.shapeAppearanceModel);
            this.boxUnderline = new C8900g();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.hintEnabled || (this.boxBackground instanceof C8072c)) {
                this.boxBackground = new C8900g(this.shapeAppearanceModel);
            } else {
                this.boxBackground = new C8072c(this.shapeAppearanceModel);
            }
            this.boxUnderline = null;
        }
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? C8937a.m28474e(C8937a.m28473d(this, C8908b.f33825o, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean z = C0311u.m2162y(this) == 1;
        rect2.bottom = rect.bottom;
        int i2 = this.boxBackgroundMode;
        if (i2 == 1) {
            rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
            return rect2;
        }
        rect2.left = rect.left + this.editText.getPaddingLeft();
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f2) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f2) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f2) {
        return isSingleLineFilledTextField() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.editText.getCompoundPaddingTop();
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        float fM24652x = this.collapsingTextHelper.m24652x();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, fM24652x);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, fM24652x);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float fM24648p;
        if (!this.hintEnabled) {
            return 0;
        }
        int i2 = this.boxBackgroundMode;
        if (i2 == 0 || i2 == 1) {
            fM24648p = this.collapsingTextHelper.m24648p();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fM24648p = this.collapsingTextHelper.m24648p() / 2.0f;
        }
        return (int) fM24648p;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((C8072c) this.boxBackground).m24815o0();
        }
    }

    private void collapseHint(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.m24637d0(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        showPlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof C8072c);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<InterfaceC8068f> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo24796a(this);
        }
    }

    private void dispatchOnEndIconChanged(int i2) {
        Iterator<InterfaceC8069g> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo24797a(this, i2);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        C8900g c8900g = this.boxUnderline;
        if (c8900g != null) {
            Rect bounds = c8900g.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.m24642j(canvas);
        }
    }

    private void expandHint(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.m24637d0(0.0f);
        }
        if (cutoutEnabled() && ((C8072c) this.boxBackground).m24814l0()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private AbstractC8074e getEndIconDelegate() {
        AbstractC8074e abstractC8074e = this.endIconDelegates.get(this.endIconMode);
        return abstractC8074e != null ? abstractC8074e : this.endIconDelegates.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i2, boolean z) {
        int compoundPaddingLeft = i2 + this.editText.getCompoundPaddingLeft();
        return (this.prefixText == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.prefixTextView.getMeasuredWidth()) + this.prefixTextView.getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.editText.getCompoundPaddingRight();
        return (this.prefixText == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.prefixTextView.getMeasuredWidth() + this.prefixTextView.getPaddingRight();
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && (Build.VERSION.SDK_INT < 16 || this.editText.getMinLines() <= 1);
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.m24645m(rectF, this.editText.getWidth(), this.editText.getGravity());
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((C8072c) this.boxBackground).m24817r0(rectF);
        }
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setEditText(EditText editText) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.endIconMode != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new C8067e(this));
        this.collapsingTextHelper.m24644k0(this.editText.getTypeface());
        this.collapsingTextHelper.m24634a0(this.editText.getTextSize());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.m24627R((gravity & (-113)) | 48);
        this.collapsingTextHelper.m24633Z(gravity);
        this.editText.addTextChangedListener(new C8063a());
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText().length());
        }
        updateEditTextBackground();
        this.indicatorViewController.m24875e();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        this.endIconFrame.bringToFront();
        this.errorIconView.bringToFront();
        dispatchOnEditTextAttached();
        updatePrefixTextViewPadding();
        updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            C0311u.m2139m0(this.editText, this.boxBackground);
        }
    }

    private void setErrorIconVisible(boolean z) {
        this.errorIconView.setVisibility(z ? 0 : 8);
        this.endIconFrame.setVisibility(z ? 8 : 0);
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        updateDummyDrawables();
    }

    private void setHintInternal(CharSequence charSequence) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.m24641i0(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zM2097J = C0311u.m2097J(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zM2097J || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zM2097J);
        checkableImageButton.setPressable(zM2097J);
        checkableImageButton.setLongClickable(z);
        C0311u.m2153t0(checkableImageButton, z2 ? 1 : 2);
    }

    private static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled == z) {
            return;
        }
        if (z) {
            C0190t c0190t = new C0190t(getContext());
            this.placeholderTextView = c0190t;
            c0190t.setId(C8912f.f33906G);
            C0311u.m2135k0(this.placeholderTextView, 1);
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.errorIconView.getVisibility() == 0 || ((hasEndIcon() && isEndIconVisible()) || this.suffixText != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return !(getStartIconDrawable() == null && this.prefixText == null) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText = this.editText;
        return (editText == null || this.boxBackground == null || editText.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void showPlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText(this.placeholderText);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            applyEndIconTint();
            return;
        }
        Drawable drawableMutate = C0265a.m1821r(getEndIconDrawable()).mutate();
        C0265a.m1817n(drawableMutate, this.indicatorViewController.m24880o());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        C8900g c8900g = this.boxUnderline;
        if (c8900g != null) {
            int i2 = rect.bottom;
            c8900g.setBounds(rect.left, i2 - this.boxStrokeWidthFocusedPx, rect.right, i2);
        }
    }

    private void updateCounter() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i2, int i3, boolean z) {
        textView.setContentDescription(context.getString(z ? C8916j.f33958b : C8916j.f33957a, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private boolean updateDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrM2320a = C0330k.m2320a(this.editText);
            Drawable drawable = drawableArrM2320a[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                C0330k.m2328i(this.editText, drawable2, drawableArrM2320a[1], drawableArrM2320a[2], drawableArrM2320a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] drawableArrM2320a2 = C0330k.m2320a(this.editText);
                C0330k.m2328i(this.editText, null, drawableArrM2320a2[1], drawableArrM2320a2[2], drawableArrM2320a2[3]);
                this.startDummyDrawable = null;
                z = true;
            }
            z = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.suffixTextView.getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C0297g.m2045b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrM2320a3 = C0330k.m2320a(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 == null || this.endDummyDrawableWidth == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrM2320a3[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawableArrM2320a3[2];
                    C0330k.m2328i(this.editText, drawableArrM2320a3[0], drawableArrM2320a3[1], drawable5, drawableArrM2320a3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C0330k.m2328i(this.editText, drawableArrM2320a3[0], drawableArrM2320a3[1], this.endDummyDrawable, drawableArrM2320a3[3]);
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z;
            }
            Drawable[] drawableArrM2320a4 = C0330k.m2320a(this.editText);
            if (drawableArrM2320a4[2] == this.endDummyDrawable) {
                C0330k.m2328i(this.editText, drawableArrM2320a4[0], drawableArrM2320a4[1], this.originalEditTextEndDrawable, drawableArrM2320a4[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
        }
        return z2;
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    private void updateIconColorOnState(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable drawableMutate = C0265a.m1821r(drawable).mutate();
        C0265a.m1818o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? 0 : editText.getText().length());
    }

    private void updatePrefixTextViewPadding() {
        if (this.editText == null) {
            return;
        }
        this.prefixTextView.setPadding(isStartIconVisible() ? 0 : this.editText.getPaddingLeft(), this.editText.getCompoundPaddingTop(), this.prefixTextView.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePrefixTextVisibility() {
        this.prefixTextView.setVisibility((this.prefixText == null || isHintExpanded()) ? 8 : 0);
        updateDummyDrawables();
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void updateSuffixTextViewPadding() {
        if (this.editText == null) {
            return;
        }
        TextView textView = this.suffixTextView;
        textView.setPadding(textView.getPaddingLeft(), this.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : this.editText.getPaddingRight(), this.editText.getPaddingBottom());
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        boolean z = (this.suffixText == null || isHintExpanded()) ? false : true;
        this.suffixTextView.setVisibility(z ? 0 : 8);
        if (visibility != this.suffixTextView.getVisibility()) {
            getEndIconDelegate().mo24808c(z);
        }
        updateDummyDrawables();
    }

    public void addOnEditTextAttachedListener(InterfaceC8068f interfaceC8068f) {
        this.editTextAttachedListeners.add(interfaceC8068f);
        if (this.editText != null) {
            interfaceC8068f.mo24796a(this);
        }
    }

    public void addOnEndIconChangedListener(InterfaceC8069g interfaceC8069g) {
        this.endIconChangedListeners.add(interfaceC8069g);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    void animateToExpansionFraction(float f2) {
        if (this.collapsingTextHelper.m24654z() == f2) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(C8919a.f34371b);
            this.animator.setDuration(167L);
            this.animator.addUpdateListener(new C8066d());
        }
        this.animator.setFloatValues(this.collapsingTextHelper.m24654z(), f2);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    boolean cutoutIsOpen() {
        return cutoutEnabled() && ((C8072c) this.boxBackground).m24814l0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.originalHint == null || (editText = this.editText) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z = this.isProvidingHint;
        this.isProvidingHint = false;
        CharSequence hint = editText.getHint();
        this.editText.setHint(this.originalHint);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.editText.setHint(hint);
            this.isProvidingHint = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C8023a c8023a = this.collapsingTextHelper;
        boolean zM24640h0 = c8023a != null ? c8023a.m24640h0(drawableState) | false : false;
        if (this.editText != null) {
            updateLabelState(C0311u.m2102O(this) && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (zM24640h0) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        return editText != null ? editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop() : super.getBaseline();
    }

    C8900g getBoxBackground() {
        int i2 = this.boxBackgroundMode;
        if (i2 == 1 || i2 == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.m28297s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.m28298t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.m28275H();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.m28274G();
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public CharSequence getError() {
        if (this.indicatorViewController.m24888y()) {
            return this.indicatorViewController.m24879n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.m24878m();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.m24880o();
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.indicatorViewController.m24880o();
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.m24889z()) {
            return this.indicatorViewController.m24882q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.m24883r();
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.m24648p();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.m24650t();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.m24580a();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.m24888y();
    }

    final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.m24884s();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.m24889z();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.m24580a();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            C8024b.m24656a(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.m24634a0(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.m24627R((gravity & (-113)) | 48);
                this.collapsingTextHelper.m24633Z(gravity);
                this.collapsingTextHelper.m24624N(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.m24630V(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.m24622K();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateDummyDrawables) {
            this.editText.post(new RunnableC8065c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        setError(savedState.f30507h);
        if (savedState.f30508i) {
            this.endIconView.post(new RunnableC8064b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.m24877k()) {
            savedState.f30507h = getError();
        }
        savedState.f30508i = hasEndIcon() && this.endIconView.isChecked();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void removeOnEditTextAttachedListener(InterfaceC8068f interfaceC8068f) {
        this.editTextAttachedListeners.remove(interfaceC8068f);
    }

    public void removeOnEndIconChangedListener(InterfaceC8069g interfaceC8069g) {
        this.endIconChangedListeners.remove(interfaceC8069g);
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.boxBackgroundColor != i2) {
            this.boxBackgroundColor = i2;
            this.defaultFilledBackgroundColor = i2;
            this.focusedFilledBackgroundColor = i2;
            this.hoveredFilledBackgroundColor = i2;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(C0255a.m1675d(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i2;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCornerRadii(float f2, float f3, float f4, float f5) {
        C8900g c8900g = this.boxBackground;
        if (c8900g != null && c8900g.m28274G() == f2 && this.boxBackground.m28275H() == f3 && this.boxBackground.m28298t() == f5 && this.boxBackground.m28297s() == f4) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.m28334v().m28367z(f2).m28353D(f3).m28363v(f5).m28359r(f4).m28355m();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int i2, int i3, int i4, int i5) {
        setBoxCornerRadii(getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i3), getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i4));
    }

    public void setBoxStrokeColor(int i2) {
        if (this.focusedStrokeColor != i2) {
            this.focusedStrokeColor = i2;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.boxStrokeWidthDefaultPx = i2;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.boxStrokeWidthFocusedPx = i2;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.counterEnabled != z) {
            if (z) {
                C0190t c0190t = new C0190t(getContext());
                this.counterView = c0190t;
                c0190t.setId(C8912f.f33903D);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.m24874d(this.counterView, 2);
                C0297g.m2046c((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(C8910d.f33865S));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.m24863A(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.counterMaxLength != i2) {
            if (i2 > 0) {
                this.counterMaxLength = i2;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.counterOverflowTextAppearance != i2) {
            this.counterOverflowTextAppearance = i2;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.counterTextAppearance != i2) {
            this.counterTextAppearance = i2;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.endIconMode;
        this.endIconMode = i2;
        dispatchOnEndIconChanged(i3);
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().mo24846b(this.boxBackgroundMode)) {
            getEndIconDelegate().mo24807a();
            applyEndIconTint();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.boxBackgroundMode + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateSuffixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.m24888y()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.m24885t();
        } else {
            this.indicatorViewController.m24872N(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.m24864C(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.m24865D(z);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.errorIconTintList = colorStateList;
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = C0265a.m1821r(drawable).mutate();
            C0265a.m1818o(drawable, colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = C0265a.m1821r(drawable).mutate();
            C0265a.m1819p(drawable, mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.indicatorViewController.m24866E(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.m24867F(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.m24873O(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.m24870I(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.m24869H(z);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.indicatorViewController.m24868G(i2);
    }

    public void setHint(CharSequence charSequence) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.AbstractC0599l.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (z) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.collapsingTextHelper.m24625O(i2);
        this.focusedTextColor = this.collapsingTextHelper.m24646n();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.m24626Q(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderEnabled && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.placeholderTextAppearance = i2;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            C0330k.m2333n(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updatePrefixTextVisibility();
    }

    public void setPrefixTextAppearance(int i2) {
        C0330k.m2333n(this.prefixTextView, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i2) {
        C0330k.m2333n(this.suffixTextView, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void setTextAppearanceCompatWithErrorFallback(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C0330k.m2333n(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = p241e.p254e.p256b.p271c.C8917k.f33977b
            androidx.core.widget.C0330k.m2333n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = p241e.p254e.p256b.p271c.C8909c.f33838b
            int r4 = androidx.core.content.C0255a.m1675d(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setTextAppearanceCompatWithErrorFallback(android.widget.TextView, int):void");
    }

    public void setTextInputAccessibilityDelegate(C8067e c8067e) {
        EditText editText = this.editText;
        if (editText != null) {
            C0311u.m2131i0(editText, c8067e);
        }
    }

    public void setTypeface(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.m24644k0(typeface);
            this.indicatorViewController.m24871K(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0200y.m1234a(background)) {
            background = background.mutate();
        }
        if (this.indicatorViewController.m24877k()) {
            background.setColorFilter(C0166h.m1009e(this.indicatorViewController.m24880o(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(C0166h.m1009e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C0265a.m1806c(background);
            this.editText.refreshDrawableState();
        }
    }

    void updateLabelState(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        updateLabelState(z, false);
    }

    void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (this.indicatorViewController.m24877k()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z2, z3);
            } else {
                this.boxStrokeColor = this.indicatorViewController.m24880o();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z2) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z3) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z2, z3);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.indicatorViewController.m24888y() && this.indicatorViewController.m24877k()) {
            z = true;
        }
        setErrorIconVisible(z);
        updateIconColorOnState(this.errorIconView, this.errorIconTintList);
        updateIconColorOnState(this.startIconView, this.startIconTintList);
        updateIconColorOnState(this.endIconView, this.endIconTintList);
        if (getEndIconDelegate().mo24847d()) {
            tintEndIconOnError(this.indicatorViewController.m24877k());
        }
        if (z2 && isEnabled()) {
            this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
        } else {
            this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z3 && !z2) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z2) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33808I);
    }

    private void updateLabelState(boolean z, boolean z2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zM24877k = this.indicatorViewController.m24877k();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.m24626Q(colorStateList2);
            this.collapsingTextHelper.m24632Y(this.defaultHintTextColor);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor;
            this.collapsingTextHelper.m24626Q(ColorStateList.valueOf(colorForState));
            this.collapsingTextHelper.m24632Y(ColorStateList.valueOf(colorForState));
        } else if (zM24877k) {
            this.collapsingTextHelper.m24626Q(this.indicatorViewController.m24881p());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.m24626Q(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.m24626Q(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || zM24877k))) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(int i2) {
        if (i2 != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.indicatorViewController.m24888y());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            applyStartIconTint();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, Resources.NotFoundException, SecurityException, ClassNotFoundException {
        int i3;
        int i4 = DEF_STYLE_RES;
        super(C8079a.m24906c(context, attributeSet, i2, i4), attributeSet, i2);
        this.indicatorViewController = new C8075f(this);
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        this.endIconMode = 0;
        this.endIconDelegates = new SparseArray<>();
        this.endIconChangedListeners = new LinkedHashSet<>();
        C8023a c8023a = new C8023a(this);
        this.collapsingTextHelper = c8023a;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.startLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.endLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.endIconFrame = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = C8919a.f34370a;
        c8023a.m24643j0(timeInterpolator);
        c8023a.m24639g0(timeInterpolator);
        c8023a.m24627R(8388659);
        int[] iArr = C8918l.f34096N4;
        int i5 = C8918l.f34236g5;
        int i6 = C8918l.f34220e5;
        int i7 = C8918l.f34327t5;
        int i8 = C8918l.f34355x5;
        int i9 = C8918l.f34013B5;
        C0185q0 c0185q0M24695i = C8032j.m24695i(context2, attributeSet, iArr, i2, i4, i5, i6, i7, i8, i9);
        this.hintEnabled = c0185q0M24695i.m1092a(C8918l.f34006A5, true);
        setHint(c0185q0M24695i.m1107p(C8918l.f34117Q4));
        this.hintAnimationEnabled = c0185q0M24695i.m1092a(C8918l.f34369z5, true);
        this.shapeAppearanceModel = C8904k.m28317e(context2, attributeSet, i2, i4).m28355m();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(C8910d.f33862P);
        this.boxCollapsedPaddingTopPx = c0185q0M24695i.m1096e(C8918l.f34138T4, 0);
        this.boxStrokeWidthDefaultPx = c0185q0M24695i.m1097f(C8918l.f34188a5, context2.getResources().getDimensionPixelSize(C8910d.f33863Q));
        this.boxStrokeWidthFocusedPx = c0185q0M24695i.m1097f(C8918l.f34196b5, context2.getResources().getDimensionPixelSize(C8910d.f33864R));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float fM1095d = c0185q0M24695i.m1095d(C8918l.f34166X4, -1.0f);
        float fM1095d2 = c0185q0M24695i.m1095d(C8918l.f34159W4, -1.0f);
        float fM1095d3 = c0185q0M24695i.m1095d(C8918l.f34145U4, -1.0f);
        float fM1095d4 = c0185q0M24695i.m1095d(C8918l.f34152V4, -1.0f);
        C8904k.b bVarM28334v = this.shapeAppearanceModel.m28334v();
        if (fM1095d >= 0.0f) {
            bVarM28334v.m28367z(fM1095d);
        }
        if (fM1095d2 >= 0.0f) {
            bVarM28334v.m28353D(fM1095d2);
        }
        if (fM1095d3 >= 0.0f) {
            bVarM28334v.m28363v(fM1095d3);
        }
        if (fM1095d4 >= 0.0f) {
            bVarM28334v.m28359r(fM1095d4);
        }
        this.shapeAppearanceModel = bVarM28334v.m28355m();
        ColorStateList colorStateListM28500b = C8947c.m28500b(context2, c0185q0M24695i, C8918l.f34124R4);
        if (colorStateListM28500b != null) {
            int defaultColor = colorStateListM28500b.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateListM28500b.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateListM28500b.getColorForState(new int[]{-16842910}, -1);
                i3 = 2;
                this.focusedFilledBackgroundColor = colorStateListM28500b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateListM28500b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                i3 = 2;
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateListM5261c = C0833a.m5261c(context2, C8909c.f33843g);
                this.disabledFilledBackgroundColor = colorStateListM5261c.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateListM5261c.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            i3 = 2;
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        int i10 = C8918l.f34110P4;
        if (c0185q0M24695i.m1110s(i10)) {
            ColorStateList colorStateListM1094c = c0185q0M24695i.m1094c(i10);
            this.focusedTextColor = colorStateListM1094c;
            this.defaultHintTextColor = colorStateListM1094c;
        }
        int i11 = C8918l.f34173Y4;
        ColorStateList colorStateListM28500b2 = C8947c.m28500b(context2, c0185q0M24695i, i11);
        this.focusedStrokeColor = c0185q0M24695i.m1093b(i11, 0);
        this.defaultStrokeColor = C0255a.m1675d(context2, C8909c.f33844h);
        this.disabledColor = C0255a.m1675d(context2, C8909c.f33845i);
        this.hoveredStrokeColor = C0255a.m1675d(context2, C8909c.f33846j);
        if (colorStateListM28500b2 != null) {
            setBoxStrokeColorStateList(colorStateListM28500b2);
        }
        int i12 = C8918l.f34180Z4;
        if (c0185q0M24695i.m1110s(i12)) {
            setBoxStrokeErrorColor(C8947c.m28500b(context2, c0185q0M24695i, i12));
        }
        if (c0185q0M24695i.m1105n(i9, -1) != -1) {
            setHintTextAppearance(c0185q0M24695i.m1105n(i9, 0));
        }
        int iM1105n = c0185q0M24695i.m1105n(i7, 0);
        CharSequence charSequenceM1107p = c0185q0M24695i.m1107p(C8918l.f34292o5);
        boolean zM1092a = c0185q0M24695i.m1092a(C8918l.f34299p5, false);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i13 = C8914h.f33944f;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i13, (ViewGroup) linearLayout2, false);
        this.errorIconView = checkableImageButton;
        checkableImageButton.setVisibility(8);
        int i14 = C8918l.f34306q5;
        if (c0185q0M24695i.m1110s(i14)) {
            setErrorIconDrawable(c0185q0M24695i.m1098g(i14));
        }
        int i15 = C8918l.f34313r5;
        if (c0185q0M24695i.m1110s(i15)) {
            setErrorIconTintList(C8947c.m28500b(context2, c0185q0M24695i, i15));
        }
        int i16 = C8918l.f34320s5;
        if (c0185q0M24695i.m1110s(i16)) {
            setErrorIconTintMode(C8033k.m24700e(c0185q0M24695i.m1102k(i16, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(C8916j.f33961e));
        C0311u.m2153t0(checkableImageButton, i3);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iM1105n2 = c0185q0M24695i.m1105n(i8, 0);
        boolean zM1092a2 = c0185q0M24695i.m1092a(C8918l.f34348w5, false);
        CharSequence charSequenceM1107p2 = c0185q0M24695i.m1107p(C8918l.f34341v5);
        int iM1105n3 = c0185q0M24695i.m1105n(C8918l.f34069J5, 0);
        CharSequence charSequenceM1107p3 = c0185q0M24695i.m1107p(C8918l.f34062I5);
        int iM1105n4 = c0185q0M24695i.m1105n(C8918l.f34090M5, 0);
        CharSequence charSequenceM1107p4 = c0185q0M24695i.m1107p(C8918l.f34083L5);
        int iM1105n5 = c0185q0M24695i.m1105n(C8918l.f34146U5, 0);
        CharSequence charSequenceM1107p5 = c0185q0M24695i.m1107p(C8918l.f34139T5);
        boolean zM1092a3 = c0185q0M24695i.m1092a(C8918l.f34204c5, false);
        setCounterMaxLength(c0185q0M24695i.m1102k(C8918l.f34212d5, -1));
        this.counterTextAppearance = c0185q0M24695i.m1105n(i5, 0);
        this.counterOverflowTextAppearance = c0185q0M24695i.m1105n(i6, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C8914h.f33945g, (ViewGroup) this.startLayout, false);
        this.startIconView = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i17 = C8918l.f34118Q5;
        if (c0185q0M24695i.m1110s(i17)) {
            setStartIconDrawable(c0185q0M24695i.m1098g(i17));
            int i18 = C8918l.f34111P5;
            if (c0185q0M24695i.m1110s(i18)) {
                setStartIconContentDescription(c0185q0M24695i.m1107p(i18));
            }
            setStartIconCheckable(c0185q0M24695i.m1092a(C8918l.f34104O5, true));
        }
        int i19 = C8918l.f34125R5;
        if (c0185q0M24695i.m1110s(i19)) {
            setStartIconTintList(C8947c.m28500b(context2, c0185q0M24695i, i19));
        }
        int i20 = C8918l.f34132S5;
        if (c0185q0M24695i.m1110s(i20)) {
            setStartIconTintMode(C8033k.m24700e(c0185q0M24695i.m1102k(i20, -1), null));
        }
        setBoxBackgroundMode(c0185q0M24695i.m1102k(C8918l.f34131S4, 0));
        this.endIconView = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i13, (ViewGroup) this.endIconFrame, false);
        this.endIconFrame.addView(this.endIconView);
        this.endIconView.setVisibility(8);
        this.endIconDelegates.append(-1, new C8071b(this));
        this.endIconDelegates.append(0, new C8077h(this));
        this.endIconDelegates.append(1, new C8078i(this));
        this.endIconDelegates.append(2, new C8070a(this));
        this.endIconDelegates.append(3, new C8073d(this));
        int i21 = C8918l.f34271l5;
        if (c0185q0M24695i.m1110s(i21)) {
            setEndIconMode(c0185q0M24695i.m1102k(i21, 0));
            int i22 = C8918l.f34264k5;
            if (c0185q0M24695i.m1110s(i22)) {
                setEndIconDrawable(c0185q0M24695i.m1098g(i22));
            }
            int i23 = C8918l.f34257j5;
            if (c0185q0M24695i.m1110s(i23)) {
                setEndIconContentDescription(c0185q0M24695i.m1107p(i23));
            }
            setEndIconCheckable(c0185q0M24695i.m1092a(C8918l.f34250i5, true));
        } else {
            int i24 = C8918l.f34041F5;
            if (c0185q0M24695i.m1110s(i24)) {
                setEndIconMode(c0185q0M24695i.m1092a(i24, false) ? 1 : 0);
                setEndIconDrawable(c0185q0M24695i.m1098g(C8918l.f34034E5));
                setEndIconContentDescription(c0185q0M24695i.m1107p(C8918l.f34027D5));
                int i25 = C8918l.f34048G5;
                if (c0185q0M24695i.m1110s(i25)) {
                    setEndIconTintList(C8947c.m28500b(context2, c0185q0M24695i, i25));
                }
                int i26 = C8918l.f34055H5;
                if (c0185q0M24695i.m1110s(i26)) {
                    setEndIconTintMode(C8033k.m24700e(c0185q0M24695i.m1102k(i26, -1), null));
                }
            }
        }
        if (!c0185q0M24695i.m1110s(C8918l.f34041F5)) {
            int i27 = C8918l.f34278m5;
            if (c0185q0M24695i.m1110s(i27)) {
                setEndIconTintList(C8947c.m28500b(context2, c0185q0M24695i, i27));
            }
            int i28 = C8918l.f34285n5;
            if (c0185q0M24695i.m1110s(i28)) {
                setEndIconTintMode(C8033k.m24700e(c0185q0M24695i.m1102k(i28, -1), null));
            }
        }
        C0190t c0190t = new C0190t(context2);
        this.prefixTextView = c0190t;
        c0190t.setId(C8912f.f33907H);
        c0190t.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        C0311u.m2135k0(c0190t, 1);
        this.startLayout.addView(this.startIconView);
        this.startLayout.addView(c0190t);
        C0190t c0190t2 = new C0190t(context2);
        this.suffixTextView = c0190t2;
        c0190t2.setId(C8912f.f33908I);
        c0190t2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        C0311u.m2135k0(c0190t2, 1);
        this.endLayout.addView(c0190t2);
        this.endLayout.addView(this.errorIconView);
        this.endLayout.addView(this.endIconFrame);
        setHelperTextEnabled(zM1092a2);
        setHelperText(charSequenceM1107p2);
        setHelperTextTextAppearance(iM1105n2);
        setErrorEnabled(zM1092a);
        setErrorTextAppearance(iM1105n);
        setErrorContentDescription(charSequenceM1107p);
        setCounterTextAppearance(this.counterTextAppearance);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setPlaceholderText(charSequenceM1107p3);
        setPlaceholderTextAppearance(iM1105n3);
        setPrefixText(charSequenceM1107p4);
        setPrefixTextAppearance(iM1105n4);
        setSuffixText(charSequenceM1107p5);
        setSuffixTextAppearance(iM1105n5);
        int i29 = C8918l.f34334u5;
        if (c0185q0M24695i.m1110s(i29)) {
            setErrorTextColor(c0185q0M24695i.m1094c(i29));
        }
        int i30 = C8918l.f34362y5;
        if (c0185q0M24695i.m1110s(i30)) {
            setHelperTextColor(c0185q0M24695i.m1094c(i30));
        }
        int i31 = C8918l.f34020C5;
        if (c0185q0M24695i.m1110s(i31)) {
            setHintTextColor(c0185q0M24695i.m1094c(i31));
        }
        int i32 = C8918l.f34243h5;
        if (c0185q0M24695i.m1110s(i32)) {
            setCounterTextColor(c0185q0M24695i.m1094c(i32));
        }
        int i33 = C8918l.f34228f5;
        if (c0185q0M24695i.m1110s(i33)) {
            setCounterOverflowTextColor(c0185q0M24695i.m1094c(i33));
        }
        int i34 = C8918l.f34076K5;
        if (c0185q0M24695i.m1110s(i34)) {
            setPlaceholderTextColor(c0185q0M24695i.m1094c(i34));
        }
        int i35 = C8918l.f34097N5;
        if (c0185q0M24695i.m1110s(i35)) {
            setPrefixTextColor(c0185q0M24695i.m1094c(i35));
        }
        int i36 = C8918l.f34153V5;
        if (c0185q0M24695i.m1110s(i36)) {
            setSuffixTextColor(c0185q0M24695i.m1094c(i36));
        }
        setCounterEnabled(zM1092a3);
        setEnabled(c0185q0M24695i.m1092a(C8918l.f34103O4, true));
        c0185q0M24695i.m1111w();
        C0311u.m2153t0(this, 2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    void updateCounter(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean z = this.counterOverflowed;
        int i3 = this.counterMaxLength;
        if (i3 == -1) {
            this.counterView.setText(String.valueOf(i2));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = i2 > i3;
            updateCounterContentDescription(getContext(), this.counterView, i2, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(C0945a.m6011c().m6018j(getContext().getString(C8916j.f33959c, Integer.valueOf(i2), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }
}
