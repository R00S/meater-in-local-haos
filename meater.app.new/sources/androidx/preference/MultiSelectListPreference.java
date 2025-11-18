package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0264g;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: b0 */
    private CharSequence[] f3555b0;

    /* renamed from: c0 */
    private CharSequence[] f3556c0;

    /* renamed from: d0 */
    private Set<String> f3557d0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3557d0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3863j0, i2, i3);
        this.f3555b0 = C0264g.m1782q(typedArrayObtainStyledAttributes, C0576t.f3872m0, C0576t.f3866k0);
        this.f3556c0 = C0264g.m1782q(typedArrayObtainStyledAttributes, C0576t.f3875n0, C0576t.f3869l0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f1 */
    public CharSequence[] m3971f1() {
        return this.f3555b0;
    }

    /* renamed from: g1 */
    public CharSequence[] m3972g1() {
        return this.f3556c0;
    }

    /* renamed from: h1 */
    public Set<String> m3973h1() {
        return this.f3557d0;
    }

    /* renamed from: i1 */
    public void m3974i1(Set<String> set) {
        this.f3557d0.clear();
        this.f3557d0.addAll(set);
        m3986B0(set);
        mo3942e0();
    }

    @Override // androidx.preference.Preference
    /* renamed from: o0 */
    protected Object mo3948o0(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        m3974i1(savedState.f3558f);
    }

    @Override // androidx.preference.Preference
    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        Parcelable parcelableMo3950t0 = super.mo3950t0();
        if (m4025b0()) {
            return parcelableMo3950t0;
        }
        SavedState savedState = new SavedState(parcelableMo3950t0);
        savedState.f3558f = m3973h1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: u0 */
    protected void mo3951u0(Object obj) {
        m3974i1(m4010Q((Set) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0539a();

        /* renamed from: f */
        Set<String> f3558f;

        /* renamed from: androidx.preference.MultiSelectListPreference$SavedState$a */
        static class C0539a implements Parcelable.Creator<SavedState> {
            C0539a() {
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
            int i2 = parcel.readInt();
            this.f3558f = new HashSet();
            String[] strArr = new String[i2];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f3558f, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3558f.size());
            Set<String> set = this.f3558f;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3725c, R.attr.dialogPreferenceStyle));
    }
}
