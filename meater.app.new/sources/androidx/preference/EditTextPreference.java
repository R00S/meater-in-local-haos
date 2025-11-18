package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.core.content.p003d.C0264g;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: b0 */
    private String f3544b0;

    /* renamed from: c0 */
    private InterfaceC0535a f3545c0;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public interface InterfaceC0535a {
        /* renamed from: a */
        void m3954a(EditText editText);
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    public static final class C0536b implements Preference.InterfaceC0546f<EditTextPreference> {

        /* renamed from: a */
        private static C0536b f3547a;

        private C0536b() {
        }

        /* renamed from: b */
        public static C0536b m3955b() {
            if (f3547a == null) {
                f3547a = new C0536b();
            }
            return f3547a;
        }

        @Override // androidx.preference.Preference.InterfaceC0546f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3956a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.m3946g1()) ? editTextPreference.m3987D().getString(C0574r.f3750c) : editTextPreference.m3946g1();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3805R, i2, i3);
        int i4 = C0576t.f3808S;
        if (C0264g.m1767b(typedArrayObtainStyledAttributes, i4, i4, false)) {
            m4011Q0(C0536b.m3955b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: U0 */
    public boolean mo3944U0() {
        return TextUtils.isEmpty(this.f3544b0) || super.mo3944U0();
    }

    /* renamed from: f1 */
    InterfaceC0535a m3945f1() {
        return this.f3545c0;
    }

    /* renamed from: g1 */
    public String m3946g1() {
        return this.f3544b0;
    }

    /* renamed from: h1 */
    public void m3947h1(String str) {
        boolean zMo3944U0 = mo3944U0();
        this.f3544b0 = str;
        m3985A0(str);
        boolean zMo3944U02 = mo3944U0();
        if (zMo3944U02 != zMo3944U0) {
            mo4028f0(zMo3944U02);
        }
        mo3942e0();
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
        m3947h1(savedState.f3546f);
    }

    @Override // androidx.preference.Preference
    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        Parcelable parcelableMo3950t0 = super.mo3950t0();
        if (m4025b0()) {
            return parcelableMo3950t0;
        }
        SavedState savedState = new SavedState(parcelableMo3950t0);
        savedState.f3546f = m3946g1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: u0 */
    protected void mo3951u0(Object obj) {
        m3947h1(m4009P((String) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0534a();

        /* renamed from: f */
        String f3546f;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$a */
        static class C0534a implements Parcelable.Creator<SavedState> {
            C0534a() {
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
            this.f3546f = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f3546f);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3727e, R.attr.editTextPreferenceStyle));
    }
}
