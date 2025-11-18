package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: B, reason: collision with root package name */
    protected int[] f24048B;

    /* renamed from: C, reason: collision with root package name */
    protected int f24049C;

    /* renamed from: D, reason: collision with root package name */
    protected Context f24050D;

    /* renamed from: E, reason: collision with root package name */
    protected a1.i f24051E;

    /* renamed from: F, reason: collision with root package name */
    protected boolean f24052F;

    /* renamed from: G, reason: collision with root package name */
    protected String f24053G;

    /* renamed from: H, reason: collision with root package name */
    protected String f24054H;

    /* renamed from: I, reason: collision with root package name */
    private View[] f24055I;

    /* renamed from: J, reason: collision with root package name */
    protected HashMap<Integer, String> f24056J;

    public b(Context context) {
        super(context);
        this.f24048B = new int[32];
        this.f24052F = false;
        this.f24055I = null;
        this.f24056J = new HashMap<>();
        this.f24050D = context;
        m(null);
    }

    private void d(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f24050D == null) {
            return;
        }
        String strTrim = str.trim();
        int iK = k(strTrim);
        if (iK != 0) {
            this.f24056J.put(Integer.valueOf(iK), strTrim);
            e(iK);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f24049C + 1;
        int[] iArr = this.f24048B;
        if (i11 > iArr.length) {
            this.f24048B = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f24048B;
        int i12 = this.f24049C;
        iArr2[i12] = i10;
        this.f24049C = i12 + 1;
    }

    private void f(String str) {
        if (str == null || str.length() == 0 || this.f24050D == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f23977c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f24050D.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iJ = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objI = constraintLayout.i(0, str);
            if (objI instanceof Integer) {
                iJ = ((Integer) objI).intValue();
            }
        }
        if (iJ == 0 && constraintLayout != null) {
            iJ = j(constraintLayout, str);
        }
        if (iJ == 0) {
            try {
                iJ = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iJ == 0 ? this.f24050D.getResources().getIdentifier(str, "id", this.f24050D.getPackageName()) : iJ;
    }

    protected void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f24048B, this.f24049C);
    }

    protected void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f24049C; i10++) {
            View viewQ = constraintLayout.q(this.f24048B[i10]);
            if (viewQ != null) {
                viewQ.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f24055I;
        if (viewArr == null || viewArr.length != this.f24049C) {
            this.f24055I = new View[this.f24049C];
        }
        for (int i10 = 0; i10 < this.f24049C; i10++) {
            this.f24055I[i10] = constraintLayout.q(this.f24048B[i10]);
        }
        return this.f24055I;
    }

    protected void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f24393V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24560o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f24053G = string;
                    setIds(string);
                } else if (index == i.f24569p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f24054H = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f24053G;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f24054H;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f24052F) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int iJ;
        if (isInEditMode()) {
            setIds(this.f24053G);
        }
        a1.i iVar = this.f24051E;
        if (iVar == null) {
            return;
        }
        iVar.a();
        for (int i10 = 0; i10 < this.f24049C; i10++) {
            int i11 = this.f24048B[i10];
            View viewQ = constraintLayout.q(i11);
            if (viewQ == null && (iJ = j(constraintLayout, (str = this.f24056J.get(Integer.valueOf(i11))))) != 0) {
                this.f24048B[i10] = iJ;
                this.f24056J.put(Integer.valueOf(iJ), str);
                viewQ = constraintLayout.q(iJ);
            }
            if (viewQ != null) {
                this.f24051E.b(constraintLayout.r(viewQ));
            }
        }
        this.f24051E.c(constraintLayout.f23923D);
    }

    public void s() {
        if (this.f24051E == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f24015v0 = (a1.e) this.f24051E;
        }
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f24053G = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f24049C = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f24054H = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f24049C = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f24053G = null;
        this.f24049C = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f24053G == null) {
            e(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24048B = new int[32];
        this.f24052F = false;
        this.f24055I = null;
        this.f24056J = new HashMap<>();
        this.f24050D = context;
        m(attributeSet);
    }

    protected void i(ConstraintLayout constraintLayout) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void n(a1.e eVar, boolean z10) {
    }
}
