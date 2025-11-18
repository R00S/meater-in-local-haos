package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p003d.C0264g;
import androidx.preference.Preference;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: b0 */
    private CharSequence[] f3548b0;

    /* renamed from: c0 */
    private CharSequence[] f3549c0;

    /* renamed from: d0 */
    private String f3550d0;

    /* renamed from: e0 */
    private String f3551e0;

    /* renamed from: f0 */
    private boolean f3552f0;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C0538a implements Preference.InterfaceC0546f<ListPreference> {

        /* renamed from: a */
        private static C0538a f3554a;

        private C0538a() {
        }

        /* renamed from: b */
        public static C0538a m3969b() {
            if (f3554a == null) {
                f3554a = new C0538a();
            }
            return f3554a;
        }

        @Override // androidx.preference.Preference.InterfaceC0546f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3956a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.m3963h1()) ? listPreference.m3987D().getString(C0574r.f3750c) : listPreference.m3963h1();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3833a0, i2, i3);
        this.f3548b0 = C0264g.m1782q(typedArrayObtainStyledAttributes, C0576t.f3845d0, C0576t.f3837b0);
        this.f3549c0 = C0264g.m1782q(typedArrayObtainStyledAttributes, C0576t.f3848e0, C0576t.f3841c0);
        int i4 = C0576t.f3851f0;
        if (C0264g.m1767b(typedArrayObtainStyledAttributes, i4, i4, false)) {
            m4011Q0(C0538a.m3969b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0576t.f3884q0, i2, i3);
        this.f3551e0 = C0264g.m1780o(typedArrayObtainStyledAttributes2, C0576t.f3827Y0, C0576t.f3908y0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: k1 */
    private int m3958k1() {
        return m3961f1(this.f3550d0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: P0 */
    public void mo3959P0(CharSequence charSequence) {
        super.mo3959P0(charSequence);
        if (charSequence == null && this.f3551e0 != null) {
            this.f3551e0 = null;
        } else {
            if (charSequence == null || charSequence.equals(this.f3551e0)) {
                return;
            }
            this.f3551e0 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: U */
    public CharSequence mo3960U() {
        if (m4018V() != null) {
            return m4018V().mo3956a(this);
        }
        CharSequence charSequenceM3963h1 = m3963h1();
        CharSequence charSequenceMo3960U = super.mo3960U();
        String str = this.f3551e0;
        if (str == null) {
            return charSequenceMo3960U;
        }
        Object[] objArr = new Object[1];
        if (charSequenceM3963h1 == null) {
            charSequenceM3963h1 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[0] = charSequenceM3963h1;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceMo3960U)) {
            return charSequenceMo3960U;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    /* renamed from: f1 */
    public int m3961f1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f3549c0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f3549c0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: g1 */
    public CharSequence[] m3962g1() {
        return this.f3548b0;
    }

    /* renamed from: h1 */
    public CharSequence m3963h1() {
        CharSequence[] charSequenceArr;
        int iM3958k1 = m3958k1();
        if (iM3958k1 < 0 || (charSequenceArr = this.f3548b0) == null) {
            return null;
        }
        return charSequenceArr[iM3958k1];
    }

    /* renamed from: i1 */
    public CharSequence[] m3964i1() {
        return this.f3549c0;
    }

    /* renamed from: j1 */
    public String m3965j1() {
        return this.f3550d0;
    }

    /* renamed from: l1 */
    public void m3966l1(String str) {
        boolean z = !TextUtils.equals(this.f3550d0, str);
        if (z || !this.f3552f0) {
            this.f3550d0 = str;
            this.f3552f0 = true;
            m3985A0(str);
            if (z) {
                mo3942e0();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: o0 */
    protected Object mo3948o0(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    /* renamed from: s0 */
    protected void mo3949s0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo3949s0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3949s0(savedState.getSuperState());
        m3966l1(savedState.f3553f);
    }

    @Override // androidx.preference.Preference
    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        Parcelable parcelableMo3950t0 = super.mo3950t0();
        if (m4025b0()) {
            return parcelableMo3950t0;
        }
        SavedState savedState = new SavedState(parcelableMo3950t0);
        savedState.f3553f = m3965j1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: u0 */
    protected void mo3951u0(Object obj) {
        m3966l1(m4009P((String) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0537a();

        /* renamed from: f */
        String f3553f;

        /* renamed from: androidx.preference.ListPreference$SavedState$a */
        static class C0537a implements Parcelable.Creator<SavedState> {
            C0537a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3553f = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f3553f);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3725c, R.attr.dialogPreferenceStyle));
    }
}
