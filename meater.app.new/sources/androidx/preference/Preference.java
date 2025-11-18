package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.p003d.C0264g;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.preference.C0566j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p024c.p025a.p026k.p027a.C0833a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private Object f3559A;

    /* renamed from: B */
    private boolean f3560B;

    /* renamed from: C */
    private boolean f3561C;

    /* renamed from: D */
    private boolean f3562D;

    /* renamed from: E */
    private boolean f3563E;

    /* renamed from: F */
    private boolean f3564F;

    /* renamed from: G */
    private boolean f3565G;

    /* renamed from: H */
    private boolean f3566H;

    /* renamed from: I */
    private boolean f3567I;

    /* renamed from: J */
    private boolean f3568J;

    /* renamed from: K */
    private boolean f3569K;

    /* renamed from: L */
    private int f3570L;

    /* renamed from: M */
    private int f3571M;

    /* renamed from: N */
    private InterfaceC0542b f3572N;

    /* renamed from: O */
    private List<Preference> f3573O;

    /* renamed from: P */
    private PreferenceGroup f3574P;

    /* renamed from: Q */
    private boolean f3575Q;

    /* renamed from: R */
    private boolean f3576R;

    /* renamed from: S */
    private ViewOnCreateContextMenuListenerC0545e f3577S;

    /* renamed from: T */
    private InterfaceC0546f f3578T;

    /* renamed from: U */
    private final View.OnClickListener f3579U;

    /* renamed from: f */
    private Context f3580f;

    /* renamed from: g */
    private C0566j f3581g;

    /* renamed from: h */
    private AbstractC0561e f3582h;

    /* renamed from: i */
    private long f3583i;

    /* renamed from: j */
    private boolean f3584j;

    /* renamed from: k */
    private InterfaceC0543c f3585k;

    /* renamed from: l */
    private InterfaceC0544d f3586l;

    /* renamed from: m */
    private int f3587m;

    /* renamed from: n */
    private int f3588n;

    /* renamed from: o */
    private CharSequence f3589o;

    /* renamed from: p */
    private CharSequence f3590p;

    /* renamed from: q */
    private int f3591q;

    /* renamed from: r */
    private Drawable f3592r;

    /* renamed from: s */
    private String f3593s;

    /* renamed from: t */
    private Intent f3594t;

    /* renamed from: u */
    private String f3595u;

    /* renamed from: v */
    private Bundle f3596v;

    /* renamed from: w */
    private boolean f3597w;

    /* renamed from: x */
    private boolean f3598x;

    /* renamed from: y */
    private boolean f3599y;

    /* renamed from: z */
    private String f3600z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C0540a();

        /* renamed from: androidx.preference.Preference$BaseSavedState$a */
        static class C0540a implements Parcelable.Creator<BaseSavedState> {
            C0540a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i2) {
                return new BaseSavedState[i2];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$a */
    class ViewOnClickListenerC0541a implements View.OnClickListener {
        ViewOnClickListenerC0541a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.mo3932x0(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    interface InterfaceC0542b {
        /* renamed from: a */
        void mo4050a(Preference preference);

        /* renamed from: b */
        void mo4051b(Preference preference);

        /* renamed from: e */
        void mo4052e(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface InterfaceC0543c {
        /* renamed from: a */
        boolean m4053a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface InterfaceC0544d {
        boolean onPreferenceClick(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    private static class ViewOnCreateContextMenuListenerC0545e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private final Preference f3602f;

        ViewOnCreateContextMenuListenerC0545e(Preference preference) {
            this.f3602f = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceMo3960U = this.f3602f.mo3960U();
            if (!this.f3602f.m4023Z() || TextUtils.isEmpty(charSequenceMo3960U)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceMo3960U);
            contextMenu.add(0, 0, 0, C0574r.f3748a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f3602f.m3987D().getSystemService("clipboard");
            CharSequence charSequenceMo3960U = this.f3602f.mo3960U();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo3960U));
            Toast.makeText(this.f3602f.m3987D(), this.f3602f.m3987D().getString(C0574r.f3751d, charSequenceMo3960U), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$f */
    public interface InterfaceC0546f<T extends Preference> {
        /* renamed from: a */
        CharSequence mo3956a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f3587m = Integer.MAX_VALUE;
        this.f3588n = 0;
        this.f3597w = true;
        this.f3598x = true;
        this.f3599y = true;
        this.f3560B = true;
        this.f3561C = true;
        this.f3562D = true;
        this.f3563E = true;
        this.f3564F = true;
        this.f3566H = true;
        this.f3569K = true;
        int i4 = C0573q.f3745b;
        this.f3570L = i4;
        this.f3579U = new ViewOnClickListenerC0541a();
        this.f3580f = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3884q0, i2, i3);
        this.f3591q = C0264g.m1779n(typedArrayObtainStyledAttributes, C0576t.f3797O0, C0576t.f3887r0, 0);
        this.f3593s = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3806R0, C0576t.f3905x0);
        this.f3589o = C0264g.m1781p(typedArrayObtainStyledAttributes, C0576t.f3830Z0, C0576t.f3899v0);
        this.f3590p = C0264g.m1781p(typedArrayObtainStyledAttributes, C0576t.f3827Y0, C0576t.f3908y0);
        this.f3587m = C0264g.m1769d(typedArrayObtainStyledAttributes, C0576t.f3812T0, C0576t.f3911z0, Integer.MAX_VALUE);
        this.f3595u = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3794N0, C0576t.f3767E0);
        this.f3570L = C0264g.m1779n(typedArrayObtainStyledAttributes, C0576t.f3809S0, C0576t.f3896u0, i4);
        this.f3571M = C0264g.m1779n(typedArrayObtainStyledAttributes, C0576t.f3834a1, C0576t.f3755A0, 0);
        this.f3597w = C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3791M0, C0576t.f3893t0, true);
        this.f3598x = C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3818V0, C0576t.f3902w0, true);
        this.f3599y = C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3815U0, C0576t.f3890s0, true);
        this.f3600z = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3785K0, C0576t.f3758B0);
        int i5 = C0576t.f3776H0;
        this.f3563E = C0264g.m1767b(typedArrayObtainStyledAttributes, i5, i5, this.f3598x);
        int i6 = C0576t.f3779I0;
        this.f3564F = C0264g.m1767b(typedArrayObtainStyledAttributes, i6, i6, this.f3598x);
        int i7 = C0576t.f3782J0;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.f3559A = mo3948o0(typedArrayObtainStyledAttributes, i7);
        } else {
            int i8 = C0576t.f3761C0;
            if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                this.f3559A = mo3948o0(typedArrayObtainStyledAttributes, i8);
            }
        }
        this.f3569K = C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3821W0, C0576t.f3764D0, true);
        int i9 = C0576t.f3824X0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i9);
        this.f3565G = zHasValue;
        if (zHasValue) {
            this.f3566H = C0264g.m1767b(typedArrayObtainStyledAttributes, i9, C0576t.f3770F0, true);
        }
        this.f3567I = C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3800P0, C0576t.f3773G0, false);
        int i10 = C0576t.f3803Q0;
        this.f3562D = C0264g.m1767b(typedArrayObtainStyledAttributes, i10, i10, true);
        int i11 = C0576t.f3788L0;
        this.f3568J = C0264g.m1767b(typedArrayObtainStyledAttributes, i11, i11, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: C0 */
    private void m3977C0() {
        if (TextUtils.isEmpty(this.f3600z)) {
            return;
        }
        Preference preferenceM3984A = m3984A(this.f3600z);
        if (preferenceM3984A != null) {
            preferenceM3984A.m3978D0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f3600z + "\" not found for preference \"" + this.f3593s + "\" (title: \"" + ((Object) this.f3589o) + "\"");
    }

    /* renamed from: D0 */
    private void m3978D0(Preference preference) {
        if (this.f3573O == null) {
            this.f3573O = new ArrayList();
        }
        this.f3573O.add(preference);
        preference.m4035m0(this, mo3944U0());
    }

    /* renamed from: H0 */
    private void m3979H0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m3979H0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: W0 */
    private void m3980W0(SharedPreferences.Editor editor) {
        if (this.f3581g.m4158r()) {
            editor.apply();
        }
    }

    /* renamed from: X0 */
    private void m3981X0() {
        Preference preferenceM3984A;
        String str = this.f3600z;
        if (str == null || (preferenceM3984A = m3984A(str)) == null) {
            return;
        }
        preferenceM3984A.m3982Y0(this);
    }

    /* renamed from: Y0 */
    private void m3982Y0(Preference preference) {
        List<Preference> list = this.f3573O;
        if (list != null) {
            list.remove(preference);
        }
    }

    /* renamed from: y */
    private void m3983y() {
        if (m4012R() != null) {
            m4043v0(true, this.f3559A);
            return;
        }
        if (m4019V0() && m4016T().contains(this.f3593s)) {
            m4043v0(true, null);
            return;
        }
        Object obj = this.f3559A;
        if (obj != null) {
            m4043v0(false, obj);
        }
    }

    /* renamed from: A */
    protected <T extends Preference> T m3984A(String str) {
        C0566j c0566j = this.f3581g;
        if (c0566j == null) {
            return null;
        }
        return (T) c0566j.m4143a(str);
    }

    /* renamed from: A0 */
    protected boolean m3985A0(String str) {
        if (!m4019V0()) {
            return false;
        }
        if (TextUtils.equals(str, m4009P(null))) {
            return true;
        }
        if (m4012R() != null) {
            throw null;
        }
        SharedPreferences.Editor editorM4144c = this.f3581g.m4144c();
        editorM4144c.putString(this.f3593s, str);
        m3980W0(editorM4144c);
        return true;
    }

    /* renamed from: B0 */
    public boolean m3986B0(Set<String> set) {
        if (!m4019V0()) {
            return false;
        }
        if (set.equals(m4010Q(null))) {
            return true;
        }
        if (m4012R() != null) {
            throw null;
        }
        SharedPreferences.Editor editorM4144c = this.f3581g.m4144c();
        editorM4144c.putStringSet(this.f3593s, set);
        m3980W0(editorM4144c);
        return true;
    }

    /* renamed from: D */
    public Context m3987D() {
        return this.f3580f;
    }

    /* renamed from: E */
    public Bundle m3988E() {
        if (this.f3596v == null) {
            this.f3596v = new Bundle();
        }
        return this.f3596v;
    }

    /* renamed from: E0 */
    public void m3989E0(Bundle bundle) {
        mo4042v(bundle);
    }

    /* renamed from: F */
    StringBuilder m3990F() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceM4020W = m4020W();
        if (!TextUtils.isEmpty(charSequenceM4020W)) {
            sb.append(charSequenceM4020W);
            sb.append(' ');
        }
        CharSequence charSequenceMo3960U = mo3960U();
        if (!TextUtils.isEmpty(charSequenceMo3960U)) {
            sb.append(charSequenceMo3960U);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: F0 */
    public void m3991F0(Bundle bundle) {
        mo4045x(bundle);
    }

    /* renamed from: G */
    public String m3992G() {
        return this.f3595u;
    }

    /* renamed from: G0 */
    public void m3993G0(boolean z) {
        if (this.f3597w != z) {
            this.f3597w = z;
            mo4028f0(mo3944U0());
            mo3942e0();
        }
    }

    /* renamed from: H */
    long mo3994H() {
        return this.f3583i;
    }

    /* renamed from: I */
    public Intent m3995I() {
        return this.f3594t;
    }

    /* renamed from: I0 */
    public void m3996I0(int i2) {
        m3998J0(C0833a.m5262d(this.f3580f, i2));
        this.f3591q = i2;
    }

    /* renamed from: J */
    public String m3997J() {
        return this.f3593s;
    }

    /* renamed from: J0 */
    public void m3998J0(Drawable drawable) {
        if (this.f3592r != drawable) {
            this.f3592r = drawable;
            this.f3591q = 0;
            mo3942e0();
        }
    }

    /* renamed from: K */
    public final int m3999K() {
        return this.f3570L;
    }

    /* renamed from: K0 */
    public void m4000K0(Intent intent) {
        this.f3594t = intent;
    }

    /* renamed from: L */
    public int m4001L() {
        return this.f3587m;
    }

    /* renamed from: L0 */
    public void m4002L0(int i2) {
        this.f3570L = i2;
    }

    /* renamed from: M */
    public PreferenceGroup m4003M() {
        return this.f3574P;
    }

    /* renamed from: M0 */
    final void m4004M0(InterfaceC0542b interfaceC0542b) {
        this.f3572N = interfaceC0542b;
    }

    /* renamed from: N */
    protected boolean m4005N(boolean z) {
        if (!m4019V0()) {
            return z;
        }
        if (m4012R() == null) {
            return this.f3581g.m4151j().getBoolean(this.f3593s, z);
        }
        throw null;
    }

    /* renamed from: N0 */
    public void m4006N0(InterfaceC0544d interfaceC0544d) {
        this.f3586l = interfaceC0544d;
    }

    /* renamed from: O */
    protected int m4007O(int i2) {
        if (!m4019V0()) {
            return i2;
        }
        if (m4012R() == null) {
            return this.f3581g.m4151j().getInt(this.f3593s, i2);
        }
        throw null;
    }

    /* renamed from: O0 */
    public void m4008O0(int i2) {
        if (i2 != this.f3587m) {
            this.f3587m = i2;
            m4030g0();
        }
    }

    /* renamed from: P */
    protected String m4009P(String str) {
        if (!m4019V0()) {
            return str;
        }
        if (m4012R() == null) {
            return this.f3581g.m4151j().getString(this.f3593s, str);
        }
        throw null;
    }

    /* renamed from: P0 */
    public void mo3959P0(CharSequence charSequence) {
        if (m4018V() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f3590p, charSequence)) {
            return;
        }
        this.f3590p = charSequence;
        mo3942e0();
    }

    /* renamed from: Q */
    public Set<String> m4010Q(Set<String> set) {
        if (!m4019V0()) {
            return set;
        }
        if (m4012R() == null) {
            return this.f3581g.m4151j().getStringSet(this.f3593s, set);
        }
        throw null;
    }

    /* renamed from: Q0 */
    public final void m4011Q0(InterfaceC0546f interfaceC0546f) {
        this.f3578T = interfaceC0546f;
        mo3942e0();
    }

    /* renamed from: R */
    public AbstractC0561e m4012R() {
        AbstractC0561e abstractC0561e = this.f3582h;
        if (abstractC0561e != null) {
            return abstractC0561e;
        }
        C0566j c0566j = this.f3581g;
        if (c0566j != null) {
            return c0566j.m4149h();
        }
        return null;
    }

    /* renamed from: R0 */
    public void m4013R0(int i2) {
        m4015S0(this.f3580f.getString(i2));
    }

    /* renamed from: S */
    public C0566j m4014S() {
        return this.f3581g;
    }

    /* renamed from: S0 */
    public void m4015S0(CharSequence charSequence) {
        if ((charSequence != null || this.f3589o == null) && (charSequence == null || charSequence.equals(this.f3589o))) {
            return;
        }
        this.f3589o = charSequence;
        mo3942e0();
    }

    /* renamed from: T */
    public SharedPreferences m4016T() {
        if (this.f3581g == null || m4012R() != null) {
            return null;
        }
        return this.f3581g.m4151j();
    }

    /* renamed from: T0 */
    public final void m4017T0(boolean z) {
        if (this.f3562D != z) {
            this.f3562D = z;
            InterfaceC0542b interfaceC0542b = this.f3572N;
            if (interfaceC0542b != null) {
                interfaceC0542b.mo4051b(this);
            }
        }
    }

    /* renamed from: U */
    public CharSequence mo3960U() {
        return m4018V() != null ? m4018V().mo3956a(this) : this.f3590p;
    }

    /* renamed from: U0 */
    public boolean mo3944U0() {
        return !mo4024a0();
    }

    /* renamed from: V */
    public final InterfaceC0546f m4018V() {
        return this.f3578T;
    }

    /* renamed from: V0 */
    protected boolean m4019V0() {
        return this.f3581g != null && m4025b0() && m4022Y();
    }

    /* renamed from: W */
    public CharSequence m4020W() {
        return this.f3589o;
    }

    /* renamed from: X */
    public final int m4021X() {
        return this.f3571M;
    }

    /* renamed from: Y */
    public boolean m4022Y() {
        return !TextUtils.isEmpty(this.f3593s);
    }

    /* renamed from: Z */
    public boolean m4023Z() {
        return this.f3568J;
    }

    /* renamed from: a0 */
    public boolean mo4024a0() {
        return this.f3597w && this.f3560B && this.f3561C;
    }

    /* renamed from: b0 */
    public boolean m4025b0() {
        return this.f3599y;
    }

    /* renamed from: c0 */
    public boolean m4026c0() {
        return this.f3598x;
    }

    /* renamed from: d0 */
    public final boolean m4027d0() {
        return this.f3562D;
    }

    /* renamed from: e0 */
    protected void mo3942e0() {
        InterfaceC0542b interfaceC0542b = this.f3572N;
        if (interfaceC0542b != null) {
            interfaceC0542b.mo4052e(this);
        }
    }

    /* renamed from: f0 */
    public void mo4028f0(boolean z) {
        List<Preference> list = this.f3573O;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).m4035m0(this, z);
        }
    }

    /* renamed from: g */
    void m4029g(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f3574P != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f3574P = preferenceGroup;
    }

    /* renamed from: g0 */
    protected void m4030g0() {
        InterfaceC0542b interfaceC0542b = this.f3572N;
        if (interfaceC0542b != null) {
            interfaceC0542b.mo4050a(this);
        }
    }

    /* renamed from: h0 */
    public void mo4031h0() {
        m3977C0();
    }

    /* renamed from: i0 */
    protected void m4032i0(C0566j c0566j) {
        this.f3581g = c0566j;
        if (!this.f3584j) {
            this.f3583i = c0566j.m4145d();
        }
        m3983y();
    }

    /* renamed from: j0 */
    protected void m4033j0(C0566j c0566j, long j2) {
        this.f3583i = j2;
        this.f3584j = true;
        try {
            m4032i0(c0566j);
        } finally {
            this.f3584j = false;
        }
    }

    /* renamed from: k */
    public boolean m4034k(Object obj) {
        InterfaceC0543c interfaceC0543c = this.f3585k;
        return interfaceC0543c == null || interfaceC0543c.m4053a(this, obj);
    }

    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        Integer numValueOf;
        View view = c0568l.itemView;
        view.setOnClickListener(this.f3579U);
        view.setId(this.f3588n);
        TextView textView = (TextView) c0568l.m4161a(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo3960U = mo3960U();
            if (TextUtils.isEmpty(charSequenceMo3960U)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceMo3960U);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c0568l.m4161a(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceM4020W = m4020W();
            if (TextUtils.isEmpty(charSequenceM4020W)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceM4020W);
                textView2.setVisibility(0);
                if (this.f3565G) {
                    textView2.setSingleLine(this.f3566H);
                }
                if (!m4026c0() && mo4024a0() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) c0568l.m4161a(R.id.icon);
        if (imageView != null) {
            int i2 = this.f3591q;
            if (i2 != 0 || this.f3592r != null) {
                if (this.f3592r == null) {
                    this.f3592r = C0833a.m5262d(this.f3580f, i2);
                }
                Drawable drawable = this.f3592r;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f3592r != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f3567I ? 4 : 8);
            }
        }
        View viewM4161a = c0568l.m4161a(C0572p.f3738a);
        if (viewM4161a == null) {
            viewM4161a = c0568l.m4161a(R.id.icon_frame);
        }
        if (viewM4161a != null) {
            if (this.f3592r != null) {
                viewM4161a.setVisibility(0);
            } else {
                viewM4161a.setVisibility(this.f3567I ? 4 : 8);
            }
        }
        if (this.f3569K) {
            m3979H0(view, mo4024a0());
        } else {
            m3979H0(view, true);
        }
        boolean zM4026c0 = m4026c0();
        view.setFocusable(zM4026c0);
        view.setClickable(zM4026c0);
        c0568l.m4164d(this.f3563E);
        c0568l.m4165e(this.f3564F);
        boolean zM4023Z = m4023Z();
        if (zM4023Z && this.f3577S == null) {
            this.f3577S = new ViewOnCreateContextMenuListenerC0545e(this);
        }
        view.setOnCreateContextMenuListener(zM4023Z ? this.f3577S : null);
        view.setLongClickable(zM4023Z);
        if (!zM4023Z || zM4026c0) {
            return;
        }
        C0311u.m2139m0(view, null);
    }

    /* renamed from: l0 */
    protected void mo3939l0() {
    }

    /* renamed from: m0 */
    public void m4035m0(Preference preference, boolean z) {
        if (this.f3560B == z) {
            this.f3560B = !z;
            mo4028f0(mo3944U0());
            mo3942e0();
        }
    }

    /* renamed from: n0 */
    public void mo4036n0() {
        m3981X0();
        this.f3575Q = true;
    }

    /* renamed from: o0 */
    protected Object mo3948o0(TypedArray typedArray, int i2) {
        return null;
    }

    @Deprecated
    /* renamed from: p0 */
    public void mo4037p0(C0289c c0289c) {
    }

    /* renamed from: q */
    final void m4038q() {
        this.f3575Q = false;
    }

    /* renamed from: q0 */
    public void m4039q0(Preference preference, boolean z) {
        if (this.f3561C == z) {
            this.f3561C = !z;
            mo4028f0(mo3944U0());
            mo3942e0();
        }
    }

    /* renamed from: r0 */
    protected void m4040r0() {
        m3981X0();
    }

    /* renamed from: s0 */
    protected void mo3949s0(Parcelable parcelable) {
        this.f3576R = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        this.f3576R = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public String toString() {
        return m3990F().toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i2 = this.f3587m;
        int i3 = preference.f3587m;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.f3589o;
        CharSequence charSequence2 = preference.f3589o;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3589o.toString());
    }

    /* renamed from: u0 */
    protected void mo3951u0(Object obj) {
    }

    /* renamed from: v */
    void mo4042v(Bundle bundle) {
        Parcelable parcelable;
        if (!m4022Y() || (parcelable = bundle.getParcelable(this.f3593s)) == null) {
            return;
        }
        this.f3576R = false;
        mo3949s0(parcelable);
        if (!this.f3576R) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    @Deprecated
    /* renamed from: v0 */
    protected void m4043v0(boolean z, Object obj) {
        mo3951u0(obj);
    }

    /* renamed from: w0 */
    public void m4044w0() {
        C0566j.c cVarM4147f;
        if (mo4024a0() && m4026c0()) {
            mo3939l0();
            InterfaceC0544d interfaceC0544d = this.f3586l;
            if (interfaceC0544d == null || !interfaceC0544d.onPreferenceClick(this)) {
                C0566j c0566jM4014S = m4014S();
                if ((c0566jM4014S == null || (cVarM4147f = c0566jM4014S.m4147f()) == null || !cVarM4147f.onPreferenceTreeClick(this)) && this.f3594t != null) {
                    m3987D().startActivity(this.f3594t);
                }
            }
        }
    }

    /* renamed from: x */
    void mo4045x(Bundle bundle) {
        if (m4022Y()) {
            this.f3576R = false;
            Parcelable parcelableMo3950t0 = mo3950t0();
            if (!this.f3576R) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo3950t0 != null) {
                bundle.putParcelable(this.f3593s, parcelableMo3950t0);
            }
        }
    }

    /* renamed from: x0 */
    protected void mo3932x0(View view) {
        m4044w0();
    }

    /* renamed from: y0 */
    protected boolean m4046y0(boolean z) {
        if (!m4019V0()) {
            return false;
        }
        if (z == m4005N(!z)) {
            return true;
        }
        if (m4012R() != null) {
            throw null;
        }
        SharedPreferences.Editor editorM4144c = this.f3581g.m4144c();
        editorM4144c.putBoolean(this.f3593s, z);
        m3980W0(editorM4144c);
        return true;
    }

    /* renamed from: z0 */
    protected boolean m4047z0(int i2) {
        if (!m4019V0()) {
            return false;
        }
        if (i2 == m4007O(i2 ^ (-1))) {
            return true;
        }
        if (m4012R() != null) {
            throw null;
        }
        SharedPreferences.Editor editorM4144c = this.f3581g.m4144c();
        editorM4144c.putInt(this.f3593s, i2);
        m3980W0(editorM4144c);
        return true;
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3731i, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
