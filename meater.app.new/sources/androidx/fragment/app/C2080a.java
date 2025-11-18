package androidx.fragment.app;

import android.util.Log;
import android.view.AbstractC2106m;
import androidx.fragment.app.C;
import androidx.fragment.app.v;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2080a extends C implements v.p {

    /* renamed from: t, reason: collision with root package name */
    final v f25595t;

    /* renamed from: u, reason: collision with root package name */
    boolean f25596u;

    /* renamed from: v, reason: collision with root package name */
    int f25597v;

    /* renamed from: w, reason: collision with root package name */
    boolean f25598w;

    C2080a(v vVar) {
        super(vVar.A0(), vVar.D0() != null ? vVar.D0().getContext().getClassLoader() : null);
        this.f25597v = -1;
        this.f25598w = false;
        this.f25595t = vVar;
    }

    @Override // androidx.fragment.app.C
    public C C(Fragment fragment) {
        v vVar = fragment.f25474W;
        if (vVar == null || vVar == this.f25595t) {
            return super.C(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void D(int i10) {
        if (this.f25402i) {
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f25396c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C.a aVar = this.f25396c.get(i11);
                Fragment fragment = aVar.f25414b;
                if (fragment != null) {
                    fragment.f25473V += i10;
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f25414b + " to " + aVar.f25414b.f25473V);
                    }
                }
            }
        }
    }

    void E() {
        int size = this.f25396c.size() - 1;
        while (size >= 0) {
            C.a aVar = this.f25396c.get(size);
            if (aVar.f25415c) {
                if (aVar.f25413a == 8) {
                    aVar.f25415c = false;
                    this.f25396c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f25414b.f25479b0;
                    aVar.f25413a = 2;
                    aVar.f25415c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        C.a aVar2 = this.f25396c.get(i11);
                        if (aVar2.f25415c && aVar2.f25414b.f25479b0 == i10) {
                            this.f25396c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int F(boolean z10, boolean z11) {
        if (this.f25596u) {
            throw new IllegalStateException("commit already called");
        }
        if (v.Q0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new H("FragmentManager"));
            G("  ", printWriter);
            printWriter.close();
        }
        this.f25596u = true;
        if (this.f25402i) {
            this.f25597v = this.f25595t.o();
        } else {
            this.f25597v = -1;
        }
        if (z11) {
            this.f25595t.d0(this, z10);
        }
        return this.f25597v;
    }

    public void G(String str, PrintWriter printWriter) {
        H(str, printWriter, true);
    }

    public void H(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f25404k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f25597v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f25596u);
            if (this.f25401h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f25401h));
            }
            if (this.f25397d != 0 || this.f25398e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f25397d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f25398e));
            }
            if (this.f25399f != 0 || this.f25400g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f25399f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f25400g));
            }
            if (this.f25405l != 0 || this.f25406m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f25405l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f25406m);
            }
            if (this.f25407n != 0 || this.f25408o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f25407n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f25408o);
            }
        }
        if (this.f25396c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f25396c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C.a aVar = this.f25396c.get(i10);
            switch (aVar.f25413a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f25413a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f25414b);
            if (z10) {
                if (aVar.f25416d != 0 || aVar.f25417e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f25416d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f25417e));
                }
                if (aVar.f25418f != 0 || aVar.f25419g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f25418f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f25419g));
                }
            }
        }
    }

    void I() {
        int size = this.f25396c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C.a aVar = this.f25396c.get(i10);
            Fragment fragment = aVar.f25414b;
            if (fragment != null) {
                fragment.f25467P = this.f25598w;
                fragment.q2(false);
                fragment.p2(this.f25401h);
                fragment.s2(this.f25409p, this.f25410q);
            }
            switch (aVar.f25413a) {
                case 1:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.G1(fragment, false);
                    this.f25595t.l(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f25413a);
                case 3:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.u1(fragment);
                    break;
                case 4:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.N0(fragment);
                    break;
                case 5:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.G1(fragment, false);
                    this.f25595t.M1(fragment);
                    break;
                case 6:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.B(fragment);
                    break;
                case 7:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.G1(fragment, false);
                    this.f25595t.q(fragment);
                    break;
                case 8:
                    this.f25595t.K1(fragment);
                    break;
                case 9:
                    this.f25595t.K1(null);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    this.f25595t.J1(fragment, aVar.f25421i);
                    break;
            }
        }
    }

    void J() {
        for (int size = this.f25396c.size() - 1; size >= 0; size--) {
            C.a aVar = this.f25396c.get(size);
            Fragment fragment = aVar.f25414b;
            if (fragment != null) {
                fragment.f25467P = this.f25598w;
                fragment.q2(true);
                fragment.p2(v.A1(this.f25401h));
                fragment.s2(this.f25410q, this.f25409p);
            }
            switch (aVar.f25413a) {
                case 1:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.G1(fragment, true);
                    this.f25595t.u1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f25413a);
                case 3:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.l(fragment);
                    break;
                case 4:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.M1(fragment);
                    break;
                case 5:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.G1(fragment, true);
                    this.f25595t.N0(fragment);
                    break;
                case 6:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.q(fragment);
                    break;
                case 7:
                    fragment.j2(aVar.f25416d, aVar.f25417e, aVar.f25418f, aVar.f25419g);
                    this.f25595t.G1(fragment, true);
                    this.f25595t.B(fragment);
                    break;
                case 8:
                    this.f25595t.K1(null);
                    break;
                case 9:
                    this.f25595t.K1(fragment);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    this.f25595t.J1(fragment, aVar.f25420h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment K(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.C$a> r5 = r0.f25396c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList<androidx.fragment.app.C$a> r5 = r0.f25396c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.C$a r5 = (androidx.fragment.app.C.a) r5
            int r6 = r5.f25413a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList<androidx.fragment.app.C$a> r6 = r0.f25396c
            androidx.fragment.app.C$a r8 = new androidx.fragment.app.C$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f25415c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f25414b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f25414b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f25414b
            if (r5 != r3) goto Lbb
            java.util.ArrayList<androidx.fragment.app.C$a> r3 = r0.f25396c
            androidx.fragment.app.C$a r6 = new androidx.fragment.app.C$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f25414b
            int r8 = r6.f25479b0
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f25479b0
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList<androidx.fragment.app.C$a> r3 = r0.f25396c
            androidx.fragment.app.C$a r15 = new androidx.fragment.app.C$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.C$a r15 = new androidx.fragment.app.C$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f25416d
            r15.f25416d = r2
            int r2 = r5.f25418f
            r15.f25418f = r2
            int r2 = r5.f25417e
            r15.f25417e = r2
            int r2 = r5.f25419g
            r15.f25419g = r2
            java.util.ArrayList<androidx.fragment.app.C$a> r2 = r0.f25396c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.C$a> r2 = r0.f25396c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f25413a = r7
            r5.f25415c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f25414b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2080a.K(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String L() {
        return this.f25404k;
    }

    public void M() {
        if (this.f25412s != null) {
            for (int i10 = 0; i10 < this.f25412s.size(); i10++) {
                this.f25412s.get(i10).run();
            }
            this.f25412s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment N(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.C$a> r0 = r5.f25396c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.C$a> r2 = r5.f25396c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.C$a r2 = (androidx.fragment.app.C.a) r2
            int r3 = r2.f25413a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.m$b r3 = r2.f25420h
            r2.f25421i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f25414b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f25414b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f25414b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2080a.N(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.v.p
    public boolean a(ArrayList<C2080a> arrayList, ArrayList<Boolean> arrayList2) {
        if (v.Q0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f25402i) {
            return true;
        }
        this.f25595t.k(this);
        return true;
    }

    @Override // androidx.fragment.app.C
    public int j() {
        return F(false, true);
    }

    @Override // androidx.fragment.app.C
    public int k() {
        return F(true, true);
    }

    @Override // androidx.fragment.app.C
    public void l() {
        o();
        this.f25595t.g0(this, false);
    }

    @Override // androidx.fragment.app.C
    public void m() {
        o();
        this.f25595t.g0(this, true);
    }

    @Override // androidx.fragment.app.C
    public C n(Fragment fragment) {
        v vVar = fragment.f25474W;
        if (vVar == null || vVar == this.f25595t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.C
    void p(int i10, Fragment fragment, String str, int i11) {
        super.p(i10, fragment, str, i11);
        fragment.f25474W = this.f25595t;
    }

    @Override // androidx.fragment.app.C
    public C q(Fragment fragment) {
        v vVar = fragment.f25474W;
        if (vVar == null || vVar == this.f25595t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.C
    public boolean r() {
        return this.f25396c.isEmpty();
    }

    @Override // androidx.fragment.app.C
    public C s(Fragment fragment) {
        v vVar = fragment.f25474W;
        if (vVar == null || vVar == this.f25595t) {
            return super.s(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f25597v >= 0) {
            sb2.append(" #");
            sb2.append(this.f25597v);
        }
        if (this.f25404k != null) {
            sb2.append(" ");
            sb2.append(this.f25404k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.C
    public C y(Fragment fragment, AbstractC2106m.b bVar) {
        if (fragment.f25474W != this.f25595t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f25595t);
        }
        if (bVar == AbstractC2106m.b.INITIALIZED && fragment.f25449B > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC2106m.b.DESTROYED) {
            return super.y(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.C
    public C z(Fragment fragment) {
        v vVar;
        if (fragment == null || (vVar = fragment.f25474W) == null || vVar == this.f25595t) {
            return super.z(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    C2080a(C2080a c2080a) {
        super(c2080a.f25595t.A0(), c2080a.f25595t.D0() != null ? c2080a.f25595t.D0().getContext().getClassLoader() : null, c2080a);
        this.f25597v = -1;
        this.f25598w = false;
        this.f25595t = c2080a.f25595t;
        this.f25596u = c2080a.f25596u;
        this.f25597v = c2080a.f25597v;
        this.f25598w = c2080a.f25598w;
    }
}
